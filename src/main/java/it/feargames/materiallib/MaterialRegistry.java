package it.feargames.materiallib;

import it.feargames.materiallib.utilities.ServerVersion;

import static it.feargames.materiallib.MaterialEntry.fromVersions;
import static it.feargames.materiallib.MaterialVersion.*;

@SuppressWarnings("unused")
public final class MaterialRegistry {

    private MaterialRegistry() {
    }

    public final static MaterialEntry ACACIA_BOAT = fromVersions(
            between("boat_acacia", ServerVersion.V1_9, ServerVersion.V1_12_2),
            since("acacia_boat", ServerVersion.V1_13)
    );

    public final static MaterialEntry ACACIA_BUTTON = fromVersions(
            since("acacia_button", ServerVersion.V1_13)
    );

    public final static MaterialEntry ACACIA_DOOR = fromVersions(
            since("acacia_door", ServerVersion.V1_8)
    );

    public final static MaterialEntry ACACIA_FENCE = fromVersions(
            since("acacia_fence", ServerVersion.V1_8)
    );

    public final static MaterialEntry ACACIA_FENCE_GATE = fromVersions(
            since("acacia_fence_gate", ServerVersion.V1_8)
    );

    public final static MaterialEntry ACACIA_LEAVES = fromVersions(
            between("leaves_2", ServerVersion.V1_7_2, ServerVersion.V1_12_2),
            since("acacia_leaves", ServerVersion.V1_13)
    );

    public final static MaterialEntry ACACIA_LOG = fromVersions(
            since("acacia_log", ServerVersion.V1_13)
    );

    public final static MaterialEntry ACACIA_PLANKS = fromVersions(
            between("wood:4", ServerVersion.V1_7_2, ServerVersion.V1_12_2),
            since("acacia_planks", ServerVersion.V1_13)
    );

    public final static MaterialEntry ACACIA_PRESSURE_PLATE = fromVersions(
            since("acacia_pressure_plate", ServerVersion.V1_13)
    );

    public final static MaterialEntry ACACIA_SAPLING = fromVersions(
            between("sapling:5", ServerVersion.V1_7_2, ServerVersion.V1_12_2),
            since("acacia_sapling", ServerVersion.V1_13)
    );

    public final static MaterialEntry ACACIA_SIGN = fromVersions(
            since("acacia_sign", ServerVersion.V1_14)
    );

    public final static MaterialEntry ACACIA_SLAB = fromVersions(
            between("wood_step:4", ServerVersion.V1_7_2, ServerVersion.V1_12_2),
            since("acacia_slab", ServerVersion.V1_13)
    );

    public final static MaterialEntry ACACIA_STAIRS = fromVersions(
            since("acacia_stairs", ServerVersion.V1_7_2)
    );

    public final static MaterialEntry ACACIA_TRAPDOOR = fromVersions(
            since("acacia_trapdoor", ServerVersion.V1_13)
    );

    public final static MaterialEntry ACTIVATOR_RAIL = fromVersions(
            since("activator_rail", ServerVersion.V1_5)
    );

    public final static MaterialEntry AIR = fromVersions(
            sinceRelease("air")
    );

    public final static MaterialEntry ALLIUM = fromVersions(
            between("red_rose:2", ServerVersion.V1_7_2, ServerVersion.V1_12_2),
            since("allium", ServerVersion.V1_13)
    );

    public final static MaterialEntry ANDESITE = fromVersions(
            between("stone:5", ServerVersion.V1_8, ServerVersion.V1_12_2),
            since("andesite", ServerVersion.V1_13)
    );

    public final static MaterialEntry ANDESITE_SLAB = fromVersions(
            since("andesite_slab", ServerVersion.V1_14)
    );

    public final static MaterialEntry ANDESITE_STAIRS = fromVersions(
            since("andesite_stairs", ServerVersion.V1_14)
    );

    public final static MaterialEntry ANDESITE_WALL = fromVersions(
            since("andesite_wall", ServerVersion.V1_14)
    );

    public final static MaterialEntry ANVIL = fromVersions(
            since("anvil", ServerVersion.V1_4_2)
    );

    public final static MaterialEntry APPLE = fromVersions(
            sinceRelease("apple")
    );

    public final static MaterialEntry ARMOR_STAND = fromVersions(
            since("armor_stand", ServerVersion.V1_8)
    );

    public final static MaterialEntry ARROW = fromVersions(
            sinceRelease("arrow")
    );

    public final static MaterialEntry ATTACHED_MELON_STEM = fromVersions(
    );

    public final static MaterialEntry ATTACHED_PUMPKIN_STEM = fromVersions(
    );

    public final static MaterialEntry AZURE_BLUET = fromVersions(
    );

    public final static MaterialEntry BAKED_POTATO = fromVersions(
    );

    public final static MaterialEntry BAMBOO = fromVersions(
    );

    public final static MaterialEntry BAMBOO_SAPLING = fromVersions(
    );

    public final static MaterialEntry BARREL = fromVersions(
    );

    public final static MaterialEntry BARRIER = fromVersions(
    );

    public final static MaterialEntry BAT_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry BEACON = fromVersions(
    );

    public final static MaterialEntry BEDROCK = fromVersions(
    );

    public final static MaterialEntry BEEF = fromVersions(
    );

    public final static MaterialEntry BEETROOT = fromVersions(
    );

    public final static MaterialEntry BEETROOTS = fromVersions(
    );

    public final static MaterialEntry BEETROOT_SEEDS = fromVersions(
    );

    public final static MaterialEntry BEETROOT_SOUP = fromVersions(
    );

    public final static MaterialEntry BELL = fromVersions(
    );

    public final static MaterialEntry BIRCH_BOAT = fromVersions(
    );

    public final static MaterialEntry BIRCH_BUTTON = fromVersions(
    );

    public final static MaterialEntry BIRCH_DOOR = fromVersions(
    );

    public final static MaterialEntry BIRCH_FENCE = fromVersions(
    );

    public final static MaterialEntry BIRCH_FENCE_GATE = fromVersions(
    );

    public final static MaterialEntry BIRCH_LEAVES = fromVersions(
    );

    public final static MaterialEntry BIRCH_LOG = fromVersions(
    );

    public final static MaterialEntry BIRCH_PLANKS = fromVersions(
    );

    public final static MaterialEntry BIRCH_PRESSURE_PLATE = fromVersions(
    );

    public final static MaterialEntry BIRCH_SAPLING = fromVersions(
    );

    public final static MaterialEntry BIRCH_SIGN = fromVersions(
    );

    public final static MaterialEntry BIRCH_SLAB = fromVersions(
    );

    public final static MaterialEntry BIRCH_STAIRS = fromVersions(
    );

    public final static MaterialEntry BIRCH_TRAPDOOR = fromVersions(
    );

    public final static MaterialEntry BIRCH_WALL_SIGN = fromVersions(
    );

    public final static MaterialEntry BIRCH_WOOD = fromVersions(
    );

    public final static MaterialEntry BLACK_BANNER = fromVersions(
    );

    public final static MaterialEntry BLACK_BED = fromVersions(
    );

    public final static MaterialEntry BLACK_CARPET = fromVersions(
    );

    public final static MaterialEntry BLACK_CONCRETE = fromVersions(
    );

    public final static MaterialEntry BLACK_CONCRETE_POWDER = fromVersions(
    );

    public final static MaterialEntry BLACK_DYE = fromVersions(
    );

    public final static MaterialEntry BLACK_GLAZED_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry BLACK_SHULKER_BOX = fromVersions(
    );

    public final static MaterialEntry BLACK_STAINED_GLASS = fromVersions(
    );

    public final static MaterialEntry BLACK_STAINED_GLASS_PANE = fromVersions(
    );

    public final static MaterialEntry BLACK_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry BLACK_WALL_BANNER = fromVersions(
    );

    public final static MaterialEntry BLACK_WOOL = fromVersions(
    );

    public final static MaterialEntry BLAST_FURNACE = fromVersions(
    );

    public final static MaterialEntry BLAZE_POWDER = fromVersions(
    );

    public final static MaterialEntry BLAZE_ROD = fromVersions(
    );

    public final static MaterialEntry BLAZE_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry BLUE_BANNER = fromVersions(
    );

    public final static MaterialEntry BLUE_BED = fromVersions(
    );

    public final static MaterialEntry BLUE_CARPET = fromVersions(
    );

    public final static MaterialEntry BLUE_CONCRETE = fromVersions(
    );

    public final static MaterialEntry BLUE_CONCRETE_POWDER = fromVersions(
    );

    public final static MaterialEntry BLUE_DYE = fromVersions(
    );

    public final static MaterialEntry BLUE_GLAZED_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry BLUE_ICE = fromVersions(
    );

    public final static MaterialEntry BLUE_ORCHID = fromVersions(
    );

    public final static MaterialEntry BLUE_SHULKER_BOX = fromVersions(
    );

    public final static MaterialEntry BLUE_STAINED_GLASS = fromVersions(
    );

    public final static MaterialEntry BLUE_STAINED_GLASS_PANE = fromVersions(
    );

    public final static MaterialEntry BLUE_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry BLUE_WALL_BANNER = fromVersions(
    );

    public final static MaterialEntry BLUE_WOOL = fromVersions(
    );

    public final static MaterialEntry BONE = fromVersions(
    );

    public final static MaterialEntry BONE_BLOCK = fromVersions(
    );

    public final static MaterialEntry BONE_MEAL = fromVersions(
    );

    public final static MaterialEntry BOOK = fromVersions(
    );

    public final static MaterialEntry BOOKSHELF = fromVersions(
    );

