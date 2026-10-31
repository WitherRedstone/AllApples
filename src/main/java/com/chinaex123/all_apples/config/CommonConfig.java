package com.chinaex123.all_apples.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class CommonConfig {
    public static final ModConfigSpec SPEC;

    public static final ModConfigSpec.IntValue amethystGrowthCount;
    public static final ModConfigSpec.IntValue enchantedAmethystGrowthCount;

    static {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

        builder.comment("通用配置").push("Common Config");
        builder.comment("紫水晶苹果").push("Amethyst Shard Apple");
        amethystGrowthCount = builder
                .comment("普通紫水晶苹果食用后触发紫水晶母岩生长的次数（仅对玩家瞄准的母岩生效）")
                .defineInRange("growthCount", 1, 1, Integer.MAX_VALUE);
        enchantedAmethystGrowthCount = builder
                .comment("附魔紫水晶苹果食用后触发紫水晶母岩生长的次数（仅对玩家瞄准的母岩生效）")
                .defineInRange("enchantedGrowthCount", 3, 1, Integer.MAX_VALUE);
        builder.pop();

        builder.pop();

        SPEC = builder.build();
    }
}