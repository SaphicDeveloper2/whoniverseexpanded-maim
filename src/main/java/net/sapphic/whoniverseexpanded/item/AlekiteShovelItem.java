
package net.sapphic.whoniverseexpanded.item;

import net.sapphic.whoniverseexpanded.init.WhoniverseexpandedModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class AlekiteShovelItem extends ShovelItem {
	public AlekiteShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1164;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 42;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(WhoniverseexpandedModItems.DALEKITE_INGOT.get()));
			}
		}, 1, -1f, new Item.Properties());
	}
}
