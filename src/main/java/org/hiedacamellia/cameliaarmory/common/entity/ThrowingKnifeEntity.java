package org.hiedacamellia.cameliaarmory.common.entity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import org.hiedacamellia.cameliaarmory.registries.CAEntity;
import org.hiedacamellia.cameliaarmory.registries.CAItem;
import org.hiedacamellia.camellialib.common.entity.ThrowableEntity;
import org.hiedacamellia.camellialib.common.entity.ThrowableItemEntity;
import org.hiedacamellia.camellialib.core.debug.CamelliaDebug;

public class ThrowingKnifeEntity extends ThrowableEntity {
    public ThrowingKnifeEntity(EntityType<? extends ThrowableEntity> entityType, Level level) {
        super(entityType, level);
    }
    public ThrowingKnifeEntity(double x, double y, double z, Level level, ItemStack pickupItemStack) {
        super(CAEntity.THROWING_KNIFE.get(),level, x, y, z, pickupItemStack);
    }

    public ThrowingKnifeEntity(LivingEntity shooter, Level level, ItemStack pickupItemStack) {
        super(CAEntity.THROWING_KNIFE.get(),level, shooter,pickupItemStack );
    }
}
