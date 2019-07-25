package it.feargames.materiallib.data;

import com.google.common.collect.Lists;
import it.feargames.materiallib.utilities.ServerVersion;
import org.bukkit.Material;

import java.util.*;
import java.util.logging.Logger;

import static it.feargames.materiallib.data.CrossMaterialVersion.*;

@SuppressWarnings("unused")
public enum CrossMaterial {

	ACACIA_BOAT(
			between("boat_acacia", ServerVersion.V1_9, ServerVersion.V1_12_2),
			since("acacia_boat", ServerVersion.V1_13)
	),

	ACACIA_BUTTON(
			since("acacia_button", ServerVersion.V1_13)
	),

	ACACIA_DOOR(
			since("acacia_door", ServerVersion.V1_8)
	),

	ACACIA_FENCE(
			since("acacia_fence", ServerVersion.V1_8)
	),

	ACACIA_FENCE_GATE(
			since("acacia_fence_gate", ServerVersion.V1_8)
	),

	ACACIA_LEAVES(
			between("leaves_2", ServerVersion.V1_7_2, ServerVersion.V1_12_2),
			since("acacia_leaves", ServerVersion.V1_13)
	),

	ACACIA_LOG(
			since("acacia_log", ServerVersion.V1_13)
	),

	ACACIA_PLANKS(
			between("wood:4", ServerVersion.V1_7_2, ServerVersion.V1_12_2),
			since("acacia_planks", ServerVersion.V1_13)
	),

	ACACIA_PRESSURE_PLATE(
			since("acacia_pressure_plate", ServerVersion.V1_13)
	),

	ACACIA_SAPLING(
			between("sapling:5", ServerVersion.V1_7_2, ServerVersion.V1_12_2),
			since("acacia_sapling", ServerVersion.V1_13)
	),

	ACACIA_SIGN(
			since("acacia_sign", ServerVersion.V1_14)
	),

	ACACIA_SLAB(
			between("wood_step:4", ServerVersion.V1_7_2, ServerVersion.V1_12_2),
			since("acacia_slab", ServerVersion.V1_13)
	),

	ACACIA_STAIRS(
			since("acacia_stairs", ServerVersion.V1_7_2)
	),

	ACACIA_TRAPDOOR(
			since("acacia_trapdoor", ServerVersion.V1_13)
	),

	ACTIVATOR_RAIL(
			since("activator_rail", ServerVersion.V1_5)
	),

	AIR(
			sinceRelease("air")
	),

	ALLIUM(
			between("red_rose:2", ServerVersion.V1_7_2, ServerVersion.V1_12_2),
			since("allium", ServerVersion.V1_13)
	),

	ANDESITE(
			between("stone:5", ServerVersion.V1_8, ServerVersion.V1_12_2),
			since("andesite", ServerVersion.V1_13)
	),

	ANDESITE_SLAB(
			since("andesite_slab", ServerVersion.V1_14)
	),

	ANDESITE_STAIRS(
			since("andesite_stairs", ServerVersion.V1_14)
	),

	ANDESITE_WALL(
			since("andesite_wall", ServerVersion.V1_14)
	),

	ANVIL(
			since("anvil", ServerVersion.V1_4_2)
	),

	APPLE(
			sinceRelease("apple")
	),

	ARMOR_STAND(
			since("armor_stand", ServerVersion.V1_8)
	),

	ARROW(
			sinceRelease("arrow")
	),

	ATTACHED_MELON_STEM(

	),

	ATTACHED_PUMPKIN_STEM(

	),

	AZURE_BLUET(

	),

	BAKED_POTATO(

	),

	BAMBOO(

	),

	BAMBOO_SAPLING(

	),

	BARREL(

	),

	BARRIER(

	),

	BAT_SPAWN_EGG(

	),

	BEACON(

	),

	BEDROCK(

	),

	BEEF(

	),

	BEETROOT(

	),

	BEETROOTS(

	),

	BEETROOT_SEEDS(

	),

	BEETROOT_SOUP(

	),

	BELL(

	),

	BIRCH_BOAT(

	),

	BIRCH_BUTTON(

	),

	BIRCH_DOOR(

	),

	BIRCH_FENCE(

	),

	BIRCH_FENCE_GATE(

	),

	BIRCH_LEAVES(

	),

	BIRCH_LOG(

	),

	BIRCH_PLANKS(

	),

	BIRCH_PRESSURE_PLATE(

	),

	BIRCH_SAPLING(

	),

	BIRCH_SIGN(

	),

	BIRCH_SLAB(

	),

	BIRCH_STAIRS(

	),

	BIRCH_TRAPDOOR(

	),

	BIRCH_WALL_SIGN(

	),

	BIRCH_WOOD(

	),

	BLACK_BANNER(

	),

	BLACK_BED(

	),

	BLACK_CARPET(

	),

	BLACK_CONCRETE(

	),

	BLACK_CONCRETE_POWDER(

	),

	BLACK_DYE(

	),

	BLACK_GLAZED_TERRACOTTA(

	),

	BLACK_SHULKER_BOX(

	),

	BLACK_STAINED_GLASS(

	),

	BLACK_STAINED_GLASS_PANE(

	),

	BLACK_TERRACOTTA(

	),

	BLACK_WALL_BANNER(

	),

	BLACK_WOOL(

	),

	BLAST_FURNACE(

	),

	BLAZE_POWDER(

	),

	BLAZE_ROD(

	),

	BLAZE_SPAWN_EGG(

	),

	BLUE_BANNER(

	),

	BLUE_BED(

	),

	BLUE_CARPET(

	),

	BLUE_CONCRETE(

	),

	BLUE_CONCRETE_POWDER(

	),

	BLUE_DYE(

	),

	BLUE_GLAZED_TERRACOTTA(

	),

	BLUE_ICE(

	),

	BLUE_ORCHID(

	),

	BLUE_SHULKER_BOX(

	),

