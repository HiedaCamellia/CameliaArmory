package org.hiedacamellia.cameliaarmory.common.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import org.hiedacamellia.cameliaarmory.registries.CAMobEffect;
import org.hiedacamellia.camellialib.common.item.AxeItemWithTooltip;

public class LucerneHammerItemWithTooltip extends AxeItemWithTooltip {
    private final int VERTIGO_DURATION;
    public LucerneHammerItemWithTooltip(int vertigoDuration ,Tier tier, Properties properties) {
        super(tier, properties);
        this.VERTIGO_DURATION = vertigoDuration;
    }

    @Override
    public void postHurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addEffect(new MobEffectInstance(CAMobEffect.VERTIGO,VERTIGO_DURATION));
    }
}
