package spired.spiredsextramaterials;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {

    public static final TagKey<Item> MITHRIL_ARMOR = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(SpiredsExtraMaterials.MOD_ID, "mithril_armor"));
    public static void initialize(){

    }
}
