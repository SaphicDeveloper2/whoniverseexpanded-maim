package net.mcreator.whoniverseexpanded.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;

import static net.mcreator.whoniverseexpanded.init.WhoniverseexpandedModItems.DALEKITE_TIER;

public class DalekitePickaxeItem extends PickaxeItem {
    public DalekitePickaxeItem() {
        // Constructor for PickaxeItem: (Tier, baseAttackDamage, attackSpeed, properties)
        super(DALEKITE_TIER, 1, -2.8f, new Item.Properties());
    }
}
