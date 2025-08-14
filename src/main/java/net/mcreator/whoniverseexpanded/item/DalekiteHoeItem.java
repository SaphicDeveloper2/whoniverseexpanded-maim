package net.mcreator.whoniverseexpanded.item;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;

import static net.mcreator.whoniverseexpanded.init.WhoniverseexpandedModItems.DALEKITE_TIER;

public class DalekiteHoeItem extends HoeItem {
    public DalekiteHoeItem() {
        // Constructor for HoeItem: (Tier, baseAttackDamage, attackSpeed, properties)
        // The attack damage is an integer for Hoes.
        super(DALEKITE_TIER, -4, 0.0f, new Item.Properties());
    }
}
