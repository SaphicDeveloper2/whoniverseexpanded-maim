// File: net/mcreator/whoniverseexpanded/mixin/DalekaniumArmorItemMixin.java

package net.mcreator.whoniverseexpanded.mixin;

import net.mcreator.whoniverseexpanded.item.ModArmorMaterials;
import net.minecraft.world.item.ArmorMaterial;
import net.teabs.teabsdoctorwhomod.item.DalekaniumArmorItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

/**
 * A revised, more direct Mixin to modify the DalekaniumArmorItem.
 * This single class targets the constructor and replaces the entire
 * anonymous ArmorMaterial with our custom one.
 */
@Mixin(value = DalekaniumArmorItem.class, remap = false)
public abstract class DalekaniumArmorItemMixin {

    /**
     * This method intercepts the constructor of DalekaniumArmorItem.
     * It targets the call to the parent ArmorItem's constructor and modifies
     * the FIRST argument (index = 0), which is the ArmorMaterial.
     *
     * We replace the entire 'new ArmorMaterial() {...}' block from the original
     * code with our own DALEKANIUM_ARMOR material.
     */
    @ModifyArg(
            method = "<init>",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ArmorItem;<init>(Lnet/minecraft/world/item/ArmorMaterial;Lnet/minecraft/world/item/ArmorItem$Type;Lnet/minecraft/world/item/Item$Properties;)V"),
            index = 0
    )
    private static ArmorMaterial whoniverseexpanded$replaceArmorMaterial(ArmorMaterial originalMaterial) {
        // The 'originalMaterial' is the anonymous one. We ignore it and return our own.
        return ModArmorMaterials.DALEKANIUM_ARMOR;
    }
}