	BLUE_STAINED_GLASS(

	),

	BLUE_STAINED_GLASS_PANE(

	),

	BLUE_TERRACOTTA(

	),

	BLUE_WALL_BANNER(

	),

	BLUE_WOOL(

	),

	BONE(

	),

	BONE_BLOCK(

	),

	BONE_MEAL(

	),

	BOOK(

	),

	BOOKSHELF(

	),

	BOW(

	),

	BOWL(

	),

	BRAIN_CORAL(

	),

	BRAIN_CORAL_BLOCK(

	),

	BRAIN_CORAL_FAN(

	),

	BRAIN_CORAL_WALL_FAN(

	),

	BREAD(

	),

	BREWING_STAND(

	),

	BRICK(

	),

	BRICKS(

	),

	BRICK_SLAB(

	),

	BRICK_STAIRS(

	),

	BRICK_WALL(

	),

	BROWN_BANNER(

	),

	BROWN_BED(

	),

	BROWN_CARPET(

	),

	BROWN_CONCRETE(

	),

	BROWN_CONCRETE_POWDER(

	),

	BROWN_DYE(

	),

	BROWN_GLAZED_TERRACOTTA(

	),

	BROWN_MUSHROOM(

	),

	BROWN_MUSHROOM_BLOCK(

	),

	BROWN_SHULKER_BOX(

	),

	BROWN_STAINED_GLASS(

	),

	BROWN_STAINED_GLASS_PANE(

	),

	BROWN_TERRACOTTA(

	),

	BROWN_WALL_BANNER(

	),

	BROWN_WOOL(

	),

	BUBBLE_COLUMN(

	),

	BUBBLE_CORAL(

	),

	BUBBLE_CORAL_BLOCK(

	),

	BUBBLE_CORAL_FAN(

	),

	BUBBLE_CORAL_WALL_FAN(

	),

	BUCKET(

	),

	CACTUS(

	),

	CAKE(

	),

	CAMPFIRE(

	),

	CARROT(

	),

	CARROTS(

	),

	CARROT_ON_A_STICK(

	),

	CARTOGRAPHY_TABLE(

	),

	CARVED_PUMPKIN(

	),

	CAT_SPAWN_EGG(

	),

	CAULDRON(

	),

	CAVE_AIR(

	),

	CAVE_SPIDER_SPAWN_EGG(

	),

	CHAINMAIL_BOOTS(

	),

	CHAINMAIL_CHESTPLATE(

	),

	CHAINMAIL_HELMET(

	),

	CHAINMAIL_LEGGINGS(

	),

	CHAIN_COMMAND_BLOCK(

	),

	CHARCOAL(

	),

	CHEST(

	),

	CHEST_MINECART(

	),

	CHICKEN(

	),

	CHICKEN_SPAWN_EGG(

	),

	CHIPPED_ANVIL(

	),

	CHISELED_QUARTZ_BLOCK(

	),

	CHISELED_RED_SANDSTONE(

	),

	CHISELED_SANDSTONE(

	),

	CHISELED_STONE_BRICKS(

	),

	CHORUS_FLOWER(

	),

	CHORUS_FRUIT(

	),

	CHORUS_PLANT(

	),

	CLAY(

	),

	CLAY_BALL(

	),

	CLOCK(

	),

	COAL(

	),

	COAL_BLOCK(

	),

	COAL_ORE(

	),

	COARSE_DIRT(

	),

	COBBLESTONE(

	),

	COBBLESTONE_SLAB(

	),

	COBBLESTONE_STAIRS(

	),

	COBBLESTONE_WALL(

	),

	COBWEB(

	),

	COCOA(

	),

	COCOA_BEANS(

	),

	COD(

	),

	COD_BUCKET(

	),

	COD_SPAWN_EGG(

	),

	COMMAND_BLOCK(

	),

	COMMAND_BLOCK_MINECART(

	),

	COMPARATOR(

	),

	COMPASS(

	),

	COMPOSTER(

	),

	CONDUIT(

	),

	COOKED_BEEF(

	),

	COOKED_CHICKEN(

	),

	COOKED_COD(

	),

	COOKED_MUTTON(

	),

	COOKED_PORKCHOP(

	),

	COOKED_RABBIT(

	),

	COOKED_SALMON(

	),

	COOKIE(

	),

	CORNFLOWER(

	),

	COW_SPAWN_EGG(

	),

	CRACKED_STONE_BRICKS(

	),

	CRAFTING_TABLE(

	),

	CREEPER_BANNER_PATTERN(

	),

	CREEPER_HEAD(

	),

	CREEPER_SPAWN_EGG(

	),

	CREEPER_WALL_HEAD(

	),

	CROSSBOW(

	),

	CUT_RED_SANDSTONE(

	),

	CUT_RED_SANDSTONE_SLAB(

	),

	CUT_SANDSTONE(

	),

	CUT_SANDSTONE_SLAB(

	),

	CYAN_BANNER(

	),

	CYAN_BED(

	),

	CYAN_CARPET(

	),

	CYAN_CONCRETE(

	),

	CYAN_CONCRETE_POWDER(

	),

	CYAN_DYE(

	),

	CYAN_GLAZED_TERRACOTTA(

	),

	CYAN_SHULKER_BOX(

	),

	CYAN_STAINED_GLASS(

	),

	CYAN_STAINED_GLASS_PANE(

	),

	CYAN_TERRACOTTA(

	),

	CYAN_WALL_BANNER(

	),

	CYAN_WOOL(

	),

	DAMAGED_ANVIL(

	),

	DANDELION(

	),

	DARK_OAK_BOAT(

	),

	DARK_OAK_BUTTON(

	),

	DARK_OAK_DOOR(

	),

	DARK_OAK_FENCE(

	),

	DARK_OAK_FENCE_GATE(

	),

	DARK_OAK_LEAVES(

	),

	DARK_OAK_LOG(

	),

