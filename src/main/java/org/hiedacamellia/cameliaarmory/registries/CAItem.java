package org.hiedacamellia.cameliaarmory.registries;

import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.cameliaarmory.CameliaArmory;
import org.hiedacamellia.cameliaarmory.common.item.*;
import org.hiedacamellia.camellialib.common.item.AxeItemWithTooltip;
import org.hiedacamellia.camellialib.common.item.BowItemWithTootip;
import org.hiedacamellia.camellialib.common.item.ItemWithTooltip;
import org.hiedacamellia.camellialib.common.item.SwordItemWithTooltip;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CAItem {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CameliaArmory.MODID);
    public static final DeferredRegister.Items ITEM_WITH_GUI = DeferredRegister.createItems(CameliaArmory.MODID);
    public static final DeferredRegister.Items SPECIAL = DeferredRegister.createItems(CameliaArmory.MODID);

    public static final List<String> tiers = List.of("wooden", "stone", "iron", "golden", "diamond", "netherite");

    public static Map<String,DeferredItem<Item>> BASTARD_SWORD = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEMS.register(s + "_bastard_sword",() -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(sweepingDamageRatio(0.4)).attributes(interactionRange(0.5)).attributes(SwordItem.createAttributes(getTier(s),4.5F+getDamageBoost(s), -2.4F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String,DeferredItem<Item>> CLAYMORE = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEM_WITH_GUI.register(s + "_claymore", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(sweepingDamageRatio(0.3)).attributes(interactionRange(0.7)).attributes(SwordItem.createAttributes(getTier(s), 5F+getDamageBoost(s), -2.7F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String,DeferredItem<Item>> HALBERD = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEM_WITH_GUI.register(s + "_halberd", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(interactionRange(1.2)).attributes(SwordItem.createAttributes(getTier(s), 5+getDamageBoost(s), -2.4F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String,DeferredItem<Item>> HENGDAO = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEMS.register(s + "_hengdao", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(sweepingDamageRatio(0.4)).attributes(SwordItem.createAttributes(getTier(s), 5+getDamageBoost(s), -2.4F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String,DeferredItem<Item>> LUCERNE_HAMMER = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEM_WITH_GUI.register(s + "_lucerne_hammer", () -> new LucerneHammerItemWithTooltip(40,getTier(s),new Item.Properties().attributes(interactionRange(1.4)).attributes(SwordItem.createAttributes(getTier(s),8F+ getDamageBoost(s), -3.1F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String,DeferredItem<Item>> PIKE = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEM_WITH_GUI.register(s + "_pike", () -> new SpearItemWithTooltip(20,getTier(s),new Item.Properties().attributes(interactionRange(3.7)).attributes(SwordItem.createAttributes(getTier(s), 4.5F+getDamageBoost(s), -3.3F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String,DeferredItem<Item>> SCYTHE = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEM_WITH_GUI.register(s + "_scythe", () -> new ScytheItemWithTooltip(getTier(s),new Item.Properties().attributes(sweepingDamageRatio(0.6)).attributes(interactionRange(0.8)).attributes(SwordItem.createAttributes(getTier(s),5+ getDamageBoost(s), -2.9F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String,DeferredItem<Item>> SPEAR = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEM_WITH_GUI.register(s + "_spear", () -> new SpearItemWithTooltip(10,getTier(s),new Item.Properties().attributes(interactionRange(1.7)).attributes(SwordItem.createAttributes(getTier(s), 4+getDamageBoost(s), -2.8F)).stacksTo(1).durability(getDurability(s))))));

    public static DeferredItem<Item> WOODEN_CLUB = ITEMS.register("wooden_club", () -> new SwordItemWithTooltip(Tiers.WOOD,new  Item.Properties().attributes(SwordItem.createAttributes(Tiers.WOOD, 5, -3.2F)).stacksTo(1).durability(59)));
    public static DeferredItem<Item> STUDDED_CLUB = ITEMS.register("studded_club", () -> new SwordItemWithTooltip(Tiers.STONE,new  Item.Properties().attributes(interactionRange(0.3)).attributes(SwordItem.createAttributes(Tiers.STONE, 6, -3.2F)).stacksTo(1).durability(131)));
    public static Map<String,DeferredItem<Item>> SPINY_MAUL = tiers.subList(2, 6).stream()
            .collect(Collectors.toMap(s -> s, s -> ITEMS.register(s + "_spiny_maul", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(interactionRange(0.7)).attributes(SwordItem.createAttributes(getTier(s), 5+getDamageBoost(s), -3.15F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String,DeferredItem<Item>> TACHI = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEM_WITH_GUI.register(s + "_tachi", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(sweepingDamageRatio(0.5)).attributes(interactionRange(1)).attributes(SwordItem.createAttributes(getTier(s), 5+getDamageBoost(s), -2.7F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String, DeferredItem<Item>> THROWING_AXE = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEMS.register(s + "_throwing_axe", () -> new ThrowingAxe(getTier(s),new Item.Properties().attributes(interactionRange(0.5)).attributes(SwordItem.createAttributes(getTier(s), 8.5F+getDamageBoost(s), -3F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String, DeferredItem<Item>> THROWING_KNIFE = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEMS.register(s + "_throwing_knife", () -> new ThrowingKnife(getTier(s),new Item.Properties().attributes(interactionRange(0.5)).attributes(SwordItem.createAttributes(getTier(s),3F+ getDamageBoost(s), -3F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String, DeferredItem<Item>> UCHIGATANA = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEMS.register(s + "_uchigatana", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(sweepingDamageRatio(0.7)).attributes(SwordItem.createAttributes(getTier(s),4+ getDamageBoost(s), -2.2F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String,DeferredItem<Item>> WAKIZASHI = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEMS.register(s + "_wakizashi", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(sweepingDamageRatio(0.9)).attributes(interactionRange(-1)).attributes(SwordItem.createAttributes(getTier(s), 3+getDamageBoost(s), -2F)).stacksTo(1).durability(getDurability(s))))));

    public static Map<String,DeferredItem<Item>> ZWEIHANDER = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEM_WITH_GUI.register(s + "_zweihander", () -> new SwordItemWithTooltip(getTier(s),new Item.Properties().attributes(sweepingDamageRatio(0.3)).attributes(interactionRange(1)).attributes(SwordItem.createAttributes(getTier(s), 5.5F+getDamageBoost(s), -2.9F)).stacksTo(1).durability(getDurability(s))))));


    public static DeferredItem<Item> KOMACHI_SCYTHE = ITEMS.register("komachi_scythe", () -> new ScytheItemWithTooltip(Tiers.WOOD,new  Item.Properties().attributes(interactionRange(0.8)).attributes(SwordItem.createAttributes(Tiers.NETHERITE, 10, -2.4F)).stacksTo(1).durability(2031)));
    public static DeferredItem<Item> LONG_STICK = ITEMS.register("long_stick", () -> new AxeItemWithTooltip(Tiers.WOOD,new  Item.Properties().attributes(interactionRange(1.5)).attributes(SwordItem.createAttributes(Tiers.WOOD, 3.5F, -2.4F)).stacksTo(1).durability(59)));
    public static DeferredItem<Item> MACUAHUITL = ITEMS.register("macuahuitl", () -> new AxeItemWithTooltip(Tiers.WOOD,new  Item.Properties().attributes(interactionRange(0.5)).attributes(SwordItem.createAttributes(Tiers.IRON, 6.5F, -2.4F)).stacksTo(1).durability(1052)));

    public static DeferredItem<BowItemWithTootip> ENGLAND_LONGBOW = SPECIAL.register("england_longbow", EnglandLongbow::new);
    public static DeferredItem<BowItemWithTootip> YUMI = SPECIAL.register("yumi", Yumi::new);

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
        return 0;
//        return switch (tier) {
//            case "wooden" -> 0;
//            case "stone" -> 1;
//            case "iron" -> 2;
//            case "golden" -> 1.5F;
//            case "diamond" -> 3;
//            case "netherite" -> 3.5F;
//            default -> 0;
//        };
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

    public static ItemAttributeModifiers interactionRange(double amount){
        return ItemAttributeModifiers.builder().add(Attributes.BLOCK_INTERACTION_RANGE, new AttributeModifier(CameliaArmory.perfix("block_interaction_range"),amount, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).build();
    }

    public static ItemAttributeModifiers sweepingDamageRatio(double amount){
        return ItemAttributeModifiers.builder().add(Attributes.SWEEPING_DAMAGE_RATIO, new AttributeModifier(CameliaArmory.perfix("sweeping_damage_ratio"),amount, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HAND).build();
    }

}
