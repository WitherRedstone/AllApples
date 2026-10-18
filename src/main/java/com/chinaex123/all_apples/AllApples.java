package com.chinaex123.all_apples;

import com.chinaex123.all_apples.init.ModCreativeTabs;
import com.chinaex123.all_apples.init.APItems;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(AllApples.MOD_ID)
public class AllApples {
    public static final String MOD_ID = "all_apples";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AllApples(IEventBus modEventBus, ModContainer modContainer) {

        APItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);

//        modContainer.registerConfig(ModConfig.Type.COMMON, CommonConfig.SPEC);
    }
}
