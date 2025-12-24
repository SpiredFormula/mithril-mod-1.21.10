package spired.spiredsextramaterials.util;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import spired.spiredsextramaterials.SpiredsExtraMaterials;

public class ModTags {
// TODO add translation to tags
    public static final TagKey<Item> MITHRIL_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(SpiredsExtraMaterials.MOD_ID, "mithril_armor"));
    public static final TagKey<Item> REPAIRS_MITHRIL_ARMOR = TagKey.of(Registries.ITEM.getKey(), Identifier.of(SpiredsExtraMaterials.MOD_ID, "repairs_mithril_armor"));
    public static void initialize(){

    }
}
