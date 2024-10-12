package org.hiedacamellia.cameliaarmory.core.event;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ModelEvent;
import org.hiedacamellia.cameliaarmory.CameliaArmory;
import org.hiedacamellia.cameliaarmory.core.entry.MutiModelsItem;
import org.hiedacamellia.cameliaarmory.registries.CAItem;

@EventBusSubscriber(value = Dist.CLIENT, modid = CameliaArmory.MODID, bus = EventBusSubscriber.Bus.MOD)
public class CAClientEvent {


    @SubscribeEvent
    public static void onModelLoad(ModelEvent.RegisterAdditional event) {

        for (var item : CAItem.ITEM_WITH_GUI.getEntries()) {
            if(item.get() instanceof MutiModelsItem mutiModelsItem) {
                event.register(mutiModelsItem.icon());
                event.register(mutiModelsItem.model());
            }
        }
    }
}
