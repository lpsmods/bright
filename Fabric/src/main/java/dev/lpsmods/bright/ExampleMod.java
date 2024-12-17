package dev.lpsmods.bright;

import net.fabricmc.api.ModInitializer;

public class ExampleMod implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Bootstrap.init();
    }
}
