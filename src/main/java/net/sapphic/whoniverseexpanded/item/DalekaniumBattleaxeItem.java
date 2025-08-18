
package net.sapphic.whoniverseexpanded.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class DalekaniumBattleaxeItem extends AxeItem {
	public DalekaniumBattleaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3900;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 12.6f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(ItemTags.create(new ResourceLocation("forge:ingotdalekanium")));
			}
		}, 1, -3f, new Item.Properties().fireResistant());
	}
}
