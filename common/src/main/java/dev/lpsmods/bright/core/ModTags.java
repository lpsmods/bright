package dev.lpsmods.bright.core;

import dev.lpsmods.bright.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> EXAMPLES;

        public static void init() {}

        public static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name));
        }

        static {
            EXAMPLES = createTag("examples");
        }
    }
    public static class Blocks {
        public static final TagKey<Block> EXAMPLES;

        public static void init() {}

        public static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name));
        }

        static {
            EXAMPLES = createTag("examples");
        }
    }
}