	DARK_OAK_PLANKS(

	),

	DARK_OAK_PRESSURE_PLATE(

	),

	DARK_OAK_SAPLING(

	),

	DARK_OAK_SIGN(

	),

	DARK_OAK_SLAB(

	),

	DARK_OAK_STAIRS(

	),

	DARK_OAK_TRAPDOOR(

	),

	DARK_OAK_WALL_SIGN(

	),

	DARK_OAK_WOOD(

	),

	DARK_PRISMARINE(

	),

	DARK_PRISMARINE_SLAB(

	),

	DARK_PRISMARINE_STAIRS(

	),

	DAYLIGHT_DETECTOR(

	),

	DEAD_BRAIN_CORAL(

	),

	DEAD_BRAIN_CORAL_BLOCK(

	),

	DEAD_BRAIN_CORAL_FAN(

	),

	DEAD_BRAIN_CORAL_WALL_FAN(

	),

	DEAD_BUBBLE_CORAL(

	),

	DEAD_BUBBLE_CORAL_BLOCK(

	),

	DEAD_BUBBLE_CORAL_FAN(

	),

	DEAD_BUBBLE_CORAL_WALL_FAN(

	),

	DEAD_BUSH(

	),

	DEAD_FIRE_CORAL(

	),

	DEAD_FIRE_CORAL_BLOCK(

	),

	DEAD_FIRE_CORAL_FAN(

	),

	DEAD_FIRE_CORAL_WALL_FAN(

	),

	DEAD_HORN_CORAL(

	),

	DEAD_HORN_CORAL_BLOCK(

	),

	DEAD_HORN_CORAL_FAN(

	),

	DEAD_HORN_CORAL_WALL_FAN(

	),

	DEAD_TUBE_CORAL(

	),

	DEAD_TUBE_CORAL_BLOCK(

	),

	DEAD_TUBE_CORAL_FAN(

	),

	DEAD_TUBE_CORAL_WALL_FAN(

	),

	DEBUG_STICK(

	),

	DETECTOR_RAIL(

	),

	DIAMOND(

	),

	DIAMOND_AXE(

	),

	DIAMOND_BLOCK(

	),

	DIAMOND_BOOTS(

	),

	DIAMOND_CHESTPLATE(

	),

	DIAMOND_HELMET(

	),

	DIAMOND_HOE(

	),

	DIAMOND_HORSE_ARMOR(

	),

	DIAMOND_LEGGINGS(

	),

	DIAMOND_ORE(

	),

	DIAMOND_PICKAXE(

	),

	DIAMOND_SHOVEL(

	),

	DIAMOND_SWORD(

	),

	DIORITE(

	),

	DIORITE_SLAB(

	),

	DIORITE_STAIRS(

	),

	DIORITE_WALL(

	),

	DIRT(

	),

	DISPENSER(

	),

	DOLPHIN_SPAWN_EGG(

	),

	DONKEY_SPAWN_EGG(

	),

	DRAGON_BREATH(

	),

	DRAGON_EGG(

	),

	DRAGON_HEAD(

	),

	DRAGON_WALL_HEAD(

	),

	DRIED_KELP(

	),

	DRIED_KELP_BLOCK(

	),

	DROPPER(

	),

	DROWNED_SPAWN_EGG(

	),

	EGG(

	),

	ELDER_GUARDIAN_SPAWN_EGG(

	),

	ELYTRA(

	),

	EMERALD(

	),

	EMERALD_BLOCK(

	),

	EMERALD_ORE(

	),

	ENCHANTED_BOOK(

	),

	ENCHANTED_GOLDEN_APPLE(

	),

	ENCHANTING_TABLE(

	),

	ENDERMAN_SPAWN_EGG(

	),

	ENDERMITE_SPAWN_EGG(

	),

	ENDER_CHEST(

	),

	ENDER_EYE(

	),

	ENDER_PEARL(

	),

	END_CRYSTAL(

	),

	END_GATEWAY(

	),

	END_PORTAL(

	),

	END_PORTAL_FRAME(

	),

	END_ROD(

	),

	END_STONE(

	),

	END_STONE_BRICKS(

	),

	END_STONE_BRICK_SLAB(

	),

	END_STONE_BRICK_STAIRS(

	),

	END_STONE_BRICK_WALL(

	),

	EVOKER_SPAWN_EGG(

	),

	EXPERIENCE_BOTTLE(

	),

	FARMLAND(

	),

	FEATHER(

	),

	FERMENTED_SPIDER_EYE(

	),

	FERN(

	),

	FILLED_MAP(

	),

	FIRE(

	),

	FIREWORK_ROCKET(

	),

	FIREWORK_STAR(

	),

	FIRE_CHARGE(

	),

	FIRE_CORAL(

	),

	FIRE_CORAL_BLOCK(

	),

	FIRE_CORAL_FAN(

	),

	FIRE_CORAL_WALL_FAN(

	),

	FISHING_ROD(

	),

	FLETCHING_TABLE(

	),

	FLINT(

	),

	FLINT_AND_STEEL(

	),

	FLOWER_BANNER_PATTERN(

	),

	FLOWER_POT(

	),

	FOX_SPAWN_EGG(

	),

	FROSTED_ICE(

	),

	FURNACE(

	),

	FURNACE_MINECART(

	),

	GHAST_SPAWN_EGG(

	),

	GHAST_TEAR(

	),

	GLASS(

	),

	GLASS_BOTTLE(

	),

	GLASS_PANE(

	),

	GLISTERING_MELON_SLICE(

	),

	GLOBE_BANNER_PATTERN(

	),

	GLOWSTONE(

	),

	GLOWSTONE_DUST(

	),

	GOLDEN_APPLE(

	),

	GOLDEN_AXE(

	),

	GOLDEN_BOOTS(

	),

	GOLDEN_CARROT(

	),

	GOLDEN_CHESTPLATE(

	),

	GOLDEN_HELMET(

	),

