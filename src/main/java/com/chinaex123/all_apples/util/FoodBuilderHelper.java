package com.chinaex123.all_apples.util;

import net.minecraft.world.food.FoodProperties;

/**
 * 食物构建辅助工具类
 */
public class FoodBuilderHelper {


    /**
     * 通用食物属性对象，总是可以被食用
     *
     * @param nutrition 营养值，表示食物可以恢复的饥饿度
     * @param saturation 饱和度修正值，表示食物提供的饱和度增益
     * @return 构建完成的FoodProperties对象，配置为总是可食用状态
     */
    public static FoodProperties simpleAlwaysEdible(int nutrition, float saturation) {
        return new FoodProperties.Builder()
                .alwaysEdible()
                .nutrition(nutrition)
                .saturationModifier(saturation)
                .build();
    }

    /**
     * 通用食物属性对象，总是可以被食用并带有状态效果
     *
     * @param nutrition 营养值，表示食物可以恢复的饥饿度
     * @param saturation 饱和度修正值，表示食物提供的饱和度增益
     * @param effects 可变参数，指定食物可能附加的状态效果及其触发概率
     * @return 构建完成的FoodProperties对象，配置为总是可食用状态并包含指定的效果
     */
    public static FoodProperties simpleAlwaysEdible(int nutrition, float saturation,
                                                    EffectPair... effects) {
        FoodProperties.Builder builder = new FoodProperties.Builder()
                .alwaysEdible()
                .nutrition(nutrition)
                .saturationModifier(saturation);

        for (EffectPair effect : effects) {
            builder.effect(effect.getEffect(), effect.getProbability());
        }

        return builder.build();
    }
}
