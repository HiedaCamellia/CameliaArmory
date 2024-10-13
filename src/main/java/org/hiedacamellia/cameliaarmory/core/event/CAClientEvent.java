package org.hiedacamellia.cameliaarmory.core.event;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import org.hiedacamellia.cameliaarmory.CameliaArmory;
import org.hiedacamellia.cameliaarmory.registries.CAEntity;
import org.hiedacamellia.camellialib.client.render.ThrowableItemRender;

@EventBusSubscriber(modid = CameliaArmory.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CAClientEvent {
    @SubscribeEvent
    public static void onClientSetup(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(CAEntity.THROWING_KNIFE.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer(CAEntity.THROWING_AXE.get(), ThrownItemRenderer::new);
    }
}
