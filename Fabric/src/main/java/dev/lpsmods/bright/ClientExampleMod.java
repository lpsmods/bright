package dev.lpsmods.bright;

import net.fabricmc.api.ClientModInitializer;

public class ClientExampleMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientBootstrap.init();
    }
}
