package org.hiedacamellia.cameliaarmory.core.data.provider;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.hiedacamellia.cameliaarmory.CameliaArmory;
import org.hiedacamellia.cameliaarmory.registries.CAItem;
import org.hiedacamellia.camellialib.core.data.model.AutoItemModelProvider;

import java.util.stream.Collectors;

public class CAItemModelProvider extends ItemModelProvider {
    public CAItemModelProvider(PackOutput output, ExistingFileHelper helper) {
        super(output, CameliaArmory.MODID, helper);
    }

    protected void registerModels() {
        this.getKnownItems().forEach((item) -> {
            if (!(item instanceof BlockItem)) {
                String path = BuiltInRegistries.ITEM.getKey(item).getPath();
                this.singleTexture(path, this.mcLoc("item/generated"), "layer0", this.modLoc("item/" + path));
            }});
        this.getKnownGuiItems().forEach((item) -> {
            if (!(item instanceof BlockItem)) {
                String path = BuiltInRegistries.ITEM.getKey(item).getPath();
                this.singleTexture(path, this.mcLoc("item/generated"), "layer0", this.modLoc("item/" + path+"_gui"));
            }});
    }

    public Iterable<Item> getKnownItems() {
        return CAItem.ITEMS.getEntries().stream().map(DeferredHolder::get).collect(Collectors.toSet());
    }
    public Iterable<Item> getKnownGuiItems() {
        return CAItem.ITEM_WITH_GUI.getEntries().stream().map(DeferredHolder::get).collect(Collectors.toSet());
    }
}
