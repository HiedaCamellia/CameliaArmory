package org.hiedacamellia.cameliaarmory;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hiedacamellia.cameliaarmory.registries.CAEntity;
import org.hiedacamellia.cameliaarmory.registries.CAItem;
import org.hiedacamellia.cameliaarmory.registries.CATab;

@Mod(CameliaArmory.MODID)
public class CameliaArmory {
    public static final String MODID = "cameliaarmory";
    public static final Logger LOGGER = LogManager.getLogger();

    public CameliaArmory() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CAItem.registry(modEventBus);
        CATab.registry(modEventBus);
        CAEntity.register(modEventBus);
    }

    public static ResourceLocation perfix(String path) {
        return new ResourceLocation(MODID, path);
    }
}
