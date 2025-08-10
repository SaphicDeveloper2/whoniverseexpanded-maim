
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.whoniverseexpanded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.whoniverseexpanded.block.DalekiteBlockBlock;
import net.mcreator.whoniverseexpanded.WhoniverseexpandedMod;

public class WhoniverseexpandedModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WhoniverseexpandedMod.MODID);
	public static final RegistryObject<Block> DALEKITE_BLOCK = REGISTRY.register("dalekite_block", () -> new DalekiteBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
