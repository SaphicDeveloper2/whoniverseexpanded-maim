// File: net/mcreator/whoniverseexpanded/mixin/DalekaniumSwordMixin.java

package net.mcreator.whoniverseexpanded.mixin;

import net.mcreator.whoniverseexpanded.item.ModTiers;
import net.minecraft.world.item.Tier;
import net.teabs.teabsdoctorwhomod.item.DalekaniumSwordItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(value = DalekaniumSwordItem.class, remap = false)
public abstract class DalekaniumSwordMixin {

    /**
     * This method intercepts the constructor of DalekaniumSwordItem.
     * It modifies the FIRST argument (index = 0), which is the tool's Tier,
     * as it's being passed to the parent SwordItem constructor.
     * We replace the original tier with our custom DALEKANIUM_TIER.
     */
    @ModifyArg(
            method = "<init>",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/SwordItem;<init>(Lnet/minecraft/world/item/Tier;IFLnet/minecraft/world/item/Item$Properties;)V"),
            index = 0
    )
    private static Tier whoniverseexpanded$replaceTier(Tier originalTier) {
        // Return our custom tier instead of the original
        return ModTiers.DALEKANIUM_TIER;
    }
}
