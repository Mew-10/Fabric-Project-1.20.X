package net.terk.mccourse.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.terk.mccourse.MCCourseMod;
import net.terk.mccourse.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup MCCOURSE_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCCourseMod.MOD_ID, "mccourse_tab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup_mccourse_tab"))
                    .icon(() -> new ItemStack(ModItems.PINK_GARNET)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.METALDETECTOR);
                        entries.add(ModItems.CAULIFOWER);

                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE);
                        entries.add(ModBlocks.END_PINK_GARNET_ORE);
                        entries.add(ModBlocks.NETHER_PINK_GARNET_ORE);
                        entries.add(ModBlocks.SOUND_BLOCK);

            } ).build());



    public static void registerItemGroups(){

    }
}