    public final static MaterialEntry BOW = fromVersions(
    );

    public final static MaterialEntry BOWL = fromVersions(
    );

    public final static MaterialEntry BRAIN_CORAL = fromVersions(
    );

    public final static MaterialEntry BRAIN_CORAL_BLOCK = fromVersions(
    );

    public final static MaterialEntry BRAIN_CORAL_FAN = fromVersions(
    );

    public final static MaterialEntry BRAIN_CORAL_WALL_FAN = fromVersions(
    );

    public final static MaterialEntry BREAD = fromVersions(
    );

    public final static MaterialEntry BREWING_STAND = fromVersions(
    );

    public final static MaterialEntry BRICK = fromVersions(
    );

    public final static MaterialEntry BRICKS = fromVersions(
    );

    public final static MaterialEntry BRICK_SLAB = fromVersions(
    );

    public final static MaterialEntry BRICK_STAIRS = fromVersions(
    );

    public final static MaterialEntry BRICK_WALL = fromVersions(
    );

    public final static MaterialEntry BROWN_BANNER = fromVersions(
    );

    public final static MaterialEntry BROWN_BED = fromVersions(
    );

    public final static MaterialEntry BROWN_CARPET = fromVersions(
    );

    public final static MaterialEntry BROWN_CONCRETE = fromVersions(
    );

    public final static MaterialEntry BROWN_CONCRETE_POWDER = fromVersions(
    );

    public final static MaterialEntry BROWN_DYE = fromVersions(
    );

    public final static MaterialEntry BROWN_GLAZED_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry BROWN_MUSHROOM = fromVersions(
    );

    public final static MaterialEntry BROWN_MUSHROOM_BLOCK = fromVersions(
    );

    public final static MaterialEntry BROWN_SHULKER_BOX = fromVersions(
    );

    public final static MaterialEntry BROWN_STAINED_GLASS = fromVersions(
    );

    public final static MaterialEntry BROWN_STAINED_GLASS_PANE = fromVersions(
    );

    public final static MaterialEntry BROWN_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry BROWN_WALL_BANNER = fromVersions(
    );

    public final static MaterialEntry BROWN_WOOL = fromVersions(
    );

    public final static MaterialEntry BUBBLE_COLUMN = fromVersions(
    );

    public final static MaterialEntry BUBBLE_CORAL = fromVersions(
    );

    public final static MaterialEntry BUBBLE_CORAL_BLOCK = fromVersions(
    );

    public final static MaterialEntry BUBBLE_CORAL_FAN = fromVersions(
    );

    public final static MaterialEntry BUBBLE_CORAL_WALL_FAN = fromVersions(
    );

    public final static MaterialEntry BUCKET = fromVersions(
    );

    public final static MaterialEntry CACTUS = fromVersions(
    );

    public final static MaterialEntry CAKE = fromVersions(
    );

    public final static MaterialEntry CAMPFIRE = fromVersions(
    );

    public final static MaterialEntry CARROT = fromVersions(
    );

    public final static MaterialEntry CARROTS = fromVersions(
    );

    public final static MaterialEntry CARROT_ON_A_STICK = fromVersions(
    );

    public final static MaterialEntry CARTOGRAPHY_TABLE = fromVersions(
    );

    public final static MaterialEntry CARVED_PUMPKIN = fromVersions(
    );

    public final static MaterialEntry CAT_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry CAULDRON = fromVersions(
    );

    public final static MaterialEntry CAVE_AIR = fromVersions(
    );

    public final static MaterialEntry CAVE_SPIDER_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry CHAINMAIL_BOOTS = fromVersions(
    );

    public final static MaterialEntry CHAINMAIL_CHESTPLATE = fromVersions(
    );

    public final static MaterialEntry CHAINMAIL_HELMET = fromVersions(
    );

    public final static MaterialEntry CHAINMAIL_LEGGINGS = fromVersions(
    );

    public final static MaterialEntry CHAIN_COMMAND_BLOCK = fromVersions(
    );

    public final static MaterialEntry CHARCOAL = fromVersions(
    );

    public final static MaterialEntry CHEST = fromVersions(
    );

    public final static MaterialEntry CHEST_MINECART = fromVersions(
    );

    public final static MaterialEntry CHICKEN = fromVersions(
    );

    public final static MaterialEntry CHICKEN_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry CHIPPED_ANVIL = fromVersions(
    );

    public final static MaterialEntry CHISELED_QUARTZ_BLOCK = fromVersions(
    );

    public final static MaterialEntry CHISELED_RED_SANDSTONE = fromVersions(
    );

    public final static MaterialEntry CHISELED_SANDSTONE = fromVersions(
    );

    public final static MaterialEntry CHISELED_STONE_BRICKS = fromVersions(
    );

    public final static MaterialEntry CHORUS_FLOWER = fromVersions(
    );

    public final static MaterialEntry CHORUS_FRUIT = fromVersions(
    );

    public final static MaterialEntry CHORUS_PLANT = fromVersions(
    );

    public final static MaterialEntry CLAY = fromVersions(
    );

    public final static MaterialEntry CLAY_BALL = fromVersions(
    );

    public final static MaterialEntry CLOCK = fromVersions(
    );

    public final static MaterialEntry COAL = fromVersions(
    );

    public final static MaterialEntry COAL_BLOCK = fromVersions(
    );

    public final static MaterialEntry COAL_ORE = fromVersions(
    );

    public final static MaterialEntry COARSE_DIRT = fromVersions(
    );

    public final static MaterialEntry COBBLESTONE = fromVersions(
    );

    public final static MaterialEntry COBBLESTONE_SLAB = fromVersions(
    );

    public final static MaterialEntry COBBLESTONE_STAIRS = fromVersions(
    );

    public final static MaterialEntry COBBLESTONE_WALL = fromVersions(
    );

    public final static MaterialEntry COBWEB = fromVersions(
    );

    public final static MaterialEntry COCOA = fromVersions(
    );

    public final static MaterialEntry COCOA_BEANS = fromVersions(
    );

    public final static MaterialEntry COD = fromVersions(
    );

    public final static MaterialEntry COD_BUCKET = fromVersions(
    );

    public final static MaterialEntry COD_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry COMMAND_BLOCK = fromVersions(
    );

    public final static MaterialEntry COMMAND_BLOCK_MINECART = fromVersions(
    );

    public final static MaterialEntry COMPARATOR = fromVersions(
    );

    public final static MaterialEntry COMPASS = fromVersions(
    );

    public final static MaterialEntry COMPOSTER = fromVersions(
    );

    public final static MaterialEntry CONDUIT = fromVersions(
    );

    public final static MaterialEntry COOKED_BEEF = fromVersions(
    );

    public final static MaterialEntry COOKED_CHICKEN = fromVersions(
    );

    public final static MaterialEntry COOKED_COD = fromVersions(
    );

    public final static MaterialEntry COOKED_MUTTON = fromVersions(
    );

    public final static MaterialEntry COOKED_PORKCHOP = fromVersions(
    );

    public final static MaterialEntry COOKED_RABBIT = fromVersions(
    );

    public final static MaterialEntry COOKED_SALMON = fromVersions(
    );

    public final static MaterialEntry COOKIE = fromVersions(
    );

    public final static MaterialEntry CORNFLOWER = fromVersions(
    );

    public final static MaterialEntry COW_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry CRACKED_STONE_BRICKS = fromVersions(
    );

    public final static MaterialEntry CRAFTING_TABLE = fromVersions(
    );

    public final static MaterialEntry CREEPER_BANNER_PATTERN = fromVersions(
    );

    public final static MaterialEntry CREEPER_HEAD = fromVersions(
    );

    public final static MaterialEntry CREEPER_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry CREEPER_WALL_HEAD = fromVersions(
    );

    public final static MaterialEntry CROSSBOW = fromVersions(
    );

    public final static MaterialEntry CUT_RED_SANDSTONE = fromVersions(
    );

    public final static MaterialEntry CUT_RED_SANDSTONE_SLAB = fromVersions(
    );

    public final static MaterialEntry CUT_SANDSTONE = fromVersions(
    );

    public final static MaterialEntry CUT_SANDSTONE_SLAB = fromVersions(
    );

    public final static MaterialEntry CYAN_BANNER = fromVersions(
    );

    public final static MaterialEntry CYAN_BED = fromVersions(
    );

    public final static MaterialEntry CYAN_CARPET = fromVersions(
    );

    public final static MaterialEntry CYAN_CONCRETE = fromVersions(
    );

    public final static MaterialEntry CYAN_CONCRETE_POWDER = fromVersions(
    );

    public final static MaterialEntry CYAN_DYE = fromVersions(
    );

    public final static MaterialEntry CYAN_GLAZED_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry CYAN_SHULKER_BOX = fromVersions(
    );

    public final static MaterialEntry CYAN_STAINED_GLASS = fromVersions(
    );

    public final static MaterialEntry CYAN_STAINED_GLASS_PANE = fromVersions(
    );

    public final static MaterialEntry CYAN_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry CYAN_WALL_BANNER = fromVersions(
    );

    public final static MaterialEntry CYAN_WOOL = fromVersions(
    );

    public final static MaterialEntry DAMAGED_ANVIL = fromVersions(
    );

    public final static MaterialEntry DANDELION = fromVersions(
    );

    public final static MaterialEntry DARK_OAK_BOAT = fromVersions(
    );

    public final static MaterialEntry DARK_OAK_BUTTON = fromVersions(
    );

    public final static MaterialEntry DARK_OAK_DOOR = fromVersions(
    );

    public final static MaterialEntry DARK_OAK_FENCE = fromVersions(
    );

