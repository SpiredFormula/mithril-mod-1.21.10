package spired.spiredsextramaterials.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import spired.spiredsextramaterials.blocks.ModBlocks;
import spired.spiredsextramaterials.item.ModItems;
import java.util.concurrent.CompletableFuture;

public class SpiredsExtraMaterialsBlockLootTableProvider extends FabricBlockLootTableProvider {


    protected SpiredsExtraMaterialsBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {



        addDrop(ModBlocks.MITHRIL_ORE, oreDrops(ModBlocks.MITHRIL_ORE, ModItems.RAW_MITHRIL));
        addDrop(ModBlocks.DEEPSLATE_MITHRIL_ORE, oreDrops(ModBlocks.MITHRIL_ORE, ModItems.RAW_MITHRIL));
        addDrop(ModBlocks.MITHRIL_BLOCK);
    }


}
