package com.chinaex123.all_apples.data;

import com.chinaex123.all_apples.AllApples;
import com.chinaex123.all_apples.init.APItemTags;
import com.chinaex123.all_apples.init.APItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                               CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, AllApples.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        List<Item> allApples = List.of(
                APItems.COAL_APPLE.get(),
                APItems.ENCHANTED_COAL_APPLE.get(),
                APItems.COPPER_APPLE.get(),
                APItems.ENCHANTED_COPPER_APPLE.get(),
                APItems.IRON_APPLE.get(),
                APItems.ENCHANTED_IRON_APPLE.get(),
                APItems.DIAMOND_APPLE.get(),
                APItems.ENCHANTED_DIAMOND_APPLE.get(),
                APItems.NETHERITE_APPLE.get(),
                APItems.ENCHANTED_NETHERITE_APPLE.get(),
                APItems.EMERALD_APPLE.get(),
                APItems.ENCHANTED_EMERALD_APPLE.get(),
                APItems.LAPIS_LAZULI_APPLE.get(),
                APItems.ENCHANTED_LAPIS_LAZULI_APPLE.get(),
                APItems.REDSTONE_APPLE.get(),
                APItems.ENCHANTED_REDSTONE_APPLE.get(),
                APItems.AMETHYST_SHARD_APPLE.get(),
                APItems.ENCHANTED_AMETHYST_SHARD_APPLE.get(),
                APItems.SLIME_APPLE.get(),
                APItems.ENCHANTED_SLIME_APPLE.get(),
                APItems.GLOWSTONE_APPLE.get(),
                APItems.ENCHANTED_GLOWSTONE_APPLE.get(),
                APItems.HEART_OF_THE_SEA_APPLE.get(),
                APItems.NETHER_STAR_APPLE.get(),
                APItems.HONEYCOMB_APPLE.get(),
                APItems.SCULK_APPLE.get(),
                APItems.QUARTZ_APPLE.get(),
                APItems.HEAVY_APPLE.get(),
                APItems.OBSIDIAN_APPLE.get(),
                APItems.CRYING_OBSIDIAN_APPLE.get(),
                APItems.BONE_APPLE.get(),
                APItems.ENDER_APPLE.get()
        );

        List<TagKey<Item>> tags = List.of(
                APItemTags.APPLES,
                ItemTags.HORSE_FOOD,
                Tags.Items.FOODS,
                Tags.Items.FOODS_FRUIT,
                Tags.Items.ANIMAL_FOODS
        );

        tags.forEach(t -> tag(t).add(allApples.toArray(Item[]::new)));
    }
}