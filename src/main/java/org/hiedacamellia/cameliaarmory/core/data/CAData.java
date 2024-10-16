package org.hiedacamellia.cameliaarmory.core.data;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.fml.common.Mod;
import org.hiedacamellia.cameliaarmory.CameliaArmory;
import org.hiedacamellia.cameliaarmory.core.data.lang.ChineseLanguageProvider;
import org.hiedacamellia.cameliaarmory.core.data.lang.EnglishLanguageProvider;
import org.hiedacamellia.cameliaarmory.core.data.provider.CAItemModelProvider;
import org.hiedacamellia.cameliaarmory.core.data.provider.CARecipeProvider;

@Mod.EventBusSubscriber(modid = CameliaArmory.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CAData {
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        var gen = event.getGenerator();
        var packOutput = gen.getPackOutput();
        var helper = event.getExistingFileHelper();
        gen.addProvider(event.includeClient(), new EnglishLanguageProvider(packOutput));
        gen.addProvider(event.includeClient(), new ChineseLanguageProvider(packOutput));
        gen.addProvider(event.includeClient(), new CAItemModelProvider(packOutput, helper));
        gen.addProvider(event.includeServer(), new CARecipeProvider(packOutput));
    }
}
