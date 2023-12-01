package net.terk.mccourse.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.terk.mccourse.block.ModBlocks;
import net.terk.mccourse.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SOUND_BLOCK)
                .pattern(" N ")
                .pattern("NDN")
                .pattern(" N ")
                .input('N', Items.NOTE_BLOCK)
                .input('D', Items.DIAMOND)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SOUND_BLOCK) + "_"));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PINK_GARNET, RecipeCategory.MISC, ModBlocks.PINK_GARNET_BLOCK);

        offerSmelting(exporter, List.of(ModItems.RAW_PINK_GARNET, ModBlocks.PINK_GARNET_ORE, ModBlocks.DEEPSLATE_PINK_GARNET_ORE,
                        ModBlocks.NETHER_PINK_GARNET_ORE, ModBlocks.END_PINK_GARNET_ORE), RecipeCategory.MISC, ModItems.PINK_GARNET,
                0.25f, 200, "pink_garnet");
        offerBlasting(exporter, List.of(ModItems.RAW_PINK_GARNET, ModBlocks.PINK_GARNET_ORE, ModBlocks.DEEPSLATE_PINK_GARNET_ORE,
                        ModBlocks.NETHER_PINK_GARNET_ORE, ModBlocks.END_PINK_GARNET_ORE), RecipeCategory.MISC, ModItems.PINK_GARNET,
                0.25f, 125, "pink_garnet");

        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_GARNET_SLAB, ModItems.PINK_GARNET);
        createStairsRecipe(ModBlocks.PINK_GARNET_STAIRS, Ingredient.ofItems(ModItems.PINK_GARNET));
        offerPressurePlateRecipe(exporter, ModBlocks.PINK_GARNET_PRESSURE_PLATE, ModItems.PINK_GARNET);


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GARNET_BUTTON)
                .pattern("   ")
                .pattern(" G ")
                .pattern("   ")
                .input('G', ModBlocks.PINK_GARNET_BLOCK)
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_BUTTON) + "_"));

    }
}
