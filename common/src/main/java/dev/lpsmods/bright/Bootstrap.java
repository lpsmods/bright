package dev.lpsmods.bright;

import dev.lpsmods.bright.core.*;

public class Bootstrap {
    public static void init() {
        Constants.LOG.info("Hello to examplemod");
        ModTags.Blocks.init();
        ModTags.Items.init();
        ModBlocks.init();
        ModItems.init();
        ModCreativeModeTabs.init();
    }
}
