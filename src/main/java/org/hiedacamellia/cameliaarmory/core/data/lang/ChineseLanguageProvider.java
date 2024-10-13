package org.hiedacamellia.cameliaarmory.core.data.lang;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import org.hiedacamellia.cameliaarmory.CameliaArmory;
import org.hiedacamellia.cameliaarmory.registries.CAItem;
import org.hiedacamellia.camellialib.core.data.lang.CamelliaLanguageProvider;

public class ChineseLanguageProvider extends CamelliaLanguageProvider {
    public ChineseLanguageProvider(PackOutput output) {
        super(output, CameliaArmory.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        CAItem.tiers.forEach((tier) -> {
            addWithTooltip(CAItem.BASTARD_SWORD.get(tier).toStack(),getTierTrans(tier)+"\u624b\u534a\u5251","");
            addWithTooltip(CAItem.CLAYMORE.get(tier).toStack(),getTierTrans(tier)+"\u82cf\u683c\u5170\u9614\u5251","");
            addWithTooltip(CAItem.HALBERD.get(tier).toStack(),getTierTrans(tier)+"\u621f","");
            addWithTooltip(CAItem.HENGDAO.get(tier).toStack(),getTierTrans(tier)+"\u6a2a\u5200","");
            addWithTooltip(CAItem.LUCERNE_HAMMER.get(tier).toStack(),getTierTrans(tier)+"\u7409\u68ee\u9524","");
            addWithTooltip(CAItem.PIKE.get(tier).toStack(),getTierTrans(tier)+"\u957f\u77db","");
            addWithTooltip(CAItem.SCYTHE.get(tier).toStack(),getTierTrans(tier)+"\u9570\u5200","");
            addWithTooltip(CAItem.SPEAR.get(tier).toStack(),getTierTrans(tier)+"\u77db","");
            addWithTooltip(CAItem.TACHI.get(tier).toStack(),getTierTrans(tier)+"\u592a\u5200","");
            addWithTooltip(CAItem.THROWING_AXE.get(tier).toStack(),getTierTrans(tier)+"\u98de\u65a7","");
            addWithTooltip(CAItem.THROWING_KNIFE.get(tier).toStack(),getTierTrans(tier)+"\u98de\u5200","");
            addWithTooltip(CAItem.UCHIGATANA.get(tier).toStack(),getTierTrans(tier)+"\u6253\u5200","");
            addWithTooltip(CAItem.WAKIZASHI.get(tier).toStack(),getTierTrans(tier)+"\u808b\u5dee","");
            addWithTooltip(CAItem.ZWEIHANDER.get(tier).toStack(),getTierTrans(tier)+"\u5fb7\u5f0f\u53cc\u624b\u5251","");
        });
        addWithTooltip(CAItem.WOODEN_CLUB.toStack(),"\u6728\u68d2","");
        addWithTooltip(CAItem.STUDDED_CLUB.toStack(),"\u5e26\u9489\u6728\u68d2","");
        CAItem.tiers.subList(2, 5).forEach((tier) -> addWithTooltip(CAItem.SPINY_MAUL.get(tier).toStack(),getTierTrans(tier)+"\u72fc\u7259\u68d2",""));

        addWithTooltip(CAItem.KOMACHI_SCYTHE.toStack(),"\u5c0f\u91ce\u585a\u7684\u9570\u5200","");
        addWithTooltip(CAItem.LONG_STICK.toStack(),"\u957f\u68cd","");
        addWithTooltip(CAItem.MACUAHUITL.toStack(),"\u9a6c\u5938\u5a01\u7279","");
        addWithTooltip(CAItem.ENGLAND_LONGBOW.toStack(),"\u82f1\u683c\u5170\u957f\u5f13","");
        addWithTooltip(CAItem.YUMI.toStack(),"\u548c\u5f13","");

        add("itemGroup.cameliaarmory","\u5c71\u8336\u82b1\u6b66\u5668");

    }


    public static String getTierTrans(String tier){
        return switch (tier) {
            case "wooden" -> "\u6728";
            case "stone" -> "\u77f3";
            case "iron" -> "\u94c1";
            case "golden" -> "\u91d1";
            case "diamond" -> "\u94bb\u77f3";
            case "netherite" -> "\u4e0b\u754c\u5408\u91d1";
            default -> "\u672a\u77e5";
        };
    }
}
