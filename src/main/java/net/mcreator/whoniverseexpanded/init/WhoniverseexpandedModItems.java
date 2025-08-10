/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.whoniverseexpanded.init;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.SpartanWeaponryAPI;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.whoniverseexpanded.item.IngotTestIngotItem;
import net.mcreator.whoniverseexpanded.item.DalekiteIngotItem;
import net.mcreator.whoniverseexpanded.item.DalekiteArmorItem;
import net.mcreator.whoniverseexpanded.item.AlekiteSwordItem;
import net.mcreator.whoniverseexpanded.item.AlekiteShovelItem;
import net.mcreator.whoniverseexpanded.item.AlekitePickaxeItem;
import net.mcreator.whoniverseexpanded.item.AlekiteHoeItem;
import net.mcreator.whoniverseexpanded.item.AlekiteAxeItem;

import net.mcreator.whoniverseexpanded.WhoniverseexpandedMod;

public class WhoniverseexpandedModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WhoniverseexpandedMod.MODID);

    // Existing items
    public static final RegistryObject<Item> DALEKITE_INGOT = REGISTRY.register("dalekite_ingot", () -> new DalekiteIngotItem());
    public static final RegistryObject<Item> DALEKITE_BLOCK = block(WhoniverseexpandedModBlocks.DALEKITE_BLOCK);
    public static final RegistryObject<Item> DALEKITE_ARMOR_HELMET = REGISTRY.register("dalekite_armor_helmet", () -> new DalekiteArmorItem.Helmet());
    public static final RegistryObject<Item> DALEKITE_ARMOR_CHESTPLATE = REGISTRY.register("dalekite_armor_chestplate", () -> new DalekiteArmorItem.Chestplate());
    public static final RegistryObject<Item> DALEKITE_ARMOR_LEGGINGS = REGISTRY.register("dalekite_armor_leggings", () -> new DalekiteArmorItem.Leggings());
    public static final RegistryObject<Item> DALEKITE_ARMOR_BOOTS = REGISTRY.register("dalekite_armor_boots", () -> new DalekiteArmorItem.Boots());

    // Register both test ids for compatibility
    public static final RegistryObject<Item> TESTINGOT = REGISTRY.register("testingot", () -> new IngotTestIngotItem());
    public static final RegistryObject<Item> INGOT_TEST_INGOT = REGISTRY.register("ingot_test_ingot", () -> new IngotTestIngotItem());

    public static final RegistryObject<Item> ALEKITE_PICKAXE = REGISTRY.register("alekite_pickaxe", () -> new AlekitePickaxeItem());
    public static final RegistryObject<Item> ALEKITE_AXE = REGISTRY.register("alekite_axe", () -> new AlekiteAxeItem());
    public static final RegistryObject<Item> ALEKITE_SWORD = REGISTRY.register("alekite_sword", () -> new AlekiteSwordItem());
    public static final RegistryObject<Item> ALEKITE_SHOVEL = REGISTRY.register("alekite_shovel", () -> new AlekiteShovelItem());
    public static final RegistryObject<Item> ALEKITE_HOE = REGISTRY.register("alekite_hoe", () -> new AlekiteHoeItem());

    // --- Weapon material for Dalekanium (reflection-safe creation) ---
    public static WeaponMaterial DALEKANIUM_MATERIAL;

    static {
        DALEKANIUM_MATERIAL = createDalekaniumMaterial();
    }

    private static WeaponMaterial createDalekaniumMaterial() {
        ResourceLocation fallback = new ResourceLocation(WhoniverseexpandedMod.MODID, "testingot");
        try {
            Class<?> cls = WeaponMaterial.class;

            // Try common constructors in order of likelihood
            try {
                // 10-arg: (String, String, int, int, int, float, float, int, ResourceLocation, ResourceLocation)
                java.lang.reflect.Constructor<?> c = cls.getConstructor(
                        String.class, String.class,
                        int.class, int.class, int.class,
                        float.class, float.class,
                        int.class,
                        ResourceLocation.class, ResourceLocation.class
                );
                return (WeaponMaterial) c.newInstance(
                        "dalekanium", WhoniverseexpandedMod.MODID,
                        0xC57D0C, 0xA86A08, 3500,
                        5.0f, -2.0f,
                        22,
                        fallback, fallback
                );
            } catch (NoSuchMethodException ignored) {}

            try {
                // 9-arg: (String, String, int, int, int, float, float, ResourceLocation, ResourceLocation)
                java.lang.reflect.Constructor<?> c = cls.getConstructor(
                        String.class, String.class,
                        int.class, int.class, int.class,
                        float.class, float.class,
                        ResourceLocation.class, ResourceLocation.class
                );
                return (WeaponMaterial) c.newInstance(
                        "dalekanium", WhoniverseexpandedMod.MODID,
                        0xC57D0C, 0xA86A08, 3500,
                        5.0f, -2.0f,
                        fallback, fallback
                );
            } catch (NoSuchMethodException ignored) {}

            try {
                // 8-arg: (String, String, int, int, int, float, float, int)
                java.lang.reflect.Constructor<?> c = cls.getConstructor(
                        String.class, String.class,
                        int.class, int.class, int.class,
                        float.class, float.class,
                        int.class
                );
                return (WeaponMaterial) c.newInstance(
                        "dalekanium", WhoniverseexpandedMod.MODID,
                        0xC57D0C, 0xA86A08, 3500,
                        5.0f, -2.0f,
                        22
                );
            } catch (NoSuchMethodException ignored) {}

            try {
                // 7-arg: (String, String, int, int, int, float, float)
                java.lang.reflect.Constructor<?> c = cls.getConstructor(
                        String.class, String.class,
                        int.class, int.class, int.class,
                        float.class, float.class
                );
                return (WeaponMaterial) c.newInstance(
                        "dalekanium", WhoniverseexpandedMod.MODID,
                        0xC57D0C, 0xA86A08, 3500,
                        5.0f, -2.0f
                );
            } catch (NoSuchMethodException ignored) {}

            // Last resort: try any public constructor that begins with (String, String)
            for (java.lang.reflect.Constructor<?> ctor : cls.getConstructors()) {
                Class<?>[] pts = ctor.getParameterTypes();
                if (pts.length >= 2 && pts[0] == String.class && pts[1] == String.class) {
                    Object[] args = new Object[pts.length];
                    args[0] = "dalekanium";
                    args[1] = WhoniverseexpandedMod.MODID;
                    for (int i = 2; i < pts.length; i++) {
                        Class<?> p = pts[i];
                        if (p == int.class || p == Integer.class) args[i] = 3500;
                        else if (p == float.class || p == Float.class) args[i] = 5.0f;
                        else if (p == boolean.class || p == Boolean.class) args[i] = false;
                        else if (p == ResourceLocation.class) args[i] = fallback;
                        else args[i] = null;
                    }
                    try {
                        return (WeaponMaterial) ctor.newInstance(args);
                    } catch (Exception ex) {
                        // try next ctor
                    }
                }
            }
        } catch (Exception ex) {
            WhoniverseexpandedMod.LOGGER.error("WeaponMaterial reflection creation failed", ex);
        }

        WhoniverseexpandedMod.LOGGER.error("Could not construct WeaponMaterial for dalekanium — material will be null.");
        return null;
    }

    // --- Dalekanium Spartan Weaponry Item Registrations (all items) ---
    // NOTE: If your SpartanWeaponry API's createX(...) methods require an Item.Properties param,
    // change suppliers from e.g. SpartanWeaponryAPI.createDagger(DALEKANIUM_MATERIAL)
    // to:    SpartanWeaponryAPI.createDagger(DALEKANIUM_MATERIAL, new Item.Properties())

    public static final RegistryObject<Item> daggerDalekanium = REGISTRY.register("dagger_dalekanium",
            () -> SpartanWeaponryAPI.createDagger(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> longswordDalekanium = REGISTRY.register("longsword_dalekanium",
            () -> SpartanWeaponryAPI.createLongsword(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> greatswordDalekanium = REGISTRY.register("greatsword_dalekanium",
            () -> SpartanWeaponryAPI.createGreatsword(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> katanaDalekanium = REGISTRY.register("katana_dalekanium",
            () -> SpartanWeaponryAPI.createKatana(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> saberDalekanium = REGISTRY.register("saber_dalekanium",
            () -> SpartanWeaponryAPI.createSaber(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> rapierDalekanium = REGISTRY.register("rapier_dalekanium",
            () -> SpartanWeaponryAPI.createRapier(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> spearDalekanium = REGISTRY.register("spear_dalekanium",
            () -> SpartanWeaponryAPI.createSpear(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> pikeDalekanium = REGISTRY.register("pike_dalekanium",
            () -> SpartanWeaponryAPI.createPike(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> halberdDalekanium = REGISTRY.register("halberd_dalekanium",
            () -> SpartanWeaponryAPI.createHalberd(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> glaiveDalekanium = REGISTRY.register("glaive_dalekanium",
            () -> SpartanWeaponryAPI.createGlaive(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> quarterstaffDalekanium = REGISTRY.register("quarterstaff_dalekanium",
            () -> SpartanWeaponryAPI.createQuarterstaff(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> battleAxeDalekanium = REGISTRY.register("battle_axe_dalekanium",
            () -> SpartanWeaponryAPI.createBattleaxe(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> warhammerDalekanium = REGISTRY.register("warhammer_dalekanium",
            () -> SpartanWeaponryAPI.createWarhammer(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> hammerDalekanium = REGISTRY.register("hammer_dalekanium",
            () -> SpartanWeaponryAPI.createBattleHammer(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> flangedMaceDalekanium = REGISTRY.register("flanged_mace_dalekanium",
            () -> SpartanWeaponryAPI.createFlangedMace(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> scytheDalekanium = REGISTRY.register("scythe_dalekanium",
            () -> SpartanWeaponryAPI.createScythe(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> throwingKnifeDalekanium = REGISTRY.register("throwing_knife_dalekanium",
            () -> SpartanWeaponryAPI.createThrowingKnife(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> javelinDalekanium = REGISTRY.register("javelin_dalekanium",
            () -> SpartanWeaponryAPI.createJavelin(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> boomerangDalekanium = REGISTRY.register("boomerang_dalekanium",
            () -> SpartanWeaponryAPI.createBoomerang(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> longbowDalekanium = REGISTRY.register("longbow_dalekanium",
            () -> SpartanWeaponryAPI.createLongbow(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> heavyCrossbowDalekanium = REGISTRY.register("heavy_crossbow_dalekanium",
            () -> SpartanWeaponryAPI.createHeavyCrossbow(DALEKANIUM_MATERIAL));

    public static final RegistryObject<Item> parryingDaggerDalekanium = REGISTRY.register("parrying_dagger_dalekanium",
            () -> SpartanWeaponryAPI.createParryingDagger(DALEKANIUM_MATERIAL));

    // Start of user code block custom items
    // End of user code block custom items

    private static RegistryObject<Item> block(RegistryObject<Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
