package org.hiedacamellia.cameliaarmory.core.entry;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import org.hiedacamellia.camellialib.common.item.ItemWithTooltip;

public class MutiModelsItem extends ItemWithTooltip {
    public MutiModelsItem(Properties properties) {
        super(properties);
    }

    public ModelResourceLocation icon() {
        return ModelResourceLocation.standalone(BuiltInRegistries.ITEM.getKey(this).withPath(e -> "item/" + e));
    }

    public ModelResourceLocation model() {
        return ModelResourceLocation.standalone(BuiltInRegistries.ITEM.getKey(this).withPath(e -> "item/" + e + "_gui"));
    }
}
