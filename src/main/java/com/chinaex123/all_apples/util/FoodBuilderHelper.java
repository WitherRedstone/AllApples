package com.chinaex123.all_apples.util;

import net.minecraft.world.food.FoodProperties;

/**
 * 食物构建辅助工具类
 */
public class FoodBuilderHelper {


    public static FoodProperties simpleAlwaysEdible(int nutrition, float saturation) {
        return new FoodProperties.Builder()
                .alwaysEdible()
                .nutrition(nutrition)
                .saturationModifier(saturation)
                .build();
    }

    public static FoodProperties simpleAlwaysEdible(int nutrition, float saturation, EffectPair... effects) {
        FoodProperties.Builder builder = new FoodProperties.Builder()
                .alwaysEdible()
                .nutrition(nutrition)
                .saturationModifier(saturation);

        for (EffectPair effect : effects) {
            builder.effect(effect.getEffect(), effect.getProbability());
        }

        return builder.build();
    }

    public static FoodProperties simpleAlwaysEdibleNoEffect(int nutrition, float saturation) {
        return new FoodProperties.Builder()
                .alwaysEdible()
                .nutrition(nutrition)
                .saturationModifier(saturation)
                .build();
    }
}
