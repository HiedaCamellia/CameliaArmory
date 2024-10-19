package org.hiedacamellia.cameliaarmory.common.item;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParam;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import org.hiedacamellia.camellialib.common.item.SwordItemWithTooltip;

import java.util.Objects;

public class ScytheItemWithTooltip extends SwordItemWithTooltip {
    public ScytheItemWithTooltip(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState state = level.getBlockState(pos);
        if(state.getBlock() instanceof CropBlock){
            for(int i = -1; i < 2; i++){
                for(int j = -1; j < 2; j++){
                    if(level.getBlockState(pos.offset(i,0,j)).getBlock() instanceof CropBlock){
                        state.setValue(CropBlock.AGE,0);
                        if(level instanceof ServerLevel serverLevel) {
//                            for(ItemStack itemStack:state.getDrops(new LootParams.Builder(serverLevel).withParameter(new LootContextParam(LootContextParamSets.) ))){
//                                level.addFreshEntity(new ItemEntity(level,pos.getX(),pos.getY(),pos.getZ(),itemStack));
//                            }
                        }
                    }
                }
            }
            ItemStack stack = context.getItemInHand();
            stack.hurtAndBreak(1, Objects.requireNonNull(context.getPlayer()), EquipmentSlot.MAINHAND);
        }
        return InteractionResult.CONSUME;
    }

    @Override
    public boolean mineBlock(ItemStack stack, Level level, BlockState state, BlockPos pos, LivingEntity miningEntity) {
        Tool tool = (Tool)stack.get(DataComponents.TOOL);
        if (tool == null) {
            return false;
        } else {
            if (!level.isClientSide && state.getDestroySpeed(level, pos) != 0.0F && tool.damagePerBlock() > 0) {

                if(state.getBlock() instanceof GrassBlock){
                    for(int i = -1; i < 2; i++){
                        for(int j = -1; j < 2; j++){
                            if(level.getBlockState(pos.offset(i,0,j)).getBlock() instanceof GrassBlock){
                                level.destroyBlock(pos.offset(i,0,j),true,miningEntity);
                            }
                        }
                    }
                }
                if(state.getBlock() instanceof CropBlock){
                    for(int i = -1; i < 2; i++){
                        for(int j = -1; j < 2; j++){
                            if(level.getBlockState(pos.offset(i,0,j)).getBlock() instanceof CropBlock){
                                level.destroyBlock(pos.offset(i,0,j),true,miningEntity);
                            }
                        }
                    }
                }
                stack.hurtAndBreak(tool.damagePerBlock(), miningEntity, EquipmentSlot.MAINHAND);
            }

            return true;
        }
    }
}
