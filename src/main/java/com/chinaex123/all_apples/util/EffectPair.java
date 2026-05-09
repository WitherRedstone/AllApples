package com.chinaex123.all_apples.util;

import java.util.function.Supplier;
import net.minecraft.world.effect.MobEffectInstance;

/**
 * 效果配对数据类
 */
public class EffectPair {
    private final Supplier<MobEffectInstance> effect;
    private final float probability;

    /**
     * 私有构造函数，创建效果与概率的配对对象
     *
     * @param effect 状态效果实例的供应器，用于延迟加载效果
     * @param probability 效果触发概率，范围通常为0.0到1.0
     */
    private EffectPair(Supplier<MobEffectInstance> effect, float probability) {
        this.effect = effect;
        this.probability = probability;
    }

    /**
     * 工厂方法，创建EffectPair实例
     *
     * @param effect 状态效果实例的供应器，用于延迟加载效果
     * @param probability 效果触发概率，范围通常为0.0到1.0
     * @return 新创建的EffectPair对象
     */

    public static EffectPair of(Supplier<MobEffectInstance> effect, float probability) {
        return new EffectPair(effect, probability);
    }

    /**
     * 获取状态效果实例的供应器
     *
     * @return MobEffectInstance的Supplier对象
     */
    public Supplier<MobEffectInstance> getEffect() {
        return effect;
    }

    /**
     * 获取效果触发概率
     *
     * @return 概率值，范围为0.0到1.0
     */
    public float getProbability() {
        return probability;
    }
}