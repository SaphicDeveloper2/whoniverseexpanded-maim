// File: net/mcreator/whoniverseexpanded/item/ModTiers.java

package net.mcreator.whoniverseexpanded.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.teabs.teabsdoctorwhomod.init.TeabsDoctorWhoModModItems;

public class ModTiers {
    /**
     * Defines the properties for Dalekanium tools.
     * 1. Mining Level (4 = Netherite)
     * 2. Durability
     * 3. Mining Speed
     * 4. Attack Damage Bonus
     * 5. Enchantability
     * 6. Block Tag for what it can mine
     * 7. Repair Ingredient
     */
    public static final ForgeTier DALEKANIUM_TIER = new ForgeTier(
            4,      // miningLevel
            3500,   // durability
            12.0f,  // miningSpeed
            4.0f,   // attackDamageBonus
            22,     // enchantability
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(TeabsDoctorWhoModModItems.DALEKANIUM_INGOT.get())
    );
}