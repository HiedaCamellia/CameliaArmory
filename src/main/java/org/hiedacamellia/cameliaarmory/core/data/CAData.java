package org.hiedacamellia.cameliaarmory.core.data;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.hiedacamellia.cameliaarmory.CameliaArmory;
import org.hiedacamellia.cameliaarmory.core.data.lang.ChineseLanguageProvider;
import org.hiedacamellia.cameliaarmory.core.data.lang.EnglishLanguageProvider;
import org.hiedacamellia.cameliaarmory.core.data.provider.CAItemModelProvider;
import org.hiedacamellia.cameliaarmory.core.data.provider.CARecipeProvider;

@EventBusSubscriber(modid = CameliaArmory.MODID, bus = EventBusSubscriber.Bus.MOD)
public class CAData {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        var gen = event.getGenerator();
        var packOutput = gen.getPackOutput();
        var helper = event.getExistingFileHelper();
        var lookupProvider = event.getLookupProvider();
        gen.addProvider(event.includeClient(), new EnglishLanguageProvider(packOutput));
        gen.addProvider(event.includeClient(), new ChineseLanguageProvider(packOutput));
        gen.addProvider(event.includeClient(), new CAItemModelProvider(packOutput, helper));
        gen.addProvider(event.includeServer(), new CARecipeProvider(packOutput, lookupProvider));
    }

}
