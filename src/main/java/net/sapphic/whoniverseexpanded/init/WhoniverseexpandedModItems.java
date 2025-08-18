
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sapphic.whoniverseexpanded.init;

import net.sapphic.whoniverseexpanded.item.IngotTestIngotItem;
import net.sapphic.whoniverseexpanded.item.DalekiteIngotItem;
import net.sapphic.whoniverseexpanded.item.DalekiteArmorItem;
import net.sapphic.whoniverseexpanded.item.DalekaniumLongswordItem;
import net.sapphic.whoniverseexpanded.item.DalekaniumKatanaItem;
import net.sapphic.whoniverseexpanded.item.DalekaniumGreatswordItem;
import net.sapphic.whoniverseexpanded.item.DalekaniumBattleaxeItem;
import net.sapphic.whoniverseexpanded.item.AlekiteSwordItem;
import net.sapphic.whoniverseexpanded.item.AlekiteShovelItem;
import net.sapphic.whoniverseexpanded.item.AlekitePickaxeItem;
import net.sapphic.whoniverseexpanded.item.AlekiteHoeItem;
import net.sapphic.whoniverseexpanded.item.AlekiteAxeItem;
import net.sapphic.whoniverseexpanded.WhoniverseexpandedMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class WhoniverseexpandedModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WhoniverseexpandedMod.MODID);
	public static final RegistryObject<Item> DALEKITE_INGOT = REGISTRY.register("dalekite_ingot", () -> new DalekiteIngotItem());
	public static final RegistryObject<Item> DALEKITE_BLOCK = block(WhoniverseexpandedModBlocks.DALEKITE_BLOCK);
	public static final RegistryObject<Item> DALEKITE_ARMOR_HELMET = REGISTRY.register("dalekite_armor_helmet", () -> new DalekiteArmorItem.Helmet());
	public static final RegistryObject<Item> DALEKITE_ARMOR_CHESTPLATE = REGISTRY.register("dalekite_armor_chestplate", () -> new DalekiteArmorItem.Chestplate());
	public static final RegistryObject<Item> DALEKITE_ARMOR_LEGGINGS = REGISTRY.register("dalekite_armor_leggings", () -> new DalekiteArmorItem.Leggings());
	public static final RegistryObject<Item> DALEKITE_ARMOR_BOOTS = REGISTRY.register("dalekite_armor_boots", () -> new DalekiteArmorItem.Boots());
	public static final RegistryObject<Item> INGOT_TEST_INGOT = REGISTRY.register("ingot_test_ingot", () -> new IngotTestIngotItem());
	public static final RegistryObject<Item> ALEKITE_PICKAXE = REGISTRY.register("alekite_pickaxe", () -> new AlekitePickaxeItem());
	public static final RegistryObject<Item> ALEKITE_AXE = REGISTRY.register("alekite_axe", () -> new AlekiteAxeItem());
	public static final RegistryObject<Item> ALEKITE_SWORD = REGISTRY.register("alekite_sword", () -> new AlekiteSwordItem());
	public static final RegistryObject<Item> ALEKITE_SHOVEL = REGISTRY.register("alekite_shovel", () -> new AlekiteShovelItem());
	public static final RegistryObject<Item> ALEKITE_HOE = REGISTRY.register("alekite_hoe", () -> new AlekiteHoeItem());
	public static final RegistryObject<Item> DALEKANIUM_KATANA = REGISTRY.register("dalekanium_katana", () -> new DalekaniumKatanaItem());
	public static final RegistryObject<Item> DALEKANIUM_BATTLEAXE = REGISTRY.register("dalekanium_battleaxe", () -> new DalekaniumBattleaxeItem());
	public static final RegistryObject<Item> DALEKANIUM_LONGSWORD = REGISTRY.register("dalekanium_longsword", () -> new DalekaniumLongswordItem());
	public static final RegistryObject<Item> DALEKANIUM_GREATSWORD = REGISTRY.register("dalekanium_greatsword", () -> new DalekaniumGreatswordItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