    public final static MaterialEntry DARK_OAK_FENCE_GATE = fromVersions(
    );

    public final static MaterialEntry DARK_OAK_LEAVES = fromVersions(
    );

    public final static MaterialEntry DARK_OAK_LOG = fromVersions(
    );

    public final static MaterialEntry DARK_OAK_PLANKS = fromVersions(
    );

    public final static MaterialEntry DARK_OAK_PRESSURE_PLATE = fromVersions(
    );

    public final static MaterialEntry DARK_OAK_SAPLING = fromVersions(
    );

    public final static MaterialEntry DARK_OAK_SIGN = fromVersions(
    );

    public final static MaterialEntry DARK_OAK_SLAB = fromVersions(
    );

    public final static MaterialEntry DARK_OAK_STAIRS = fromVersions(
    );

    public final static MaterialEntry DARK_OAK_TRAPDOOR = fromVersions(
    );

    public final static MaterialEntry DARK_OAK_WALL_SIGN = fromVersions(
    );

    public final static MaterialEntry DARK_OAK_WOOD = fromVersions(
    );

    public final static MaterialEntry DARK_PRISMARINE = fromVersions(
    );

    public final static MaterialEntry DARK_PRISMARINE_SLAB = fromVersions(
    );

    public final static MaterialEntry DARK_PRISMARINE_STAIRS = fromVersions(
    );

    public final static MaterialEntry DAYLIGHT_DETECTOR = fromVersions(
    );

    public final static MaterialEntry DEAD_BRAIN_CORAL = fromVersions(
    );

    public final static MaterialEntry DEAD_BRAIN_CORAL_BLOCK = fromVersions(
    );

    public final static MaterialEntry DEAD_BRAIN_CORAL_FAN = fromVersions(
    );

    public final static MaterialEntry DEAD_BRAIN_CORAL_WALL_FAN = fromVersions(
    );

    public final static MaterialEntry DEAD_BUBBLE_CORAL = fromVersions(
    );

    public final static MaterialEntry DEAD_BUBBLE_CORAL_BLOCK = fromVersions(
    );

    public final static MaterialEntry DEAD_BUBBLE_CORAL_FAN = fromVersions(
    );

    public final static MaterialEntry DEAD_BUBBLE_CORAL_WALL_FAN = fromVersions(
    );

    public final static MaterialEntry DEAD_BUSH = fromVersions(
    );

    public final static MaterialEntry DEAD_FIRE_CORAL = fromVersions(
    );

    public final static MaterialEntry DEAD_FIRE_CORAL_BLOCK = fromVersions(
    );

    public final static MaterialEntry DEAD_FIRE_CORAL_FAN = fromVersions(
    );

    public final static MaterialEntry DEAD_FIRE_CORAL_WALL_FAN = fromVersions(
    );

    public final static MaterialEntry DEAD_HORN_CORAL = fromVersions(
    );

    public final static MaterialEntry DEAD_HORN_CORAL_BLOCK = fromVersions(
    );

    public final static MaterialEntry DEAD_HORN_CORAL_FAN = fromVersions(
    );

    public final static MaterialEntry DEAD_HORN_CORAL_WALL_FAN = fromVersions(
    );

    public final static MaterialEntry DEAD_TUBE_CORAL = fromVersions(
    );

    public final static MaterialEntry DEAD_TUBE_CORAL_BLOCK = fromVersions(
    );

    public final static MaterialEntry DEAD_TUBE_CORAL_FAN = fromVersions(
    );

    public final static MaterialEntry DEAD_TUBE_CORAL_WALL_FAN = fromVersions(
    );

    public final static MaterialEntry DEBUG_STICK = fromVersions(
    );

    public final static MaterialEntry DETECTOR_RAIL = fromVersions(
    );

    public final static MaterialEntry DIAMOND = fromVersions(
    );

    public final static MaterialEntry DIAMOND_AXE = fromVersions(
    );

    public final static MaterialEntry DIAMOND_BLOCK = fromVersions(
    );

    public final static MaterialEntry DIAMOND_BOOTS = fromVersions(
    );

    public final static MaterialEntry DIAMOND_CHESTPLATE = fromVersions(
    );

    public final static MaterialEntry DIAMOND_HELMET = fromVersions(
    );

    public final static MaterialEntry DIAMOND_HOE = fromVersions(
    );

    public final static MaterialEntry DIAMOND_HORSE_ARMOR = fromVersions(
    );

    public final static MaterialEntry DIAMOND_LEGGINGS = fromVersions(
    );

    public final static MaterialEntry DIAMOND_ORE = fromVersions(
    );

    public final static MaterialEntry DIAMOND_PICKAXE = fromVersions(
    );

    public final static MaterialEntry DIAMOND_SHOVEL = fromVersions(
    );

    public final static MaterialEntry DIAMOND_SWORD = fromVersions(
    );

    public final static MaterialEntry DIORITE = fromVersions(
    );

    public final static MaterialEntry DIORITE_SLAB = fromVersions(
    );

    public final static MaterialEntry DIORITE_STAIRS = fromVersions(
    );

    public final static MaterialEntry DIORITE_WALL = fromVersions(
    );

    public final static MaterialEntry DIRT = fromVersions(
    );

    public final static MaterialEntry DISPENSER = fromVersions(
    );

    public final static MaterialEntry DOLPHIN_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry DONKEY_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry DRAGON_BREATH = fromVersions(
    );

    public final static MaterialEntry DRAGON_EGG = fromVersions(
    );

    public final static MaterialEntry DRAGON_HEAD = fromVersions(
    );

    public final static MaterialEntry DRAGON_WALL_HEAD = fromVersions(
    );

    public final static MaterialEntry DRIED_KELP = fromVersions(
    );

    public final static MaterialEntry DRIED_KELP_BLOCK = fromVersions(
    );

    public final static MaterialEntry DROPPER = fromVersions(
    );

    public final static MaterialEntry DROWNED_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry EGG = fromVersions(
    );

    public final static MaterialEntry ELDER_GUARDIAN_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry ELYTRA = fromVersions(
    );

    public final static MaterialEntry EMERALD = fromVersions(
    );

    public final static MaterialEntry EMERALD_BLOCK = fromVersions(
    );

    public final static MaterialEntry EMERALD_ORE = fromVersions(
    );

    public final static MaterialEntry ENCHANTED_BOOK = fromVersions(
    );

    public final static MaterialEntry ENCHANTED_GOLDEN_APPLE = fromVersions(
    );

    public final static MaterialEntry ENCHANTING_TABLE = fromVersions(
    );

    public final static MaterialEntry ENDERMAN_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry ENDERMITE_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry ENDER_CHEST = fromVersions(
    );

    public final static MaterialEntry ENDER_EYE = fromVersions(
    );

    public final static MaterialEntry ENDER_PEARL = fromVersions(
    );

    public final static MaterialEntry END_CRYSTAL = fromVersions(
    );

    public final static MaterialEntry END_GATEWAY = fromVersions(
    );

    public final static MaterialEntry END_PORTAL = fromVersions(
    );

    public final static MaterialEntry END_PORTAL_FRAME = fromVersions(
    );

    public final static MaterialEntry END_ROD = fromVersions(
    );

    public final static MaterialEntry END_STONE = fromVersions(
    );

    public final static MaterialEntry END_STONE_BRICKS = fromVersions(
    );

    public final static MaterialEntry END_STONE_BRICK_SLAB = fromVersions(
    );

    public final static MaterialEntry END_STONE_BRICK_STAIRS = fromVersions(
    );

    public final static MaterialEntry END_STONE_BRICK_WALL = fromVersions(
    );

    public final static MaterialEntry EVOKER_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry EXPERIENCE_BOTTLE = fromVersions(
    );

    public final static MaterialEntry FARMLAND = fromVersions(
    );

    public final static MaterialEntry FEATHER = fromVersions(
    );

    public final static MaterialEntry FERMENTED_SPIDER_EYE = fromVersions(
    );

    public final static MaterialEntry FERN = fromVersions(
    );

    public final static MaterialEntry FILLED_MAP = fromVersions(
    );

    public final static MaterialEntry FIRE = fromVersions(
    );

    public final static MaterialEntry FIREWORK_ROCKET = fromVersions(
    );

    public final static MaterialEntry FIREWORK_STAR = fromVersions(
    );

    public final static MaterialEntry FIRE_CHARGE = fromVersions(
    );

    public final static MaterialEntry FIRE_CORAL = fromVersions(
    );

    public final static MaterialEntry FIRE_CORAL_BLOCK = fromVersions(
    );

    public final static MaterialEntry FIRE_CORAL_FAN = fromVersions(
    );

    public final static MaterialEntry FIRE_CORAL_WALL_FAN = fromVersions(
    );

    public final static MaterialEntry FISHING_ROD = fromVersions(
    );

    public final static MaterialEntry FLETCHING_TABLE = fromVersions(
    );

    public final static MaterialEntry FLINT = fromVersions(
    );

    public final static MaterialEntry FLINT_AND_STEEL = fromVersions(
    );

    public final static MaterialEntry FLOWER_BANNER_PATTERN = fromVersions(
    );

    public final static MaterialEntry FLOWER_POT = fromVersions(
    );

    public final static MaterialEntry FOX_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry FROSTED_ICE = fromVersions(
    );

    public final static MaterialEntry FURNACE = fromVersions(
    );

    public final static MaterialEntry FURNACE_MINECART = fromVersions(
    );

    public final static MaterialEntry GHAST_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry GHAST_TEAR = fromVersions(
    );

    public final static MaterialEntry GLASS = fromVersions(
    );

