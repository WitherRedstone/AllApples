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
                    .icon(() -> new ItemStack(APItems.SCULK_APPLE.get()))
                    .title(Component.translatable("itemGroup.all_apples_tab"))
                    .displayItems((parameters, output) -> {

                        output.accept(APItems.COAL_APPLE.get());
                        output.accept(APItems.ENCHANTED_COAL_APPLE.get());
                        output.accept(APItems.COPPER_APPLE.get());
                        output.accept(APItems.ENCHANTED_COPPER_APPLE.get());
                        output.accept(APItems.IRON_APPLE.get());
                        output.accept(APItems.ENCHANTED_IRON_APPLE.get());
                        output.accept(APItems.DIAMOND_APPLE.get());
                        output.accept(APItems.ENCHANTED_DIAMOND_APPLE.get());
                        output.accept(APItems.NETHERITE_APPLE.get());
                        output.accept(APItems.ENCHANTED_NETHERITE_APPLE.get());
                        output.accept(APItems.EMERALD_APPLE.get());
                        output.accept(APItems.ENCHANTED_EMERALD_APPLE.get());
                        output.accept(APItems.LAPIS_LAZULI_APPLE.get());
                        output.accept(APItems.ENCHANTED_LAPIS_LAZULI_APPLE.get());
                        output.accept(APItems.REDSTONE_APPLE.get());
                        output.accept(APItems.ENCHANTED_REDSTONE_APPLE.get());
                        output.accept(APItems.AMETHYST_SHARD_APPLE.get());
                        output.accept(APItems.ENCHANTED_AMETHYST_SHARD_APPLE.get());
                        output.accept(APItems.SLIME_APPLE.get());
                        output.accept(APItems.ENCHANTED_SLIME_APPLE.get());
                        output.accept(APItems.GLOWSTONE_APPLE.get());
                        output.accept(APItems.ENCHANTED_GLOWSTONE_APPLE.get());
                        output.accept(APItems.HEART_OF_THE_SEA_APPLE.get());
                        output.accept(APItems.NETHER_STAR_APPLE.get());
                        output.accept(APItems.HONEYCOMB_APPLE.get());
                        output.accept(APItems.SCULK_APPLE.get());
                        output.accept(APItems.QUARTZ_APPLE.get());
                        output.accept(APItems.HEAVY_APPLE.get());
                        output.accept(APItems.OBSIDIAN_APPLE.get());
                        output.accept(APItems.CRYING_OBSIDIAN_APPLE.get());
                        output.accept(APItems.BONE_APPLE.get());
                        output.accept(APItems.ENDER_APPLE.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}