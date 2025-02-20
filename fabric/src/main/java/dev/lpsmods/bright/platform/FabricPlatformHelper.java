package dev.lpsmods.bright.platform;

import dev.lpsmods.bright.platform.services.IPlatformHelper;
import net.fabricmc.loader.api.FabricLoader;

/**
 * <a href="https://docs.fabricmc.net/develop/">Fabric Documentation</a>
 * */
public class FabricPlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {
        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }
}
