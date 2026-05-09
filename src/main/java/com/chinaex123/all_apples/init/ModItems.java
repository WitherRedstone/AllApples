package com.chinaex123.all_apples.init;

import com.chinaex123.all_apples.AllApples;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public interface ModItems {
    DeferredRegister.Items ITEMS_REGISTER = DeferredRegister.createItems(AllApples.MOD_ID);

    // ======================= 原版 =======================
    DeferredItem<Item> COAL_APPLE = ITEMS_REGISTER.register("coal_apple", () -> new Item(new Item.Properties().food(ModFoods.COAL_APPLE))); // 煤炭苹果
    DeferredItem<Item> ENCHANTED_COAL_APPLE = createEnchantedItem("enchanted_coal_apple", ModFoods.ENCHANTED_COAL_APPLE, Rarity.RARE); // 附魔煤炭苹果
    DeferredItem<Item> COPPER_APPLE = ITEMS_REGISTER.register("copper_apple", () -> new Item(new Item.Properties().food(ModFoods.COPPER_APPLE))); // 铜苹果
    DeferredItem<Item> ENCHANTED_COPPER_APPLE = createEnchantedItem("enchanted_copper_apple", ModFoods.ENCHANTED_COPPER_APPLE, Rarity.RARE); // 附魔铜苹果
    DeferredItem<Item> IRON_APPLE = ITEMS_REGISTER.register("iron_apple", () -> new Item(new Item.Properties().food(ModFoods.IRON_APPLE))); // 铁苹果
    DeferredItem<Item> ENCHANTED_IRON_APPLE = createEnchantedItem("enchanted_iron_apple", ModFoods.ENCHANTED_IRON_APPLE, Rarity.RARE); // 附魔铁苹果
    DeferredItem<Item> DIAMOND_APPLE = ITEMS_REGISTER.register("diamond_apple", () -> new Item(new Item.Properties().food(ModFoods.DIAMOND_APPLE))); // 钻石苹果
    DeferredItem<Item> ENCHANTED_DIAMOND_APPLE = createEnchantedItem("enchanted_diamond_apple", ModFoods.ENCHANTED_DIAMOND_APPLE, Rarity.RARE); // 附魔钻石苹果
    DeferredItem<Item> NETHERITE_APPLE = ITEMS_REGISTER.register("netherite_apple", () -> new Item(new Item.Properties().food(ModFoods.NETHERITE_APPLE))); // 下界合金苹果
    DeferredItem<Item> ENCHANTED_NETHERITE_APPLE = createEnchantedItem("enchanted_netherite_apple", ModFoods.ENCHANTED_NETHERITE_APPLE, Rarity.RARE); // 附魔下界合金苹果
    DeferredItem<Item> EMERALD_APPLE = ITEMS_REGISTER.register("emerald_apple", () -> new Item(new Item.Properties().food(ModFoods.EMERALD_APPLE))); // 绿宝石苹果
    DeferredItem<Item> ENCHANTED_EMERALD_APPLE = createEnchantedItem("enchanted_emerald_apple", ModFoods.ENCHANTED_EMERALD_APPLE, Rarity.RARE); // 附魔绿宝石苹果
    DeferredItem<Item> LAPIS_LAZULI_APPLE = ITEMS_REGISTER.register("lapis_lazuli_apple", () -> new Item(new Item.Properties().food(ModFoods.LAPIS_LAZULI_APPLE))); // 青金石苹果
    DeferredItem<Item> ENCHANTED_LAPIS_LAZULI_APPLE = createEnchantedItem("enchanted_lapis_lazuli_apple", ModFoods.ENCHANTED_LAPIS_LAZULI_APPLE, Rarity.RARE); // 附魔青金石苹果
    DeferredItem<Item> REDSTONE_APPLE = ITEMS_REGISTER.register("redstone_apple", () -> new Item(new Item.Properties().food(ModFoods.REDSTONE_APPLE))); // 红石苹果
    DeferredItem<Item> ENCHANTED_REDSTONE_APPLE = createEnchantedItem("enchanted_redstone_apple", ModFoods.ENCHANTED_REDSTONE_APPLE, Rarity.RARE); // 附魔红石苹果
    DeferredItem<Item> AMETHYST_SHARD_APPLE = ITEMS_REGISTER.register("amethyst_shard_apple", () -> new Item(new Item.Properties().food(ModFoods.AMETHYST_SHARD_APPLE))); // 紫水晶苹果
    DeferredItem<Item> ENCHANTED_AMETHYST_SHARD_APPLE = createEnchantedItem("enchanted_amethyst_shard_apple", ModFoods.ENCHANTED_AMETHYST_SHARD_APPLE, Rarity.RARE); // 附魔紫水晶苹果
    DeferredItem<Item> SLIME_APPLE = ITEMS_REGISTER.register("slime_apple", () -> new Item(new Item.Properties().food(ModFoods.SLIME_APPLE))); // 黏液苹果
    DeferredItem<Item> ENCHANTED_SLIME_APPLE = ITEMS_REGISTER.register("enchanted_slime_apple", () -> new Item(new Item.Properties().food(ModFoods.ENCHANTED_SLIME_APPLE))); // 附魔黏液苹果
    DeferredItem<Item> GLOWSTONE_APPLE = ITEMS_REGISTER.register("glowstone_apple", () -> new Item(new Item.Properties().food(ModFoods.GLOWSTONE_APPLE))); // 荧石苹果
    DeferredItem<Item> ENCHANTED_GLOWSTONE_APPLE = createEnchantedItem("enchanted_glowstone_apple", ModFoods.ENCHANTED_GLOWSTONE_APPLE, Rarity.RARE); // 附魔荧石苹果

    DeferredItem<Item> HEART_OF_THE_SEA_APPLE = ITEMS_REGISTER.register("heart_of_the_sea_apple", () -> new Item(new Item.Properties().food(ModFoods.HEART_OF_THE_SEA_APPLE))); // 海洋之心苹果
    DeferredItem<Item> NETHER_STAR_APPLE = ITEMS_REGISTER.register("nether_star_apple", () -> new Item(new Item.Properties().food(ModFoods.NETHER_STAR_APPLE))); // 下界之星苹果
    DeferredItem<Item> HONEYCOMB_APPLE = ITEMS_REGISTER.register("honeycomb_apple", () -> new Item(new Item.Properties().food(ModFoods.HONEYCOMB_APPLE))); // 蜜脾苹果
    DeferredItem<Item> ECHO_APPLE = ITEMS_REGISTER.register("echo_apple", () -> new Item(new Item.Properties().food(ModFoods.ECHO_APPLE))); // 回响苹果
    DeferredItem<Item> QUARTZ_APPLE = ITEMS_REGISTER.register("quartz_apple", () -> new Item(new Item.Properties().food(ModFoods.QUARTZ_APPLE))); // 下界石英苹果
    DeferredItem<Item> HEAVY_APPLE = ITEMS_REGISTER.register("heavy_apple", () -> new Item(new Item.Properties().food(ModFoods.HEAVY_APPLE))); // 沉重苹果
    DeferredItem<Item> OBSIDIAN_APPLE = ITEMS_REGISTER.register("obsidian_apple", () -> new Item(new Item.Properties().food(ModFoods.OBSIDIAN_APPLE))); // 黑曜石苹果
    DeferredItem<Item> CRYING_OBSIDIAN_APPLE = ITEMS_REGISTER.register("crying_obsidian_apple", () -> new Item(new Item.Properties().food(ModFoods.CRYING_OBSIDIAN_APPLE))); // 哭泣的黑曜石苹果
    DeferredItem<Item> BONE_APPLE = ITEMS_REGISTER.register("bone_apple", () -> new Item(new Item.Properties().food(ModFoods.BONE_APPLE))); // 骨块苹果
    DeferredItem<Item> ENDER_APPLE = ITEMS_REGISTER.register("ender_apple", () -> new Item(new Item.Properties().food(ModFoods.ENDER_APPLE))); // 末影苹果
    DeferredItem<Item> BELL_APPLE = ITEMS_REGISTER.register("bell_apple", () -> new Item(new Item.Properties().food(ModFoods.BELL_APPLE))); // 钟苹果


    // ======================= 联动模组 =======================









    /**
     * 创建带有附魔光效的物品
     */
    private static DeferredItem<Item> createEnchantedItem(String name, FoodProperties food) {
        return ITEMS_REGISTER.register(name, () -> new Item(new Item.Properties().food(food)) {
            @Override
            public boolean isFoil(ItemStack stack) {
                return true;
            }
        });
    }

    /**
     * 创建带有附魔光效和稀有度的物品
     */
    private static DeferredItem<Item> createEnchantedItem(String name, FoodProperties food, Rarity rarity) {
        return ITEMS_REGISTER.register(name, () -> new Item(new Item.Properties().food(food).rarity(rarity)) {
            @Override
            public boolean isFoil(ItemStack stack) {
                return true;
            }
        });
    }

    static void register(IEventBus eventBus){
        ITEMS_REGISTER.register(eventBus);
    }
}
