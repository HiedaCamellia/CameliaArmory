package org.hiedacamellia.cameliaarmory.core.data.lang;

import net.minecraft.data.PackOutput;
import org.hiedacamellia.cameliaarmory.CameliaArmory;
import org.hiedacamellia.cameliaarmory.registries.CAItem;
import org.hiedacamellia.camellialib.core.data.lang.CamelliaLanguageProvider;

public class EnglishLanguageProvider extends CamelliaLanguageProvider {
    public EnglishLanguageProvider(PackOutput output) {
        super(output, CameliaArmory.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        CAItem.tiers.forEach((tier) -> {
            addWithTooltip(CAItem.BASTARD_SWORD.get(tier).toStack(),getTierTrans(tier)+"Bastard Sword","");
            addWithTooltip(CAItem.CLAYMORE.get(tier).toStack(),getTierTrans(tier)+"Claymore","");
            addWithTooltip(CAItem.HALBERD.get(tier).toStack(),getTierTrans(tier)+"Halberd","");
            addWithTooltip(CAItem.HENGDAO.get(tier).toStack(),getTierTrans(tier)+"Hengdao","");
            addWithTooltip(CAItem.LUCERNE_HAMMER.get(tier).toStack(),getTierTrans(tier)+"Lucerne Hammer","");
            addWithTooltip(CAItem.PIKE.get(tier).toStack(),getTierTrans(tier)+"Pike","");
            addWithTooltip(CAItem.SCYTHE.get(tier).toStack(),getTierTrans(tier)+"Scythe","");
            addWithTooltip(CAItem.SPEAR.get(tier).toStack(),getTierTrans(tier)+"Spear","");
            addWithTooltip(CAItem.TACHI.get(tier).toStack(),getTierTrans(tier)+"Tachi","");
            addWithTooltip(CAItem.THROWING_AXE.get(tier).toStack(),getTierTrans(tier)+"Throwing Axe","");
            addWithTooltip(CAItem.THROWING_KNIFE.get(tier).toStack(),getTierTrans(tier)+"Throwing Knife","");
            addWithTooltip(CAItem.UCHIGATANA.get(tier).toStack(),getTierTrans(tier)+"Uchigatana","");
            addWithTooltip(CAItem.WAKIZASHI.get(tier).toStack(),getTierTrans(tier)+"Wakizashi","");
            addWithTooltip(CAItem.ZWEIHANDER.get(tier).toStack(),getTierTrans(tier)+"Zweihander","");
        });
        addWithTooltip(CAItem.WOODEN_CLUB.toStack(),"Wooden Club","");
        addWithTooltip(CAItem.STUDDED_CLUB.toStack(),"Studded Club","");
        CAItem.tiers.subList(2, 5).forEach((tier) -> addWithTooltip(CAItem.SPINY_MAUL.get(tier).toStack(),getTierTrans(tier)+"Spiny Maul",""));

        addWithTooltip(CAItem.KOMACHI_SCYTHE.toStack(),"Komachi's Scythe","");
        addWithTooltip(CAItem.LONG_STICK.toStack(),"Long stick","");
        addWithTooltip(CAItem.MACUAHUITL.toStack(),"Macuahuitl","");
        addWithTooltip(CAItem.ENGLAND_LONGBOW.toStack(),"England LongBow","");
        addWithTooltip(CAItem.YUMI.toStack(),"Yumi","");

        add("itemGroup.cameliaarmory","Camelia Armory");

    }


    public static String getTierTrans(String tier){
        return switch (tier) {
            case "wooden" -> "Wooden ";
            case "stone" -> "Stone ";
            case "iron" -> "Iron ";
            case "golden" -> "Golden ";
            case "diamond" -> "Diamond ";
            case "netherite" -> "Netherite ";
            default -> "Unknown ";
        };
    }
}
