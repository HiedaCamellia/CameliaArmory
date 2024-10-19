package org.hiedacamellia.cameliaarmory.common.entity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.hiedacamellia.cameliaarmory.registries.CAEntity;
import org.hiedacamellia.cameliaarmory.registries.CAItem;
import org.hiedacamellia.camellialib.common.entity.ThrowableEntity;
import org.hiedacamellia.camellialib.common.entity.ThrowableItemEntity;

public class ThrowingAxeEntity extends ThrowableEntity {
    public ThrowingAxeEntity(EntityType<? extends ThrowableEntity> entityType, Level level) {
        super(entityType, level);
    }
    public ThrowingAxeEntity(double x, double y, double z, Level level, ItemStack pickupItemStack) {
        super(CAEntity.THROWING_AXE.get(),level, x, y, z, pickupItemStack);
    }

    public ThrowingAxeEntity(LivingEntity shooter, Level level, ItemStack pickupItemStack) {
        super(CAEntity.THROWING_AXE.get(),level, shooter,pickupItemStack );
    }

}
