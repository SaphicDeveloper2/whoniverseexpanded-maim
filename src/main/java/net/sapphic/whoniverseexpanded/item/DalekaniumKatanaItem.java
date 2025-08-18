
package net.sapphic.whoniverseexpanded.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class DalekaniumKatanaItem extends SwordItem {
	public DalekaniumKatanaItem() {
		super(new Tier() {
			public int getUses() {
				return 3900;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(ItemTags.create(new ResourceLocation("forge:ingotdalekanium")));
			}
		}, 3, -3f, new Item.Properties().fireResistant());
	}
}
