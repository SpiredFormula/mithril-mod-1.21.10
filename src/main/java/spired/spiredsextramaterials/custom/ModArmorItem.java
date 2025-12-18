package spired.spiredsextramaterials.custom;

import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;
import spired.spiredsextramaterials.ModTags;


// TODO allow this to be used for all future set bonuses instead of just mithril
public class ModArmorItem extends Item {

    private final Holder<MobEffect> effect = new MobEffectInstance(MobEffects.SPEED, 400, 1, false, false ).getEffect();

    public ModArmorItem(Properties properties) {
        super(properties);
    }

    @Override
    public void inventoryTick(ItemStack itemStack, ServerLevel serverLevel, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
        super.inventoryTick(itemStack, serverLevel, entity, equipmentSlot);

        if(!serverLevel.isClientSide()) {
            if(entity instanceof Player){

                Player player = (Player) entity;

                // If player is not wearing the helmet then return
                if(!(player.getInventory().getItem(39).getItem().equals(this))) return;


                if(checkIfWearingFullSet(player) && checkArmorType(player, ModTags.MITHRIL_ARMOR)){
                    boolean hasEffect = player.hasEffect(effect);
                    if(!hasEffect){
                        player.addEffect(new MobEffectInstance(MobEffects.SPEED, 5, 0, false, false ));
                    }

                }



            }
        }
    }

    private boolean checkIfWearingFullSet(Player player){
        Inventory inventory =  player.getInventory();

        ItemStack boots = player.getInventory().getItem(36);
        ItemStack leggings = player.getInventory().getItem(37);
        ItemStack chestPlate = player.getInventory().getItem(38);
        ItemStack helmet = player.getInventory().getItem(39);

        // Check if the player has a full set of armor on
        if (boots.isEmpty() || leggings.isEmpty() || chestPlate.isEmpty() || helmet.isEmpty()){
            return false;
        }
        return true;

    }
    private boolean checkArmorType(Player player, TagKey<Item> tag){
        ItemStack boots = player.getInventory().getItem(36);
        ItemStack leggings = player.getInventory().getItem(37);
        ItemStack chestPlate = player.getInventory().getItem(38);
        ItemStack helmet = player.getInventory().getItem(39);

        // If all bits of armor have the correct tag return true
        return boots.getTags().toList().contains(tag) && leggings.getTags().toList().contains(tag)
                && chestPlate.getTags().toList().contains(tag) && helmet.getTags().toList().contains(tag);
    }

}
