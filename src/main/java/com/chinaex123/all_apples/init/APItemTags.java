package com.chinaex123.all_apples.init;

import com.chinaex123.all_apples.AllApples;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public interface APItemTags {

    TagKey<Item> APPLES = bind("apples");

    private static TagKey<Item> bind(String name) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(AllApples.MOD_ID, name));
    }

    private static TagKey<Item> mcItemTag(String name) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("minecraft", name));
    }

    private static TagKey<Item> neoforgeItemTag(String name) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", name));
    }
}
