package net.terk.mccourse.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.terk.mccourse.MCCourseMod;

public class ModBlocks {


    public static final Block PINK_GARNET_BLOCK = registeBlock("pink_garnet_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block RAW_PINK_GARNET_BLOCK = registeBlock("raw_pink_garnet_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block PINK_GARNET_ORE = registeBlock("pink_garnet_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

    public static final Block DEEPSLATE_PINK_GARNET_ORE = registeBlock("deepslate_pink_garnet_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));

    public static final Block END_PINK_GARNET_ORE = registeBlock("end_pink_garnet_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));

    public static final Block NETHER_PINK_GARNET_ORE = registeBlock("nether_pink_garnet_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));


    private static Block registeBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MCCourseMod.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlock(){
        MCCourseMod.LOGGER.info("Registering ModBlocks for" + MCCourseMod.MOD_ID);
    }
}
