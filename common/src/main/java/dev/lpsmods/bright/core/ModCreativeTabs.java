package dev.lpsmods.bright.core;

import com.mrcrayfish.framework.api.registry.RegistryContainer;
import com.mrcrayfish.framework.api.registry.RegistryEntry;
import dev.lpsmods.bright.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

@RegistryContainer
public class ModCreativeTabs {
    public static RegistryEntry<CreativeModeTab> MAIN;

    static {
        MAIN = RegistryEntry.creativeModeTab(ModUtils.makeId("bright"), builder -> {
            builder.icon(() -> new ItemStack(Items.LIGHT));
            builder.title(Component.translatable("itemGroup."+ Constants.MOD_ID));
            builder.displayItems((params, output) -> {
                output.accept(ModBlocks.COPPER_CANDLE_STICK.get());
                output.accept(ModBlocks.COPPER_WHITE_CANDLE_STICK.get());
                output.accept(ModBlocks.COPPER_LIGHT_GRAY_CANDLE_STICK.get());
                output.accept(ModBlocks.COPPER_GRAY_CANDLE_STICK.get());
                output.accept(ModBlocks.COPPER_BLACK_CANDLE_STICK.get());
                output.accept(ModBlocks.COPPER_BROWN_CANDLE_STICK.get());
                output.accept(ModBlocks.COPPER_RED_CANDLE_STICK.get());
                output.accept(ModBlocks.COPPER_ORANGE_CANDLE_STICK.get());
                output.accept(ModBlocks.COPPER_YELLOW_CANDLE_STICK.get());
                output.accept(ModBlocks.COPPER_LIME_CANDLE_STICK.get());
                output.accept(ModBlocks.COPPER_GREEN_CANDLE_STICK.get());
                output.accept(ModBlocks.COPPER_CYAN_CANDLE_STICK.get());
                output.accept(ModBlocks.COPPER_LIGHT_BLUE_CANDLE_STICK.get());
                output.accept(ModBlocks.COPPER_BLUE_CANDLE_STICK.get());
                output.accept(ModBlocks.COPPER_PURPLE_CANDLE_STICK.get());
                output.accept(ModBlocks.COPPER_MAGENTA_CANDLE_STICK.get());
                output.accept(ModBlocks.COPPER_PINK_CANDLE_STICK.get());
                output.accept(ModBlocks.DIAMOND_CANDLE_STICK.get());
                output.accept(ModBlocks.DIAMOND_WHITE_CANDLE_STICK.get());
                output.accept(ModBlocks.DIAMOND_LIGHT_GRAY_CANDLE_STICK.get());
                output.accept(ModBlocks.DIAMOND_GRAY_CANDLE_STICK.get());
                output.accept(ModBlocks.DIAMOND_BLACK_CANDLE_STICK.get());
                output.accept(ModBlocks.DIAMOND_BROWN_CANDLE_STICK.get());
                output.accept(ModBlocks.DIAMOND_RED_CANDLE_STICK.get());
                output.accept(ModBlocks.DIAMOND_ORANGE_CANDLE_STICK.get());
                output.accept(ModBlocks.DIAMOND_YELLOW_CANDLE_STICK.get());
                output.accept(ModBlocks.DIAMOND_LIME_CANDLE_STICK.get());
                output.accept(ModBlocks.DIAMOND_GREEN_CANDLE_STICK.get());
                output.accept(ModBlocks.DIAMOND_CYAN_CANDLE_STICK.get());
                output.accept(ModBlocks.DIAMOND_LIGHT_BLUE_CANDLE_STICK.get());
                output.accept(ModBlocks.DIAMOND_BLUE_CANDLE_STICK.get());
                output.accept(ModBlocks.DIAMOND_PURPLE_CANDLE_STICK.get());
                output.accept(ModBlocks.DIAMOND_MAGENTA_CANDLE_STICK.get());
                output.accept(ModBlocks.DIAMOND_PINK_CANDLE_STICK.get());
                output.accept(ModBlocks.GOLD_CANDLE_STICK.get());
                output.accept(ModBlocks.GOLD_WHITE_CANDLE_STICK.get());
                output.accept(ModBlocks.GOLD_LIGHT_GRAY_CANDLE_STICK.get());
                output.accept(ModBlocks.GOLD_GRAY_CANDLE_STICK.get());
                output.accept(ModBlocks.GOLD_BLACK_CANDLE_STICK.get());
                output.accept(ModBlocks.GOLD_BROWN_CANDLE_STICK.get());
                output.accept(ModBlocks.GOLD_RED_CANDLE_STICK.get());
                output.accept(ModBlocks.GOLD_ORANGE_CANDLE_STICK.get());
                output.accept(ModBlocks.GOLD_YELLOW_CANDLE_STICK.get());
                output.accept(ModBlocks.GOLD_LIME_CANDLE_STICK.get());
                output.accept(ModBlocks.GOLD_GREEN_CANDLE_STICK.get());
                output.accept(ModBlocks.GOLD_CYAN_CANDLE_STICK.get());
                output.accept(ModBlocks.GOLD_LIGHT_BLUE_CANDLE_STICK.get());
                output.accept(ModBlocks.GOLD_BLUE_CANDLE_STICK.get());
                output.accept(ModBlocks.GOLD_PURPLE_CANDLE_STICK.get());
                output.accept(ModBlocks.GOLD_MAGENTA_CANDLE_STICK.get());
                output.accept(ModBlocks.GOLD_PINK_CANDLE_STICK.get());
                output.accept(ModBlocks.IRON_CANDLE_STICK.get());
                output.accept(ModBlocks.IRON_WHITE_CANDLE_STICK.get());
                output.accept(ModBlocks.IRON_LIGHT_GRAY_CANDLE_STICK.get());
                output.accept(ModBlocks.IRON_GRAY_CANDLE_STICK.get());
                output.accept(ModBlocks.IRON_BLACK_CANDLE_STICK.get());
                output.accept(ModBlocks.IRON_BROWN_CANDLE_STICK.get());
                output.accept(ModBlocks.IRON_RED_CANDLE_STICK.get());
                output.accept(ModBlocks.IRON_ORANGE_CANDLE_STICK.get());
                output.accept(ModBlocks.IRON_YELLOW_CANDLE_STICK.get());
                output.accept(ModBlocks.IRON_LIME_CANDLE_STICK.get());
                output.accept(ModBlocks.IRON_GREEN_CANDLE_STICK.get());
                output.accept(ModBlocks.IRON_CYAN_CANDLE_STICK.get());
                output.accept(ModBlocks.IRON_LIGHT_BLUE_CANDLE_STICK.get());
                output.accept(ModBlocks.IRON_BLUE_CANDLE_STICK.get());
                output.accept(ModBlocks.IRON_PURPLE_CANDLE_STICK.get());
                output.accept(ModBlocks.IRON_MAGENTA_CANDLE_STICK.get());
                output.accept(ModBlocks.IRON_PINK_CANDLE_STICK.get());
                output.accept(ModBlocks.NETHERITE_CANDLE_STICK.get());
                output.accept(ModBlocks.NETHERITE_WHITE_CANDLE_STICK.get());
                output.accept(ModBlocks.NETHERITE_LIGHT_GRAY_CANDLE_STICK.get());
                output.accept(ModBlocks.NETHERITE_GRAY_CANDLE_STICK.get());
                output.accept(ModBlocks.NETHERITE_BLACK_CANDLE_STICK.get());
                output.accept(ModBlocks.NETHERITE_BROWN_CANDLE_STICK.get());
                output.accept(ModBlocks.NETHERITE_RED_CANDLE_STICK.get());
                output.accept(ModBlocks.NETHERITE_ORANGE_CANDLE_STICK.get());
                output.accept(ModBlocks.NETHERITE_YELLOW_CANDLE_STICK.get());
                output.accept(ModBlocks.NETHERITE_LIME_CANDLE_STICK.get());
                output.accept(ModBlocks.NETHERITE_GREEN_CANDLE_STICK.get());
                output.accept(ModBlocks.NETHERITE_CYAN_CANDLE_STICK.get());
                output.accept(ModBlocks.NETHERITE_LIGHT_BLUE_CANDLE_STICK.get());
                output.accept(ModBlocks.NETHERITE_BLUE_CANDLE_STICK.get());
                output.accept(ModBlocks.NETHERITE_PURPLE_CANDLE_STICK.get());
                output.accept(ModBlocks.NETHERITE_MAGENTA_CANDLE_STICK.get());
                output.accept(ModBlocks.NETHERITE_PINK_CANDLE_STICK.get());
                output.accept(ModBlocks.WHITE_CEILING_LIGHT.get());
                output.accept(ModBlocks.ORANGE_CEILING_LIGHT.get());
                output.accept(ModBlocks.MAGENTA_CEILING_LIGHT.get());
                output.accept(ModBlocks.LIGHT_BLUE_CEILING_LIGHT.get());
                output.accept(ModBlocks.YELLOW_CEILING_LIGHT.get());
                output.accept(ModBlocks.LIME_CEILING_LIGHT.get());
                output.accept(ModBlocks.PINK_CEILING_LIGHT.get());
                output.accept(ModBlocks.GRAY_CEILING_LIGHT.get());
                output.accept(ModBlocks.LIGHT_GRAY_CEILING_LIGHT.get());
                output.accept(ModBlocks.CYAN_CEILING_LIGHT.get());
                output.accept(ModBlocks.PURPLE_CEILING_LIGHT.get());
                output.accept(ModBlocks.BLUE_CEILING_LIGHT.get());
                output.accept(ModBlocks.BROWN_CEILING_LIGHT.get());
                output.accept(ModBlocks.GREEN_CEILING_LIGHT.get());
                output.accept(ModBlocks.RED_CEILING_LIGHT.get());
                output.accept(ModBlocks.BLACK_CEILING_LIGHT.get());
                output.accept(ModBlocks.WHITE_FLOOR_LIGHT.get());
                output.accept(ModBlocks.ORANGE_FLOOR_LIGHT.get());
                output.accept(ModBlocks.MAGENTA_FLOOR_LIGHT.get());
                output.accept(ModBlocks.LIGHT_BLUE_FLOOR_LIGHT.get());
                output.accept(ModBlocks.YELLOW_FLOOR_LIGHT.get());
                output.accept(ModBlocks.LIME_FLOOR_LIGHT.get());
                output.accept(ModBlocks.PINK_FLOOR_LIGHT.get());
                output.accept(ModBlocks.GRAY_FLOOR_LIGHT.get());
                output.accept(ModBlocks.LIGHT_GRAY_FLOOR_LIGHT.get());
                output.accept(ModBlocks.CYAN_FLOOR_LIGHT.get());
                output.accept(ModBlocks.PURPLE_FLOOR_LIGHT.get());
                output.accept(ModBlocks.BLUE_FLOOR_LIGHT.get());
                output.accept(ModBlocks.BROWN_FLOOR_LIGHT.get());
                output.accept(ModBlocks.GREEN_FLOOR_LIGHT.get());
                output.accept(ModBlocks.RED_FLOOR_LIGHT.get());
                output.accept(ModBlocks.BLACK_FLOOR_LIGHT.get());
                output.accept(ModBlocks.WHITE_LIGHT_BULB.get());
                output.accept(ModBlocks.ORANGE_LIGHT_BULB.get());
                output.accept(ModBlocks.MAGENTA_LIGHT_BULB.get());
                output.accept(ModBlocks.LIGHT_BLUE_LIGHT_BULB.get());
                output.accept(ModBlocks.YELLOW_LIGHT_BULB.get());
                output.accept(ModBlocks.LIME_LIGHT_BULB.get());
                output.accept(ModBlocks.PINK_LIGHT_BULB.get());
                output.accept(ModBlocks.GRAY_LIGHT_BULB.get());
                output.accept(ModBlocks.LIGHT_GRAY_LIGHT_BULB.get());
                output.accept(ModBlocks.CYAN_LIGHT_BULB.get());
                output.accept(ModBlocks.PURPLE_LIGHT_BULB.get());
                output.accept(ModBlocks.BLUE_LIGHT_BULB.get());
                output.accept(ModBlocks.BROWN_LIGHT_BULB.get());
                output.accept(ModBlocks.GREEN_LIGHT_BULB.get());
                output.accept(ModBlocks.RED_LIGHT_BULB.get());
                output.accept(ModBlocks.BLACK_LIGHT_BULB.get());
                output.accept(ModBlocks.WHITE_LIGHT_FIXTURE.get());
                output.accept(ModBlocks.ORANGE_LIGHT_FIXTURE.get());
                output.accept(ModBlocks.MAGENTA_LIGHT_FIXTURE.get());
                output.accept(ModBlocks.LIGHT_BLUE_LIGHT_FIXTURE.get());
                output.accept(ModBlocks.YELLOW_LIGHT_FIXTURE.get());
                output.accept(ModBlocks.LIME_LIGHT_FIXTURE.get());
                output.accept(ModBlocks.PINK_LIGHT_FIXTURE.get());
                output.accept(ModBlocks.GRAY_LIGHT_FIXTURE.get());
                output.accept(ModBlocks.LIGHT_GRAY_LIGHT_FIXTURE.get());
                output.accept(ModBlocks.CYAN_LIGHT_FIXTURE.get());
                output.accept(ModBlocks.PURPLE_LIGHT_FIXTURE.get());
                output.accept(ModBlocks.BLUE_LIGHT_FIXTURE.get());
                output.accept(ModBlocks.BROWN_LIGHT_FIXTURE.get());
                output.accept(ModBlocks.GREEN_LIGHT_FIXTURE.get());
                output.accept(ModBlocks.RED_LIGHT_FIXTURE.get());
                output.accept(ModBlocks.BLACK_LIGHT_FIXTURE.get());
            });
        });
    }
}