    public final static MaterialEntry GLASS_BOTTLE = fromVersions(
    );

    public final static MaterialEntry GLASS_PANE = fromVersions(
    );

    public final static MaterialEntry GLISTERING_MELON_SLICE = fromVersions(
    );

    public final static MaterialEntry GLOBE_BANNER_PATTERN = fromVersions(
    );

    public final static MaterialEntry GLOWSTONE = fromVersions(
    );

    public final static MaterialEntry GLOWSTONE_DUST = fromVersions(
    );

    public final static MaterialEntry GOLDEN_APPLE = fromVersions(
    );

    public final static MaterialEntry GOLDEN_AXE = fromVersions(
    );

    public final static MaterialEntry GOLDEN_BOOTS = fromVersions(
    );

    public final static MaterialEntry GOLDEN_CARROT = fromVersions(
    );

    public final static MaterialEntry GOLDEN_CHESTPLATE = fromVersions(
    );

    public final static MaterialEntry GOLDEN_HELMET = fromVersions(
    );

    public final static MaterialEntry GOLDEN_HOE = fromVersions(
    );

    public final static MaterialEntry GOLDEN_HORSE_ARMOR = fromVersions(
    );

    public final static MaterialEntry GOLDEN_LEGGINGS = fromVersions(
    );

    public final static MaterialEntry GOLDEN_PICKAXE = fromVersions(
    );

    public final static MaterialEntry GOLDEN_SHOVEL = fromVersions(
    );

    public final static MaterialEntry GOLDEN_SWORD = fromVersions(
    );

    public final static MaterialEntry GOLD_BLOCK = fromVersions(
    );

    public final static MaterialEntry GOLD_INGOT = fromVersions(
    );

    public final static MaterialEntry GOLD_NUGGET = fromVersions(
    );

    public final static MaterialEntry GOLD_ORE = fromVersions(
    );

    public final static MaterialEntry GRANITE = fromVersions(
    );

    public final static MaterialEntry GRANITE_SLAB = fromVersions(
    );

    public final static MaterialEntry GRANITE_STAIRS = fromVersions(
    );

    public final static MaterialEntry GRANITE_WALL = fromVersions(
    );

    public final static MaterialEntry GRASS = fromVersions(
    );

    public final static MaterialEntry GRASS_BLOCK = fromVersions(
    );

    public final static MaterialEntry GRASS_PATH = fromVersions(
    );

    public final static MaterialEntry GRAVEL = fromVersions(
    );

    public final static MaterialEntry GRAY_BANNER = fromVersions(
    );

    public final static MaterialEntry GRAY_BED = fromVersions(
    );

    public final static MaterialEntry GRAY_CARPET = fromVersions(
    );

    public final static MaterialEntry GRAY_CONCRETE = fromVersions(
    );

    public final static MaterialEntry GRAY_CONCRETE_POWDER = fromVersions(
    );

    public final static MaterialEntry GRAY_DYE = fromVersions(
    );

    public final static MaterialEntry GRAY_GLAZED_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry GRAY_SHULKER_BOX = fromVersions(
    );

    public final static MaterialEntry GRAY_STAINED_GLASS = fromVersions(
    );

    public final static MaterialEntry GRAY_STAINED_GLASS_PANE = fromVersions(
    );

    public final static MaterialEntry GRAY_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry GRAY_WALL_BANNER = fromVersions(
    );

    public final static MaterialEntry GRAY_WOOL = fromVersions(
    );

    public final static MaterialEntry GREEN_BANNER = fromVersions(
    );

    public final static MaterialEntry GREEN_BED = fromVersions(
    );

    public final static MaterialEntry GREEN_CARPET = fromVersions(
    );

    public final static MaterialEntry GREEN_CONCRETE = fromVersions(
    );

    public final static MaterialEntry GREEN_CONCRETE_POWDER = fromVersions(
    );

    public final static MaterialEntry GREEN_DYE = fromVersions(
    );

    public final static MaterialEntry GREEN_GLAZED_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry GREEN_SHULKER_BOX = fromVersions(
    );

    public final static MaterialEntry GREEN_STAINED_GLASS = fromVersions(
    );

    public final static MaterialEntry GREEN_STAINED_GLASS_PANE = fromVersions(
    );

    public final static MaterialEntry GREEN_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry GREEN_WALL_BANNER = fromVersions(
    );

    public final static MaterialEntry GREEN_WOOL = fromVersions(
    );

    public final static MaterialEntry GRINDSTONE = fromVersions(
    );

    public final static MaterialEntry GUARDIAN_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry GUNPOWDER = fromVersions(
    );

    public final static MaterialEntry HAY_BLOCK = fromVersions(
    );

    public final static MaterialEntry HEART_OF_THE_SEA = fromVersions(
    );

    public final static MaterialEntry HEAVY_WEIGHTED_PRESSURE_PLATE = fromVersions(
    );

    public final static MaterialEntry HOPPER = fromVersions(
    );

    public final static MaterialEntry HOPPER_MINECART = fromVersions(
    );

    public final static MaterialEntry HORN_CORAL = fromVersions(
    );

    public final static MaterialEntry HORN_CORAL_BLOCK = fromVersions(
    );

    public final static MaterialEntry HORN_CORAL_FAN = fromVersions(
    );

    public final static MaterialEntry HORN_CORAL_WALL_FAN = fromVersions(
    );

    public final static MaterialEntry HORSE_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry HUSK_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry ICE = fromVersions(
    );

    public final static MaterialEntry INFESTED_CHISELED_STONE_BRICKS = fromVersions(
    );

    public final static MaterialEntry INFESTED_COBBLESTONE = fromVersions(
    );

    public final static MaterialEntry INFESTED_CRACKED_STONE_BRICKS = fromVersions(
    );

    public final static MaterialEntry INFESTED_MOSSY_STONE_BRICKS = fromVersions(
    );

    public final static MaterialEntry INFESTED_STONE = fromVersions(
    );

    public final static MaterialEntry INFESTED_STONE_BRICKS = fromVersions(
    );

    public final static MaterialEntry INK_SAC = fromVersions(
    );

    public final static MaterialEntry IRON_AXE = fromVersions(
    );

    public final static MaterialEntry IRON_BARS = fromVersions(
    );

    public final static MaterialEntry IRON_BLOCK = fromVersions(
    );

    public final static MaterialEntry IRON_BOOTS = fromVersions(
    );

    public final static MaterialEntry IRON_CHESTPLATE = fromVersions(
    );

    public final static MaterialEntry IRON_DOOR = fromVersions(
    );

    public final static MaterialEntry IRON_HELMET = fromVersions(
    );

    public final static MaterialEntry IRON_HOE = fromVersions(
    );

    public final static MaterialEntry IRON_HORSE_ARMOR = fromVersions(
    );

    public final static MaterialEntry IRON_INGOT = fromVersions(
    );

    public final static MaterialEntry IRON_LEGGINGS = fromVersions(
    );

    public final static MaterialEntry IRON_NUGGET = fromVersions(
    );

    public final static MaterialEntry IRON_ORE = fromVersions(
    );

    public final static MaterialEntry IRON_PICKAXE = fromVersions(
    );

    public final static MaterialEntry IRON_SHOVEL = fromVersions(
    );

    public final static MaterialEntry IRON_SWORD = fromVersions(
    );

    public final static MaterialEntry IRON_TRAPDOOR = fromVersions(
    );

    public final static MaterialEntry ITEM_FRAME = fromVersions(
    );

    public final static MaterialEntry JACK_O_LANTERN = fromVersions(
    );

    public final static MaterialEntry JIGSAW = fromVersions(
    );

    public final static MaterialEntry JUKEBOX = fromVersions(
    );

    public final static MaterialEntry JUNGLE_BOAT = fromVersions(
    );

    public final static MaterialEntry JUNGLE_BUTTON = fromVersions(
    );

    public final static MaterialEntry JUNGLE_DOOR = fromVersions(
    );

    public final static MaterialEntry JUNGLE_FENCE = fromVersions(
    );

    public final static MaterialEntry JUNGLE_FENCE_GATE = fromVersions(
    );

    public final static MaterialEntry JUNGLE_LEAVES = fromVersions(
    );

    public final static MaterialEntry JUNGLE_LOG = fromVersions(
    );

    public final static MaterialEntry JUNGLE_PLANKS = fromVersions(
    );

    public final static MaterialEntry JUNGLE_PRESSURE_PLATE = fromVersions(
    );

    public final static MaterialEntry JUNGLE_SAPLING = fromVersions(
    );

    public final static MaterialEntry JUNGLE_SIGN = fromVersions(
    );

    public final static MaterialEntry JUNGLE_SLAB = fromVersions(
    );

    public final static MaterialEntry JUNGLE_STAIRS = fromVersions(
    );

    public final static MaterialEntry JUNGLE_TRAPDOOR = fromVersions(
    );

    public final static MaterialEntry JUNGLE_WALL_SIGN = fromVersions(
    );

    public final static MaterialEntry JUNGLE_WOOD = fromVersions(
    );

    public final static MaterialEntry KELP = fromVersions(
    );

    public final static MaterialEntry KELP_PLANT = fromVersions(
    );

    public final static MaterialEntry KNOWLEDGE_BOOK = fromVersions(
    );

    public final static MaterialEntry LADDER = fromVersions(
    );

    public final static MaterialEntry LANTERN = fromVersions(
    );

    public final static MaterialEntry LAPIS_BLOCK = fromVersions(
    );

    public final static MaterialEntry LAPIS_LAZULI = fromVersions(
    );

    public final static MaterialEntry LAPIS_ORE = fromVersions(
    );

