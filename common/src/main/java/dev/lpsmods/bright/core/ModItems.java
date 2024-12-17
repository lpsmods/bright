package dev.lpsmods.bright.core;

import dev.lpsmods.bright.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModItems {
    public static final Item EXAMPLE_BLOCK;
    public static final Item EXAMPLE_ITEM;


    private static Item registerBlock(String name, Block block) {
        return registerItem(name, new BlockItem(block, new Item.Properties()));
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), item);
    }

    public static void init() {}

    static {
        EXAMPLE_BLOCK = registerBlock("example_block", ModBlocks.EXAMPLE_BLOCK);
        EXAMPLE_ITEM = registerItem("example_item", new Item(new Item.Properties()));
    }
}
