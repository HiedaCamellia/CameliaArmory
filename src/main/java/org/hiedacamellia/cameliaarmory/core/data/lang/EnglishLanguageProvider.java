package org.hiedacamellia.cameliaarmory.core.data.lang;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import org.hiedacamellia.cameliaarmory.CameliaArmory;
import org.hiedacamellia.cameliaarmory.registries.CAItem;
import org.hiedacamellia.camellialib.core.data.lang.CamelliaLanguageProvider;
import org.jetbrains.annotations.Nullable;

public class EnglishLanguageProvider extends CamelliaLanguageProvider {
    public EnglishLanguageProvider(PackOutput output) {
        super(output, CameliaArmory.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        CAItem.tiers.forEach((tier) -> {
            addWithTooltip(CAItem.BASTARD_SWORD.get(tier).get(),getTierTrans(tier)+"Bastard Sword","");
            addWithTooltip(CAItem.CLAYMORE.get(tier).get(),getTierTrans(tier)+"Claymore","");
            addWithTooltip(CAItem.HALBERD.get(tier).get(),getTierTrans(tier)+"Halberd","");
            addWithTooltip(CAItem.HENGDAO.get(tier).get(),getTierTrans(tier)+"Hengdao","");
            addWithTooltip(CAItem.LUCERNE_HAMMER.get(tier).get(),getTierTrans(tier)+"Lucerne Hammer","");
            addWithTooltip(CAItem.PIKE.get(tier).get(),getTierTrans(tier)+"Pike","");
            addWithTooltip(CAItem.SCYTHE.get(tier).get(),getTierTrans(tier)+"Scythe","");
            addWithTooltip(CAItem.SPEAR.get(tier).get(),getTierTrans(tier)+"Spear","");
            addWithTooltip(CAItem.TACHI.get(tier).get(),getTierTrans(tier)+"Tachi","");
            addWithTooltip(CAItem.THROWING_AXE.get(tier).get(),getTierTrans(tier)+"Throwing Axe","");
            addWithTooltip(CAItem.THROWING_KNIFE.get(tier).get(),getTierTrans(tier)+"Throwing Knife","");
            addWithTooltip(CAItem.UCHIGATANA.get(tier).get(),getTierTrans(tier)+"Uchigatana","");
            addWithTooltip(CAItem.WAKIZASHI.get(tier).get(),getTierTrans(tier)+"Wakizashi","");
            addWithTooltip(CAItem.ZWEIHANDER.get(tier).get(),getTierTrans(tier)+"Zweihander","");
        });
        addWithTooltip(CAItem.WOODEN_CLUB.get(),"Wooden Club","");
        addWithTooltip(CAItem.STUDDED_CLUB.get(),"Studded Club","");
        CAItem.tiers.subList(2, 5).forEach((tier) -> addWithTooltip(CAItem.SPINY_MAUL.get(tier).get(),getTierTrans(tier)+"Spiny Maul",""));

        addWithTooltip(CAItem.KOMACHI_SCYTHE.get(),"Komachi's Scythe","");
        addWithTooltip(CAItem.LONG_STICK.get(),"Long stick","");
        addWithTooltip(CAItem.MACUAHUITL.get(),"Macuahuitl","");
        addWithTooltip(CAItem.ENGLAND_LONGBOW.get(),"England LongBow","");
        addWithTooltip(CAItem.YUMI.get(),"Yumi","");

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
