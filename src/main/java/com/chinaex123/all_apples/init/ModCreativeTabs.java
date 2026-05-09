package com.chinaex123.all_apples.init;

import com.chinaex123.all_apples.AllApples;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AllApples.MOD_ID);

    public static final Supplier<CreativeModeTab> ALL_APPLES_TAB =
            CREATIVE_MODE_TAB.register("all_apples_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.IRON_APPLE.get()))
                    .title(Component.translatable("itemGroup.all_apples_tab"))
                    .displayItems((parameters, output) -> {

                        // ======================= 原版 =======================
                        output.accept(ModItems.COAL_APPLE.get()); // 煤炭苹果
                        output.accept(ModItems.ENCHANTED_COAL_APPLE.get()); // 附魔煤炭苹果
                        output.accept(ModItems.COPPER_APPLE.get()); // 铜苹果
                        output.accept(ModItems.ENCHANTED_COPPER_APPLE.get()); // 附魔铜苹果
                        output.accept(ModItems.IRON_APPLE.get()); // 铁苹果
                        output.accept(ModItems.ENCHANTED_IRON_APPLE.get()); // 附魔铁苹果
                        output.accept(ModItems.DIAMOND_APPLE.get()); // 钻石苹果
                        output.accept(ModItems.ENCHANTED_DIAMOND_APPLE.get()); // 附魔钻石苹果
                        output.accept(ModItems.NETHERITE_APPLE.get()); // 下界合金苹果
                        output.accept(ModItems.ENCHANTED_NETHERITE_APPLE.get()); // 附魔下界合金苹果
                        output.accept(ModItems.EMERALD_APPLE.get()); // 绿宝石苹果
                        output.accept(ModItems.ENCHANTED_EMERALD_APPLE.get()); // 附魔绿宝石苹果
                        output.accept(ModItems.LAPIS_LAZULI_APPLE.get()); // 青金石苹果
                        output.accept(ModItems.ENCHANTED_LAPIS_LAZULI_APPLE.get()); // 附魔青金石苹果
                        output.accept(ModItems.REDSTONE_APPLE.get()); // 红石苹果
                        output.accept(ModItems.ENCHANTED_REDSTONE_APPLE.get()); // 附魔红石苹果
                        output.accept(ModItems.AMETHYST_SHARD_APPLE.get()); // 紫水晶苹果
                        output.accept(ModItems.ENCHANTED_AMETHYST_SHARD_APPLE.get()); // 附魔紫水晶苹果
                        output.accept(ModItems.SLIME_APPLE.get()); // 黏液苹果
                        output.accept(ModItems.ENCHANTED_SLIME_APPLE.get()); // 附魔黏液苹果
                        output.accept(ModItems.GLOWSTONE_APPLE.get()); // 荧石苹果
                        output.accept(ModItems.ENCHANTED_GLOWSTONE_APPLE.get()); // 附魔荧石苹果

                        output.accept(ModItems.HEART_OF_THE_SEA_APPLE.get()); // 海洋之心苹果
                        output.accept(ModItems.NETHER_STAR_APPLE.get()); // 下界之星苹果
                        output.accept(ModItems.HONEYCOMB_APPLE.get()); // 蜜脾苹果
                        output.accept(ModItems.ECHO_APPLE.get()); // 回响苹果
                        output.accept(ModItems.QUARTZ_APPLE.get()); // 下界石英苹果
                        output.accept(ModItems.HEAVY_APPLE.get()); // 沉重苹果
                        output.accept(ModItems.OBSIDIAN_APPLE.get()); // 黑曜石苹果
                        output.accept(ModItems.CRYING_OBSIDIAN_APPLE.get()); // 哭泣的黑曜石苹果
                        output.accept(ModItems.BONE_APPLE.get()); // 骨块苹果
                        output.accept(ModItems.ENDER_APPLE.get()); // 末影苹果
                        output.accept(ModItems.BELL_APPLE.get()); // 钟苹果

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
