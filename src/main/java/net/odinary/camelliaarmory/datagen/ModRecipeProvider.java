package net.odinary.camelliaarmory.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.odinary.camelliaarmory.CamelliaArmory;
import net.odinary.camelliaarmory.block.ModBlocks;
import net.odinary.camelliaarmory.item.ModItems;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    //一个装有同系列矿物的列表
    //private static final List<ItemLike> EMERALD_SMELTABLES = List.of(ModItems.RAW_EMERALD.get(),
    //        ModBlocks.EMERALD_ORE.get());
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    //下为冶炼时间的设置
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
    //    oreSmelting(pWriter, EMERALD_SMELTABLES, RecipeCategory.MISC, ModItems.EMERALD.get(), 0.25f, 200, "emerald");
    //    oreBlasting(pWriter, EMERALD_SMELTABLES, RecipeCategory.MISC, ModItems.EMERALD.get(), 0.25f, 100, "emerald");
//有序合成
    /*    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EMERALD_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.EMERALD.get())
                .unlockedBy(getHasName(ModItems.EMERALD.get()), has(ModItems.EMERALD.get()))
                .save(pWriter);
//无序合成
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.EMERALD.get(), 9)
                .requires(ModBlocks.EMERALD_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.EMERALD_BLOCK.get()), has(ModBlocks.EMERALD_BLOCK.get()))
                .save(pWriter);*/
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, CamelliaArmory.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
