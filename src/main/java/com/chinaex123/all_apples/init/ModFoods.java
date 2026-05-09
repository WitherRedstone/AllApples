package com.chinaex123.all_apples.init;

import com.chinaex123.all_apples.util.EffectPair;
import com.chinaex123.all_apples.util.FoodBuilderHelper;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public interface ModFoods {

//    FoodProperties IRON_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f); // 铁苹果

    // ======================= 原版 =======================
    // 煤炭苹果
    FoodProperties COAL_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 附魔煤炭苹果
    FoodProperties ENCHANTED_COAL_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 铜苹果
    FoodProperties COPPER_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 附魔铜苹果
    FoodProperties ENCHANTED_COPPER_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 铁苹果
    FoodProperties IRON_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 附魔铁苹果
    FoodProperties ENCHANTED_IRON_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 钻石苹果
    FoodProperties DIAMOND_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 附魔钻石苹果
    FoodProperties ENCHANTED_DIAMOND_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 下界合金苹果
    FoodProperties NETHERITE_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 附魔下界合金苹果
    FoodProperties ENCHANTED_NETHERITE_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 绿宝石苹果
    FoodProperties EMERALD_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 附魔绿宝石苹果
    FoodProperties ENCHANTED_EMERALD_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 青金石苹果
    FoodProperties LAPIS_LAZULI_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 附魔青金石苹果
    FoodProperties ENCHANTED_LAPIS_LAZULI_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 红石苹果
    FoodProperties REDSTONE_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 附魔红石苹果
    FoodProperties ENCHANTED_REDSTONE_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 紫水晶苹果
    FoodProperties AMETHYST_SHARD_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 附魔紫水晶苹果
    FoodProperties ENCHANTED_AMETHYST_SHARD_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 黏液苹果
    FoodProperties SLIME_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 附魔黏液苹果
    FoodProperties ENCHANTED_SLIME_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 荧石苹果
    FoodProperties GLOWSTONE_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 附魔荧石苹果
    FoodProperties ENCHANTED_GLOWSTONE_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );

    // 海洋之心苹果
    FoodProperties HEART_OF_THE_SEA_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 下界之星苹果
    FoodProperties NETHER_STAR_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 蜜脾苹果
    FoodProperties HONEYCOMB_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 回响苹果
    FoodProperties ECHO_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 下界石英苹果
    FoodProperties QUARTZ_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 沉重苹果
    FoodProperties HEAVY_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 黑曜石苹果
    FoodProperties OBSIDIAN_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 哭泣的黑曜石苹果
    FoodProperties CRYING_OBSIDIAN_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 骨块苹果
    FoodProperties BONE_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 末影苹果
    FoodProperties ENDER_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );
    // 钟苹果
    FoodProperties BELL_APPLE = FoodBuilderHelper.simpleAlwaysEdible(8, 0.4f,
            EffectPair.of(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1.0f)
    );


    // ======================= 联动 =======================














//    FoodProperties IRON_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.5f)
//            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 20 * 15, 4), 1.0f) // 饥饿
//            .alwaysEdible().build();
}
