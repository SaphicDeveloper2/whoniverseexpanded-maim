
package net.sapphic.whoniverseexpanded.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DalekiteIngotItem extends Item {
	public DalekiteIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
