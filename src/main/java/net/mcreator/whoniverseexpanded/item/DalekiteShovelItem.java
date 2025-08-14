package net.mcreator.whoniverseexpanded.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;

import static net.mcreator.whoniverseexpanded.init.WhoniverseexpandedModItems.DALEKITE_TIER;

public class DalekiteShovelItem extends ShovelItem {
    public DalekiteShovelItem() {
        // Constructor for ShovelItem: (Tier, baseAttackDamage, attackSpeed, properties)
        super(DALEKITE_TIER, 1.5f, -3.0f, new Item.Properties());
    }
}
