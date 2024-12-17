package dev.lpsmods.bright.core;

import dev.lpsmods.bright.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static CreativeModeTab MAIN;

    private static CreativeModeTab registerTab(String name, CreativeModeTab tab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), tab);
    }

    public static void init() {}

    static {
        MAIN = registerTab("example", CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("itemGroup."+ Constants.MOD_ID)).icon(() -> {
            return new ItemStack(ModItems.EXAMPLE_ITEM);
        }).displayItems((CreativeModeTab.ItemDisplayParameters params, CreativeModeTab.Output out) -> {
            out.accept(ModItems.EXAMPLE_ITEM);
            out.accept(ModItems.EXAMPLE_BLOCK);
        }).build());
    }
}