    public final static MaterialEntry LARGE_FERN = fromVersions(
    );

    public final static MaterialEntry LAVA = fromVersions(
    );

    public final static MaterialEntry LAVA_BUCKET = fromVersions(
    );

    public final static MaterialEntry LEAD = fromVersions(
    );

    public final static MaterialEntry LEATHER = fromVersions(
    );

    public final static MaterialEntry LEATHER_BOOTS = fromVersions(
    );

    public final static MaterialEntry LEATHER_CHESTPLATE = fromVersions(
    );

    public final static MaterialEntry LEATHER_HELMET = fromVersions(
    );

    public final static MaterialEntry LEATHER_HORSE_ARMOR = fromVersions(
    );

    public final static MaterialEntry LEATHER_LEGGINGS = fromVersions(
    );

    public final static MaterialEntry LECTERN = fromVersions(
    );

    public final static MaterialEntry LEVER = fromVersions(
    );

    public final static MaterialEntry LIGHT_BLUE_BANNER = fromVersions(
    );

    public final static MaterialEntry LIGHT_BLUE_BED = fromVersions(
    );

    public final static MaterialEntry LIGHT_BLUE_CARPET = fromVersions(
    );

    public final static MaterialEntry LIGHT_BLUE_CONCRETE = fromVersions(
    );

    public final static MaterialEntry LIGHT_BLUE_CONCRETE_POWDER = fromVersions(
    );

    public final static MaterialEntry LIGHT_BLUE_DYE = fromVersions(
    );

    public final static MaterialEntry LIGHT_BLUE_GLAZED_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry LIGHT_BLUE_SHULKER_BOX = fromVersions(
    );

    public final static MaterialEntry LIGHT_BLUE_STAINED_GLASS = fromVersions(
    );

    public final static MaterialEntry LIGHT_BLUE_STAINED_GLASS_PANE = fromVersions(
    );

    public final static MaterialEntry LIGHT_BLUE_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry LIGHT_BLUE_WALL_BANNER = fromVersions(
    );

    public final static MaterialEntry LIGHT_BLUE_WOOL = fromVersions(
    );

    public final static MaterialEntry LIGHT_GRAY_BANNER = fromVersions(
    );

    public final static MaterialEntry LIGHT_GRAY_BED = fromVersions(
    );

    public final static MaterialEntry LIGHT_GRAY_CARPET = fromVersions(
    );

    public final static MaterialEntry LIGHT_GRAY_CONCRETE = fromVersions(
    );

    public final static MaterialEntry LIGHT_GRAY_CONCRETE_POWDER = fromVersions(
    );

    public final static MaterialEntry LIGHT_GRAY_DYE = fromVersions(
    );

    public final static MaterialEntry LIGHT_GRAY_GLAZED_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry LIGHT_GRAY_SHULKER_BOX = fromVersions(
    );

    public final static MaterialEntry LIGHT_GRAY_STAINED_GLASS = fromVersions(
    );

    public final static MaterialEntry LIGHT_GRAY_STAINED_GLASS_PANE = fromVersions(
    );

    public final static MaterialEntry LIGHT_GRAY_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry LIGHT_GRAY_WALL_BANNER = fromVersions(
    );

    public final static MaterialEntry LIGHT_GRAY_WOOL = fromVersions(
    );

    public final static MaterialEntry LIGHT_WEIGHTED_PRESSURE_PLATE = fromVersions(
    );

    public final static MaterialEntry LILAC = fromVersions(
    );

    public final static MaterialEntry LILY_OF_THE_VALLEY = fromVersions(
    );

    public final static MaterialEntry LILY_PAD = fromVersions(
    );

    public final static MaterialEntry LIME_BANNER = fromVersions(
    );

    public final static MaterialEntry LIME_BED = fromVersions(
    );

    public final static MaterialEntry LIME_CARPET = fromVersions(
    );

    public final static MaterialEntry LIME_CONCRETE = fromVersions(
    );

    public final static MaterialEntry LIME_CONCRETE_POWDER = fromVersions(
    );

    public final static MaterialEntry LIME_DYE = fromVersions(
    );

    public final static MaterialEntry LIME_GLAZED_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry LIME_SHULKER_BOX = fromVersions(
    );

    public final static MaterialEntry LIME_STAINED_GLASS = fromVersions(
    );

    public final static MaterialEntry LIME_STAINED_GLASS_PANE = fromVersions(
    );

    public final static MaterialEntry LIME_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry LIME_WALL_BANNER = fromVersions(
    );

    public final static MaterialEntry LIME_WOOL = fromVersions(
    );

    public final static MaterialEntry LINGERING_POTION = fromVersions(
    );

    public final static MaterialEntry LLAMA_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry LOOM = fromVersions(
    );

    public final static MaterialEntry MAGENTA_BANNER = fromVersions(
    );

    public final static MaterialEntry MAGENTA_BED = fromVersions(
    );

    public final static MaterialEntry MAGENTA_CARPET = fromVersions(
    );

    public final static MaterialEntry MAGENTA_CONCRETE = fromVersions(
    );

    public final static MaterialEntry MAGENTA_CONCRETE_POWDER = fromVersions(
    );

    public final static MaterialEntry MAGENTA_DYE = fromVersions(
    );

    public final static MaterialEntry MAGENTA_GLAZED_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry MAGENTA_SHULKER_BOX = fromVersions(
    );

    public final static MaterialEntry MAGENTA_STAINED_GLASS = fromVersions(
    );

    public final static MaterialEntry MAGENTA_STAINED_GLASS_PANE = fromVersions(
    );

    public final static MaterialEntry MAGENTA_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry MAGENTA_WALL_BANNER = fromVersions(
    );

    public final static MaterialEntry MAGENTA_WOOL = fromVersions(
    );

    public final static MaterialEntry MAGMA_BLOCK = fromVersions(
    );

    public final static MaterialEntry MAGMA_CREAM = fromVersions(
    );

    public final static MaterialEntry MAGMA_CUBE_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry MAP = fromVersions(
    );

    public final static MaterialEntry MELON = fromVersions(
    );

    public final static MaterialEntry MELON_SEEDS = fromVersions(
    );

    public final static MaterialEntry MELON_SLICE = fromVersions(
    );

    public final static MaterialEntry MELON_STEM = fromVersions(
    );

    public final static MaterialEntry MILK_BUCKET = fromVersions(
    );

    public final static MaterialEntry MINECART = fromVersions(
    );

    public final static MaterialEntry MOJANG_BANNER_PATTERN = fromVersions(
    );

    public final static MaterialEntry MOOSHROOM_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry MOSSY_COBBLESTONE = fromVersions(
    );

    public final static MaterialEntry MOSSY_COBBLESTONE_SLAB = fromVersions(
    );

    public final static MaterialEntry MOSSY_COBBLESTONE_STAIRS = fromVersions(
    );

    public final static MaterialEntry MOSSY_COBBLESTONE_WALL = fromVersions(
    );

    public final static MaterialEntry MOSSY_STONE_BRICKS = fromVersions(
    );

    public final static MaterialEntry MOSSY_STONE_BRICK_SLAB = fromVersions(
    );

    public final static MaterialEntry MOSSY_STONE_BRICK_STAIRS = fromVersions(
    );

    public final static MaterialEntry MOSSY_STONE_BRICK_WALL = fromVersions(
    );

    public final static MaterialEntry MOVING_PISTON = fromVersions(
    );

    public final static MaterialEntry MULE_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry MUSHROOM_STEM = fromVersions(
    );

    public final static MaterialEntry MUSHROOM_STEW = fromVersions(
    );

    public final static MaterialEntry MUSIC_DISC_11 = fromVersions(
    );

    public final static MaterialEntry MUSIC_DISC_13 = fromVersions(
    );

    public final static MaterialEntry MUSIC_DISC_BLOCKS = fromVersions(
    );

    public final static MaterialEntry MUSIC_DISC_CAT = fromVersions(
    );

    public final static MaterialEntry MUSIC_DISC_CHIRP = fromVersions(
    );

    public final static MaterialEntry MUSIC_DISC_FAR = fromVersions(
    );

    public final static MaterialEntry MUSIC_DISC_MALL = fromVersions(
    );

    public final static MaterialEntry MUSIC_DISC_MELLOHI = fromVersions(
    );

    public final static MaterialEntry MUSIC_DISC_STAL = fromVersions(
    );

    public final static MaterialEntry MUSIC_DISC_STRAD = fromVersions(
    );

    public final static MaterialEntry MUSIC_DISC_WAIT = fromVersions(
    );

    public final static MaterialEntry MUSIC_DISC_WARD = fromVersions(
    );

    public final static MaterialEntry MUTTON = fromVersions(
    );

    public final static MaterialEntry MYCELIUM = fromVersions(
    );

    public final static MaterialEntry NAME_TAG = fromVersions(
    );

    public final static MaterialEntry NAUTILUS_SHELL = fromVersions(
    );

    public final static MaterialEntry NETHERRACK = fromVersions(
    );

    public final static MaterialEntry NETHER_BRICK = fromVersions(
    );

    public final static MaterialEntry NETHER_BRICKS = fromVersions(
    );

    public final static MaterialEntry NETHER_BRICK_FENCE = fromVersions(
    );

    public final static MaterialEntry NETHER_BRICK_SLAB = fromVersions(
    );

    public final static MaterialEntry NETHER_BRICK_STAIRS = fromVersions(
    );

    public final static MaterialEntry NETHER_BRICK_WALL = fromVersions(
    );

    public final static MaterialEntry NETHER_PORTAL = fromVersions(
    );

