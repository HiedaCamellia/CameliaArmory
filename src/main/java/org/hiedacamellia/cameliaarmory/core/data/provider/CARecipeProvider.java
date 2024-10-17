package org.hiedacamellia.cameliaarmory.core.data.provider;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.RegistryObject;
import org.hiedacamellia.cameliaarmory.CameliaArmory;
import org.hiedacamellia.cameliaarmory.registries.CAItem;
import org.hiedacamellia.camellialib.core.data.recipe.TieredShapedRecipeBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class CARecipeProvider extends RecipeProvider {
    public CARecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> output) {
        TieredShapedRecipeBuilder.defaultTiered(RecipeCategory.COMBAT,
                        getItemList(CAItem.BASTARD_SWORD))
                .pattern("  T")
                .pattern(" ST")
                .pattern("S  ")
                .define('S', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("bastard_sword"));
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(CAItem.BASTARD_SWORD.get("diamond").get()),
                        Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, CAItem.BASTARD_SWORD.get("netherite").get())
                .unlocks("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("bastard_sword_netherite"));


        TieredShapedRecipeBuilder.defaultTiered(RecipeCategory.COMBAT,
                        getItemList(CAItem.CLAYMORE))
                .pattern(" T ")
                .pattern("ST ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("claymore"));
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(CAItem.CLAYMORE.get("diamond").get()),
                        Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, CAItem.CLAYMORE.get("netherite").get())
                .unlocks("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("claymore_netherite"));


        TieredShapedRecipeBuilder.defaultTiered(RecipeCategory.COMBAT,
                        getItemList(CAItem.HALBERD))
                .pattern(" ST")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("halberd"));
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(CAItem.HALBERD.get("diamond").get()),
                        Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, CAItem.HALBERD.get("netherite").get())
                .unlocks("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("halberd_netherite"));


        TieredShapedRecipeBuilder.defaultTiered(RecipeCategory.COMBAT,
                        getItemList(CAItem.HENGDAO))
                .pattern("T  ")
                .pattern(" T ")
                .pattern(" SS")
                .define('S', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("hengdao"));
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(CAItem.HENGDAO.get("diamond").get()),
                        Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, CAItem.HENGDAO.get("netherite").get())
                .unlocks("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("hengdao_netherite"));


        TieredShapedRecipeBuilder.defaultTiered(RecipeCategory.COMBAT,
                        getItemList(CAItem.LUCERNE_HAMMER))
                .pattern("TTS")
                .pattern(" ST")
                .pattern(" S ")
                .define('S', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("lucerne_hammer"));
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(CAItem.LUCERNE_HAMMER.get("diamond").get()),
                        Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, CAItem.LUCERNE_HAMMER.get("netherite").get())
                .unlocks("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("lucerne_hammer_netherite"));


        TieredShapedRecipeBuilder.defaultTiered(RecipeCategory.COMBAT,
                        getItemList(CAItem.PIKE))
                .pattern(" ST")
                .pattern("SS ")
                .pattern("S  ")
                .define('S', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("pike"));
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(CAItem.PIKE.get("diamond").get()),
                        Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, CAItem.PIKE.get("netherite").get())
                .unlocks("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("pike_netherite"));


        TieredShapedRecipeBuilder.defaultTiered(RecipeCategory.COMBAT,
                        getItemList(CAItem.SCYTHE))
                .pattern(" T ")
                .pattern("S T")
                .pattern("S  ")
                .define('S', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("scythe"));
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(CAItem.SCYTHE.get("diamond").get()),
                        Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, CAItem.SCYTHE.get("netherite").get())
                .unlocks("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("scythe_netherite"));


        TieredShapedRecipeBuilder.defaultTiered(RecipeCategory.COMBAT,
                        getItemList(CAItem.SPEAR))
                .pattern("  T")
                .pattern(" S ")
                .pattern("S  ")
                .define('S', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("spear"));
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(CAItem.SPEAR.get("diamond").get()),
                        Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, CAItem.SPEAR.get("netherite").get())
                .unlocks("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("spear_netherite"));


        TieredShapedRecipeBuilder.defaultTiered(RecipeCategory.COMBAT,
                        getItemList(CAItem.TACHI))
                .pattern("   ")
                .pattern("STT")
                .pattern("S  ")
                .define('S', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("tachi"));
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(CAItem.TACHI.get("diamond").get()),
                        Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, CAItem.TACHI.get("netherite").get())
                .unlocks("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("tachi_netherite"));


        TieredShapedRecipeBuilder.defaultTiered(RecipeCategory.COMBAT,
                        getItemList(CAItem.UCHIGATANA))
                .pattern("   ")
                .pattern(" TT")
                .pattern("S  ")
                .define('S', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("uchigatana"));
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(CAItem.UCHIGATANA.get("diamond").get()),
                        Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, CAItem.UCHIGATANA.get("netherite").get())
                .unlocks("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("uchigatana_netherite"));


        TieredShapedRecipeBuilder.defaultTiered(RecipeCategory.COMBAT,
                        getItemList(CAItem.WAKIZASHI))
                .pattern("   ")
                .pattern(" FT")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('F', Items.STRING)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("wakizashi"));
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(CAItem.WAKIZASHI.get("diamond").get()),
                        Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, CAItem.WAKIZASHI.get("netherite").get())
                .unlocks("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("wakizashi_netherite"));


        TieredShapedRecipeBuilder.defaultTiered(RecipeCategory.COMBAT,
                        getItemList(CAItem.THROWING_KNIFE))
                .pattern("   ")
                .pattern(" FT")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('F', Items.STRING)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("throwing_knife"));
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(CAItem.THROWING_KNIFE.get("diamond").get()),
                        Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, CAItem.THROWING_KNIFE.get("netherite").get())
                .unlocks("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("throwing_knife_netherite"));


        TieredShapedRecipeBuilder.defaultTiered(RecipeCategory.COMBAT,
                        getItemList(CAItem.THROWING_AXE))
                .pattern("FTT")
                .pattern(" ST")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('F', Items.STRING)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("throwing_axe"));
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(CAItem.THROWING_AXE.get("diamond").get()),
                        Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, CAItem.THROWING_AXE.get("netherite").get())
                .unlocks("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("throwing_axe_netherite"));


        TieredShapedRecipeBuilder.defaultTiered(RecipeCategory.COMBAT,
                        getItemList(CAItem.ZWEIHANDER))
                .pattern(" T ")
                .pattern("FT ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('F', Items.STRING)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("zweihander"));
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(CAItem.ZWEIHANDER.get("diamond").get()),
                        Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, CAItem.ZWEIHANDER.get("netherite").get())
                .unlocks("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("zweihander_netherite"));


        TieredShapedRecipeBuilder.defaultTiered(RecipeCategory.COMBAT,
                        List.of(CAItem.WOODEN_CLUB.get(), CAItem.STUDDED_CLUB.get()
                                , CAItem.SPINY_MAUL.get("iron").get(), CAItem.SPINY_MAUL.get("golden").get(), CAItem.SPINY_MAUL.get("diamond").get()))
                .pattern(" ST")
                .pattern(" ST")
                .pattern(" S ")
                .define('S', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("spiny_maul"));
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(CAItem.SPINY_MAUL.get("diamond").get()),
                        Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, CAItem.SPINY_MAUL.get("netherite").get())
                .unlocks("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("spiny_maul_netherite"));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, CAItem.KOMACHI_SCYTHE.get())
                .pattern(" T ")
                .pattern("S T")
                .pattern("S  ")
                .define('S', Items.STICK)
                .define('T', Items.NETHERITE_INGOT)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("komachi_scythe"));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, CAItem.LONG_STICK.get())
                .pattern("P  ")
                .pattern("P  ")
                .pattern("P  ")
                .define('P', ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output, CameliaArmory.perfix("long_stick"));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, CAItem.MACUAHUITL.get())
                .pattern("TST")
                .pattern("TST")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('T', Items.OBSIDIAN)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("macuahuitl"));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, CAItem.ENGLAND_LONGBOW.get())
                .pattern(" ST")
                .pattern("S T")
                .pattern("ST ")
                .define('S', Items.STICK)
                .define('T', Items.STRING)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("england_longbow"));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, CAItem.YUMI.get())
                .pattern("S  ")
                .pattern("LS ")
                .pattern("S  ")
                .define('S', Items.STRING)
                .define('L', ItemTags.LOGS)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output, CameliaArmory.perfix("yumi"));

    }

    public List<ItemLike> getItemList(Map<String, RegistryObject<Item>> map) {
        List<ItemLike> items = new ArrayList<>();
        CAItem.tiers.forEach((tier) -> {
            items.add(map.get(tier).get());
        });
        return items;
    }
}
