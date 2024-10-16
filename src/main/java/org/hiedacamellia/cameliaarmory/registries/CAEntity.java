package org.hiedacamellia.cameliaarmory.registries;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import org.hiedacamellia.cameliaarmory.CameliaArmory;
import org.hiedacamellia.cameliaarmory.common.entity.ThrowingAxeEntity;
import org.hiedacamellia.cameliaarmory.common.entity.ThrowingKnifeEntity;
import org.hiedacamellia.camellialib.common.entity.ThrowableItemEntity;

public class CAEntity {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, CameliaArmory.MODID);

    public static final RegistryObject<EntityType<ThrowableItemEntity>> THROWING_AXE = ENTITY_TYPES.register("throwing_axe",
            () -> EntityType.Builder.<ThrowableItemEntity>of(ThrowingAxeEntity::new, MobCategory.MISC)
                    .sized(0.25F, 0.25F)
                    .clientTrackingRange(4)
                    .updateInterval(10)
                    .build("throwing_axe"));

    public static final RegistryObject<EntityType<ThrowableItemEntity>> THROWING_KNIFE = ENTITY_TYPES.register("throwing_knife",
            () -> EntityType.Builder.<ThrowableItemEntity>of(ThrowingKnifeEntity::new, MobCategory.MISC)
                    .sized(0.25F, 0.25F)
                    .clientTrackingRange(4)
                    .updateInterval(10)
                    .build("throwing_knife"));

    public static void register(IEventBus modEventBus) {
        ENTITY_TYPES.register(modEventBus);
    }
}
