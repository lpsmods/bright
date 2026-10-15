package dev.lpsmods.bright;

import com.mrcrayfish.framework.FrameworkSetup;
import net.fabricmc.api.ModInitializer;

public class BrightMod implements ModInitializer {
    
    @Override
    public void onInitialize() {
        FrameworkSetup.run();
    }
}
