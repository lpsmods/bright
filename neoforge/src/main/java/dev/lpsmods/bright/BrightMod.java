package dev.lpsmods.bright;


import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@Mod(Constants.MOD_ID)
public class BrightMod {

    public BrightMod(IEventBus bus) {
        bus.addListener(this::onCommonSetup);
        bus.addListener(this::onGatherData);
        bus.addListener(this::onClientSetup);
    }

    private void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(Bootstrap::init);
    }

    private void onClientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(ClientBrightMod::init);
    }

    private void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
//        event.createProvider(CommonRecipeProvider.Runner::new);
    }
}