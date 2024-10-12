package org.hiedacamellia.cameliaarmory.registries;

import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.cameliaarmory.CameliaArmory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CAItem {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CameliaArmory.MODID);
    public static final DeferredRegister.Items ITEM_WITH_GUI = DeferredRegister.createItems(CameliaArmory.MODID);
    public static final DeferredRegister.Items SPECIAL = DeferredRegister.createItems(CameliaArmory.MODID);

    public static final List<String> armorys = List.of("bastard_sword"
    ,"claymore","halberd","hengdao","lucerne_hammer","pike","scythe","spear","spiny_maul"
    ,"tachi","throwing_axe","throwing_knife","uchigatana","wakizashi","zweihander");

    public static final List<String> tiers = List.of("wooden","stone","iron","golden","diamond","netherite");


    public static Map<String, DeferredItem<Item>> BASTARD_SWORD = tiers.stream()
            .collect(Collectors.toMap(s -> s+"_bastard_sword",s ->ITEMS.registerSimpleItem(s+"_bastard_sword") ));

    public static Map<String, DeferredItem<Item>> CLAYMORE = tiers.stream()
            .collect(Collectors.toMap(s -> s+"_claymore",s ->ITEM_WITH_GUI.registerSimpleItem(s+"_claymore") ));

    public static Map<String, DeferredItem<Item>> HALBERD = tiers.stream()
            .collect(Collectors.toMap(s -> s+"_halberd",s ->ITEM_WITH_GUI.registerSimpleItem(s+"_halberd") ));

    public static Map<String, DeferredItem<Item>> HENGDAO = tiers.stream()
            .collect(Collectors.toMap(s -> s+"_hengdao",s ->ITEMS.registerSimpleItem(s+"_hengdao") ));

    public static Map<String, DeferredItem<Item>> LUCERNE_HAMMER = tiers.stream()
            .collect(Collectors.toMap(s -> s+"_lucerne_hammer",s ->ITEM_WITH_GUI.registerSimpleItem(s+"_lucerne_hammer") ));

    public static Map<String, DeferredItem<Item>> PIKE = tiers.stream()
            .collect(Collectors.toMap(s -> s+"_pike",s ->ITEM_WITH_GUI.registerSimpleItem(s+"_pike") ));

    public static Map<String, DeferredItem<Item>> SCYTHE = tiers.stream()
            .collect(Collectors.toMap(s -> s+"_scythe",s ->ITEM_WITH_GUI.registerSimpleItem(s+"_scythe") ));

    public static Map<String, DeferredItem<Item>> SPEAR = tiers.stream()
            .collect(Collectors.toMap(s -> s+"_spear",s ->ITEM_WITH_GUI.registerSimpleItem(s+"_spear") ));

    public static Map<String, DeferredItem<Item>> SPINY_MAUL = tiers.subList(2,5).stream()
            .collect(Collectors.toMap(s -> s+"_spiny_maul",s ->ITEMS.registerSimpleItem(s+"_spiny_maul") ));

    public static Map<String, DeferredItem<Item>> TACHI = tiers.stream()
            .collect(Collectors.toMap(s -> s+"_tachi",s ->ITEM_WITH_GUI.registerSimpleItem(s+"_tachi") ));

    public static Map<String, DeferredItem<Item>> THROWING_AXE = tiers.stream()
            .collect(Collectors.toMap(s -> s+"_throwing_axe",s ->ITEMS.registerSimpleItem(s+"_throwing_axe") ));

    public static Map<String, DeferredItem<Item>> THROWING_KNIFE = tiers.stream()
            .collect(Collectors.toMap(s -> s+"_throwing_knife",s ->ITEMS.registerSimpleItem(s+"_throwing_knife") ));

    public static Map<String, DeferredItem<Item>> UCHIGATANA = tiers.stream()
            .collect(Collectors.toMap(s -> s+"_uchigatana",s ->ITEMS.registerSimpleItem(s+"_uchigatana") ));

    public static Map<String, DeferredItem<Item>> WAKIZASHI = tiers.stream()
            .collect(Collectors.toMap(s -> s+"_wakizashi",s ->ITEMS.registerSimpleItem(s+"_wakizashi") ));

    public static Map<String, DeferredItem<Item>> ZWEIHANDER = tiers.stream()
            .collect(Collectors.toMap(s -> s+"_zweihander",s ->ITEM_WITH_GUI.registerSimpleItem(s+"_zweihander") ));



    public static DeferredItem<Item> ENGLAND_LONGBOW = SPECIAL.registerItem("england_longbow",(i)-> new BowItem(new Item.Properties().durability(384).stacksTo(1)));
    public static DeferredItem<Item> YUMI = SPECIAL.registerItem("yumi",(i)-> new BowItem(
            new Item.Properties().durability(384).stacksTo(1)));

    public static DeferredItem<Item> KOMACHI_SCYTHE = ITEMS.registerSimpleItem("komachi_scythe");
    public static DeferredItem<Item> LONG_STICK = ITEMS.registerSimpleItem("long_stick");
    public static DeferredItem<Item> MACUAHUITL = ITEMS.registerSimpleItem("macuahuitl");
    public static DeferredItem<Item> STUDDED_CLUB = ITEMS.registerSimpleItem("studded_club");

    public static void registry(IEventBus modEventBug){
        ITEMS.register(modEventBug);
        SPECIAL.register(modEventBug);
        ITEM_WITH_GUI.register(modEventBug);
    }
}
