package org.hiedacamellia.cameliaarmory.core.data.lang;

import net.minecraft.data.PackOutput;
import org.hiedacamellia.cameliaarmory.CameliaArmory;
import org.hiedacamellia.camellialib.core.data.lang.CamelliaLanguageProvider;

public class EnglishLanguageProvider extends CamelliaLanguageProvider {
    public EnglishLanguageProvider(PackOutput output) {
        super(output, CameliaArmory.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {

    }
}
