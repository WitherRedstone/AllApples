package com.chinaex123.all_apples.client.tooltip;

import com.chinaex123.all_apples.init.APItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

@EventBusSubscriber(modid = "all_apples", value = Dist.CLIENT)
public class APTooltip {

    @SubscribeEvent
    public static void onTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();

        if (stack.is(APItems.AMETHYST_SHARD_APPLE.get())) {
            event.getToolTip().add(Component.translatable("tooltip.all_apples.amethyst_shard_apple"));
        } else if (stack.is(APItems.ENCHANTED_AMETHYST_SHARD_APPLE.get())) {
            event.getToolTip().add(Component.translatable("tooltip.all_apples.enchanted_amethyst_shard_apple"));
        } else if (stack.is(APItems.ENDER_APPLE.get())) {
            event.getToolTip().add(Component.translatable("tooltip.all_apples.ender_apple"));
        }
    }
}