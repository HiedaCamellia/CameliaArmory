package org.hiedacamellia.cameliaarmory.common.item;

import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import org.hiedacamellia.cameliaarmory.common.entity.ThrowingKnifeEntity;
import org.hiedacamellia.cameliaarmory.registries.CAEntity;
import org.hiedacamellia.camellialib.common.item.SwordItemWithTooltip;

public class ThrowingKnife extends SwordItemWithTooltip implements ProjectileItem {

    public ThrowingKnife(Tier tier, Properties properties) {
        super(tier, properties);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        if (!level.isClientSide) {
            ThrowingKnifeEntity throwableItemEntity = new ThrowingKnifeEntity(CAEntity.THROWING_KNIFE.get(), level);
            throwableItemEntity.setItem(itemStack);
            throwableItemEntity.setOwner(player);
            throwableItemEntity.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
            level.addFreshEntity(throwableItemEntity);
        }
        itemStack.consume(1,player);
        return InteractionResultHolder.consume(itemStack);
    }

    @Override
    public Projectile asProjectile(Level level, Position position, ItemStack itemStack, Direction direction) {
        ThrowingKnifeEntity throwableItemEntity = new ThrowingKnifeEntity(position.x(),position.y(),position.z(),level);
        throwableItemEntity.setItem(itemStack);
        return throwableItemEntity;
    }
}
