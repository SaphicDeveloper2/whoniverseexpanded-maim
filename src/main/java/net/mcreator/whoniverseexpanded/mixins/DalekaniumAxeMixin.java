// File: net/mcreator/whoniverseexpanded/mixins/DalekaniumAxeMixin.java

package net.mcreator.whoniverseexpanded.mixins;

import net.mcreator.whoniverseexpanded.item.ModTiers;
import net.minecraft.world.item.Tier;
import net.teabs.teabsdoctorwhomod.item.DalekaniumAxeItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(value = DalekaniumAxeItem.class, remap = false)
public abstract class DalekaniumAxeMixin {

    @ModifyArg(
            method = "<init>",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/AxeItem;<init>(Lnet/minecraft/world/item/Tier;FFLnet/minecraft/world/item/Item$Properties;)V"),
            index = 0
    )
    private static Tier whoniverseexpanded$replaceTier(Tier originalTier) {
        return ModTiers.DALEKANIUM_TIER;
    }
}
