package spired.spiredsextramaterials.item;


import spired.spiredsextramaterials.SpiredsExtraMaterials;

import java.util.Map;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import spired.spiredsextramaterials.util.ModTags;

// TODO make this the ModArmorMaterial class for storing all Armor materials
public class ModArmorMaterials {
    public static final int BASE_DURABILITY = 15;

    public static final RegistryKey<EquipmentAsset> MITHRIL_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(SpiredsExtraMaterials.MOD_ID,"mithril"));



    public static final ArmorMaterial MITHRIL_ARMOR_INSTANCE = new ArmorMaterial(
            BASE_DURABILITY,
            Map.of(
                    EquipmentType.HELMET, 3,
                    EquipmentType.CHESTPLATE, 8,
                    EquipmentType.LEGGINGS, 6,
                    EquipmentType.BOOTS, 3
            ),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0.0F,
            0.0F,
            ModTags.REPAIRS_MITHRIL_ARMOR,
            MITHRIL_ARMOR_MATERIAL_KEY
    );
}