    public final static MaterialEntry NETHER_QUARTZ_ORE = fromVersions(
    );

    public final static MaterialEntry NETHER_STAR = fromVersions(
    );

    public final static MaterialEntry NETHER_WART = fromVersions(
    );

    public final static MaterialEntry NETHER_WART_BLOCK = fromVersions(
    );

    public final static MaterialEntry NOTE_BLOCK = fromVersions(
    );

    public final static MaterialEntry OAK_BOAT = fromVersions(
    );

    public final static MaterialEntry OAK_BUTTON = fromVersions(
    );

    public final static MaterialEntry OAK_DOOR = fromVersions(
    );

    public final static MaterialEntry OAK_FENCE = fromVersions(
    );

    public final static MaterialEntry OAK_FENCE_GATE = fromVersions(
    );

    public final static MaterialEntry OAK_LEAVES = fromVersions(
    );

    public final static MaterialEntry OAK_LOG = fromVersions(
    );

    public final static MaterialEntry OAK_PLANKS = fromVersions(
    );

    public final static MaterialEntry OAK_PRESSURE_PLATE = fromVersions(
    );

    public final static MaterialEntry OAK_SAPLING = fromVersions(
    );

    public final static MaterialEntry OAK_SIGN = fromVersions(
    );

    public final static MaterialEntry OAK_SLAB = fromVersions(
    );

    public final static MaterialEntry OAK_STAIRS = fromVersions(
    );

    public final static MaterialEntry OAK_TRAPDOOR = fromVersions(
    );

    public final static MaterialEntry OAK_WALL_SIGN = fromVersions(
    );

    public final static MaterialEntry OAK_WOOD = fromVersions(
    );

    public final static MaterialEntry OBSERVER = fromVersions(
    );

    public final static MaterialEntry OBSIDIAN = fromVersions(
    );

    public final static MaterialEntry OCELOT_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry ORANGE_BANNER = fromVersions(
    );

    public final static MaterialEntry ORANGE_BED = fromVersions(
    );

    public final static MaterialEntry ORANGE_CARPET = fromVersions(
    );

    public final static MaterialEntry ORANGE_CONCRETE = fromVersions(
    );

    public final static MaterialEntry ORANGE_CONCRETE_POWDER = fromVersions(
    );

    public final static MaterialEntry ORANGE_DYE = fromVersions(
    );

    public final static MaterialEntry ORANGE_GLAZED_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry ORANGE_SHULKER_BOX = fromVersions(
    );

    public final static MaterialEntry ORANGE_STAINED_GLASS = fromVersions(
    );

    public final static MaterialEntry ORANGE_STAINED_GLASS_PANE = fromVersions(
    );

    public final static MaterialEntry ORANGE_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry ORANGE_TULIP = fromVersions(
    );

    public final static MaterialEntry ORANGE_WALL_BANNER = fromVersions(
    );

    public final static MaterialEntry ORANGE_WOOL = fromVersions(
    );

    public final static MaterialEntry OXEYE_DAISY = fromVersions(
    );

    public final static MaterialEntry PACKED_ICE = fromVersions(
    );

    public final static MaterialEntry PAINTING = fromVersions(
    );

    public final static MaterialEntry PANDA_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry PAPER = fromVersions(
    );

    public final static MaterialEntry PARROT_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry PEONY = fromVersions(
    );

    public final static MaterialEntry PETRIFIED_OAK_SLAB = fromVersions(
    );

    public final static MaterialEntry PHANTOM_MEMBRANE = fromVersions(
    );

    public final static MaterialEntry PHANTOM_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry PIG_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry PILLAGER_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry PINK_BANNER = fromVersions(
    );

    public final static MaterialEntry PINK_BED = fromVersions(
    );

    public final static MaterialEntry PINK_CARPET = fromVersions(
    );

    public final static MaterialEntry PINK_CONCRETE = fromVersions(
    );

    public final static MaterialEntry PINK_CONCRETE_POWDER = fromVersions(
    );

    public final static MaterialEntry PINK_DYE = fromVersions(
    );

    public final static MaterialEntry PINK_GLAZED_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry PINK_SHULKER_BOX = fromVersions(
    );

    public final static MaterialEntry PINK_STAINED_GLASS = fromVersions(
    );

    public final static MaterialEntry PINK_STAINED_GLASS_PANE = fromVersions(
    );

    public final static MaterialEntry PINK_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry PINK_TULIP = fromVersions(
    );

    public final static MaterialEntry PINK_WALL_BANNER = fromVersions(
    );

    public final static MaterialEntry PINK_WOOL = fromVersions(
    );

    public final static MaterialEntry PISTON = fromVersions(
    );

    public final static MaterialEntry PISTON_HEAD = fromVersions(
    );

    public final static MaterialEntry PLAYER_HEAD = fromVersions(
    );

    public final static MaterialEntry PLAYER_WALL_HEAD = fromVersions(
    );

    public final static MaterialEntry PODZOL = fromVersions(
    );

    public final static MaterialEntry POISONOUS_POTATO = fromVersions(
    );

    public final static MaterialEntry POLAR_BEAR_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry POLISHED_ANDESITE = fromVersions(
    );

    public final static MaterialEntry POLISHED_ANDESITE_SLAB = fromVersions(
    );

    public final static MaterialEntry POLISHED_ANDESITE_STAIRS = fromVersions(
    );

    public final static MaterialEntry POLISHED_DIORITE = fromVersions(
    );

    public final static MaterialEntry POLISHED_DIORITE_SLAB = fromVersions(
    );

    public final static MaterialEntry POLISHED_DIORITE_STAIRS = fromVersions(
    );

    public final static MaterialEntry POLISHED_GRANITE = fromVersions(
    );

    public final static MaterialEntry POLISHED_GRANITE_SLAB = fromVersions(
    );

    public final static MaterialEntry POLISHED_GRANITE_STAIRS = fromVersions(
    );

    public final static MaterialEntry POPPED_CHORUS_FRUIT = fromVersions(
    );

    public final static MaterialEntry POPPY = fromVersions(
    );

    public final static MaterialEntry PORKCHOP = fromVersions(
    );

    public final static MaterialEntry POTATO = fromVersions(
    );

    public final static MaterialEntry POTATOES = fromVersions(
    );

    public final static MaterialEntry POTION = fromVersions(
    );

    public final static MaterialEntry POTTED_ACACIA_SAPLING = fromVersions(
    );

    public final static MaterialEntry POTTED_ALLIUM = fromVersions(
    );

    public final static MaterialEntry POTTED_AZURE_BLUET = fromVersions(
    );

    public final static MaterialEntry POTTED_BAMBOO = fromVersions(
    );

    public final static MaterialEntry POTTED_BIRCH_SAPLING = fromVersions(
    );

    public final static MaterialEntry POTTED_BLUE_ORCHID = fromVersions(
    );

    public final static MaterialEntry POTTED_BROWN_MUSHROOM = fromVersions(
    );

    public final static MaterialEntry POTTED_CACTUS = fromVersions(
    );

    public final static MaterialEntry POTTED_CORNFLOWER = fromVersions(
    );

    public final static MaterialEntry POTTED_DANDELION = fromVersions(
    );

    public final static MaterialEntry POTTED_DARK_OAK_SAPLING = fromVersions(
    );

    public final static MaterialEntry POTTED_DEAD_BUSH = fromVersions(
    );

    public final static MaterialEntry POTTED_FERN = fromVersions(
    );

    public final static MaterialEntry POTTED_JUNGLE_SAPLING = fromVersions(
    );

    public final static MaterialEntry POTTED_LILY_OF_THE_VALLEY = fromVersions(
    );

    public final static MaterialEntry POTTED_OAK_SAPLING = fromVersions(
    );

    public final static MaterialEntry POTTED_ORANGE_TULIP = fromVersions(
    );

    public final static MaterialEntry POTTED_OXEYE_DAISY = fromVersions(
    );

    public final static MaterialEntry POTTED_PINK_TULIP = fromVersions(
    );

    public final static MaterialEntry POTTED_POPPY = fromVersions(
    );

    public final static MaterialEntry POTTED_RED_MUSHROOM = fromVersions(
    );

    public final static MaterialEntry POTTED_RED_TULIP = fromVersions(
    );

    public final static MaterialEntry POTTED_SPRUCE_SAPLING = fromVersions(
    );

    public final static MaterialEntry POTTED_WHITE_TULIP = fromVersions(
    );

    public final static MaterialEntry POTTED_WITHER_ROSE = fromVersions(
    );

    public final static MaterialEntry POWERED_RAIL = fromVersions(
    );

    public final static MaterialEntry PRISMARINE = fromVersions(
    );

    public final static MaterialEntry PRISMARINE_BRICKS = fromVersions(
    );

    public final static MaterialEntry PRISMARINE_BRICK_SLAB = fromVersions(
    );

    public final static MaterialEntry PRISMARINE_BRICK_STAIRS = fromVersions(
    );

    public final static MaterialEntry PRISMARINE_CRYSTALS = fromVersions(
    );

    public final static MaterialEntry PRISMARINE_SHARD = fromVersions(
    );

    public final static MaterialEntry PRISMARINE_SLAB = fromVersions(
    );

    public final static MaterialEntry PRISMARINE_STAIRS = fromVersions(
    );

    public final static MaterialEntry PRISMARINE_WALL = fromVersions(
    );

    public final static MaterialEntry PUFFERFISH = fromVersions(
    );

    public final static MaterialEntry PUFFERFISH_BUCKET = fromVersions(
    );

    public final static MaterialEntry PUFFERFISH_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry PUMPKIN = fromVersions(
    );

