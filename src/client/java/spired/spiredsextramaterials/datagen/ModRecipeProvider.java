package spired.spiredsextramaterials.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import spired.spiredsextramaterials.blocks.ModBlocks;
import spired.spiredsextramaterials.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {


    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                RegistryWrapper.Impl<Item> itemLookup = registries.getOrThrow(RegistryKeys.ITEM);

                offerSmelting(
                        List.of(ModItems.RAW_MITHRIL), // Inputs
                        RecipeCategory.MISC, // Category
                        ModItems.MITHRIL_INGOT, // Output
                        0.7f, // Experience
                        200, // Cooking time
                        "mithril_ingot" // group
                );
                offerBlasting(
                        List.of(ModItems.RAW_MITHRIL), // Inputs
                        RecipeCategory.MISC, // Category
                        ModItems.MITHRIL_INGOT, // Output
                        0.7f, // Experience
                        200, // Cooking time
                        "mithril_ingot" // group
                );
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MITHRIL_BLOCK.asItem())
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .input('#', ModItems.MITHRIL_INGOT)
                        .criterion(hasItem(ModItems.MITHRIL_INGOT ),conditionsFromItem(ModItems.MITHRIL_INGOT))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC,ModItems.MITHRIL_INGOT, 9)
                        .input(ModBlocks.MITHRIL_BLOCK.asItem())
                        .criterion(hasItem(ModBlocks.MITHRIL_BLOCK.asItem()), conditionsFromItem(ModBlocks.MITHRIL_BLOCK.asItem()))
                        .offerTo(exporter);

                // Mithril Armor
                createShaped(RecipeCategory.COMBAT, ModItems.MITHRIL_HELMET)
                        .pattern("XXX")
                        .pattern("X X")
                        .input('X', ModItems.MITHRIL_INGOT)
                        .criterion(hasItem(ModItems.MITHRIL_INGOT), conditionsFromItem(ModItems.MITHRIL_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.MITHRIL_CHESTPLATE)
                        .pattern("X X")
                        .pattern("XXX")
                        .pattern("XXX")
                        .input('X', ModItems.MITHRIL_INGOT)
                        .criterion(hasItem(ModItems.MITHRIL_INGOT), conditionsFromItem(ModItems.MITHRIL_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.MITHRIL_LEGGINGS)
                        .pattern("XXX")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', ModItems.MITHRIL_INGOT)
                        .criterion(hasItem(ModItems.MITHRIL_INGOT), conditionsFromItem(ModItems.MITHRIL_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.MITHRIL_BOOTS)
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', ModItems.MITHRIL_INGOT)
                        .criterion(hasItem(ModItems.MITHRIL_INGOT), conditionsFromItem(ModItems.MITHRIL_INGOT))
                        .offerTo(exporter);

                // Mithril Tools
                createShaped(RecipeCategory.COMBAT, ModItems.MITHRIL_SWORD)
                        .pattern(" X ")
                        .pattern(" X ")
                        .pattern(" # ")
                        .input('X', ModItems.MITHRIL_INGOT)
                        .input('#', Items.STICK)
                        .criterion(hasItem(ModItems.MITHRIL_INGOT), conditionsFromItem(ModItems.MITHRIL_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.MITHRIL_PICKAXE)
                        .pattern("XXX")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('X', ModItems.MITHRIL_INGOT)
                        .input('#', Items.STICK)
                        .criterion(hasItem(ModItems.MITHRIL_INGOT), conditionsFromItem(ModItems.MITHRIL_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.MITHRIL_SHOVEL)
                        .pattern(" X ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .input('X', ModItems.MITHRIL_INGOT)
                        .input('#', Items.STICK)
                        .criterion(hasItem(ModItems.MITHRIL_INGOT), conditionsFromItem(ModItems.MITHRIL_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.MITHRIL_AXE)
                        .pattern("XX ")
                        .pattern("X# ")
                        .pattern(" # ")
                        .input('X', ModItems.MITHRIL_INGOT)
                        .input('#', Items.STICK)
                        .criterion(hasItem(ModItems.MITHRIL_INGOT), conditionsFromItem(ModItems.MITHRIL_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.MITHRIL_HOE)
                        .pattern("XX ")
                        .pattern(" # ")
                        .pattern(" # " )
                        .input('X', ModItems.MITHRIL_INGOT)
                        .input('#', Items.STICK)
                        .criterion(hasItem(ModItems.MITHRIL_INGOT), conditionsFromItem(ModItems.MITHRIL_INGOT))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "ModRecipeProvider";
    }
}







//
//                // Mithril Armor

//                // Mithril Tools

