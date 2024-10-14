package org.hiedacamellia.cameliaarmory.common.entity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import org.hiedacamellia.cameliaarmory.registries.CAEntity;
import org.hiedacamellia.cameliaarmory.registries.CAItem;
import org.hiedacamellia.camellialib.common.entity.ThrowableItemEntity;
import org.hiedacamellia.camellialib.core.debug.CamelliaDebug;

public class ThrowingKnifeEntity extends ThrowableItemEntity {
    public ThrowingKnifeEntity(EntityType<? extends ThrowableItemEntity> entityType, Level level) {
        super(CAEntity.THROWING_KNIFE.get(), level);
    }
    public ThrowingKnifeEntity(double x, double y, double z, Level level) {
        super(CAEntity.THROWING_KNIFE.get(), x, y, z, level);
    }

    public ThrowingKnifeEntity(LivingEntity shooter, Level level) {
        super(CAEntity.THROWING_KNIFE.get(), shooter, level);
    }

    @Override
    protected Item getDefaultItem() {
        return CAItem.THROWING_KNIFE.get("iron").get();
    }
}
