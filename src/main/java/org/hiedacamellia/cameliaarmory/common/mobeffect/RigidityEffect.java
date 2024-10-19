package org.hiedacamellia.cameliaarmory.common.mobeffect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import org.hiedacamellia.cameliaarmory.CameliaArmory;

public class RigidityEffect extends MobEffect {
    public RigidityEffect() {
        super(MobEffectCategory.HARMFUL, 0x000000);
    }

    @Override
    public String getDescriptionId() {
        return "effect." + CameliaArmory.MODID + ".rigidity";
    }
}
