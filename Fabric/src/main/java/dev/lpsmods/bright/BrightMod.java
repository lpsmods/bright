package dev.lpsmods.bright;

import com.mrcrayfish.framework.FrameworkSetup;
import dev.lpsmods.bright.data.CommonRecipeProvider;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BrightMod implements ModInitializer, DataGeneratorEntrypoint {
    
    @Override
    public void onInitialize() {
        FrameworkSetup.run();
        Bootstrap.init();
    }

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();
        pack.addProvider(CommonRecipeProvider::new);
    }
}