	GOLDEN_HOE(

	),

	GOLDEN_HORSE_ARMOR(

	),

	GOLDEN_LEGGINGS(

	),

	GOLDEN_PICKAXE(

	),

	GOLDEN_SHOVEL(

	),

	GOLDEN_SWORD(

	),

	GOLD_BLOCK(

	),

	GOLD_INGOT(

	),

	GOLD_NUGGET(

	),

	GOLD_ORE(

	),

	GRANITE(

	),

	GRANITE_SLAB(

	),

	GRANITE_STAIRS(

	),

	GRANITE_WALL(

	),

	GRASS(

	),

	GRASS_BLOCK(

	),

	GRASS_PATH(

	),

	GRAVEL(

	),

	GRAY_BANNER(

	),

	GRAY_BED(

	),

	GRAY_CARPET(

	),

	GRAY_CONCRETE(

	),

	GRAY_CONCRETE_POWDER(

	),

	GRAY_DYE(

	),

	GRAY_GLAZED_TERRACOTTA(

	),

	GRAY_SHULKER_BOX(

	),

	GRAY_STAINED_GLASS(

	),

	GRAY_STAINED_GLASS_PANE(

	),

	GRAY_TERRACOTTA(

	),

	GRAY_WALL_BANNER(

	),

	GRAY_WOOL(

	),

	GREEN_BANNER(

	),

	GREEN_BED(

	),

	GREEN_CARPET(

	),

	GREEN_CONCRETE(

	),

	GREEN_CONCRETE_POWDER(

	),

	GREEN_DYE(

	),

	GREEN_GLAZED_TERRACOTTA(

	),

	GREEN_SHULKER_BOX(

	),

	GREEN_STAINED_GLASS(

	),

	GREEN_STAINED_GLASS_PANE(

	),

	GREEN_TERRACOTTA(

	),

	GREEN_WALL_BANNER(

	),

	GREEN_WOOL(

	),

	GRINDSTONE(

	),

	GUARDIAN_SPAWN_EGG(

	),

	GUNPOWDER(

	),

	HAY_BLOCK(

	),

	HEART_OF_THE_SEA(

	),

	HEAVY_WEIGHTED_PRESSURE_PLATE(

	),

	HOPPER(

	),

	HOPPER_MINECART(

	),

	HORN_CORAL(

	),

	HORN_CORAL_BLOCK(

	),

	HORN_CORAL_FAN(

	),

	HORN_CORAL_WALL_FAN(

	),

	HORSE_SPAWN_EGG(

	),

	HUSK_SPAWN_EGG(

	),

	ICE(

	),

	INFESTED_CHISELED_STONE_BRICKS(

	),

	INFESTED_COBBLESTONE(

	),

	INFESTED_CRACKED_STONE_BRICKS(

	),

	INFESTED_MOSSY_STONE_BRICKS(

	),

	INFESTED_STONE(

	),

	INFESTED_STONE_BRICKS(

	),

	INK_SAC(

	),

	IRON_AXE(

	),

	IRON_BARS(

	),

	IRON_BLOCK(

	),

	IRON_BOOTS(

	),

	IRON_CHESTPLATE(

	),

	IRON_DOOR(

	),

	IRON_HELMET(

	),

	IRON_HOE(

	),

	IRON_HORSE_ARMOR(

	),

	IRON_INGOT(

	),

	IRON_LEGGINGS(

	),

	IRON_NUGGET(

	),

	IRON_ORE(

	),

	IRON_PICKAXE(

	),

	IRON_SHOVEL(

	),

	IRON_SWORD(

	),

	IRON_TRAPDOOR(

	),

	ITEM_FRAME(

	),

	JACK_O_LANTERN(

	),

	JIGSAW(

	),

	JUKEBOX(

	),

	JUNGLE_BOAT(

	),

	JUNGLE_BUTTON(

	),

	JUNGLE_DOOR(

	),

	JUNGLE_FENCE(

	),

	JUNGLE_FENCE_GATE(

	),

	JUNGLE_LEAVES(

	),

	JUNGLE_LOG(

	),

	JUNGLE_PLANKS(

	),

	JUNGLE_PRESSURE_PLATE(

	),

	JUNGLE_SAPLING(

	),

	JUNGLE_SIGN(

	),

	JUNGLE_SLAB(

	),

	JUNGLE_STAIRS(

	),

	JUNGLE_TRAPDOOR(

	),

	JUNGLE_WALL_SIGN(

	),

	JUNGLE_WOOD(

	),

	KELP(

	),

	KELP_PLANT(

	),

	KNOWLEDGE_BOOK(

	),

	LADDER(

	),

	LANTERN(

	),

	LAPIS_BLOCK(

	),

	LAPIS_LAZULI(

	),

	LAPIS_ORE(

	),

	LARGE_FERN(

	),

	LAVA(

	),

	LAVA_BUCKET(

	),

	LEAD(

	),

	LEATHER(

	),

	LEATHER_BOOTS(

	),

	LEATHER_CHESTPLATE(

	),

	LEATHER_HELMET(

	),

	LEATHER_HORSE_ARMOR(

	),

	LEATHER_LEGGINGS(

	),

	LECTERN(

	),

	LEVER(

	),

	LIGHT_BLUE_BANNER(

	),

	LIGHT_BLUE_BED(

	),

	LIGHT_BLUE_CARPET(

	),

	LIGHT_BLUE_CONCRETE(

	),

	LIGHT_BLUE_CONCRETE_POWDER(

	),

	LIGHT_BLUE_DYE(

	),

	LIGHT_BLUE_GLAZED_TERRACOTTA(

	),

	LIGHT_BLUE_SHULKER_BOX(

	),

	LIGHT_BLUE_STAINED_GLASS(

	),

	LIGHT_BLUE_STAINED_GLASS_PANE(

	),

	LIGHT_BLUE_TERRACOTTA(

	),

