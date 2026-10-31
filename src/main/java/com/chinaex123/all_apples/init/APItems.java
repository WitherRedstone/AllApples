package com.chinaex123.all_apples.init;

import com.chinaex123.all_apples.AllApples;
import com.chinaex123.all_apples.config.CommonConfig;
import com.chinaex123.all_apples.item.AmethystAppleItem;
import com.chinaex123.all_apples.item.EnderAppleItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public interface APItems {
    DeferredRegister.Items ITEMS = DeferredRegister.createItems(AllApples.MOD_ID);

    /** 煤炭苹果 */
    DeferredItem<Item> COAL_APPLE = ITEMS.register("coal_apple", () -> new Item(new Item.Properties().food(APFoods.COAL_APPLE)));
    /** 附魔煤炭苹果 */
    DeferredItem<Item> ENCHANTED_COAL_APPLE = createEnchantedItem("enchanted_coal_apple", APFoods.ENCHANTED_COAL_APPLE, Rarity.RARE);
    /** 铜苹果 */
    DeferredItem<Item> COPPER_APPLE = ITEMS.register("copper_apple", () -> new Item(new Item.Properties().food(APFoods.COPPER_APPLE)));
    /** 附魔铜苹果 */
    DeferredItem<Item> ENCHANTED_COPPER_APPLE = createEnchantedItem("enchanted_copper_apple", APFoods.ENCHANTED_COPPER_APPLE, Rarity.RARE);
    /** 铁苹果 */
    DeferredItem<Item> IRON_APPLE = ITEMS.register("iron_apple", () -> new Item(new Item.Properties().food(APFoods.IRON_APPLE)));
    /** 附魔铁苹果 */
    DeferredItem<Item> ENCHANTED_IRON_APPLE = createEnchantedItem("enchanted_iron_apple", APFoods.ENCHANTED_IRON_APPLE, Rarity.RARE);
    /** 钻石苹果 */
    DeferredItem<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple", () -> new Item(new Item.Properties().food(APFoods.DIAMOND_APPLE)));
    /** 附魔钻石苹果 */
    DeferredItem<Item> ENCHANTED_DIAMOND_APPLE = createEnchantedItem("enchanted_diamond_apple", APFoods.ENCHANTED_DIAMOND_APPLE, Rarity.RARE);
    /** 下界合金苹果 */
    DeferredItem<Item> NETHERITE_APPLE = ITEMS.register("netherite_apple", () -> new Item(new Item.Properties().food(APFoods.NETHERITE_APPLE)));
    /** 附魔下界合金苹果 */
    DeferredItem<Item> ENCHANTED_NETHERITE_APPLE = createEnchantedItem("enchanted_netherite_apple", APFoods.ENCHANTED_NETHERITE_APPLE, Rarity.RARE);
    /** 绿宝石苹果 */
    DeferredItem<Item> EMERALD_APPLE = ITEMS.register("emerald_apple", () -> new Item(new Item.Properties().food(APFoods.EMERALD_APPLE)));
    /** 附魔绿宝石苹果 */
    DeferredItem<Item> ENCHANTED_EMERALD_APPLE = createEnchantedItem("enchanted_emerald_apple", APFoods.ENCHANTED_EMERALD_APPLE, Rarity.RARE);
    /** 青金石苹果 */
    DeferredItem<Item> LAPIS_LAZULI_APPLE = ITEMS.register("lapis_lazuli_apple", () -> new Item(new Item.Properties().food(APFoods.LAPIS_LAZULI_APPLE)));
    /** 附魔青金石苹果 */
    DeferredItem<Item> ENCHANTED_LAPIS_LAZULI_APPLE = createEnchantedItem("enchanted_lapis_lazuli_apple", APFoods.ENCHANTED_LAPIS_LAZULI_APPLE, Rarity.RARE);
    /** 红石苹果 */
    DeferredItem<Item> REDSTONE_APPLE = ITEMS.register("redstone_apple", () -> new Item(new Item.Properties().food(APFoods.REDSTONE_APPLE)));
    /** 附魔红石苹果 */
    DeferredItem<Item> ENCHANTED_REDSTONE_APPLE = createEnchantedItem("enchanted_redstone_apple", APFoods.ENCHANTED_REDSTONE_APPLE, Rarity.RARE);
    /** 紫水晶苹果 */
    DeferredItem<Item> AMETHYST_SHARD_APPLE = createAmethystApple("amethyst_shard_apple", APFoods.AMETHYST_SHARD_APPLE, CommonConfig.amethystGrowthCount);
    /** 附魔紫水晶苹果 */
    DeferredItem<Item> ENCHANTED_AMETHYST_SHARD_APPLE = createEnchantedAmethystApple("enchanted_amethyst_shard_apple", APFoods.ENCHANTED_AMETHYST_SHARD_APPLE, CommonConfig.enchantedAmethystGrowthCount);
    /** 黏液苹果 */
    DeferredItem<Item> SLIME_APPLE = ITEMS.register("slime_apple", () -> new Item(new Item.Properties().food(APFoods.SLIME_APPLE)));
    /** 附魔黏液苹果 */
    DeferredItem<Item> ENCHANTED_SLIME_APPLE = ITEMS.register("enchanted_slime_apple", () -> new Item(new Item.Properties().food(APFoods.ENCHANTED_SLIME_APPLE)));
    /** 荧石苹果 */
    DeferredItem<Item> GLOWSTONE_APPLE = ITEMS.register("glowstone_apple", () -> new Item(new Item.Properties().food(APFoods.GLOWSTONE_APPLE)));
    /** 附魔荧石苹果 */
    DeferredItem<Item> ENCHANTED_GLOWSTONE_APPLE = createEnchantedItem("enchanted_glowstone_apple", APFoods.ENCHANTED_GLOWSTONE_APPLE, Rarity.RARE);

    /** 海洋之心苹果 */
    DeferredItem<Item> HEART_OF_THE_SEA_APPLE = ITEMS.register("heart_of_the_sea_apple", () -> new Item(new Item.Properties().food(APFoods.HEART_OF_THE_SEA_APPLE)));
    /** 下界之星苹果 */
    DeferredItem<Item> NETHER_STAR_APPLE = ITEMS.register("nether_star_apple", () -> new Item(new Item.Properties().food(APFoods.NETHER_STAR_APPLE)));
    /** 蜜脾苹果 */
    DeferredItem<Item> HONEYCOMB_APPLE = ITEMS.register("honeycomb_apple", () -> new Item(new Item.Properties().food(APFoods.HONEYCOMB_APPLE)));
    /** 幽匿苹果 */
    DeferredItem<Item> SCULK_APPLE = ITEMS.register("sculk_apple", () -> new Item(new Item.Properties().food(APFoods.SCULK_APPLE)));
    /** 石英苹果 */
    DeferredItem<Item> QUARTZ_APPLE = ITEMS.register("quartz_apple", () -> new Item(new Item.Properties().food(APFoods.QUARTZ_APPLE)));
    /** 沉重苹果 */
    DeferredItem<Item> HEAVY_APPLE = ITEMS.register("heavy_apple", () -> new Item(new Item.Properties().food(APFoods.HEAVY_APPLE)));
    /** 黑曜石苹果 */
    DeferredItem<Item> OBSIDIAN_APPLE = ITEMS.register("obsidian_apple", () -> new Item(new Item.Properties().food(APFoods.OBSIDIAN_APPLE)));
    /** 哭泣的黑曜石苹果 */
    DeferredItem<Item> CRYING_OBSIDIAN_APPLE = ITEMS.register("crying_obsidian_apple", () -> new Item(new Item.Properties().food(APFoods.CRYING_OBSIDIAN_APPLE)));
    /** 骨块苹果 */
    DeferredItem<Item> BONE_APPLE = ITEMS.register("bone_apple", () -> new Item(new Item.Properties().food(APFoods.BONE_APPLE)));
    /** 末影苹果 */
    DeferredItem<Item> ENDER_APPLE = ITEMS.register("ender_apple", () -> new EnderAppleItem(new Item.Properties().food(APFoods.ENDER_APPLE)));

    /**
     * 创建带有附魔光效的物品
     */
    private static DeferredItem<Item> createEnchantedItem(String name, FoodProperties food) {
        return ITEMS.register(name, () -> new Item(new Item.Properties().food(food)) {
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
        return ITEMS.register(name, () -> new Item(new Item.Properties().food(food).rarity(rarity)) {
            @Override
            public boolean isFoil(ItemStack stack) {
                return true;
            }
        });
    }

    /**
     * 创建紫水晶苹果
     */
    private static DeferredItem<Item> createAmethystApple(String name, FoodProperties food, java.util.function.Supplier<Integer> countSupplier) {
        return ITEMS.register(name, () -> new AmethystAppleItem(new Item.Properties().food(food), countSupplier));
    }

    /**
     * 创建带有附魔光效和稀有度的紫水晶苹果
     */
    private static DeferredItem<Item> createEnchantedAmethystApple(String name, FoodProperties food, java.util.function.Supplier<Integer> countSupplier) {
        return ITEMS.register(name, () -> new AmethystAppleItem(new Item.Properties().food(food).rarity(Rarity.RARE), countSupplier) {
            @Override
            public boolean isFoil(ItemStack stack) {
                return true;
            }
        });
    }

    static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}