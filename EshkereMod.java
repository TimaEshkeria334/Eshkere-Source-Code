
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eeshkerejokersword.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.eeshkerejokersword.item.YvItem;
import net.mcreator.eeshkerejokersword.item.UyrlukuItem;
import net.mcreator.eeshkerejokersword.item.KonchilSongItem;
import net.mcreator.eeshkerejokersword.item.EshkereSwordItem;
import net.mcreator.eeshkerejokersword.item.EshkerePickaxeItem;
import net.mcreator.eeshkerejokersword.item.EshkereItemItem;
import net.mcreator.eeshkerejokersword.EeshkerejokerswordMod;

public class EeshkerejokerswordModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EeshkerejokerswordMod.MODID);
	public static final RegistryObject<Item> ESHKERE_SWORD = REGISTRY.register("eshkere_sword", () -> new EshkereSwordItem());
	public static final RegistryObject<Item> ESHKERE_ITEM = REGISTRY.register("eshkere_item", () -> new EshkereItemItem());
	public static final RegistryObject<Item> KONCHIL_SONG = REGISTRY.register("konchil_song", () -> new KonchilSongItem());
	public static final RegistryObject<Item> ESHKERE_PICKAXE = REGISTRY.register("eshkere_pickaxe", () -> new EshkerePickaxeItem());
	public static final RegistryObject<Item> ESHKEREB_ROPISUN = block(EeshkerejokerswordModBlocks.ESHKEREB_ROPISUN);
	public static final RegistryObject<Item> ESHKERE_MOB_SPAWN_EGG = REGISTRY.register("eshkere_mob_spawn_egg", () -> new ForgeSpawnEggItem(EeshkerejokerswordModEntities.ESHKERE_MOB, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> UYRLUKU_HELMET = REGISTRY.register("uyrluku_helmet", () -> new UyrlukuItem.Helmet());
	public static final RegistryObject<Item> UYRLUKU_CHESTPLATE = REGISTRY.register("uyrluku_chestplate", () -> new UyrlukuItem.Chestplate());
	public static final RegistryObject<Item> UYRLUKU_LEGGINGS = REGISTRY.register("uyrluku_leggings", () -> new UyrlukuItem.Leggings());
	public static final RegistryObject<Item> UYRLUKU_BOOTS = REGISTRY.register("uyrluku_boots", () -> new UyrlukuItem.Boots());
	public static final RegistryObject<Item> YV = REGISTRY.register("yv", () -> new YvItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
