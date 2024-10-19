package org.hiedacamellia.cameliaarmory.core.data.provider;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.hiedacamellia.cameliaarmory.CameliaArmory;
import org.hiedacamellia.cameliaarmory.registries.CAItem;

import java.util.stream.Collectors;

public class CAItemModelProvider extends ItemModelProvider {
    public CAItemModelProvider(PackOutput output, ExistingFileHelper helper) {
        super(output, CameliaArmory.MODID, helper);
    }

    protected void registerModels() {
        this.getKnownItems().forEach((item) -> {
            if (!(item instanceof BlockItem)) {
                String path = BuiltInRegistries.ITEM.getKey(item).getPath();
                this.singleTexture(path, this.mcLoc("cameliaarmory:item/base"), "layer0", this.modLoc("item/" + path));
            }
        });
        this.getKnownGuiItems().forEach((item) -> {
            if (!(item instanceof BlockItem)) {
                String path = BuiltInRegistries.ITEM.getKey(item).getPath();
                this.singleTexture(path + "_gui", this.mcLoc("cameliaarmory:item/base"), "layer0", this.modLoc("item/" + path + "_gui"));
                this.singleTexture(path + "_base", this.mcLoc("cameliaarmory:item/base"), "layer0", this.modLoc("item/" + path));
            }
        });
    }

    public Iterable<Item> getKnownItems() {
        return CAItem.ITEMS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toSet());
    }

    public Iterable<Item> getKnownGuiItems() {
        return CAItem.ITEM_WITH_GUI.getEntries().stream().map(RegistryObject::get).collect(Collectors.toSet());
    }
}
