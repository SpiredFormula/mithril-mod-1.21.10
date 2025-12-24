package spired.spiredsextramaterials.datagen;


import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import spired.spiredsextramaterials.blocks.ModBlocks;
import spired.spiredsextramaterials.item.MithrilArmorMaterial;
import spired.spiredsextramaterials.item.ModItems;

public class SpiredsExtraMaterialsModelProvider extends FabricModelProvider {


    public SpiredsExtraMaterialsModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MITHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_MITHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MITHRIL_BLOCK);
    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_MITHRIL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor( ModItems.MITHRIL_HELMET, MithrilArmorMaterial.MITHRIL_ARMOR_MATERIAL_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor( ModItems.MITHRIL_CHESTPLATE, MithrilArmorMaterial.MITHRIL_ARMOR_MATERIAL_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor( ModItems.MITHRIL_LEGGINGS, MithrilArmorMaterial.MITHRIL_ARMOR_MATERIAL_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor( ModItems.MITHRIL_BOOTS, MithrilArmorMaterial.MITHRIL_ARMOR_MATERIAL_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);
    }
}