
package net.sapphic.whoniverseexpanded.item;

import net.sapphic.whoniverseexpanded.init.WhoniverseexpandedModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class AlekiteHoeItem extends HoeItem {
	public AlekiteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1164;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 2f;
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
		}, 0, 5f, new Item.Properties());
	}
}
