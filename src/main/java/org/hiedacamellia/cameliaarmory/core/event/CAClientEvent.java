package org.hiedacamellia.cameliaarmory.core.event;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.fml.common.Mod;
import org.hiedacamellia.cameliaarmory.CameliaArmory;
import org.hiedacamellia.cameliaarmory.registries.CAEntity;

@Mod.EventBusSubscriber(modid = CameliaArmory.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CAClientEvent {
    @SubscribeEvent
    public static void onClientSetup(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(CAEntity.THROWING_KNIFE.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer(CAEntity.THROWING_AXE.get(), ThrownItemRenderer::new);
    }
}
