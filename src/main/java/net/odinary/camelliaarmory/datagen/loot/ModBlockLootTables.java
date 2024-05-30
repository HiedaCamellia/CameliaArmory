package net.odinary.camelliaarmory.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.odinary.camelliaarmory.block.ModBlocks;
import net.odinary.camelliaarmory.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //掉落自身，如果漏写可能不掉东西
        //this.dropSelf(ModBlocks.EMERALD_BLOCK.get());
        //this.dropSelf(ModBlocks.EMERALD_ORE.get());
        //this.dropSelf(ModBlocks.SOUND_BLOCK.get());
        //这里匹配矿物掉落法
        //this.add(ModBlocks.EMERALD_ORE.get(),
        //        block -> createCopperLikeOreDrops(ModBlocks.EMERALD_ORE.get(), ModItems.RAW_EMERALD.get()));
    }

    //这里新写了矿物掉落规则
    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
