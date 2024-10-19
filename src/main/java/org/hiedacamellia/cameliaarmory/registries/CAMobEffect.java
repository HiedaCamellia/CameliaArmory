package org.hiedacamellia.cameliaarmory.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.cameliaarmory.CameliaArmory;
import org.hiedacamellia.cameliaarmory.common.mobeffect.RigidityEffect;

public class CAMobEffect {
    public static final DeferredRegister<MobEffect> Effects = DeferredRegister.create(Registries.MOB_EFFECT, CameliaArmory.MODID);

    public static final DeferredHolder<MobEffect, MobEffect> RIGIDITY = Effects.register("rigidity",()->new RigidityEffect().addAttributeModifier(Attributes.MOVEMENT_SPEED,CameliaArmory.perfix("rigidity"), -1, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final DeferredHolder<MobEffect, MobEffect> VERTIGO = Effects.register("vertigo",()->new RigidityEffect().addAttributeModifier(Attributes.MOVEMENT_SPEED,CameliaArmory.perfix("vertigo"), -1, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            .addAttributeModifier(Attributes.ATTACK_SPEED,CameliaArmory.perfix("vertigo"), -1, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));



    public static void register(IEventBus modEventBus) {
        Effects.register(modEventBus);
    }
}