    public final static MaterialEntry PUMPKIN_PIE = fromVersions(
    );

    public final static MaterialEntry PUMPKIN_SEEDS = fromVersions(
    );

    public final static MaterialEntry PUMPKIN_STEM = fromVersions(
    );

    public final static MaterialEntry PURPLE_BANNER = fromVersions(
    );

    public final static MaterialEntry PURPLE_BED = fromVersions(
    );

    public final static MaterialEntry PURPLE_CARPET = fromVersions(
    );

    public final static MaterialEntry PURPLE_CONCRETE = fromVersions(
    );

    public final static MaterialEntry PURPLE_CONCRETE_POWDER = fromVersions(
    );

    public final static MaterialEntry PURPLE_DYE = fromVersions(
    );

    public final static MaterialEntry PURPLE_GLAZED_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry PURPLE_SHULKER_BOX = fromVersions(
    );

    public final static MaterialEntry PURPLE_STAINED_GLASS = fromVersions(
    );

    public final static MaterialEntry PURPLE_STAINED_GLASS_PANE = fromVersions(
    );

    public final static MaterialEntry PURPLE_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry PURPLE_WALL_BANNER = fromVersions(
    );

    public final static MaterialEntry PURPLE_WOOL = fromVersions(
    );

    public final static MaterialEntry PURPUR_BLOCK = fromVersions(
    );

    public final static MaterialEntry PURPUR_PILLAR = fromVersions(
    );

    public final static MaterialEntry PURPUR_SLAB = fromVersions(
    );

    public final static MaterialEntry PURPUR_STAIRS = fromVersions(
    );

    public final static MaterialEntry QUARTZ = fromVersions(
    );

    public final static MaterialEntry QUARTZ_BLOCK = fromVersions(
    );

    public final static MaterialEntry QUARTZ_PILLAR = fromVersions(
    );

    public final static MaterialEntry QUARTZ_SLAB = fromVersions(
    );

    public final static MaterialEntry QUARTZ_STAIRS = fromVersions(
    );

    public final static MaterialEntry RABBIT = fromVersions(
    );

    public final static MaterialEntry RABBIT_FOOT = fromVersions(
    );

    public final static MaterialEntry RABBIT_HIDE = fromVersions(
    );

    public final static MaterialEntry RABBIT_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry RABBIT_STEW = fromVersions(
    );

    public final static MaterialEntry RAIL = fromVersions(
    );

    public final static MaterialEntry RAVAGER_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry REDSTONE = fromVersions(
    );

    public final static MaterialEntry REDSTONE_BLOCK = fromVersions(
    );

    public final static MaterialEntry REDSTONE_LAMP = fromVersions(
    );

    public final static MaterialEntry REDSTONE_ORE = fromVersions(
    );

    public final static MaterialEntry REDSTONE_TORCH = fromVersions(
    );

    public final static MaterialEntry REDSTONE_WALL_TORCH = fromVersions(
    );

    public final static MaterialEntry REDSTONE_WIRE = fromVersions(
    );

    public final static MaterialEntry RED_BANNER = fromVersions(
    );

    public final static MaterialEntry RED_BED = fromVersions(
    );

    public final static MaterialEntry RED_CARPET = fromVersions(
    );

    public final static MaterialEntry RED_CONCRETE = fromVersions(
    );

    public final static MaterialEntry RED_CONCRETE_POWDER = fromVersions(
    );

    public final static MaterialEntry RED_DYE = fromVersions(
    );

    public final static MaterialEntry RED_GLAZED_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry RED_MUSHROOM = fromVersions(
    );

    public final static MaterialEntry RED_MUSHROOM_BLOCK = fromVersions(
    );

    public final static MaterialEntry RED_NETHER_BRICKS = fromVersions(
    );

    public final static MaterialEntry RED_NETHER_BRICK_SLAB = fromVersions(
    );

    public final static MaterialEntry RED_NETHER_BRICK_STAIRS = fromVersions(
    );

    public final static MaterialEntry RED_NETHER_BRICK_WALL = fromVersions(
    );

    public final static MaterialEntry RED_SAND = fromVersions(
    );

    public final static MaterialEntry RED_SANDSTONE = fromVersions(
    );

    public final static MaterialEntry RED_SANDSTONE_SLAB = fromVersions(
    );

    public final static MaterialEntry RED_SANDSTONE_STAIRS = fromVersions(
    );

    public final static MaterialEntry RED_SANDSTONE_WALL = fromVersions(
    );

    public final static MaterialEntry RED_SHULKER_BOX = fromVersions(
    );

    public final static MaterialEntry RED_STAINED_GLASS = fromVersions(
    );

    public final static MaterialEntry RED_STAINED_GLASS_PANE = fromVersions(
    );

    public final static MaterialEntry RED_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry RED_TULIP = fromVersions(
    );

    public final static MaterialEntry RED_WALL_BANNER = fromVersions(
    );

    public final static MaterialEntry RED_WOOL = fromVersions(
    );

    public final static MaterialEntry REPEATER = fromVersions(
    );

    public final static MaterialEntry REPEATING_COMMAND_BLOCK = fromVersions(
    );

    public final static MaterialEntry ROSE_BUSH = fromVersions(
    );

    public final static MaterialEntry ROTTEN_FLESH = fromVersions(
    );

    public final static MaterialEntry SADDLE = fromVersions(
    );

    public final static MaterialEntry SALMON = fromVersions(
    );

    public final static MaterialEntry SALMON_BUCKET = fromVersions(
    );

    public final static MaterialEntry SALMON_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry SAND = fromVersions(
    );

    public final static MaterialEntry SANDSTONE = fromVersions(
    );

    public final static MaterialEntry SANDSTONE_SLAB = fromVersions(
    );

    public final static MaterialEntry SANDSTONE_STAIRS = fromVersions(
    );

    public final static MaterialEntry SANDSTONE_WALL = fromVersions(
    );

    public final static MaterialEntry SCAFFOLDING = fromVersions(
    );

    public final static MaterialEntry SCUTE = fromVersions(
    );

    public final static MaterialEntry SEAGRASS = fromVersions(
    );

    public final static MaterialEntry SEA_LANTERN = fromVersions(
    );

    public final static MaterialEntry SEA_PICKLE = fromVersions(
    );

    public final static MaterialEntry SHEARS = fromVersions(
    );

    public final static MaterialEntry SHEEP_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry SHIELD = fromVersions(
    );

    public final static MaterialEntry SHULKER_BOX = fromVersions(
    );

    public final static MaterialEntry SHULKER_SHELL = fromVersions(
    );

    public final static MaterialEntry SHULKER_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry SILVERFISH_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry SKELETON_HORSE_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry SKELETON_SKULL = fromVersions(
    );

    public final static MaterialEntry SKELETON_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry SKELETON_WALL_SKULL = fromVersions(
    );

    public final static MaterialEntry SKULL_BANNER_PATTERN = fromVersions(
    );

    public final static MaterialEntry SLIME_BALL = fromVersions(
    );

    public final static MaterialEntry SLIME_BLOCK = fromVersions(
    );

    public final static MaterialEntry SLIME_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry SMITHING_TABLE = fromVersions(
    );

    public final static MaterialEntry SMOKER = fromVersions(
    );

    public final static MaterialEntry SMOOTH_QUARTZ = fromVersions(
    );

    public final static MaterialEntry SMOOTH_QUARTZ_SLAB = fromVersions(
    );

    public final static MaterialEntry SMOOTH_QUARTZ_STAIRS = fromVersions(
    );

    public final static MaterialEntry SMOOTH_RED_SANDSTONE = fromVersions(
    );

    public final static MaterialEntry SMOOTH_RED_SANDSTONE_SLAB = fromVersions(
    );

    public final static MaterialEntry SMOOTH_RED_SANDSTONE_STAIRS = fromVersions(
    );

    public final static MaterialEntry SMOOTH_SANDSTONE = fromVersions(
    );

    public final static MaterialEntry SMOOTH_SANDSTONE_SLAB = fromVersions(
    );

    public final static MaterialEntry SMOOTH_SANDSTONE_STAIRS = fromVersions(
    );

    public final static MaterialEntry SMOOTH_STONE = fromVersions(
    );

    public final static MaterialEntry SMOOTH_STONE_SLAB = fromVersions(
    );

    public final static MaterialEntry SNOW = fromVersions(
    );

    public final static MaterialEntry SNOWBALL = fromVersions(
    );

    public final static MaterialEntry SNOW_BLOCK = fromVersions(
    );

    public final static MaterialEntry SOUL_SAND = fromVersions(
    );

    public final static MaterialEntry SPAWNER = fromVersions(
    );

    public final static MaterialEntry SPECTRAL_ARROW = fromVersions(
    );

    public final static MaterialEntry SPIDER_EYE = fromVersions(
    );

    public final static MaterialEntry SPIDER_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry SPLASH_POTION = fromVersions(
    );

    public final static MaterialEntry SPONGE = fromVersions(
    );

    public final static MaterialEntry SPRUCE_BOAT = fromVersions(
    );

    public final static MaterialEntry SPRUCE_BUTTON = fromVersions(
    );

    public final static MaterialEntry SPRUCE_DOOR = fromVersions(
    );

    public final static MaterialEntry SPRUCE_FENCE = fromVersions(
    );

    public final static MaterialEntry SPRUCE_FENCE_GATE = fromVersions(
    );

    public final static MaterialEntry SPRUCE_LEAVES = fromVersions(
    );

    public final static MaterialEntry SPRUCE_LOG = fromVersions(
    );

    public final static MaterialEntry SPRUCE_PLANKS = fromVersions(
    );

