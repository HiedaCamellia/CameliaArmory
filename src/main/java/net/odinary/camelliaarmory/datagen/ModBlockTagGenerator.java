package net.odinary.camelliaarmory.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.odinary.camelliaarmory.CamelliaArmory;
import net.odinary.camelliaarmory.block.ModBlocks;
import net.odinary.camelliaarmory.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CamelliaArmory.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        /*
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.EMERALD_BLOCK.get(),
                        ModBlocks.EMERALD_ORE.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.EMERALD_BLOCK.get(),
                        ModBlocks.EMERALD_ORE.get());

         */
    }
}