	LIGHT_BLUE_WALL_BANNER(

	),

	LIGHT_BLUE_WOOL(

	),

	LIGHT_GRAY_BANNER(

	),

	LIGHT_GRAY_BED(

	),

	LIGHT_GRAY_CARPET(

	),

	LIGHT_GRAY_CONCRETE(

	),

	LIGHT_GRAY_CONCRETE_POWDER(

	),

	LIGHT_GRAY_DYE(

	),

	LIGHT_GRAY_GLAZED_TERRACOTTA(

	),

	LIGHT_GRAY_SHULKER_BOX(

	),

	LIGHT_GRAY_STAINED_GLASS(

	),

	LIGHT_GRAY_STAINED_GLASS_PANE(

	),

	LIGHT_GRAY_TERRACOTTA(

	),

	LIGHT_GRAY_WALL_BANNER(

	),

	LIGHT_GRAY_WOOL(

	),

	LIGHT_WEIGHTED_PRESSURE_PLATE(

	),

	LILAC(

	),

	LILY_OF_THE_VALLEY(

	),

	LILY_PAD(

	),

	LIME_BANNER(

	),

	LIME_BED(

	),

	LIME_CARPET(

	),

	LIME_CONCRETE(

	),

	LIME_CONCRETE_POWDER(

	),

	LIME_DYE(

	),

	LIME_GLAZED_TERRACOTTA(

	),

	LIME_SHULKER_BOX(

	),

	LIME_STAINED_GLASS(

	),

	LIME_STAINED_GLASS_PANE(

	),

	LIME_TERRACOTTA(

	),

	LIME_WALL_BANNER(

	),

	LIME_WOOL(

	),

	LINGERING_POTION(

	),

	LLAMA_SPAWN_EGG(

	),

	LOOM(

	),

	MAGENTA_BANNER(

	),

	MAGENTA_BED(

	),

	MAGENTA_CARPET(

	),

	MAGENTA_CONCRETE(

	),

	MAGENTA_CONCRETE_POWDER(

	),

	MAGENTA_DYE(

	),

	MAGENTA_GLAZED_TERRACOTTA(

	),

	MAGENTA_SHULKER_BOX(

	),

	MAGENTA_STAINED_GLASS(

	),

	MAGENTA_STAINED_GLASS_PANE(

	),

	MAGENTA_TERRACOTTA(

	),

	MAGENTA_WALL_BANNER(

	),

	MAGENTA_WOOL(

	),

	MAGMA_BLOCK(

	),

	MAGMA_CREAM(

	),

	MAGMA_CUBE_SPAWN_EGG(

	),

	MAP(

	),

	MELON(

	),

	MELON_SEEDS(

	),

	MELON_SLICE(

	),

	MELON_STEM(

	),

	MILK_BUCKET(

	),

	MINECART(

	),

	MOJANG_BANNER_PATTERN(

	),

	MOOSHROOM_SPAWN_EGG(

	),

	MOSSY_COBBLESTONE(

	),

	MOSSY_COBBLESTONE_SLAB(

	),

	MOSSY_COBBLESTONE_STAIRS(

	),

	MOSSY_COBBLESTONE_WALL(

	),

	MOSSY_STONE_BRICKS(

	),

	MOSSY_STONE_BRICK_SLAB(

	),

	MOSSY_STONE_BRICK_STAIRS(

	),

	MOSSY_STONE_BRICK_WALL(

	),

	MOVING_PISTON(

	),

	MULE_SPAWN_EGG(

	),

	MUSHROOM_STEM(

	),

	MUSHROOM_STEW(

	),

	MUSIC_DISC_11(

	),

	MUSIC_DISC_13(

	),

	MUSIC_DISC_BLOCKS(

	),

	MUSIC_DISC_CAT(

	),

	MUSIC_DISC_CHIRP(

	),

	MUSIC_DISC_FAR(

	),

	MUSIC_DISC_MALL(

	),

	MUSIC_DISC_MELLOHI(

	),

	MUSIC_DISC_STAL(

	),

	MUSIC_DISC_STRAD(

	),

	MUSIC_DISC_WAIT(

	),

	MUSIC_DISC_WARD(

	),

	MUTTON(

	),

	MYCELIUM(

	),

	NAME_TAG(

	),

	NAUTILUS_SHELL(

	),

	NETHERRACK(

	),

	NETHER_BRICK(

	),

	NETHER_BRICKS(

	),

	NETHER_BRICK_FENCE(

	),

	NETHER_BRICK_SLAB(

	),

	NETHER_BRICK_STAIRS(

	),

	NETHER_BRICK_WALL(

	),

	NETHER_PORTAL(

	),

	NETHER_QUARTZ_ORE(

	),

	NETHER_STAR(

	),

	NETHER_WART(

	),

	NETHER_WART_BLOCK(

	),

	NOTE_BLOCK(

	),

	OAK_BOAT(

	),

	OAK_BUTTON(

	),

	OAK_DOOR(

	),

	OAK_FENCE(

	),

	OAK_FENCE_GATE(

	),

	OAK_LEAVES(

	),

	OAK_LOG(

	),

	OAK_PLANKS(

	),

	OAK_PRESSURE_PLATE(

	),

	OAK_SAPLING(

	),

	OAK_SIGN(

	),

	OAK_SLAB(

	),

	OAK_STAIRS(

	),

	OAK_TRAPDOOR(

	),

	OAK_WALL_SIGN(

	),

	OAK_WOOD(

	),

	OBSERVER(

	),

	OBSIDIAN(

	),

	OCELOT_SPAWN_EGG(

	),

	ORANGE_BANNER(

	),

	ORANGE_BED(

	),

	ORANGE_CARPET(

	),

	ORANGE_CONCRETE(

	),

	ORANGE_CONCRETE_POWDER(

	),

	ORANGE_DYE(

	),

	ORANGE_GLAZED_TERRACOTTA(

	),

