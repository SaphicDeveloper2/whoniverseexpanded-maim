// File: net/mcreator/whoniverseexpanded/item/ModArmorMaterials.java

package net.mcreator.whoniverseexpanded.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.teabs.teabsdoctorwhomod.init.TeabsDoctorWhoModModItems;
import net.mcreator.whoniverseexpanded.WhoniverseexpandedMod; // <-- IMPORTANT: Replace with your actual main mod class import

public class ModArmorMaterials {
    public static final ArmorMaterial DALEKANIUM_ARMOR = new ArmorMaterial() {
        @Override
        public int getDurabilityForType(ArmorItem.Type pType) {
            // Durability values for Helmet, Chestplate, Leggings, Boots
            return new int[]{13, 15, 16, 11}[pType.getSlot().getIndex()] * 45;
        }

        @Override
        public int getDefenseForType(ArmorItem.Type pType) {
            // Protection values for Helmet, Chestplate, Leggings, Boots
            return new int[]{4, 7, 9, 4}[pType.getSlot().getIndex()];
        }

        @Override
        public int getEnchantmentValue() {
            return 22;
        }

        @Override
        public net.minecraft.sounds.SoundEvent getEquipSound() {
            return SoundEvents.ARMOR_EQUIP_NETHERITE;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(TeabsDoctorWhoModModItems.DALEKANIUM_INGOT.get());
        }

        @Override
        public String getName() {
            // Format: "modid:material_name". Must be all lowercase.
            return WhoniverseexpandedMod.MODID + ":dalekanium";
        }

        @Override
        public float getToughness() {
            return 3.5F;
        }

        @Override
        public float getKnockbackResistance() {
            return 0.15F;
        }
    };
}
