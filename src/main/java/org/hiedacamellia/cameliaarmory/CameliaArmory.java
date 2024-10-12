package org.hiedacamellia.cameliaarmory;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.hiedacamellia.cameliaarmory.registries.CAItem;
import org.hiedacamellia.cameliaarmory.registries.CATab;

@Mod(CameliaArmory.MODID)
public class CameliaArmory {
    public static final String MODID = "cameliaarmory";

    public CameliaArmory(IEventBus modEventBus, ModContainer modContainer) {
        CAItem.registry(modEventBus);
        CATab.registry(modEventBus);
    }

}
