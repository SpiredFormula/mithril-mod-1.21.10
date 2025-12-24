package spired.spiredsextramaterials.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import spired.spiredsextramaterials.world.ModConfiguredFeatures;
import spired.spiredsextramaterials.world.ModPlacedFeatures;


public class SpiredsExtraMaterialsDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(SpiredsExtraMaterialsBlockTagProvider::new);
        pack.addProvider(SpiredsExtraMaterialsItemTagProvider::new);
        pack.addProvider(SpiredsExtraMaterialsBlockLootTableProvider::new);
        pack.addProvider(SpiredsExtraMaterialsRecipeProvider::new);
        pack.addProvider(SpiredsExtraMaterialsRegistryDataGenerator::new);
        pack.addProvider(SpiredsExtraMaterialsModelProvider::new);
    }
    @Override
    public void buildRegistry(RegistryBuilder registryBuilder){
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
    }

}
