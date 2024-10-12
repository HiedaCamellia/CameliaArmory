package org.hiedacamellia.cameliaarmory.registries;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.cameliaarmory.CameliaArmory;
import org.hiedacamellia.cameliaarmory.core.entry.BowItemWithTootip;
import org.hiedacamellia.camellialib.common.item.ItemWithTooltip;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CAItem {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CameliaArmory.MODID);
    public static final DeferredRegister.Items ITEM_WITH_GUI = DeferredRegister.createItems(CameliaArmory.MODID);
    public static final DeferredRegister.Items SPECIAL = DeferredRegister.createItems(CameliaArmory.MODID);

    public static final List<String> armorys = List.of("bastard_sword"
            , "claymore", "halberd", "hengdao", "lucerne_hammer", "pike", "scythe", "spear", "spiny_maul"
            , "tachi", "throwing_axe", "throwing_knife", "uchigatana", "wakizashi", "zweihander");

    public static final List<String> tiers = List.of("wooden", "stone", "iron", "golden", "diamond", "netherite");


    public static Map<String, DeferredItem<Item>> BASTARD_SWORD = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_bastard_sword", s -> ITEMS.register(s + "_bastard_sword",() -> new ItemWithTooltip(new Item.Properties()))));

    public static Map<String, DeferredItem<ItemWithTooltip>> CLAYMORE = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_claymore", s -> ITEM_WITH_GUI.register(s + "_claymore", () -> new ItemWithTooltip(new Item.Properties()))));

    public static Map<String, DeferredItem<ItemWithTooltip>> HALBERD = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_halberd", s -> ITEM_WITH_GUI.register(s + "_halberd", () -> new ItemWithTooltip(new Item.Properties()))));

    public static Map<String, DeferredItem<Item>> HENGDAO = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_hengdao", s -> ITEMS.register(s + "_hengdao", () -> new ItemWithTooltip(new Item.Properties()))));

    public static Map<String, DeferredItem<ItemWithTooltip>> LUCERNE_HAMMER = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_lucerne_hammer", s -> ITEM_WITH_GUI.register(s + "_lucerne_hammer", () -> new ItemWithTooltip(new Item.Properties()))));

    public static Map<String, DeferredItem<ItemWithTooltip>> PIKE = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_pike", s -> ITEM_WITH_GUI.register(s + "_pike", () -> new ItemWithTooltip(new Item.Properties()))));

    public static Map<String, DeferredItem<ItemWithTooltip>> SCYTHE = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_scythe", s -> ITEM_WITH_GUI.register(s + "_scythe", () -> new ItemWithTooltip(new Item.Properties()))));

    public static Map<String, DeferredItem<ItemWithTooltip>> SPEAR = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_spear", s -> ITEM_WITH_GUI.register(s + "_spear", () -> new ItemWithTooltip(new Item.Properties()))));

    public static Map<String, DeferredItem<Item>> SPINY_MAUL = tiers.subList(2, 5).stream()
            .collect(Collectors.toMap(s -> s + "_spiny_maul", s -> ITEMS.register(s + "_spiny_maul", () -> new ItemWithTooltip(new Item.Properties()))));

    public static Map<String, DeferredItem<ItemWithTooltip>> TACHI = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_tachi", s -> ITEM_WITH_GUI.register(s + "_tachi", () -> new ItemWithTooltip(new Item.Properties()))));

    public static Map<String, DeferredItem<Item>> THROWING_AXE = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_throwing_axe", s -> ITEMS.register(s + "_throwing_axe", () -> new ItemWithTooltip(new Item.Properties()))));

    public static Map<String, DeferredItem<Item>> THROWING_KNIFE = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_throwing_knife", s -> ITEMS.register(s + "_throwing_knife", () -> new ItemWithTooltip(new Item.Properties()))));

    public static Map<String, DeferredItem<Item>> UCHIGATANA = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_uchigatana", s -> ITEMS.register(s + "_uchigatana", () -> new ItemWithTooltip(new Item.Properties()))));

    public static Map<String, DeferredItem<Item>> WAKIZASHI = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_wakizashi", s -> ITEMS.register(s + "_wakizashi", () -> new ItemWithTooltip(new Item.Properties()))));

    public static Map<String, DeferredItem<ItemWithTooltip>> ZWEIHANDER = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_zweihander", s -> ITEM_WITH_GUI.register(s + "_zweihander", () -> new ItemWithTooltip(new Item.Properties()))));


    public static DeferredItem<Item> ENGLAND_LONGBOW = SPECIAL.registerItem("england_longbow", (i) -> new BowItemWithTootip(
            new Item.Properties().durability(384).stacksTo(1)));
    public static DeferredItem<Item> YUMI = SPECIAL.registerItem("yumi", (i) -> new BowItemWithTootip(
            new Item.Properties().durability(384).stacksTo(1)));

    public static DeferredItem<Item> KOMACHI_SCYTHE = ITEMS.register("komachi_scythe", () -> new ItemWithTooltip(new Item.Properties()));
    public static DeferredItem<Item> LONG_STICK = ITEMS.register("long_stick", () -> new ItemWithTooltip(new Item.Properties()));
    public static DeferredItem<Item> MACUAHUITL = ITEMS.register("macuahuitl", () -> new ItemWithTooltip(new Item.Properties()));
    public static DeferredItem<Item> STUDDED_CLUB = ITEMS.register("studded_club", () -> new ItemWithTooltip(new Item.Properties()));

    public static void registry(IEventBus modEventBug) {
        ITEMS.register(modEventBug);
        SPECIAL.register(modEventBug);
        ITEM_WITH_GUI.register(modEventBug);
    }
}
