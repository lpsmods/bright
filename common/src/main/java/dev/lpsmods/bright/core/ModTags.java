package dev.lpsmods.bright.core;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> CANDLE_STICKS;
        public static final TagKey<Block> CEILING_LIGHTS;
        public static final TagKey<Block> FLOOR_LIGHTS;
        public static final TagKey<Block> LIGHT_BULBS;
        public static final TagKey<Block> LIGHT_FIXTURES;

        private static TagKey<Block> tag(String name) {
            return TagKey.create(Registries.BLOCK, ModUtils.makeId(name));
        }

        static {
            CANDLE_STICKS = tag("candle_sticks");
            CEILING_LIGHTS = tag("ceiling_lights");
            FLOOR_LIGHTS = tag("floor_lights");
            LIGHT_BULBS = tag("light_bulbs");
            LIGHT_FIXTURES = tag("light_fixtures");
        }
    }
}
