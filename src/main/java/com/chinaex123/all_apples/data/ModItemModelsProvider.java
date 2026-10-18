package com.chinaex123.all_apples.data;

import com.chinaex123.all_apples.AllApples;
import com.chinaex123.all_apples.init.APItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemModelsProvider extends ItemModelProvider {
    public ModItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AllApples.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // ======================= 原版 =======================
        enchantedFoodItem(APItems.COAL_APPLE, APItems.ENCHANTED_COAL_APPLE);
        enchantedFoodItem(APItems.COPPER_APPLE, APItems.ENCHANTED_COPPER_APPLE);
        enchantedFoodItem(APItems.IRON_APPLE, APItems.ENCHANTED_IRON_APPLE);
        enchantedFoodItem(APItems.DIAMOND_APPLE, APItems.ENCHANTED_DIAMOND_APPLE);
        enchantedFoodItem(APItems.NETHERITE_APPLE, APItems.ENCHANTED_NETHERITE_APPLE);
        enchantedFoodItem(APItems.EMERALD_APPLE, APItems.ENCHANTED_EMERALD_APPLE);
        enchantedFoodItem(APItems.LAPIS_LAZULI_APPLE, APItems.ENCHANTED_LAPIS_LAZULI_APPLE);
        enchantedFoodItem(APItems.REDSTONE_APPLE, APItems.ENCHANTED_REDSTONE_APPLE);
        enchantedFoodItem(APItems.AMETHYST_SHARD_APPLE, APItems.ENCHANTED_AMETHYST_SHARD_APPLE);
        enchantedFoodItem(APItems.SLIME_APPLE, APItems.ENCHANTED_SLIME_APPLE);
        enchantedFoodItem(APItems.GLOWSTONE_APPLE, APItems.ENCHANTED_GLOWSTONE_APPLE);
        basicItem(APItems.HEART_OF_THE_SEA_APPLE.get());
        basicItem(APItems.NETHER_STAR_APPLE.get());
        basicItem(APItems.HONEYCOMB_APPLE.get());
        basicItem(APItems.SCULK_APPLE.get());
        basicItem(APItems.QUARTZ_APPLE.get());
        basicItem(APItems.HEAVY_APPLE.get());
        basicItem(APItems.OBSIDIAN_APPLE.get());
        basicItem(APItems.CRYING_OBSIDIAN_APPLE.get());
        basicItem(APItems.BONE_APPLE.get());
        basicItem(APItems.ENDER_APPLE.get());

        // ======================= 联动模组 =======================




    }


    private void enchantedFoodItem(DeferredItem<?> baseItem, DeferredItem<?> enchantedItem) {
        String baseItemName = baseItem.getId().getPath();
        String enchantedItemName = enchantedItem.getId().getPath();

        // 基础物品使用自己的纹理
        ItemModelBuilder baseBuilder = withExistingParent(baseItemName, ResourceLocation.withDefaultNamespace("item/generated"));
        baseBuilder.texture("layer0", ResourceLocation.fromNamespaceAndPath(AllApples.MOD_ID, "item/" + baseItemName));

        // 附魔物品使用基础物品的纹理
        ItemModelBuilder enchantedBuilder = withExistingParent(enchantedItemName, ResourceLocation.withDefaultNamespace("item/generated"));
        enchantedBuilder.texture("layer0", ResourceLocation.fromNamespaceAndPath(AllApples.MOD_ID, "item/" + baseItemName));
    }

    private void basicFoodItem(DeferredItem<?> item) {
        String itemName = item.getId().getPath();
        ItemModelBuilder builder = withExistingParent(itemName, ResourceLocation.withDefaultNamespace("item/generated"));
        builder.texture("layer0", ResourceLocation.fromNamespaceAndPath(AllApples.MOD_ID, "item/compat/" + itemName));
    }
}
