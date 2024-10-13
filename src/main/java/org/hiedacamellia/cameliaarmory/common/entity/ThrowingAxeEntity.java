package org.hiedacamellia.cameliaarmory.common.entity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.level.Level;
import org.hiedacamellia.cameliaarmory.registries.CAEntity;
import org.hiedacamellia.camellialib.common.entity.ThrowableItemEntity;

public class ThrowingAxeEntity extends ThrowableItemEntity {
    public ThrowingAxeEntity(EntityType<? extends ThrowableItemEntity> entityType, Level level) {
        super(CAEntity.THROWING_AXE.get(), level);
    }
    public ThrowingAxeEntity(double x, double y, double z, Level level) {
        super(CAEntity.THROWING_AXE.get(), x, y, z, level);
    }

    public ThrowingAxeEntity(LivingEntity shooter, Level level) {
        super(CAEntity.THROWING_AXE.get(), shooter, level);
    }
}
