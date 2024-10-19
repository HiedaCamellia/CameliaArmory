package org.hiedacamellia.cameliaarmory.common.item;

import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import org.hiedacamellia.cameliaarmory.common.entity.ThrowingKnifeEntity;
import org.hiedacamellia.camellialib.common.item.SwordItemWithTooltip;

public class ThrowingKnife extends SwordItemWithTooltip implements ProjectileItem {

    public ThrowingKnife(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        ThrowingKnifeEntity throwableItemEntity = new ThrowingKnifeEntity(player,level,itemStack);
        if (!level.isClientSide) {
            if(player instanceof ServerPlayer serverPlayer)
                itemStack.hurtAndBreak(1,serverPlayer, EquipmentSlot.MAINHAND);
            throwableItemEntity.setItem(itemStack);
            throwableItemEntity.setOwner(player);
            throwableItemEntity.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 3F, 1.0F);
            level.addFreshEntity(throwableItemEntity);
        }
        level.playSound(player,throwableItemEntity,SoundEvents.TRIDENT_THROW.value(),SoundSource.PLAYERS,1.0F,1.0F);
        player.getCooldowns().addCooldown(this, 8);
        itemStack.consume(1,player);
        return InteractionResultHolder.success(itemStack);
    }

    @Override
    public Projectile asProjectile(Level level, Position position, ItemStack itemStack, Direction direction) {
        ThrowingKnifeEntity throwableItemEntity = new ThrowingKnifeEntity(position.x(),position.y(),position.z(),level,itemStack);
        throwableItemEntity.setItem(itemStack);
        return throwableItemEntity;
    }
}
