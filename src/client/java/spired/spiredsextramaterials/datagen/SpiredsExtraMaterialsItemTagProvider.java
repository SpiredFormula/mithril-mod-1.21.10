package spired.spiredsextramaterials.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;
import spired.spiredsextramaterials.item.ModItems;
import spired.spiredsextramaterials.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class SpiredsExtraMaterialsItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public SpiredsExtraMaterialsItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, registriesFuture, blockTagProvider);
    }

    public SpiredsExtraMaterialsItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
        .add(ModItems.MITHRIL_HELMET)
        .add(ModItems.MITHRIL_CHESTPLATE)
        .add(ModItems.MITHRIL_LEGGINGS)
        .add(ModItems.MITHRIL_BOOTS);

        valueLookupBuilder(ModTags.MITHRIL_ARMOR)
                .add(ModItems.MITHRIL_HELMET)
                .add(ModItems.MITHRIL_CHESTPLATE)
                .add(ModItems.MITHRIL_LEGGINGS)
                .add(ModItems.MITHRIL_BOOTS);

        valueLookupBuilder(ModTags.REPAIRS_MITHRIL_ARMOR).add(ModItems.MITHRIL_INGOT);

        valueLookupBuilder(ItemTags.SWORDS).add(ModItems.MITHRIL_SWORD);
        valueLookupBuilder(ItemTags.PICKAXES).add(ModItems.MITHRIL_PICKAXE);
        valueLookupBuilder(ItemTags.AXES).add(ModItems.MITHRIL_AXE);
        valueLookupBuilder(ItemTags.SHOVELS).add(ModItems.MITHRIL_SHOVEL);
        valueLookupBuilder(ItemTags.HOES).add(ModItems.MITHRIL_HOE);
    }
}



