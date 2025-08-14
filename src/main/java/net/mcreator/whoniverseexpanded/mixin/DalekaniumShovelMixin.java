// File: net/mcreator/whoniverseexpanded/mixin/DalekaniumShovelMixin.java

package net.mcreator.whoniverseexpanded.mixin;

import net.mcreator.whoniverseexpanded.item.ModTiers;
import net.minecraft.world.item.Tier;
import net.teabs.teabsdoctorwhomod.item.DalekaniumShovelItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(value = DalekaniumShovelItem.class, remap = false)
public abstract class DalekaniumShovelMixin {

    /**
     * This method intercepts the constructor of DalekaniumShovelItem.
     * It modifies the FIRST argument (index = 0), which is the tool's Tier,
     * as it's being passed to the parent ShovelItem constructor.
     * We replace the original tier with our custom DALEKANIUM_TIER.
     */
    @ModifyArg(
            method = "<init>",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ShovelItem;<init>(Lnet/minecraft/world/item/Tier;FFLnet/minecraft/world/item/Item$Properties;)V"),
            index = 0
    )
    private static Tier whoniverseexpanded$replaceTier(Tier originalTier) {
        // Return our custom tier instead of the original
        return ModTiers.DALEKANIUM_TIER;
    }
}
