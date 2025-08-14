package net.mcreator.whoniverseexpanded.item;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;

import static net.mcreator.whoniverseexpanded.init.WhoniverseexpandedModItems.DALEKITE_TIER;

public class DalekiteAxeItem extends AxeItem {
    public DalekiteAxeItem() {
        // The error was trying to redefine the Tier inside the super() call.
        // The correct way is to simply pass the existing DALEKITE_TIER object.
        // The constructor for AxeItem is: (Tier, baseAttackDamage, attackSpeed, properties)
        // The Tier's damage bonus will be added to the base damage automatically.
        super(DALEKITE_TIER, 6.0f, -3.0f, new Item.Properties());
    }
}
