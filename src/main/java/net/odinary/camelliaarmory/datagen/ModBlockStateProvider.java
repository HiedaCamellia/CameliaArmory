package net.odinary.camelliaarmory.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.odinary.camelliaarmory.CamelliaArmory;
import net.odinary.camelliaarmory.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CamelliaArmory.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        /*
        blockwithItem(ModBlocks.EMERALD_BLOCK);

        blockwithItem(ModBlocks.EMERALD_ORE);

         */

    }

    public void blockwithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
