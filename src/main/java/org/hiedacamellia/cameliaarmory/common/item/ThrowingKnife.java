package org.hiedacamellia.cameliaarmory.common.item;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import org.hiedacamellia.cameliaarmory.common.entity.ThrowingKnifeEntity;
import org.hiedacamellia.cameliaarmory.registries.CAEntity;
import org.hiedacamellia.camellialib.common.item.SwordItemWithTooltip;

public class ThrowingKnife extends SwordItemWithTooltip {

    public ThrowingKnife(Tier tier, int pAttackDamageModifier, float pAttackSpeedModifier, Item.Properties properties) {
        super(tier, pAttackDamageModifier, pAttackSpeedModifier, properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        if (!level.isClientSide) {
            ThrowingKnifeEntity throwableItemEntity = new ThrowingKnifeEntity(CAEntity.THROWING_KNIFE.get(), level);
            throwableItemEntity.setItem(itemStack);
            throwableItemEntity.setOwner(player);
            throwableItemEntity.setPos(player.getX(),player.getY()+player.getEyeHeight(),player.getZ());
            throwableItemEntity.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 3F, 1.0F);
            level.addFreshEntity(throwableItemEntity);
            if(player instanceof ServerPlayer serverPlayer)
                itemStack.hurtAndBreak(1,serverPlayer, (serverPlayer1)->{
                    serverPlayer1.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });
        }
        player.getCooldowns().addCooldown(this, 8);
        return InteractionResultHolder.success(itemStack);
    }
    /*
    @Override
    public Projectile asProjectile(Level level, Position position, ItemStack itemStack, Direction direction) {
        ThrowingKnifeEntity throwableItemEntity = new ThrowingKnifeEntity(position.x(),position.y(),position.z(),level);
        throwableItemEntity.setItem(itemStack);
        return throwableItemEntity;
    }
     */
}
