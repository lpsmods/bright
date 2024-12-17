package dev.lpsmods.bright;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class ExampleMod {

    public ExampleMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::commonSetup);
        bus.addListener(this::clientSetup);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(Bootstrap::init);
    }

    private void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(ClientBootstrap::init);
    }
}