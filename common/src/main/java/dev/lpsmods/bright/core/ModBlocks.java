package dev.lpsmods.bright.core;

import dev.lpsmods.bright.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {
    public static final Block EXAMPLE_BLOCK;

    private static Block registerBlock(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), block);
    }

    public static void init() {}

    static {
        EXAMPLE_BLOCK = registerBlock("example_block", new Block(BlockBehaviour.Properties.of()));
    }
}
