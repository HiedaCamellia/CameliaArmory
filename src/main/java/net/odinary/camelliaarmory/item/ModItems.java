package net.odinary.camelliaarmory.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.odinary.camelliaarmory.CamelliaArmory;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CamelliaArmory.MOD_ID);

    public static final RegistryObject<Item> DIAMOND_BASTARD_SWORD = ITEMS.register("diamond_bastard_sword",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
