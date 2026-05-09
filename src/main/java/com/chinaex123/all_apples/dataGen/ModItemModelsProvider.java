package com.chinaex123.all_apples.dataGen;

import com.chinaex123.all_apples.AllApples;
import com.chinaex123.all_apples.init.ModItems;
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
        enchantedFoodItem(ModItems.COAL_APPLE, ModItems.ENCHANTED_COAL_APPLE); // 煤炭苹果
        enchantedFoodItem(ModItems.COPPER_APPLE, ModItems.ENCHANTED_COPPER_APPLE); // 铜苹果
        enchantedFoodItem(ModItems.IRON_APPLE, ModItems.ENCHANTED_IRON_APPLE); // 铁苹果
        enchantedFoodItem(ModItems.DIAMOND_APPLE, ModItems.ENCHANTED_DIAMOND_APPLE); // 钻石苹果
        enchantedFoodItem(ModItems.NETHERITE_APPLE, ModItems.ENCHANTED_NETHERITE_APPLE); // 下界合金苹果
        enchantedFoodItem(ModItems.EMERALD_APPLE, ModItems.ENCHANTED_EMERALD_APPLE); // 绿宝石苹果
        enchantedFoodItem(ModItems.LAPIS_LAZULI_APPLE, ModItems.ENCHANTED_LAPIS_LAZULI_APPLE); // 青金石苹果
        enchantedFoodItem(ModItems.REDSTONE_APPLE, ModItems.ENCHANTED_REDSTONE_APPLE); // 红石苹果
        enchantedFoodItem(ModItems.AMETHYST_SHARD_APPLE, ModItems.ENCHANTED_AMETHYST_SHARD_APPLE); // 紫水晶苹果
        enchantedFoodItem(ModItems.SLIME_APPLE, ModItems.ENCHANTED_SLIME_APPLE); // 黏液苹果
        enchantedFoodItem(ModItems.GLOWSTONE_APPLE, ModItems.ENCHANTED_GLOWSTONE_APPLE); // 荧石苹果

        basicFoodItem(ModItems.HEART_OF_THE_SEA_APPLE); // 海洋之心苹果
        basicFoodItem(ModItems.NETHER_STAR_APPLE); // 下界之星苹果
        basicFoodItem(ModItems.HONEYCOMB_APPLE); // 蜜脾苹果
        basicFoodItem(ModItems.ECHO_APPLE); // 回响苹果
        basicFoodItem(ModItems.QUARTZ_APPLE); // 下界石英苹果
        basicFoodItem(ModItems.HEAVY_APPLE); // 沉重苹果
        basicFoodItem(ModItems.OBSIDIAN_APPLE); // 黑曜石苹果
        basicFoodItem(ModItems.CRYING_OBSIDIAN_APPLE); // 哭泣的黑曜石苹果
        basicFoodItem(ModItems.BONE_APPLE); // 骨块苹果
        basicFoodItem(ModItems.ENDER_APPLE); // 末影苹果
        basicFoodItem(ModItems.BELL_APPLE); // 钟苹果


        // ======================= 联动模组 =======================




    }

    /**
     * 食物物品模型（路径：textures/item/food/）
     */
    private void basicFoodItem(DeferredItem<?> item) {
        String itemName = item.getId().getPath();
        ItemModelBuilder builder = withExistingParent(itemName, ResourceLocation.withDefaultNamespace("item/generated"));
        builder.texture("layer0", ResourceLocation.fromNamespaceAndPath(AllApples.MOD_ID, "item/food/" + itemName));
    }

    /**
     * 附魔物品模型（使用相同纹理，但带有附魔光效）
     * @param baseItem 基础物品（提供纹理）
     * @param enchantedItem 附魔物品（使用基础物品的纹理）
     */
    private void enchantedFoodItem(DeferredItem<?> baseItem, DeferredItem<?> enchantedItem) {
        String baseItemName = baseItem.getId().getPath();
        String enchantedItemName = enchantedItem.getId().getPath();

        // 基础物品使用自己的纹理
        ItemModelBuilder baseBuilder = withExistingParent(baseItemName, ResourceLocation.withDefaultNamespace("item/generated"));
        baseBuilder.texture("layer0", ResourceLocation.fromNamespaceAndPath(AllApples.MOD_ID, "item/food/" + baseItemName));

        // 附魔物品使用基础物品的纹理
        ItemModelBuilder enchantedBuilder = withExistingParent(enchantedItemName, ResourceLocation.withDefaultNamespace("item/generated"));
        enchantedBuilder.texture("layer0", ResourceLocation.fromNamespaceAndPath(AllApples.MOD_ID, "item/food/" + baseItemName));
    }

    /**
     * Croptopia 联动物品模型（路径：textures/item/food/compat/croptopia）
     */
    private void basicCroptopiaItem(DeferredItem<?> item) {
        String itemName = item.getId().getPath();
        ItemModelBuilder builder = withExistingParent(itemName, ResourceLocation.withDefaultNamespace("item/generated"));
        builder.texture("layer0", ResourceLocation.fromNamespaceAndPath(AllApples.MOD_ID, "item/food/compat/croptopia/" + itemName));
    }
}