    public final static MaterialEntry SPRUCE_PRESSURE_PLATE = fromVersions(
    );

    public final static MaterialEntry SPRUCE_SAPLING = fromVersions(
    );

    public final static MaterialEntry SPRUCE_SIGN = fromVersions(
    );

    public final static MaterialEntry SPRUCE_SLAB = fromVersions(
    );

    public final static MaterialEntry SPRUCE_STAIRS = fromVersions(
    );

    public final static MaterialEntry SPRUCE_TRAPDOOR = fromVersions(
    );

    public final static MaterialEntry SPRUCE_WALL_SIGN = fromVersions(
    );

    public final static MaterialEntry SPRUCE_WOOD = fromVersions(
    );

    public final static MaterialEntry SQUID_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry STICK = fromVersions(
    );

    public final static MaterialEntry STICKY_PISTON = fromVersions(
    );

    public final static MaterialEntry STONE = fromVersions(
    );

    public final static MaterialEntry STONECUTTER = fromVersions(
    );

    public final static MaterialEntry STONE_AXE = fromVersions(
    );

    public final static MaterialEntry STONE_BRICKS = fromVersions(
    );

    public final static MaterialEntry STONE_BRICK_SLAB = fromVersions(
    );

    public final static MaterialEntry STONE_BRICK_STAIRS = fromVersions(
    );

    public final static MaterialEntry STONE_BRICK_WALL = fromVersions(
    );

    public final static MaterialEntry STONE_BUTTON = fromVersions(
    );

    public final static MaterialEntry STONE_HOE = fromVersions(
    );

    public final static MaterialEntry STONE_PICKAXE = fromVersions(
    );

    public final static MaterialEntry STONE_PRESSURE_PLATE = fromVersions(
    );

    public final static MaterialEntry STONE_SHOVEL = fromVersions(
    );

    public final static MaterialEntry STONE_SLAB = fromVersions(
    );

    public final static MaterialEntry STONE_STAIRS = fromVersions(
    );

    public final static MaterialEntry STONE_SWORD = fromVersions(
    );

    public final static MaterialEntry STRAY_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry STRING = fromVersions(
    );

    public final static MaterialEntry STRIPPED_ACACIA_LOG = fromVersions(
    );

    public final static MaterialEntry STRIPPED_ACACIA_WOOD = fromVersions(
    );

    public final static MaterialEntry STRIPPED_BIRCH_LOG = fromVersions(
    );

    public final static MaterialEntry STRIPPED_BIRCH_WOOD = fromVersions(
    );

    public final static MaterialEntry STRIPPED_DARK_OAK_LOG = fromVersions(
    );

    public final static MaterialEntry STRIPPED_DARK_OAK_WOOD = fromVersions(
    );

    public final static MaterialEntry STRIPPED_JUNGLE_LOG = fromVersions(
    );

    public final static MaterialEntry STRIPPED_JUNGLE_WOOD = fromVersions(
    );

    public final static MaterialEntry STRIPPED_OAK_LOG = fromVersions(
    );

    public final static MaterialEntry STRIPPED_OAK_WOOD = fromVersions(
    );

    public final static MaterialEntry STRIPPED_SPRUCE_LOG = fromVersions(
    );

    public final static MaterialEntry STRIPPED_SPRUCE_WOOD = fromVersions(
    );

    public final static MaterialEntry STRUCTURE_BLOCK = fromVersions(
    );

    public final static MaterialEntry STRUCTURE_VOID = fromVersions(
    );

    public final static MaterialEntry SUGAR = fromVersions(
    );

    public final static MaterialEntry SUGAR_CANE = fromVersions(
    );

    public final static MaterialEntry SUNFLOWER = fromVersions(
    );

    public final static MaterialEntry SUSPICIOUS_STEW = fromVersions(
    );

    public final static MaterialEntry SWEET_BERRIES = fromVersions(
    );

    public final static MaterialEntry SWEET_BERRY_BUSH = fromVersions(
    );

    public final static MaterialEntry TALL_GRASS = fromVersions(
    );

    public final static MaterialEntry TALL_SEAGRASS = fromVersions(
    );

    public final static MaterialEntry TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry TIPPED_ARROW = fromVersions(
    );

    public final static MaterialEntry TNT = fromVersions(
    );

    public final static MaterialEntry TNT_MINECART = fromVersions(
    );

    public final static MaterialEntry TORCH = fromVersions(
    );

    public final static MaterialEntry TOTEM_OF_UNDYING = fromVersions(
    );

    public final static MaterialEntry TRADER_LLAMA_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry TRAPPED_CHEST = fromVersions(
    );

    public final static MaterialEntry TRIDENT = fromVersions(
    );

    public final static MaterialEntry TRIPWIRE = fromVersions(
    );

    public final static MaterialEntry TRIPWIRE_HOOK = fromVersions(
    );

    public final static MaterialEntry TROPICAL_FISH = fromVersions(
    );

    public final static MaterialEntry TROPICAL_FISH_BUCKET = fromVersions(
    );

    public final static MaterialEntry TROPICAL_FISH_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry TUBE_CORAL = fromVersions(
    );

    public final static MaterialEntry TUBE_CORAL_BLOCK = fromVersions(
    );

    public final static MaterialEntry TUBE_CORAL_FAN = fromVersions(
    );

    public final static MaterialEntry TUBE_CORAL_WALL_FAN = fromVersions(
    );

    public final static MaterialEntry TURTLE_EGG = fromVersions(
    );

    public final static MaterialEntry TURTLE_HELMET = fromVersions(
    );

    public final static MaterialEntry TURTLE_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry VEX_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry VILLAGER_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry VINDICATOR_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry VINE = fromVersions(
    );

    public final static MaterialEntry VOID_AIR = fromVersions(
    );

    public final static MaterialEntry WALL_TORCH = fromVersions(
    );

    public final static MaterialEntry WANDERING_TRADER_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry WATER = fromVersions(
    );

    public final static MaterialEntry WATER_BUCKET = fromVersions(
    );

    public final static MaterialEntry WET_SPONGE = fromVersions(
    );

    public final static MaterialEntry WHEAT = fromVersions(
    );

    public final static MaterialEntry WHEAT_SEEDS = fromVersions(
    );

    public final static MaterialEntry WHITE_BANNER = fromVersions(
    );

    public final static MaterialEntry WHITE_BED = fromVersions(
    );

    public final static MaterialEntry WHITE_CARPET = fromVersions(
    );

    public final static MaterialEntry WHITE_CONCRETE = fromVersions(
    );

    public final static MaterialEntry WHITE_CONCRETE_POWDER = fromVersions(
    );

    public final static MaterialEntry WHITE_DYE = fromVersions(
    );

    public final static MaterialEntry WHITE_GLAZED_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry WHITE_SHULKER_BOX = fromVersions(
    );

    public final static MaterialEntry WHITE_STAINED_GLASS = fromVersions(
    );

    public final static MaterialEntry WHITE_STAINED_GLASS_PANE = fromVersions(
    );

    public final static MaterialEntry WHITE_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry WHITE_TULIP = fromVersions(
    );

    public final static MaterialEntry WHITE_WALL_BANNER = fromVersions(
    );

    public final static MaterialEntry WHITE_WOOL = fromVersions(
    );

    public final static MaterialEntry WITCH_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry WITHER_ROSE = fromVersions(
    );

    public final static MaterialEntry WITHER_SKELETON_SKULL = fromVersions(
    );

    public final static MaterialEntry WITHER_SKELETON_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry WITHER_SKELETON_WALL_SKULL = fromVersions(
    );

    public final static MaterialEntry WOLF_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry WOODEN_AXE = fromVersions(
    );

    public final static MaterialEntry WOODEN_HOE = fromVersions(
    );

    public final static MaterialEntry WOODEN_PICKAXE = fromVersions(
    );

    public final static MaterialEntry WOODEN_SHOVEL = fromVersions(
    );

    public final static MaterialEntry WOODEN_SWORD = fromVersions(
    );

    public final static MaterialEntry WRITABLE_BOOK = fromVersions(
    );

    public final static MaterialEntry WRITTEN_BOOK = fromVersions(
    );

    public final static MaterialEntry YELLOW_BANNER = fromVersions(
    );

    public final static MaterialEntry YELLOW_BED = fromVersions(
    );

    public final static MaterialEntry YELLOW_CARPET = fromVersions(
    );

    public final static MaterialEntry YELLOW_CONCRETE = fromVersions(
    );

    public final static MaterialEntry YELLOW_CONCRETE_POWDER = fromVersions(
    );

    public final static MaterialEntry YELLOW_DYE = fromVersions(
    );

    public final static MaterialEntry YELLOW_GLAZED_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry YELLOW_SHULKER_BOX = fromVersions(
    );

    public final static MaterialEntry YELLOW_STAINED_GLASS = fromVersions(
    );

    public final static MaterialEntry YELLOW_STAINED_GLASS_PANE = fromVersions(
    );

    public final static MaterialEntry YELLOW_TERRACOTTA = fromVersions(
    );

    public final static MaterialEntry YELLOW_WALL_BANNER = fromVersions(
    );

    public final static MaterialEntry YELLOW_WOOL = fromVersions(
    );

    public final static MaterialEntry ZOMBIE_HEAD = fromVersions(
    );

    public final static MaterialEntry ZOMBIE_HORSE_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry ZOMBIE_PIGMAN_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry ZOMBIE_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry ZOMBIE_VILLAGER_SPAWN_EGG = fromVersions(
    );

    public final static MaterialEntry ZOMBIE_WALL_HEAD = fromVersions(
    );
}
