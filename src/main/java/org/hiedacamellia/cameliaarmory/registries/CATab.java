package org.hiedacamellia.cameliaarmory.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.cameliaarmory.CameliaArmory;

public class CATab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CameliaArmory.MODID);



    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> WG_TAB = TABS.register("cameliaarmory", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.cameliaarmory")).withTabsBefore(CreativeModeTabs.COMBAT).icon(CAItem.YUMI::toStack)
            .displayItems((parameters, output) -> {
                CAItem.ITEM_WITH_GUI.getEntries().forEach(holder -> output.accept(holder.get()));
                CAItem.ITEMS.getEntries().forEach(holder -> output.accept(holder.get()));
                CAItem.SPECIAL.getEntries().forEach(holder -> output.accept(holder.get()));
            }).build());

    public static void registry(IEventBus modEventBus) {
        TABS.register(modEventBus);
    }
}
