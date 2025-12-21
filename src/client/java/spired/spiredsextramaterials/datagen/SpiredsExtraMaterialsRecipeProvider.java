package spired.spiredsextramaterials.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.world.item.Items;
import spired.spiredsextramaterials.blocks.ModBlocks;
import spired.spiredsextramaterials.item.ModItems;

public class SpiredsExtraMaterialsRecipeProvider extends FabricRecipeProvider {

    public SpiredsExtraMaterialsRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                HolderLookup.RegistryLookup<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);

                // MISC Recipes
                oreSmelting(
                        List.of(ModItems.RAW_MITHRIL), // Inputs
                        RecipeCategory.MISC, // Category
                        ModItems.MITHRIL_INGOT, // Output
                        0.7f, // Experience
                        200, // Cooking time
                        "mithril_ingot" // group
                );

                oreBlasting(
                        List.of(ModItems.RAW_MITHRIL),
                        RecipeCategory.MISC,
                        ModItems.MITHRIL_INGOT,
                        0.7f,
                        100,
                        "mithril_ingot"
                );
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MITHRIL_BLOCK.asItem())
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ModItems.MITHRIL_INGOT)
                        .unlockedBy(getHasName(ModItems.MITHRIL_INGOT ),has(ModItems.MITHRIL_INGOT))
                        .save(output);
                shapeless(RecipeCategory.MISC,ModItems.MITHRIL_INGOT, 9)
                        .requires(ModBlocks.MITHRIL_BLOCK.asItem())
                        .unlockedBy(getHasName(ModBlocks.MITHRIL_BLOCK.asItem()), has(ModBlocks.MITHRIL_BLOCK.asItem()))
                        .save(output);

                // Mithril Armor
                shaped(RecipeCategory.COMBAT, ModItems.MITHRIL_HELMET)
                        .pattern("XXX")
                        .pattern("X X")
                        .define('X', ModItems.MITHRIL_INGOT)
                        .unlockedBy(getHasName(ModItems.MITHRIL_INGOT), has(ModItems.MITHRIL_INGOT))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.MITHRIL_CHESTPLATE)
                        .pattern("X X")
                        .pattern("XXX")
                        .pattern("XXX")
                        .define('X', ModItems.MITHRIL_INGOT)
                        .unlockedBy(getHasName(ModItems.MITHRIL_INGOT), has(ModItems.MITHRIL_INGOT))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.MITHRIL_LEGGINGS)
                        .pattern("XXX")
                        .pattern("X X")
                        .pattern("X X")
                        .define('X', ModItems.MITHRIL_INGOT)
                        .unlockedBy(getHasName(ModItems.MITHRIL_INGOT), has(ModItems.MITHRIL_INGOT))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ModItems.MITHRIL_BOOTS)
                        .pattern("X X")
                        .pattern("X X")
                        .define('X', ModItems.MITHRIL_INGOT)
                        .unlockedBy(getHasName(ModItems.MITHRIL_INGOT), has(ModItems.MITHRIL_INGOT))
                        .save(output);
                // Mithril Tools
                shaped(RecipeCategory.COMBAT, ModItems.MITHRIL_SWORD)
                        .pattern(" X ")
                        .pattern(" X ")
                        .pattern(" # ")
                        .define('X', ModItems.MITHRIL_INGOT)
                        .define('#', Items.STICK)
                        .unlockedBy(getHasName(ModItems.MITHRIL_INGOT), has(ModItems.MITHRIL_INGOT))
                        .save(output);
                shaped(RecipeCategory.TOOLS, ModItems.MITHRIL_PICKAXE)
                        .pattern("XXX")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('X', ModItems.MITHRIL_INGOT)
                        .define('#', Items.STICK)
                        .unlockedBy(getHasName(ModItems.MITHRIL_INGOT), has(ModItems.MITHRIL_INGOT))
                        .save(output);
                shaped(RecipeCategory.TOOLS, ModItems.MITHRIL_SHOVEL)
                        .pattern(" X ")
                        .pattern(" # ")
                        .pattern(" # ")
                        .define('X', ModItems.MITHRIL_INGOT)
                        .define('#', Items.STICK)
                        .unlockedBy(getHasName(ModItems.MITHRIL_INGOT), has(ModItems.MITHRIL_INGOT))
                        .save(output);
                shaped(RecipeCategory.TOOLS, ModItems.MITHRIL_AXE)
                        .pattern("XX ")
                        .pattern("X# ")
                        .pattern(" # ")
                        .define('X', ModItems.MITHRIL_INGOT)
                        .define('#', Items.STICK)
                        .unlockedBy(getHasName(ModItems.MITHRIL_INGOT), has(ModItems.MITHRIL_INGOT))
                        .save(output);
                shaped(RecipeCategory.TOOLS, ModItems.MITHRIL_HOE)
                        .pattern("XX ")
                        .pattern(" # ")
                        .pattern(" # " )
                        .define('X', ModItems.MITHRIL_INGOT)
                        .define('#', Items.STICK)
                        .unlockedBy(getHasName(ModItems.MITHRIL_INGOT), has(ModItems.MITHRIL_INGOT))
                        .save(output);

            }
        };


    }

    @Override
    public String getName() {
        return "MithrilModRecipeProvider";
    }
}