	ORANGE_SHULKER_BOX(

	),

	ORANGE_STAINED_GLASS(

	),

	ORANGE_STAINED_GLASS_PANE(

	),

	ORANGE_TERRACOTTA(

	),

	ORANGE_TULIP(

	),

	ORANGE_WALL_BANNER(

	),

	ORANGE_WOOL(

	),

	OXEYE_DAISY(

	),

	PACKED_ICE(

	),

	PAINTING(

	),

	PANDA_SPAWN_EGG(

	),

	PAPER(

	),

	PARROT_SPAWN_EGG(

	),

	PEONY(

	),

	PETRIFIED_OAK_SLAB(

	),

	PHANTOM_MEMBRANE(

	),

	PHANTOM_SPAWN_EGG(

	),

	PIG_SPAWN_EGG(

	),

	PILLAGER_SPAWN_EGG(

	),

	PINK_BANNER(

	),

	PINK_BED(

	),

	PINK_CARPET(

	),

	PINK_CONCRETE(

	),

	PINK_CONCRETE_POWDER(

	),

	PINK_DYE(

	),

	PINK_GLAZED_TERRACOTTA(

	),

	PINK_SHULKER_BOX(

	),

	PINK_STAINED_GLASS(

	),

	PINK_STAINED_GLASS_PANE(

	),

	PINK_TERRACOTTA(

	),

	PINK_TULIP(

	),

	PINK_WALL_BANNER(

	),

	PINK_WOOL(

	),

	PISTON(

	),

	PISTON_HEAD(

	),

	PLAYER_HEAD(

	),

	PLAYER_WALL_HEAD(

	),

	PODZOL(

	),

	POISONOUS_POTATO(

	),

	POLAR_BEAR_SPAWN_EGG(

	),

	POLISHED_ANDESITE(

	),

	POLISHED_ANDESITE_SLAB(

	),

	POLISHED_ANDESITE_STAIRS(

	),

	POLISHED_DIORITE(

	),

	POLISHED_DIORITE_SLAB(

	),

	POLISHED_DIORITE_STAIRS(

	),

	POLISHED_GRANITE(

	),

	POLISHED_GRANITE_SLAB(

	),

	POLISHED_GRANITE_STAIRS(

	),

	POPPED_CHORUS_FRUIT(

	),

	POPPY(

	),

	PORKCHOP(

	),

	POTATO(

	),

	POTATOES(

	),

	POTION(

	),

	POTTED_ACACIA_SAPLING(

	),

	POTTED_ALLIUM(

	),

	POTTED_AZURE_BLUET(

	),

	POTTED_BAMBOO(

	),

	POTTED_BIRCH_SAPLING(

	),

	POTTED_BLUE_ORCHID(

	),

	POTTED_BROWN_MUSHROOM(

	),

	POTTED_CACTUS(

	),

	POTTED_CORNFLOWER(

	),

	POTTED_DANDELION(

	),

	POTTED_DARK_OAK_SAPLING(

	),

	POTTED_DEAD_BUSH(

	),

	POTTED_FERN(

	),

	POTTED_JUNGLE_SAPLING(

	),

	POTTED_LILY_OF_THE_VALLEY(

	),

	POTTED_OAK_SAPLING(

	),

	POTTED_ORANGE_TULIP(

	),

	POTTED_OXEYE_DAISY(

	),

	POTTED_PINK_TULIP(

	),

	POTTED_POPPY(

	),

	POTTED_RED_MUSHROOM(

	),

	POTTED_RED_TULIP(

	),

	POTTED_SPRUCE_SAPLING(

	),

	POTTED_WHITE_TULIP(

	),

	POTTED_WITHER_ROSE(

	),

	POWERED_RAIL(

	),

	PRISMARINE(

	),

	PRISMARINE_BRICKS(

	),

	PRISMARINE_BRICK_SLAB(

	),

	PRISMARINE_BRICK_STAIRS(

	),

	PRISMARINE_CRYSTALS(

	),

	PRISMARINE_SHARD(

	),

	PRISMARINE_SLAB(

	),

	PRISMARINE_STAIRS(

	),

	PRISMARINE_WALL(

	),

	PUFFERFISH(

	),

	PUFFERFISH_BUCKET(

	),

	PUFFERFISH_SPAWN_EGG(

	),

	PUMPKIN(

	),

	PUMPKIN_PIE(

	),

	PUMPKIN_SEEDS(

	),

	PUMPKIN_STEM(

	),

	PURPLE_BANNER(

	),

	PURPLE_BED(

	),

	PURPLE_CARPET(

	),

	PURPLE_CONCRETE(

	),

	PURPLE_CONCRETE_POWDER(

	),

	PURPLE_DYE(

	),

	PURPLE_GLAZED_TERRACOTTA(

	),

	PURPLE_SHULKER_BOX(

	),

	PURPLE_STAINED_GLASS(

	),

	PURPLE_STAINED_GLASS_PANE(

	),

	PURPLE_TERRACOTTA(

	),

	PURPLE_WALL_BANNER(

	),

	PURPLE_WOOL(

	),

	PURPUR_BLOCK(

	),

	PURPUR_PILLAR(

	),

	PURPUR_SLAB(

	),

	PURPUR_STAIRS(

	),

	QUARTZ(

	),

	QUARTZ_BLOCK(

	),

	QUARTZ_PILLAR(

	),

	QUARTZ_SLAB(

	),

	QUARTZ_STAIRS(

	),

	RABBIT(

	),

	RABBIT_FOOT(

	),

	RABBIT_HIDE(

	),

	RABBIT_SPAWN_EGG(

	),

	RABBIT_STEW(

	),

	RAIL(

	),

	RAVAGER_SPAWN_EGG(

	),

	REDSTONE(

	),

	REDSTONE_BLOCK(

	),

	REDSTONE_LAMP(

	),

	REDSTONE_ORE(

	),

	REDSTONE_TORCH(

	),

