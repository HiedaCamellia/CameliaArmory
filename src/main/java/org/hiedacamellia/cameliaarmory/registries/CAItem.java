package org.hiedacamellia.cameliaarmory.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.hiedacamellia.cameliaarmory.CameliaArmory;
import org.hiedacamellia.cameliaarmory.common.item.EnglandLongbow;
import org.hiedacamellia.cameliaarmory.common.item.ThrowingAxe;
import org.hiedacamellia.cameliaarmory.common.item.ThrowingKnife;
import org.hiedacamellia.cameliaarmory.common.item.Yumi;
import org.hiedacamellia.camellialib.common.item.BowItemWithTootip;
import org.hiedacamellia.camellialib.common.item.SwordItemWithTooltip;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CAItem {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, CameliaArmory.MODID);
    public static final DeferredRegister<Item> ITEM_WITH_GUI = DeferredRegister.create(Registries.ITEM, CameliaArmory.MODID);
    public static final DeferredRegister<Item> SPECIAL = DeferredRegister.create(Registries.ITEM, CameliaArmory.MODID);

    public static final List<String> tiers = List.of("wooden", "stone", "iron", "golden", "diamond", "netherite");
    public static Map<String, RegistryObject<Item>> BASTARD_SWORD = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEMS.register(s + "_bastard_sword", () -> new SwordItemWithTooltip(getTier(s), 4+getDamageBoost(s), 1.6f - 4, new Item.Properties().stacksTo(1).durability(getDurability(s))))));

    public static Map<String, RegistryObject<Item>> CLAYMORE = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEM_WITH_GUI.register(s + "_claymore", () -> new SwordItemWithTooltip(getTier(s), 5+getDamageBoost(s), 1.3f - 4, new Item.Properties().stacksTo(1).durability(getDurability(s))))));

    public static Map<String, RegistryObject<Item>> HALBERD = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEM_WITH_GUI.register(s + "_halberd", () -> new SwordItemWithTooltip(getTier(s), 5+getDamageBoost(s), 1.6f - 4, new Item.Properties().stacksTo(1).durability(getDurability(s))))));

    public static Map<String, RegistryObject<Item>> HENGDAO = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEMS.register(s + "_hengdao", () -> new SwordItemWithTooltip(getTier(s), 5+getDamageBoost(s), 1.6f - 4, new Item.Properties().stacksTo(1).durability(getDurability(s))))));

    public static Map<String, RegistryObject<Item>> LUCERNE_HAMMER = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEM_WITH_GUI.register(s + "_lucerne_hammer", () -> new SwordItemWithTooltip(getTier(s), 8+getDamageBoost(s), 0.9f - 4, new Item.Properties().stacksTo(1).durability(getDurability(s))))));

    public static Map<String, RegistryObject<Item>> PIKE = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEM_WITH_GUI.register(s + "_pike", () -> new SwordItemWithTooltip(getTier(s), 4+getDamageBoost(s), 0.7f - 4, new Item.Properties().stacksTo(1).durability(getDurability(s))))));

    public static Map<String, RegistryObject<Item>> SCYTHE = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEM_WITH_GUI.register(s + "_scythe", () -> new SwordItemWithTooltip(getTier(s), 5+getDamageBoost(s), 1.1f - 4, new Item.Properties().stacksTo(1).durability(getDurability(s))))));

    public static Map<String, RegistryObject<Item>> SPEAR = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEM_WITH_GUI.register(s + "_spear", () -> new SwordItemWithTooltip(getTier(s), 4+getDamageBoost(s), 1.2f - 4, new Item.Properties().stacksTo(1).durability(getDurability(s))))));

    public static RegistryObject<Item> WOODEN_CLUB = ITEMS.register("wooden_club", () -> new SwordItemWithTooltip(Tiers.WOOD, 5, 0.8f - 4, new Item.Properties().stacksTo(1).durability(59)));
    public static RegistryObject<Item> STUDDED_CLUB = ITEMS.register("studded_club", () -> new SwordItemWithTooltip(Tiers.STONE, 6, 0.8f - 4, new Item.Properties().stacksTo(1).durability(131)));
    public static Map<String, RegistryObject<Item>> SPINY_MAUL = tiers.subList(2, 6).stream()
            .collect(Collectors.toMap(s -> s, s -> ITEMS.register(s + "_spiny_maul", () -> new SwordItemWithTooltip(getTier(s), 5+getDamageBoost(s), 0.85f - 4, new Item.Properties().stacksTo(1).durability(getDurability(s))))));

    public static Map<String, RegistryObject<Item>> TACHI = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEM_WITH_GUI.register(s + "_tachi", () -> new SwordItemWithTooltip(getTier(s), 5+getDamageBoost(s), 1.3f - 4, new Item.Properties().stacksTo(1).durability(getDurability(s))))));

    public static Map<String, RegistryObject<Item>> THROWING_AXE = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEMS.register(s + "_throwing_axe", () -> new ThrowingAxe(getTier(s), 8+getDamageBoost(s), 1f - 4, new Item.Properties().stacksTo(1).durability(getDurability(s))))));

    public static Map<String, RegistryObject<Item>> THROWING_KNIFE = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEMS.register(s + "_throwing_knife", () -> new ThrowingKnife(getTier(s), 3+getDamageBoost(s), 1f - 4, new Item.Properties().stacksTo(1).durability(getDurability(s))))));

    public static Map<String, RegistryObject<Item>> UCHIGATANA = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEMS.register(s + "_uchigatana", () -> new SwordItemWithTooltip(getTier(s), 4+getDamageBoost(s), 1.8f - 4, new Item.Properties().stacksTo(1).durability(getDurability(s))))));

    public static Map<String, RegistryObject<Item>> WAKIZASHI = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEMS.register(s + "_wakizashi", () -> new SwordItemWithTooltip(getTier(s), 3+getDamageBoost(s), 2f - 4, new Item.Properties().stacksTo(1).durability(getDurability(s))))));

    public static Map<String, RegistryObject<Item>> ZWEIHANDER = tiers.stream()
            .collect(Collectors.toMap(s -> s, s -> ITEM_WITH_GUI.register(s + "_zweihander", () -> new SwordItemWithTooltip(getTier(s), 5+getDamageBoost(s), 1.1f - 4, new Item.Properties().stacksTo(1).durability(getDurability(s))))));


    public static RegistryObject<Item> KOMACHI_SCYTHE = ITEMS.register("komachi_scythe", () -> new SwordItemWithTooltip(Tiers.WOOD, 10, 1.6f - 4, new Item.Properties().stacksTo(1).durability(2031)));
    public static RegistryObject<Item> LONG_STICK = ITEMS.register("long_stick", () -> new SwordItemWithTooltip(Tiers.WOOD, 3, 1.6f - 4, new Item.Properties().stacksTo(1).durability(59)));
    public static RegistryObject<Item> MACUAHUITL = ITEMS.register("macuahuitl", () -> new SwordItemWithTooltip(Tiers.WOOD, 6, 1.6f - 4, new Item.Properties().stacksTo(1).durability(1052)));

    public static RegistryObject<BowItemWithTootip> ENGLAND_LONGBOW = SPECIAL.register("england_longbow", EnglandLongbow::new);
    public static RegistryObject<BowItemWithTootip> YUMI = SPECIAL.register("yumi", Yumi::new);

    public static void registry(IEventBus modEventBug) {
        ITEMS.register(modEventBug);
        SPECIAL.register(modEventBug);
        ITEM_WITH_GUI.register(modEventBug);
    }

    public static int getDurability(String tier) {
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

    public static int getDamageBoost(String tier) {
        return switch (tier) {
            case "wooden" -> 0;
            case "stone" -> 1;
            case "iron" -> 2;
            case "golden" -> 2;
            case "diamond" -> 3;
            case "netherite" -> 4;
            default -> 0;
        };
    }

    public static Tier getTier(String tier) {
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
    /*
    public static ItemAttributeModifiers interactionRange(double amount) {
        return ItemAttributeModifiers.builder().add(Attributes.BLOCK_INTERACTION_RANGE, new AttributeModifier(CameliaArmory.perfix("block_interaction_range"), amount, AttributeModifier.Operation.ADDITION), EquipmentSlot.MAINHAND).build();
    }

    public static ItemAttributeModifiers sweepingDamageRatio(double amount) {
        return ItemAttributeModifiers.builder().add(Attributes.SWEEPING_DAMAGE_RATIO, new AttributeModifier(CameliaArmory.perfix("sweeping_damage_ratio"), amount, AttributeModifier.Operation.ADDITION), EquipmentSlot.MAINHAND).build();
    }
     */

}
