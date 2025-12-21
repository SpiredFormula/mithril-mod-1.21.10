package spired.spiredsextramaterials.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class SpiredsExtraMaterialsRegistryDataGenerator extends FabricDynamicRegistryProvider {
    public SpiredsExtraMaterialsRegistryDataGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    public String getName() {
        return "";
    }

    @Override
    protected void configure(HolderLookup.Provider registries, Entries entries) {

    }
}
