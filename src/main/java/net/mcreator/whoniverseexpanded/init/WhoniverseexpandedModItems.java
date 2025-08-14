/*
 * MCreator note: This file will be REGENERATED on each build.
 *
 * This is the final corrected version. It fixes the typo in the ResourceKey
 * creation, ensuring the code compiles as intended.
 */
package net.mcreator.whoniverseexpanded.init;

import com.oblivioussp.spartanweaponry.api.SpartanWeaponryAPI;
import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.WeaponTrait;
import net.mcreator.whoniverseexpanded.WhoniverseexpandedMod;
import net.mcreator.whoniverseexpanded.item.DalekiteArmorItem;
import net.mcreator.whoniverseexpanded.item.DalekiteIngotItem;
import net.mcreator.whoniverseexpanded.item.IngotTestIngotItem;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Supplier;

import static net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL;
import static net.minecraft.world.item.crafting.Ingredient.of;
import static net.teabs.teabsdoctorwhomod.init.TeabsDoctorWhoModModItems.DALEKANIUM_INGOT;

public class WhoniverseexpandedModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WhoniverseexpandedMod.MODID);

    // --- Explicitly define the keys needed for the WeaponMaterial ---
    // 1. Get the key for the registry that holds all Weapon Traits.
    private static final ResourceKey<Registry<WeaponTrait>> WEAPON_TRAIT_REGISTRY_KEY = ResourceKey.createRegistryKey(new ResourceLocation("whoniverseexpanded", "weapon_trait"));

    // 2. Create a TagKey for our specific trait tag within that registry.
    private static final TagKey<WeaponTrait> DALEKANIUM_TRAITS_TAG = TagKey.create(WEAPON_TRAIT_REGISTRY_KEY, new ResourceLocation(WhoniverseexpandedMod.MODID, "dalekanium_traits"));


    // --- Core Items ---
    public static final RegistryObject<Item> DALEKITE_INGOT = REGISTRY.register("dalekite_ingot", DalekiteIngotItem::new);
    public static final RegistryObject<Item> INGOT_TEST_INGOT = REGISTRY.register("ingot_test_ingot", IngotTestIngotItem::new);

    // --- Vanilla Tool Tier for Dalekanium Alekite Tools ---
    public static final Tier DALEKITE_TIER = new ForgeTier(
            5,                                      // miningLevel (4 = Netherite)
            3500,                                   // uses
            9.0F,                                   // efficiency
            4.0F,                                   // attackDamageBonus
            22,                                     // enchantmentValue
            NEEDS_DIAMOND_TOOL,           // block-breaking tag
            () -> of(DALEKITE_INGOT.get()) // repairIngredient
    );

    // --- Custom Armor and Tool Items ---
    public static final RegistryObject<Item> DALEKITE_BLOCK = block(WhoniverseexpandedModBlocks.DALEKITE_BLOCK);
    public static final RegistryObject<Item> DALEKITE_ARMOR_HELMET = REGISTRY.register("dalekite_armor_helmet", DalekiteArmorItem.Helmet::new);
    public static final RegistryObject<Item> DALEKITE_ARMOR_CHESTPLATE = REGISTRY.register("dalekite_armor_chestplate", DalekiteArmorItem.Chestplate::new);
    public static final RegistryObject<Item> DALEKITE_ARMOR_LEGGINGS = REGISTRY.register("dalekite_armor_leggings", DalekiteArmorItem.Leggings::new);
    public static final RegistryObject<Item> DALEKITE_ARMOR_BOOTS = REGISTRY.register("dalekite_armor_boots", DalekiteArmorItem.Boots::new);

    // --- Standard Alekite Tools (Original Names Restored) ---
    public static final RegistryObject<Item> DALEKITE_SWORD = REGISTRY.register("dalekite_sword",
            () -> new SwordItem(DALEKITE_TIER, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> DALEKITE_PICKAXE = REGISTRY.register("dalekite_pickaxe",
            () -> new PickaxeItem(DALEKITE_TIER, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> DALEKITE_AXE = REGISTRY.register("dalekite_axe",
            () -> new AxeItem(DALEKITE_TIER, 5.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> DALEKITE_SHOVEL = REGISTRY.register("dalekite_shovel",
            () -> new ShovelItem(DALEKITE_TIER, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> DALEKITE_HOE = REGISTRY.register("dalekite_hoe",
            () -> new HoeItem(DALEKITE_TIER, -4, 0.0F, new Item.Properties()));


    // --- Spartan Weaponry Material for Dalekanium ---
    // 3. Use the TagKey we created above in the constructor.
    public static final WeaponMaterial DALEKANIUM_MATERIAL = new WeaponMaterial(
            "dalekanium", WhoniverseexpandedMod.MODID,
            0xC57D0C, 0xA86A08,
            3500, 9.0F, 4.0F, 22,
            ItemTags.create(new ResourceLocation("whoniverseexpanded", "ingotdalekanium")),
            DALEKANIUM_TRAITS_TAG // Use the TagKey we defined at the top of the file.
    );

    // --- Dalekanium Spartan Weaponry Item Registrations ---
    public static final RegistryObject<Item> DAGGER_DALEKANIUM = registerSW("dagger_dalekanium", () -> SpartanWeaponryAPI.createDagger(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> LONGSWORD_DALEKANIUM = registerSW("longsword_dalekanium", () -> SpartanWeaponryAPI.createLongsword(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> GREATSWORD_DALEKANIUM = registerSW("greatsword_dalekanium", () -> SpartanWeaponryAPI.createGreatsword(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> KATANA_DALEKANIUM = registerSW("katana_dalekanium", () -> SpartanWeaponryAPI.createKatana(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> SABER_DALEKANIUM = registerSW("saber_dalekanium", () -> SpartanWeaponryAPI.createSaber(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> RAPIER_DALEKANIUM = registerSW("rapier_dalekanium", () -> SpartanWeaponryAPI.createRapier(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> SPEAR_DALEKANIUM = registerSW("spear_dalekanium", () -> SpartanWeaponryAPI.createSpear(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> PIKE_DALEKANIUM = registerSW("pike_dalekanium", () -> SpartanWeaponryAPI.createPike(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> HALBERD_DALEKANIUM = registerSW("halberd_dalekanium", () -> SpartanWeaponryAPI.createHalberd(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> GLAIVE_DALEKANIUM = registerSW("glaive_dalekanium", () -> SpartanWeaponryAPI.createGlaive(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> QUARTERSTAFF_DALEKANIUM = registerSW("quarterstaff_dalekanium", () -> SpartanWeaponryAPI.createQuarterstaff(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> BATTLE_AXE_DALEKANIUM = registerSW("battle_axe_dalekanium", () -> SpartanWeaponryAPI.createBattleaxe(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> WARHAMMER_DALEKANIUM = registerSW("warhammer_dalekanium", () -> SpartanWeaponryAPI.createWarhammer(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> HAMMER_DALEKANIUM = registerSW("hammer_dalekanium", () -> SpartanWeaponryAPI.createBattleHammer(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> FLANGED_MACE_DALEKANIUM = registerSW("flanged_mace_dalekanium", () -> SpartanWeaponryAPI.createFlangedMace(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> SCYTHE_DALEKANIUM = registerSW("scythe_dalekanium", () -> SpartanWeaponryAPI.createScythe(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> THROWING_KNIFE_DALEKANIUM = registerSW("throwing_knife_dalekanium", () -> SpartanWeaponryAPI.createThrowingKnife(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> JAVELIN_DALEKANIUM = registerSW("javelin_dalekanium", () -> SpartanWeaponryAPI.createJavelin(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> BOOMERANG_DALEKANIUM = registerSW("boomerang_dalekanium", () -> SpartanWeaponryAPI.createBoomerang(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> LONGBOW_DALEKANIUM = registerSW("longbow_dalekanium", () -> SpartanWeaponryAPI.createLongbow(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> HEAVY_CROSSBOW_DALEKANIUM = registerSW("heavy_crossbow_dalekanium", () -> SpartanWeaponryAPI.createHeavyCrossbow(DALEKANIUM_MATERIAL));
    public static final RegistryObject<Item> PARRYING_DAGGER_DALEKANIUM = registerSW("parrying_dagger_dalekanium", () -> SpartanWeaponryAPI.createParryingDagger(DALEKANIUM_MATERIAL));


    // Helper method to register a BlockItem for a given Block.
    private static RegistryObject<Item> block(RegistryObject<Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
    }

    // Helper method to simplify Spartan Weaponry item registration.
    private static RegistryObject<Item> registerSW(String name, Supplier<Item> item) {
        return REGISTRY.register(name, item);
    }

    // Method to register all items to the Forge Event Bus.
    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}