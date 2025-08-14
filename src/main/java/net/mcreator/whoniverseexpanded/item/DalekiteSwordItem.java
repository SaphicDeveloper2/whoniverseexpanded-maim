package net.mcreator.whoniverseexpanded.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

import static net.mcreator.whoniverseexpanded.init.WhoniverseexpandedModItems.DALEKITE_TIER;

public class DalekiteSwordItem extends SwordItem {
    public DalekiteSwordItem() {
        // Constructor for SwordItem: (Tier, baseAttackDamage, attackSpeed, properties)
        super(DALEKITE_TIER, 3, -2.4f, new Item.Properties());
    }
}