	REDSTONE_WALL_TORCH(

	),

	REDSTONE_WIRE(

	),

	RED_BANNER(

	),

	RED_BED(

	),

	RED_CARPET(

	),

	RED_CONCRETE(

	),

	RED_CONCRETE_POWDER(

	),

	RED_DYE(

	),

	RED_GLAZED_TERRACOTTA(

	),

	RED_MUSHROOM(

	),

	RED_MUSHROOM_BLOCK(

	),

	RED_NETHER_BRICKS(

	),

	RED_NETHER_BRICK_SLAB(

	),

	RED_NETHER_BRICK_STAIRS(

	),

	RED_NETHER_BRICK_WALL(

	),

	RED_SAND(

	),

	RED_SANDSTONE(

	),

	RED_SANDSTONE_SLAB(

	),

	RED_SANDSTONE_STAIRS(

	),

	RED_SANDSTONE_WALL(

	),

	RED_SHULKER_BOX(

	),

	RED_STAINED_GLASS(

	),

	RED_STAINED_GLASS_PANE(

	),

	RED_TERRACOTTA(

	),

	RED_TULIP(

	),

	RED_WALL_BANNER(

	),

	RED_WOOL(

	),

	REPEATER(

	),

	REPEATING_COMMAND_BLOCK(

	),

	ROSE_BUSH(

	),

	ROTTEN_FLESH(

	),

	SADDLE(

	),

	SALMON(

	),

	SALMON_BUCKET(

	),

	SALMON_SPAWN_EGG(

	),

	SAND(

	),

	SANDSTONE(

	),

	SANDSTONE_SLAB(

	),

	SANDSTONE_STAIRS(

	),

	SANDSTONE_WALL(

	),

	SCAFFOLDING(

	),

	SCUTE(

	),

	SEAGRASS(

	),

	SEA_LANTERN(

	),

	SEA_PICKLE(

	),

	SHEARS(

	),

	SHEEP_SPAWN_EGG(

	),

	SHIELD(

	),

	SHULKER_BOX(

	),

	SHULKER_SHELL(

	),

	SHULKER_SPAWN_EGG(

	),

	SILVERFISH_SPAWN_EGG(

	),

	SKELETON_HORSE_SPAWN_EGG(

	),

	SKELETON_SKULL(

	),

	SKELETON_SPAWN_EGG(

	),

	SKELETON_WALL_SKULL(

	),

	SKULL_BANNER_PATTERN(

	),

	SLIME_BALL(

	),

	SLIME_BLOCK(

	),

	SLIME_SPAWN_EGG(

	),

	SMITHING_TABLE(

	),

	SMOKER(

	),

	SMOOTH_QUARTZ(

	),

	SMOOTH_QUARTZ_SLAB(

	),

	SMOOTH_QUARTZ_STAIRS(

	),

	SMOOTH_RED_SANDSTONE(

	),

	SMOOTH_RED_SANDSTONE_SLAB(

	),

	SMOOTH_RED_SANDSTONE_STAIRS(

	),

	SMOOTH_SANDSTONE(

	),

	SMOOTH_SANDSTONE_SLAB(

	),

	SMOOTH_SANDSTONE_STAIRS(

	),

	SMOOTH_STONE(

	),

	SMOOTH_STONE_SLAB(

	),

	SNOW(

	),

	SNOWBALL(

	),

	SNOW_BLOCK(

	),

	SOUL_SAND(

	),

	SPAWNER(

	),

	SPECTRAL_ARROW(

	),

	SPIDER_EYE(

	),

	SPIDER_SPAWN_EGG(

	),

	SPLASH_POTION(

	),

	SPONGE(

	),

	SPRUCE_BOAT(

	),

	SPRUCE_BUTTON(

	),

	SPRUCE_DOOR(

	),

	SPRUCE_FENCE(

	),

	SPRUCE_FENCE_GATE(

	),

	SPRUCE_LEAVES(

	),

	SPRUCE_LOG(

	),

	SPRUCE_PLANKS(

	),

	SPRUCE_PRESSURE_PLATE(

	),

	SPRUCE_SAPLING(

	),

	SPRUCE_SIGN(

	),

	SPRUCE_SLAB(

	),

	SPRUCE_STAIRS(

	),

	SPRUCE_TRAPDOOR(

	),

	SPRUCE_WALL_SIGN(

	),

	SPRUCE_WOOD(

	),

	SQUID_SPAWN_EGG(

	),

	STICK(

	),

	STICKY_PISTON(

	),

	STONE(

	),

	STONECUTTER(

	),

	STONE_AXE(

	),

	STONE_BRICKS(

	),

	STONE_BRICK_SLAB(

	),

	STONE_BRICK_STAIRS(

	),

	STONE_BRICK_WALL(

	),

	STONE_BUTTON(

	),

	STONE_HOE(

	),

	STONE_PICKAXE(

	),

	STONE_PRESSURE_PLATE(

	),

	STONE_SHOVEL(

	),

	STONE_SLAB(

	),

	STONE_STAIRS(

	),

	STONE_SWORD(

	),

	STRAY_SPAWN_EGG(

	),

	STRING(

	),

	STRIPPED_ACACIA_LOG(

	),

	STRIPPED_ACACIA_WOOD(

	),

	STRIPPED_BIRCH_LOG(

	),

	STRIPPED_BIRCH_WOOD(

	),

	STRIPPED_DARK_OAK_LOG(

	),

	STRIPPED_DARK_OAK_WOOD(

	),

	STRIPPED_JUNGLE_LOG(

	),

	STRIPPED_JUNGLE_WOOD(

	),

	STRIPPED_OAK_LOG(

	),

	STRIPPED_OAK_WOOD(

	),

	STRIPPED_SPRUCE_LOG(

	),

	STRIPPED_SPRUCE_WOOD(

	),

	STRUCTURE_BLOCK(

	),

	STRUCTURE_VOID(

	),

