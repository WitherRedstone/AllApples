package com.chinaex123.all_apples.item;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.neoforged.neoforge.entity.PartEntity;

import java.util.function.Supplier;

/**
 * 紫水晶苹果物品
 * 食用后会让玩家瞄准的那个紫水晶母岩生长紫水晶
 */
public class AmethystAppleItem extends Item {

    /** 生长次数提供者 */
    private final Supplier<Integer> countSupplier;

    public AmethystAppleItem(Properties properties, Supplier<Integer> countSupplier) {
        super(properties);
        this.countSupplier = countSupplier;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        if (!level.isClientSide && livingEntity instanceof Player player) {
            // 获取玩家视线瞄准的方块（创造模式 6 格，其他 4.5 格）
            HitResult hit = ProjectileUtil.getHitResultOnViewVector(
                    player, (e) -> !e.isSpectator() && !(e instanceof PartEntity<?>),
                    player.blockInteractionRange());
            if (hit.getType() != HitResult.Type.BLOCK) return stack;
            BlockPos targetPos = ((BlockHitResult) hit).getBlockPos();
            BlockState targetState = level.getBlockState(targetPos);

            if (targetState.is(Blocks.BUDDING_AMETHYST)) {
                int count = countSupplier.get();
                for (int i = 0; i < count; i++) {
                    growAmethystDirectly((ServerLevel) level, targetPos);
                }
            }
        }
        return super.finishUsingItem(stack, level, livingEntity);
    }

    private static void growAmethystDirectly(ServerLevel level, BlockPos pos) {
        for (Direction direction : Direction.values()) {
            BlockPos crystalPos = pos.relative(direction);
            BlockState adjacentState = level.getBlockState(crystalPos);

            // 空气/水 → 创建新紫水晶芽
            if (adjacentState.isAir() || adjacentState.is(Blocks.WATER)) {
                createNewAmethystBud(level, pos, direction);
            }
            // 已有紫水晶芽/簇 → 推进到下一阶段
            else {
                Block adjacentBlock = adjacentState.getBlock();
                if (adjacentBlock == Blocks.SMALL_AMETHYST_BUD ||
                        adjacentBlock == Blocks.MEDIUM_AMETHYST_BUD ||
                        adjacentBlock == Blocks.LARGE_AMETHYST_BUD) {

                    Block newBlock = getNextAmethystStage(adjacentBlock);
                    if (newBlock != adjacentBlock) {
                        BlockState newState = newBlock.defaultBlockState()
                                .setValue(AmethystClusterBlock.FACING, adjacentState.getValue(AmethystClusterBlock.FACING))
                                .setValue(AmethystClusterBlock.WATERLOGGED, adjacentState.getValue(AmethystClusterBlock.WATERLOGGED));
                        level.setBlock(crystalPos, newState, 3);
                    }
                }
            }
        }
    }

    /** 创建一个新的最小紫水晶芽 */
    private static void createNewAmethystBud(ServerLevel level, BlockPos motherPos, Direction face) {
        BlockPos budPos = motherPos.relative(face);
        BlockState budState = Blocks.SMALL_AMETHYST_BUD.defaultBlockState()
                .setValue(AmethystClusterBlock.FACING, face)
                .setValue(AmethystClusterBlock.WATERLOGGED, level.getBlockState(budPos).is(Blocks.WATER));

        if (budState.canSurvive(level, budPos)) {
            level.setBlock(budPos, budState, 3);
            level.playSound(null, budPos, SoundEvents.AMETHYST_CLUSTER_PLACE, SoundSource.BLOCKS, 0.8f, 1.0f);
        }
    }

    /** 紫水晶阶段推进 */
    private static Block getNextAmethystStage(Block current) {
        if (current == Blocks.SMALL_AMETHYST_BUD) return Blocks.MEDIUM_AMETHYST_BUD;
        if (current == Blocks.MEDIUM_AMETHYST_BUD) return Blocks.LARGE_AMETHYST_BUD;
        if (current == Blocks.LARGE_AMETHYST_BUD) return Blocks.AMETHYST_CLUSTER;
        return current;
    }
}