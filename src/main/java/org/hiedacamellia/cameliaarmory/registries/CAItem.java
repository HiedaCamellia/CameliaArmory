package org.hiedacamellia.cameliaarmory.registries;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.cameliaarmory.CameliaArmory;
import org.hiedacamellia.cameliaarmory.core.entry.BowItemWithTootip;
import org.hiedacamellia.cameliaarmory.core.entry.SwordItemWithTooltip;
import org.hiedacamellia.camellialib.common.item.ItemWithTooltip;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CAItem {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CameliaArmory.MODID);
    public static final DeferredRegister.Items ITEM_WITH_GUI = DeferredRegister.createItems(CameliaArmory.MODID);
    public static final DeferredRegister.Items SPECIAL = DeferredRegister.createItems(CameliaArmory.MODID);

    public static final List<String> tiers = List.of("wooden", "stone", "iron", "golden", "diamond", "netherite");

    public static Map<String, DeferredItem<Item>> BASTARD_SWORD = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_bastard_sword", s -> ITEMS.register(s + "_bastard_sword",() -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(SwordItem.createAttributes(getTier(s),4.5F+getDamageBoost(s), -2.4F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String, DeferredItem<SwordItemWithTooltip>> CLAYMORE = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_claymore", s -> ITEM_WITH_GUI.register(s + "_claymore", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(SwordItem.createAttributes(getTier(s), 5F+getDamageBoost(s), -2.4F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String, DeferredItem<SwordItemWithTooltip>> HALBERD = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_halberd", s -> ITEM_WITH_GUI.register(s + "_halberd", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(SwordItem.createAttributes(getTier(s), 5+getDamageBoost(s), -2.4F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String, DeferredItem<Item>> HENGDAO = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_hengdao", s -> ITEMS.register(s + "_hengdao", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(SwordItem.createAttributes(getTier(s), 5+getDamageBoost(s), -2.4F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String, DeferredItem<SwordItemWithTooltip>> LUCERNE_HAMMER = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_lucerne_hammer", s -> ITEM_WITH_GUI.register(s + "_lucerne_hammer", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(SwordItem.createAttributes(getTier(s),8F+ getDamageBoost(s), -2.4F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String, DeferredItem<SwordItemWithTooltip>> PIKE = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_pike", s -> ITEM_WITH_GUI.register(s + "_pike", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(SwordItem.createAttributes(getTier(s), 4.5F+getDamageBoost(s), -2.4F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String, DeferredItem<SwordItemWithTooltip>> SCYTHE = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_scythe", s -> ITEM_WITH_GUI.register(s + "_scythe", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(SwordItem.createAttributes(getTier(s),5+ getDamageBoost(s), -2.4F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String, DeferredItem<SwordItemWithTooltip>> SPEAR = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_spear", s -> ITEM_WITH_GUI.register(s + "_spear", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(SwordItem.createAttributes(getTier(s), 4+getDamageBoost(s), -2.4F)).stacksTo(1).durability(getDurability(s))))));

    public static DeferredItem<Item> WOODEN_CLUB = ITEMS.register("wooden_club", () -> new SwordItemWithTooltip(Tiers.WOOD,new  Item.Properties().attributes(SwordItem.createAttributes(Tiers.WOOD, 5, -2.4F)).stacksTo(1).durability(59)));
    public static DeferredItem<Item> STUDDED_CLUB = ITEMS.register("studded_club", () -> new SwordItemWithTooltip(Tiers.STONE,new  Item.Properties().attributes(SwordItem.createAttributes(Tiers.STONE, 6, -2.4F)).stacksTo(1).durability(131)));
    public static Map<String, DeferredItem<Item>> SPINY_MAUL = tiers.subList(2, 5).stream()
            .collect(Collectors.toMap(s -> s + "_spiny_maul", s -> ITEMS.register(s + "_spiny_maul", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(SwordItem.createAttributes(getTier(s), 5+getDamageBoost(s), -2.4F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String, DeferredItem<SwordItemWithTooltip>> TACHI = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_tachi", s -> ITEM_WITH_GUI.register(s + "_tachi", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(SwordItem.createAttributes(getTier(s), 5+getDamageBoost(s), -2.4F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String, DeferredItem<Item>> THROWING_AXE = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_throwing_axe", s -> ITEMS.register(s + "_throwing_axe", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(SwordItem.createAttributes(getTier(s), 8.5F+getDamageBoost(s), -2.4F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String, DeferredItem<Item>> THROWING_KNIFE = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_throwing_knife", s -> ITEMS.register(s + "_throwing_knife", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(SwordItem.createAttributes(getTier(s),3F+ getDamageBoost(s), -2.4F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String, DeferredItem<Item>> UCHIGATANA = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_uchigatana", s -> ITEMS.register(s + "_uchigatana", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(SwordItem.createAttributes(getTier(s),4+ getDamageBoost(s), -2.4F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String, DeferredItem<Item>> WAKIZASHI = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_wakizashi", s -> ITEMS.register(s + "_wakizashi", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(SwordItem.createAttributes(getTier(s), 3+getDamageBoost(s), -2.4F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String, DeferredItem<SwordItemWithTooltip>> ZWEIHANDER = tiers.stream()
            .collect(Collectors.toMap(s -> s + "_zweihander", s -> ITEM_WITH_GUI.register(s + "_zweihander", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(SwordItem.createAttributes(getTier(s), 5.5F+getDamageBoost(s), -2.4F)).stacksTo(1).durability(getDurability(s))))));


    public static DeferredItem<Item> KOMACHI_SCYTHE = SPECIAL.register("komachi_scythe", () -> new SwordItemWithTooltip(Tiers.WOOD,new  Item.Properties().attributes(SwordItem.createAttributes(Tiers.NETHERITE, 10, -2.4F)).stacksTo(1).durability(2031)));
    public static DeferredItem<Item> LONG_STICK = SPECIAL.register("long_stick", () -> new SwordItemWithTooltip(Tiers.WOOD,new  Item.Properties().attributes(SwordItem.createAttributes(Tiers.WOOD, 3.5F, -2.4F)).stacksTo(1).durability(59)));
    public static DeferredItem<Item> MACUAHUITL = SPECIAL.register("macuahuitl", () -> new SwordItemWithTooltip(Tiers.WOOD,new  Item.Properties().attributes(SwordItem.createAttributes(Tiers.NETHERITE, 11.5F, -2.4F)).stacksTo(1).durability(2031)));

    public static DeferredItem<Item> ENGLAND_LONGBOW = SPECIAL.registerItem("england_longbow", (i) -> new BowItemWithTootip(
            new  Item.Properties().stacksTo(1).durability(384)));
    public static DeferredItem<Item> YUMI = SPECIAL.registerItem("yumi", (i) -> new BowItemWithTootip(
            new  Item.Properties().stacksTo(1).durability(384)));

    public static void registry(IEventBus modEventBug) {
        ITEMS.register(modEventBug);
        SPECIAL.register(modEventBug);
        ITEM_WITH_GUI.register(modEventBug);
    }

    public static int getDurability(String tier){
        return switch (tier) {
            case "wooden" -> 59;
            case "stone" -> 131;
            case "iron" -> 250;
            case "golden" -> 32;
            case "diamond" -> 1561;
            case "netherite" -> 2031;
            default -> 0;
        };
    }
    
    public static float getDamageBoost(String tier){
        return switch (tier) {
            case "wooden" -> 0;
            case "stone" -> 1;
            case "iron" -> 2;
            case "golden" -> 1.5F;
            case "diamond" -> 3;
            case "netherite" -> 3.5F;
            default -> 0;
        };
    }
    
    public static Tier getTier(String tier){
        return switch (tier) {
            case "wooden" -> Tiers.WOOD;
            case "stone" -> Tiers.STONE;
            case "iron" -> Tiers.IRON;
            case "golden" -> Tiers.GOLD;
            case "diamond" -> Tiers.DIAMOND;
            case "netherite" -> Tiers.NETHERITE;
            default -> Tiers.WOOD;
        };
    }

}
