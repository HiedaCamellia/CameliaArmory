package org.hiedacamellia.cameliaarmory.common.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import org.hiedacamellia.cameliaarmory.registries.CAMobEffect;
import org.hiedacamellia.camellialib.common.item.AxeItemWithTooltip;

public class SpearItemWithTooltip extends AxeItemWithTooltip {

    private final int RIGIDITY_DURATION;

    public SpearItemWithTooltip(int rigidityDuration,Tier tier, Properties properties) {
        super(tier, properties);
        this.RIGIDITY_DURATION = rigidityDuration;
    }

    @Override
    public void postHurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addEffect(new MobEffectInstance(CAMobEffect.RIGIDITY,RIGIDITY_DURATION));
    }
}
