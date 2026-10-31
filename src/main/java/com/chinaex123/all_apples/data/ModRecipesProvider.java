package com.chinaex123.all_apples.data;

import com.chinaex123.all_apples.init.APItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.COAL_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', ItemTags.COALS)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.COAL), has(ItemTags.COALS))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.ENCHANTED_COAL_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.STORAGE_BLOCKS_COAL)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.COAL_BLOCK), has(Tags.Items.STORAGE_BLOCKS_COAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.COPPER_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.INGOTS_COPPER)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Tags.Items.INGOTS_COPPER))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.ENCHANTED_COPPER_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.STORAGE_BLOCKS_COPPER)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.COPPER_BLOCK), has(Tags.Items.STORAGE_BLOCKS_COPPER))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.IRON_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.INGOTS_IRON)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Tags.Items.INGOTS_IRON))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.ENCHANTED_IRON_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.STORAGE_BLOCKS_IRON)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.IRON_BLOCK), has(Tags.Items.STORAGE_BLOCKS_IRON))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.DIAMOND_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.GEMS_DIAMOND)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.DIAMOND), has(Tags.Items.GEMS_DIAMOND))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.ENCHANTED_DIAMOND_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.STORAGE_BLOCKS_DIAMOND)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.DIAMOND_BLOCK), has(Tags.Items.STORAGE_BLOCKS_DIAMOND))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.NETHERITE_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.INGOTS_NETHERITE)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Tags.Items.INGOTS_NETHERITE))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.ENCHANTED_NETHERITE_APPLE.get())
                .pattern(" B ")
                .pattern("BAB")
                .pattern(" B ")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.STORAGE_BLOCKS_NETHERITE)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.NETHERITE_BLOCK), has(Tags.Items.STORAGE_BLOCKS_NETHERITE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.EMERALD_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.GEMS_EMERALD)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.EMERALD), has(Tags.Items.GEMS_EMERALD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.ENCHANTED_EMERALD_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.STORAGE_BLOCKS_EMERALD)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.EMERALD_BLOCK), has(Tags.Items.STORAGE_BLOCKS_EMERALD))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.LAPIS_LAZULI_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.GEMS_LAPIS)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Tags.Items.GEMS_LAPIS))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.ENCHANTED_LAPIS_LAZULI_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.STORAGE_BLOCKS_LAPIS)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.LAPIS_BLOCK), has(Tags.Items.STORAGE_BLOCKS_LAPIS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.REDSTONE_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.DUSTS_REDSTONE)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.REDSTONE), has(Tags.Items.DUSTS_REDSTONE))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.ENCHANTED_REDSTONE_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.STORAGE_BLOCKS_REDSTONE)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.REDSTONE_BLOCK), has(Tags.Items.STORAGE_BLOCKS_REDSTONE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.AMETHYST_SHARD_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.GEMS_AMETHYST)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Tags.Items.GEMS_AMETHYST))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.ENCHANTED_AMETHYST_SHARD_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Items.AMETHYST_BLOCK)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.AMETHYST_BLOCK), has(Items.AMETHYST_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.SLIME_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.SLIME_BALLS)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.SLIME_BALL), has(Tags.Items.SLIME_BALLS))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.ENCHANTED_SLIME_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.STORAGE_BLOCKS_SLIME)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.SLIME_BLOCK), has(Tags.Items.STORAGE_BLOCKS_SLIME))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.GLOWSTONE_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.DUSTS_GLOWSTONE)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.GLOWSTONE), has(Tags.Items.DUSTS_GLOWSTONE))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.ENCHANTED_GLOWSTONE_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Items.GLOWSTONE)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.GLOWSTONE), has(Items.GLOWSTONE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.HEART_OF_THE_SEA_APPLE.get())
                .pattern(" B ")
                .pattern("BAB")
                .pattern(" B ")
                .define('A', Items.APPLE)
                .define('B', Items.HEART_OF_THE_SEA)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.HEART_OF_THE_SEA), has(Items.HEART_OF_THE_SEA))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.NETHER_STAR_APPLE.get())
                .pattern(" B ")
                .pattern("BAB")
                .pattern(" B ")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.NETHER_STARS)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.NETHER_STAR), has(Tags.Items.NETHER_STARS))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.HONEYCOMB_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Items.HONEYCOMB)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.SCULK_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Items.ECHO_SHARD)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.ECHO_SHARD), has(Items.ECHO_SHARD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.QUARTZ_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.GEMS_QUARTZ)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.QUARTZ), has(Tags.Items.GEMS_QUARTZ))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.HEAVY_APPLE.get())
                .pattern(" B ")
                .pattern("BAB")
                .pattern(" B ")
                .define('A', Items.APPLE)
                .define('B', Items.HEAVY_CORE)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.HEAVY_CORE), has(Items.HEAVY_CORE))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.OBSIDIAN_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.OBSIDIANS)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.OBSIDIAN), has(Tags.Items.OBSIDIANS))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.CRYING_OBSIDIAN_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.OBSIDIANS_CRYING)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.CRYING_OBSIDIAN), has(Tags.Items.OBSIDIANS_CRYING))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.BONE_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Items.BONE_BLOCK)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.BONE_BLOCK), has(Items.BONE_BLOCK))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, APItems.ENDER_APPLE.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.APPLE)
                .define('B', Tags.Items.ENDER_PEARLS)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .unlockedBy(getHasName(Items.ENDER_PEARL), has(Tags.Items.ENDER_PEARLS))
                .save(recipeOutput);

    }

}
