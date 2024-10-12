package org.hiedacamellia.cameliaarmory.core.entry;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class BowItemWithTootip extends BowItem {
    public BowItemWithTootip(Properties properties) {
        super(properties);
    }
    public void appendHoverText(@NotNull ItemStack itemstack, Item.@NotNull TooltipContext context, @NotNull List<Component> list, @NotNull TooltipFlag flag) {
        super.appendHoverText(itemstack, context, list, flag);
        ResourceLocation key = BuiltInRegistries.ITEM.getKey(itemstack.getItem());
        if (!Screen.hasShiftDown()) {
            list.add(Component.translatable("tooltip.camellialib.press_shift").withStyle(new ChatFormatting[]{ChatFormatting.GRAY, ChatFormatting.ITALIC}));
        } else {
            String[] description = Component.translatable(key.toLanguageKey() + ".desc").getString().split("搂n");
            String[] var7 = description;
            int var8 = description.length;

            for(int var9 = 0; var9 < var8; ++var9) {
                String line = var7[var9];
                list.add(Component.literal(line));
            }
        }

    }
}
