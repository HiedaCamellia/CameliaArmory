package net.odinary.camelliaarmory.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.odinary.camelliaarmory.CamelliaArmory;


public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CamelliaArmory.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CAMELLIAARMORY_TAB = CREATIVE_MODE_TABS.register("camelliaarmory_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIAMOND_BASTARD_SWORD.get()))
                    .title(Component.translatable("creativetab.camelliaarmory_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.DIAMOND_BASTARD_SWORD.get());


                        //block

                        //custom block


                        pOutput.accept(Items.DRAGON_EGG);
                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
