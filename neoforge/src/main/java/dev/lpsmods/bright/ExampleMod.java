package dev.lpsmods.bright;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(Constants.MOD_ID)
public class ExampleMod {

    public ExampleMod(IEventBus eventBus) {
        eventBus.addListener(this::commonSetup);
        eventBus.addListener(this::clientSetup);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(Bootstrap::init);
    }

    private void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(ClientBootstrap::init);
    }
}