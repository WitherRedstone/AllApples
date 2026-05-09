package com.chinaex123.all_apples;

import com.chinaex123.all_apples.config.CommonConfig;
import com.chinaex123.all_apples.init.ModCreativeTabs;
import com.chinaex123.all_apples.init.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;

@Mod(AllApples.MOD_ID)
public class AllApples {
    public static final String MOD_ID = "all_apples";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AllApples(IEventBus modEventBus, ModContainer modContainer) {

        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);

//        modContainer.registerConfig(ModConfig.Type.COMMON, CommonConfig.SPEC);
    }
}
