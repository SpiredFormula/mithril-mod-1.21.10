package spired.spiredsextramaterials.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import spired.spiredsextramaterials.util.ModTags;

public class ModToolMaterials {

    public static final ToolMaterial MITHRIL_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            1561,8.0F,3.0F,10,
            ModTags.REPAIRS_MITHRIL_ARMOR
    );
}
