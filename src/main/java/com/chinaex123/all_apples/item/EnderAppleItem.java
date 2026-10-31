package com.chinaex123.all_apples.item;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

/**
 * 末影苹果物品
 * <p>
 * 食用后会像紫颂果一样随机瞬移到附近安全位置
 */
public class EnderAppleItem extends Item {

    /** 瞬移尝试次数上限 */
    private static final int MAX_TELEPORT_TRIES = 32;
    /** 水平搜索半径（X/Z 方向） */
    private static final int HORIZONTAL_RADIUS = 16;
    /** 垂直搜索半径（Y 方向） */
    private static final int VERTICAL_RADIUS = 8;

    public EnderAppleItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        if (!level.isClientSide && livingEntity.isAlive()) {
            teleportsRandomly(livingEntity, (ServerLevel) level);
        }
        return super.finishUsingItem(stack, level, livingEntity);
    }

    private static void teleportsRandomly(LivingEntity entity, ServerLevel level) {
        double entityX = entity.getX();
        double entityY = entity.getY();
        double entityZ = entity.getZ();

        // 循环随机尝试，最多 32 次
        for (int i = 0; i < MAX_TELEPORT_TRIES; i++) {
            // 1) XZ 平面随机偏移
            double offsetX = entity.getRandom().nextInt(HORIZONTAL_RADIUS * 2) - HORIZONTAL_RADIUS;
            double offsetZ = entity.getRandom().nextInt(HORIZONTAL_RADIUS * 2) - HORIZONTAL_RADIUS;
            double targetX = entityX + offsetX;
            double targetZ = entityZ + offsetZ;

            // 2) Y 轴方向：围绕玩家当前高度上下搜索
            int targetY = entity.getRandom().nextInt(VERTICAL_RADIUS * 2 + 1) - VERTICAL_RADIUS;
            int searchY = (int) entityY + targetY;

            // 3) 沿 Y 轴上下滑动，找一个碰撞箱合法的位置
            if (searchY < level.getMinBuildHeight()) {
                searchY = level.getMinBuildHeight();
            }
            if (searchY > level.getMaxBuildHeight() - 1) {
                searchY = level.getMaxBuildHeight() - 1;
            }

            BlockPos.MutableBlockPos mutablePos = new BlockPos.MutableBlockPos();

            // 从 searchY 往下搜到地表，检查哪里能站立
            for (int y = searchY; y >= level.getMinBuildHeight(); y--) {
                mutablePos.set(targetX, y, targetZ);
                BlockState state = level.getBlockState(mutablePos);
                // 如果方块有碰撞箱（不是空气/水/岩浆等），说明位置太低了
                if (!state.getCollisionShape(level, mutablePos).isEmpty()) {
                    // 就在这个方块的上方站立
                    Vec3 standPos = new Vec3(targetX + 0.5, y + 1.01, targetZ + 0.5);
                    // 强制传送（force=true），忽略距离限制
                    if (entity.randomTeleport(standPos.x, standPos.y, standPos.z, true)) {
                        level.sendParticles(net.minecraft.core.particles.ParticleTypes.PORTAL,
                                entity.getX(), entity.getY(), entity.getZ(), 12, 0.5, 0.5, 0.5, 0.4);
                        entity.resetFallDistance();
                        return;
                    }
                    break;
                }
            }
        }
    }
}