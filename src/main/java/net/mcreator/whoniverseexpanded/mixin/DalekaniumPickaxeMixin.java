// File: net/mcreator/whoniverseexpanded/mixin/DalekaniumPickaxeMixin.java

package net.mcreator.whoniverseexpanded.mixin;

import net.mcreator.whoniverseexpanded.item.ModTiers;
import net.minecraft.world.item.Tier;
import net.teabs.teabsdoctorwhomod.item.DalekaniumPickaxeItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(value = DalekaniumPickaxeItem.class, remap = false)
public abstract class DalekaniumPickaxeMixin {

    @ModifyArg(
        method = "<init>",
        at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/PickaxeItem;<init>(Lnet/minecraft/world/item/Tier;IFLnet/minecraft/world/item/Item$Properties;)V"),
        index = 0
    )
    private static Tier whoniverseexpanded$replaceTier(Tier originalTier) {
        return ModTiers.DALEKANIUM_TIER;
    }
}