	SUGAR(

	),

	SUGAR_CANE(

	),

	SUNFLOWER(

	),

	SUSPICIOUS_STEW(

	),

	SWEET_BERRIES(

	),

	SWEET_BERRY_BUSH(

	),

	TALL_GRASS(

	),

	TALL_SEAGRASS(

	),

	TERRACOTTA(

	),

	TIPPED_ARROW(

	),

	TNT(

	),

	TNT_MINECART(

	),

	TORCH(

	),

	TOTEM_OF_UNDYING(

	),

	TRADER_LLAMA_SPAWN_EGG(

	),

	TRAPPED_CHEST(

	),

	TRIDENT(

	),

	TRIPWIRE(

	),

	TRIPWIRE_HOOK(

	),

	TROPICAL_FISH(

	),

	TROPICAL_FISH_BUCKET(

	),

	TROPICAL_FISH_SPAWN_EGG(

	),

	TUBE_CORAL(

	),

	TUBE_CORAL_BLOCK(

	),

	TUBE_CORAL_FAN(

	),

	TUBE_CORAL_WALL_FAN(

	),

	TURTLE_EGG(

	),

	TURTLE_HELMET(

	),

	TURTLE_SPAWN_EGG(

	),

	VEX_SPAWN_EGG(

	),

	VILLAGER_SPAWN_EGG(

	),

	VINDICATOR_SPAWN_EGG(

	),

	VINE(

	),

	VOID_AIR(

	),

	WALL_TORCH(

	),

	WANDERING_TRADER_SPAWN_EGG(

	),

	WATER(

	),

	WATER_BUCKET(

	),

	WET_SPONGE(

	),

	WHEAT(

	),

	WHEAT_SEEDS(

	),

	WHITE_BANNER(

	),

	WHITE_BED(

	),

	WHITE_CARPET(

	),

	WHITE_CONCRETE(

	),

	WHITE_CONCRETE_POWDER(

	),

	WHITE_DYE(

	),

	WHITE_GLAZED_TERRACOTTA(

	),

	WHITE_SHULKER_BOX(

	),

	WHITE_STAINED_GLASS(

	),

	WHITE_STAINED_GLASS_PANE(

	),

	WHITE_TERRACOTTA(

	),

	WHITE_TULIP(

	),

	WHITE_WALL_BANNER(

	),

	WHITE_WOOL(

	),

	WITCH_SPAWN_EGG(

	),

	WITHER_ROSE(

	),

	WITHER_SKELETON_SKULL(

	),

	WITHER_SKELETON_SPAWN_EGG(

	),

	WITHER_SKELETON_WALL_SKULL(

	),

	WOLF_SPAWN_EGG(

	),

	WOODEN_AXE(

	),

	WOODEN_HOE(

	),

	WOODEN_PICKAXE(

	),

	WOODEN_SHOVEL(

	),

	WOODEN_SWORD(

	),

	WRITABLE_BOOK(

	),

	WRITTEN_BOOK(

	),

	YELLOW_BANNER(

	),

	YELLOW_BED(

	),

	YELLOW_CARPET(

	),

	YELLOW_CONCRETE(

	),

	YELLOW_CONCRETE_POWDER(

	),

	YELLOW_DYE(

	),

	YELLOW_GLAZED_TERRACOTTA(

	),

	YELLOW_SHULKER_BOX(

	),

	YELLOW_STAINED_GLASS(

	),

	YELLOW_STAINED_GLASS_PANE(

	),

	YELLOW_TERRACOTTA(

	),

	YELLOW_WALL_BANNER(

	),

	YELLOW_WOOL(

	),

	ZOMBIE_HEAD(

	),

	ZOMBIE_HORSE_SPAWN_EGG(

	),

	ZOMBIE_PIGMAN_SPAWN_EGG(

	),

	ZOMBIE_SPAWN_EGG(

	),

	ZOMBIE_VILLAGER_SPAWN_EGG(

	),

	ZOMBIE_WALL_HEAD(

	);

	private static boolean initialized;

	private final List<CrossMaterialVersion> versions;
	private MaterialHandler handle;

	CrossMaterial(CrossMaterialVersion... versions) {
		if (versions.length == 0) {
			throw new IllegalArgumentException("No versions for material " + name());
		}
		this.versions = Arrays.asList(versions);
	}

	public List<CrossMaterialVersion> getVersions() {
		return Collections.unmodifiableList(versions);
	}

	public Optional<CrossMaterialVersion> getMostSuitableVersion(ServerVersion version) {
		for (CrossMaterialVersion candidate : Lists.reverse(versions)) {
			if (candidate.getValidVersions().isBetweenBounds(version)) {
				return Optional.of(candidate);
			}
		}
		return Optional.empty();
	}

	public Optional<MaterialHandler> getHandle() {
		return Optional.ofNullable(handle);
	}

	public boolean equals(Material material) {
		return getHandle().map(handle -> handle.getType() == material).orElse(false);
	}

	public static Collection<CrossMaterial> getMaterials() {
		return Collections.unmodifiableList(Arrays.asList(values()));
	}

	public static void initialize(Logger logger, ServerVersion serverVersion) {
		if (initialized) {
			throw new IllegalStateException("Already initialized!");
		}
		initialized = true;
		for (CrossMaterial material : values()) {
			material.getMostSuitableVersion(serverVersion)
					.ifPresent(version -> {
						String[] query = version.getName().split(":", 2);
						Material type = Material.getMaterial(query[0]);
						if (type == null) {
							throw new IllegalStateException("Unable to find expected material " + material.name());
						}
						Byte data = null;
						if (query.length == 2) {
							if (serverVersion.isNewer(ServerVersion.V1_13)) {
								throw new IllegalStateException("Can't use material data in > 1.13");
							}
							data = (byte) Integer.parseInt(query[1]);
						}
						material.handle = new MaterialHandler(type, data);
					});
		}
	}
}
