package io.github.chaosawakens.data;

import io.github.chaosawakens.ChaosAwakens;
import io.github.chaosawakens.common.registry.CABlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class CALanguageProvider {

    public static class EnglishAmerican extends LanguageProvider{
        @Override
        public String getName() {
            return ChaosAwakens.MODNAME + ": Language & Translations Entries";
        }

        public EnglishAmerican(DataGenerator gen) {
            super(gen, ChaosAwakens.MODID, "en_us");
        }

        @Override
        protected void addTranslations() {
            // blocks
            this.add(CABlocks.ACACIA_GATE_BLOCK.get(), "Acacia Gate Block");
            this.add(CABlocks.ACACIA_LEAF_CARPET.get(), "Acacia Leaf Carpet");
            this.add(CABlocks.ALUMINUM_BLOCK.get(), "Aluminium Block");
            this.add(CABlocks.ALUMINUM_ORE.get(), "Aluminium Ore");
            this.add(CABlocks.AMETHYST_BLOCK.get(), "Amethyst Block");
            this.add(CABlocks.AMETHYST_ORE.get(), "Amethyst Ore");
            this.add(CABlocks.APPLE_BUTTON.get(), "Apple Button");
            this.add(CABlocks.APPLE_DOOR.get(), "Apple Door");
            this.add(CABlocks.APPLE_FENCE.get(), "Apple Fence");
            this.add(CABlocks.APPLE_GATE_BLOCK.get(), "Apple Gate Block");
            this.add(CABlocks.APPLE_LEAVES.get(), "Apple Leaves");
            this.add(CABlocks.APPLE_LOG.get(), "Apple Log");
            this.add(CABlocks.APPLE_LEAF_CARPET.get(), "Apple leaf Carpet");
            this.add(CABlocks.APPLE_PRESSURE_PLATE.get(), "Apple Pressure Plate");
            this.add(CABlocks.APPLE_PLANKS.get(), "Apple Planks");
            this.add(CABlocks.APPLE_SAPLING.get(), "Apple Sapling");
            this.add(CABlocks.APPLE_SIGN.get(), "Apple Sign");
            this.add(CABlocks.APPLE_STAIRS.get(), "Apple Stairs");
            this.add(CABlocks.APPLE_SLAB.get(), "Apple Slab");
            this.add(CABlocks.APPLE_TRAPDOOR.get(), "Apple Trapdoor");
            this.add(CABlocks.APPLE_WALL_SIGN.get(), "Apple Wall Sign");
            this.add(CABlocks.APPLE_WOOD.get(), "Apple Wood");
            this.add(CABlocks.BASILISK_SCALE_BLOCK.get(), "Basilisk Scale Block");
            this.add(CABlocks.BIRCH_GATE_BLOCK.get(), "Birch Gate Block");
            this.add(CABlocks.BLOODSTONE_BLOCK.get(), "Bloodstone Block");
            this.add(CABlocks.BLACK_TERRACOTTA_BRICK_WALL.get(), "Black Terracotta Brick Wall");
            this.add(CABlocks.BLACK_TERRACOTTA_BRICK_SLAB.get(), "Black Terracotta Bricks");
            this.add(CABlocks.BLACK_TERRACOTTA_BRICKS.get(), "Black Terracotta Bricks");
            this.add(CABlocks.BLACK_TERRACOTTA_BRICK_STAIRS.get(), "Black Terracotta Stairs");
            this.add(CABlocks.BLACKSTONE_RUBY_ORE.get(), "Blackstone Ruby Ore");
            this.add(CABlocks.BLUE_BULB.get(), "Blue Bulb");
            this.add(CABlocks.BLUE_CRYSTAL_FLOWER.get(), "Blue Crystal Flower");
            this.add(CABlocks.BLUE_CRYSTAL_GROWTH.get(), "Blue Crystal Growth");
            this.add(CABlocks.BLUE_TERRACOTTA_BRICK_WALL.get(), "Blue Terracotta Brick Wall");
            this.add(CABlocks.BLUE_TERRACOTTA_BRICK_SLAB.get(), "Blue Terracotta Brick Slab");
            this.add(CABlocks.BLUE_TERRACOTTA_BRICK_STAIRS.get(), "Blue Terracotta Brick Stairs");
            this.add(CABlocks.BLUE_TERRACOTTA_BRICKS.get(), "Blue Terracotta Bricks");
            this.add(CABlocks.BROWN_ANT_NEST.get(), "Brown Ant Nest");
            this.add(CABlocks.BROWN_TERRACOTTA_BRICK_SLAB.get(), "Brown Terracotta Brick Slab");
            this.add(CABlocks.BROWN_TERRACOTTA_BRICK_STAIRS.get(), "Brown Terracotta Brick Stairs");
            this.add(CABlocks.BROWN_TERRACOTTA_BRICK_WALL.get(), "Brown Terracotta Brick Wall");
            this.add(CABlocks.BUDDING_CATS_EYE.get(), "Budding Cats Eye");
            this.add(CABlocks.BUDDING_PINK_TOURMALINE.get(), "Budding Pink Tourmaline");
            this.add(CABlocks.CATS_EYE_BLOCK.get(), "Cats Eye Block");
            this.add(CABlocks.CATS_EYE_CLUSTER.get(), "Cats Eye Cluster");
            this.add(CABlocks.CHERRY_BUTTON.get(), "Cherry Button");
            this.add(CABlocks.CHERRY_DOOR.get(), "Cherry Door");
            this.add(CABlocks.CHERRY_FENCE.get(), "Cherry Fence");
            this.add(CABlocks.CHERRY_GATE_BLOCK.get(), "Cherry Gate Block");
            this.add(CABlocks.CHERRY_LEAF_CARPET.get(), "Cherry Leaf Carpet");
            this.add(CABlocks.CHERRY_LEAVES.get(), "Cherry Leaves");
            this.add(CABlocks.CHERRY_LOG.get(), "Cherry Log");
            this.add(CABlocks.CHERRY_PLANKS.get(), "Cherry Planks");
            this.add(CABlocks.CHERRY_PRESSURE_PLATE.get(), "Cherry Pressure Plate");
            this.add(CABlocks.CHERRY_SAPLING.get(), "Cherry Sapling");
            this.add(CABlocks.CHERRY_SIGN.get(), "Cherry Sign");
            this.add(CABlocks.CHERRY_SLAB.get(), "Cherry Slab");
            this.add(CABlocks.CHERRY_STAIRS.get(), "Cherry Stairs");
            this.add(CABlocks.CHERRY_TRAPDOOR.get(), "Cherry Trapdoor");
            this.add(CABlocks.CHERRY_WALL_SIGN.get(), "Cherry Wall Sign");
            this.add(CABlocks.CHISELED_LIMESTONE_BRICK_SLAB.get(), "Chiseled Limestone Brick Slab");
            this.add(CABlocks.CHISELED_LIMESTONE_BRICKS.get(), "Chiseled Limestone Bricks");
            this.add(CABlocks.CHISELED_LIMESTONE_BRICK_STAIRS.get(), "Chiseled Limestone Brick Stairs");
            this.add(CABlocks.CHISELED_LIMESTONE_BRICK_WALL.get(), "Chiseled Limestone Brick Wall");
            this.add(CABlocks.COPPER_BLOCK.get(), "Copper Block");
            this.add(CABlocks.COPPER_ORE.get(), "Copper Ore");
            this.add(CABlocks.CORN_BODY_BLOCK.get(), "Corn Body Block");
            this.add(CABlocks.CORN_TOP_BLOCK.get(), "Corn Top Block");
            this.add(CABlocks.CRACKED_BLACK_TERRACOTTA_BRICK_SLAB.get(), "Cracked Black Terracotta Brick Slab");
            this.add(CABlocks.CRACKED_BLACK_TERRACOTTA_BRICK_STAIRS.get(), "Cracked Black Terracotta Brick Stairs");
            this.add(CABlocks.CRACKED_BLACK_TERRACOTTA_BRICK_WALL.get(), "Cracked Black Terracotta Brick Wall");
            this.add(CABlocks.CRACKED_BLACK_TERRACOTTA_BRICKS.get(), "Cracked Black Terracotta Bricks");
            this.add(CABlocks.CRACKED_BLUE_TERRACOTTA_BRICK_SLAB.get(), "Cracked Blue Terracotta Brick Slab");
            this.add(CABlocks.CRACKED_BLUE_TERRACOTTA_BRICK_STAIRS.get(), "Cracked Blue Terracotta Bricks Stairs");
            this.add(CABlocks.CRACKED_BLUE_TERRACOTTA_BRICK_WALL.get(), "Cracked Blue Terracotta Brick Wall");
            this.add(CABlocks.CRACKED_BLUE_TERRACOTTA_BRICKS.get(), "Cracked Blue Terracotta Bricks");
            this.add(CABlocks.CRACKED_BROWN_TERRACOTTA_BRICK_STAIRS.get(), "Cracked Brown Terracotta Brick Stairs");
            this.add(CABlocks.CRACKED_BROWN_TERRACOTTA_BRICK_SLAB.get(), "Cracked Brown Terracotta Brick Slab");
            this.add(CABlocks.CRACKED_BROWN_TERRACOTTA_BRICK_WALL.get(), "Cracked Brown Terracotta Brick Wall");
            this.add(CABlocks.CRACKED_BROWN_TERRACOTTA_BRICKS.get(), "Cracked Brown Terracotta Bricks");
            this.add(CABlocks.CRACKED_CYAN_TERRACOTTA_BRICK_SLAB.get(), "Cracked Cyan Terracotta Brick Slab");
            this.add(CABlocks.CRACKED_CYAN_TERRACOTTA_BRICK_STAIRS.get(), "Cracked Cyan Terracotta Brick Stairs");
            this.add(CABlocks.CRACKED_CYAN_TERRACOTTA_BRICK_WALL.get(), "Cracked Cyan Terracotta Brick Wall");
            this.add(CABlocks.CRACKED_CYAN_TERRACOTTA_BRICKS.get(), "Cracked Cyan Terracotta Bricks");
            this.add(CABlocks.CRACKED_GRAY_TERRACOTTA_BRICK_SLAB.get(), "Cracked Gray Terracotta Brick Slab");
            this.add(CABlocks.CRACKED_GRAY_TERRACOTTA_BRICK_STAIRS.get(), "Cracked Gray Terracotta Brick Stairs");
            this.add(CABlocks.CRACKED_GRAY_TERRACOTTA_BRICK_WALL.get(), "Cracked Gray Terracotta Brick Wall");
            this.add(CABlocks.CRACKED_GRAY_TERRACOTTA_BRICKS.get(), "Cracked Gray Terracotta Bricks");
            this.add(CABlocks.CRACKED_GREEN_TERRACOTTA_BRICK_SLAB.get(), "Cracked Green Terracotta Brick Slab");
            this.add(CABlocks.CRACKED_GREEN_TERRACOTTA_BRICK_STAIRS.get(), "Cracked Green Terracotta Brick Stairs");
            this.add(CABlocks.CRACKED_GREEN_TERRACOTTA_BRICK_WALL.get(), "Cracked Green Terracotta Brick Wall");
            this.add(CABlocks.CRACKED_GREEN_TERRACOTTA_BRICKS.get(), "Cracked Green Terracotta Bricks");
            this.add(CABlocks.CRACKED_LIGHT_BLUE_TERRACOTTA_BRICK_SLAB.get(), "Cracked Light Blue Terracotta Brick Slab");
            this.add(CABlocks.CRACKED_LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS.get(), "Cracked Light Blue Terracotta Brick Stairs");
            this.add(CABlocks.CRACKED_LIGHT_BLUE_TERRACOTTA_BRICK_WALL.get(), "Cracked Light Blue Terracotta Brick Wall");
            this.add(CABlocks.CRACKED_LIGHT_BLUE_TERRACOTTA_BRICKS.get(), "Cracked Light Blue Terracotta Bricks");
            this.add(CABlocks.CRACKED_LIGHT_GRAY_TERRACOTTA_BRICK_SLAB.get(), "Cracked Light Gray Terracotta Brick Slab");
            this.add(CABlocks.CRACKED_LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS.get(), "Cracked Light Gray Terracotta Brick Stairs");
            this.add(CABlocks.CRACKED_LIGHT_GRAY_TERRACOTTA_BRICK_WALL.get(), "Cracked Light Gray Terracotta Brick Wall");
            this.add(CABlocks.CRACKED_LIGHT_GRAY_TERRACOTTA_BRICKS.get(), "Cracked Light Gray Terracotta Bricks");
            this.add(CABlocks.CRACKED_LIME_TERRACOTTA_BRICK_SLAB.get(), "Cracked Lime Terracotta Brick Slab");
            this.add(CABlocks.CRACKED_LIME_TERRACOTTA_BRICK_STAIRS.get(), "Cracked Lime Terracotta Brick Stairs");
            this.add(CABlocks.CRACKED_LIME_TERRACOTTA_BRICK_WALL.get(), "Cracked Lime Terracotta Brick Wall");
            this.add(CABlocks.CRACKED_LIME_TERRACOTTA_BRICKS.get(), "Cracked Lime Terracotta Bricks");
            this.add(CABlocks.CRACKED_MAGENTA_TERRACOTTA_BRICK_SLAB.get(), "Cracked Magenta Terracotta Brick Slab");
            this.add(CABlocks.CRACKED_MAGENTA_TERRACOTTA_BRICK_STAIRS.get(), "Cracked Magenta Terracotta Brick Stairs");
            this.add(CABlocks.CRACKED_MAGENTA_TERRACOTTA_BRICK_WALL.get(), "Cracked Magenta Terracotta Brick Wall");
            this.add(CABlocks.CRACKED_MAGENTA_TERRACOTTA_BRICKS.get(), "Cracked Magenta Terracotta Bricks");
            this.add(CABlocks.CRACKED_ORANGE_TERRACOTTA_BRICK_SLAB.get(), "Cracked Orange Terracotta Brick Slab");
            this.add(CABlocks.CRACKED_ORANGE_TERRACOTTA_BRICK_STAIRS.get(), "Cracked Orange Terracotta Brick Stairs");
            this.add(CABlocks.CRACKED_ORANGE_TERRACOTTA_BRICK_WALL.get(), "Cracked Orange Terracotta Brick Wall");
            this.add(CABlocks.CRACKED_ORANGE_TERRACOTTA_BRICKS.get(), "Cracked Orange Terracotta Bricks");
            this.add(CABlocks.CRACKED_PINK_TERRACOTTA_BRICK_SLAB.get(), "Cracked Pink Terracotta Brick Slab");
            this.add(CABlocks.CRACKED_PINK_TERRACOTTA_BRICK_STAIRS.get(), "Cracked Pink Terracotta Brick Stairs");
            this.add(CABlocks.CRACKED_PINK_TERRACOTTA_BRICK_WALL.get(), "Cracked Pink Terracotta Bricks Wall");
            this.add(CABlocks.CRACKED_PINK_TERRACOTTA_BRICKS.get(), "Cracked Pink Terracotta Bricks");
            this.add(CABlocks.CRACKED_PURPLE_TERRACOTTA_BRICK_SLAB.get(), "Cracked Purple Terracotta Brick Slab");
            this.add(CABlocks.CRACKED_PURPLE_TERRACOTTA_BRICK_STAIRS.get(), "Cracked Purple Terracotta Brick Stairs");
            this.add(CABlocks.CRACKED_PURPLE_TERRACOTTA_BRICK_WALL.get(), "Cracked Purple Terracotta Brick Wall");
            this.add(CABlocks.CRACKED_PURPLE_TERRACOTTA_BRICKS.get(), "Cracked Purple Terracotta Bricks");
            this.add(CABlocks.CRACKED_RED_TERRACOTTA_BRICK_SLAB.get(), "Cracked Red Terracotta Brick Slab");
            this.add(CABlocks.CRACKED_RED_TERRACOTTA_BRICK_STAIRS.get(), "Cracked Red Terracotta Brick Stairs");
            this.add(CABlocks.CRACKED_RED_TERRACOTTA_BRICK_WALL.get(), "Cracked Red Terracotta Brick Wall");
            this.add(CABlocks.CRACKED_RED_TERRACOTTA_BRICKS.get(), "Cracked Red Terracotta Bricks");
            this.add(CABlocks.CRACKED_TERRACOTTA_BRICK_SLAB.get(), "Cracked Terracotta Brick Slab");
            this.add(CABlocks.CRACKED_TERRACOTTA_BRICK_STAIRS.get(), "Cracked Terracotta Brick Stairs");
            this.add(CABlocks.CRACKED_TERRACOTTA_BRICK_WALL.get(), "Cracked Terracotta Brick Wall");
            this.add(CABlocks.CRACKED_TERRACOTTA_BRICKS.get(), "Cracked Terracotta Bricks");
            this.add(CABlocks.CRACKED_WHITE_TERRACOTTA_BRICK_SLAB.get(), "Cracked White Terracotta Brick Slab");
            this.add(CABlocks.CRACKED_WHITE_TERRACOTTA_BRICK_STAIRS.get(), "Cracked White Terracotta Brick Stairs");
            this.add(CABlocks.CRACKED_WHITE_TERRACOTTA_BRICK_WALL.get(), "Cracked White Terracotta Brick Wall");
            this.add(CABlocks.CRACKED_WHITE_TERRACOTTA_BRICKS.get(), "Cracked White Terracotta Bricks");
            this.add(CABlocks.CRACKED_MARBLE_BRICK_SLAB.get(), "Cracked Marble Brick Slab");
            this.add(CABlocks.CRACKED_MARBLE_BRICK_STAIRS.get(), "Cracked Marble Brick Stairs");
            this.add(CABlocks.CRACKED_MARBLE_BRICK_WALL.get(), "Cracked Marble Brick Wall");
            this.add(CABlocks.CRACKED_MARBLE_BRICKS.get(), "Cracked Marble Bricks");
            this.add(CABlocks.CRACKED_YELLOW_TERRACOTTA_BRICK_SLAB.get(), "Cracked Yellow Terracotta Brick Slab");
            this.add(CABlocks.CRACKED_YELLOW_TERRACOTTA_BRICK_STAIRS.get(), "Cracked Yellow Terracotta Brick Stairs");
            this.add(CABlocks.CRACKED_YELLOW_TERRACOTTA_BRICK_WALL.get(), "Cracked Yellow Terracotta Brick Wall");
            this.add(CABlocks.CRACKED_YELLOW_TERRACOTTA_BRICKS.get(), "Cracked Yellow Terracotta Bricks");
            this.add(CABlocks.CRIMSON_GATE_BLOCK.get(), "Crimson Gate Black");
            this.add(CABlocks.CRYSTAL_CRAFTING_TABLE.get(), "Crystal Crafting Black");
            this.add(CABlocks.CRYSTAL_BUTTON.get(), "Crystal Button");
            this.add(CABlocks.CRYSTAL_ENERGY.get(), "Crystal Energy");
            this.add(CABlocks.CRYSTAL_FENCE.get(), "Crystal Fence");
            this.add(CABlocks.CRYSTAL_FENCE_GATE.get(), "Crystal Fence Gate");
            this.add(CABlocks.CRYSTAL_FURNACE.get(), "Crystal Furnace");
            this.add(CABlocks.CRYSTAL_GRASS.get(), "Crystal Grass");
            this.add(CABlocks.CRYSTAL_GRASS_BLOCK.get(), "Crystal Grass Block");
            this.add(CABlocks.CRYSTAL_LOG.get(), "Crystal Log");
            this.add(CABlocks.CRYSTAL_PLANKS.get(), "Crystal Planks");
            this.add(CABlocks.CRYSTAL_PRESSURE_PLATE.get(), "Crystal Pressure Plate");
            this.add(CABlocks.CRYSTAL_SLAB.get(), "Crystal Slab");
            this.add(CABlocks.CRYSTAL_STAIRS.get(), "Crystal Stairs");
            this.add(CABlocks.CRYSTAL_TERMITE_NEST.get(), "Crystal Termite Nest");
            this.add(CABlocks.CRYSTAL_TORCH.get(), "Crystal Torch");
            this.add(CABlocks.CRYSTAL_WOOD.get(), "Crystal Wood");
            this.add(CABlocks.CYAN_ROSE.get(), "Cyan Rose");
            this.add(CABlocks.CYAN_TERRACOTTA_BRICK_SLAB.get(), "Cyan Terracotta Brick Slab");
            this.add(CABlocks.CYAN_TERRACOTTA_BRICK_STAIRS.get(), "Cyan Terracotta Brick Stairs");
            this.add(CABlocks.CYAN_TERRACOTTA_BRICK_WALL.get(), "Cyan Terracotta Brick Wall");
            this.add(CABlocks.CYAN_TERRACOTTA_BRICKS.get(), "Cyan Terracotta Bricks");
            this.add(CABlocks.DARK_OAK_GATE_BLOCK.get(), "Dark Oak Gate Block");
            this.add(CABlocks.DARK_OAK_LEAF_CARPET.get(), "Dark Oak Leaf Carpet");
            this.add(CABlocks.DEAD_DUPLICATION_LOG.get(), "Dead Duplication Log");
            this.add(CABlocks.DEAD_DUPLICATION_WOOD.get(), "Dead Duplication Wood");
            this.add(CABlocks.DENSE_DIRT.get(), "Dense Dirt");
            this.add(CABlocks.DENSE_GRASS.get(), "Dense Grass");
            this.add(CABlocks.DENSE_GRASS_BLOCK.get(), "Dense Grass Block");
            this.add(CABlocks.DENSE_RED_ANT_NEST.get(), "Dense Red Ant Nest");
            this.add(CABlocks.DUPLICATION_BUTTON.get(), "Duplication Button");
            this.add(CABlocks.DUPLICATION_DOOR.get(), "Duplication Door");
            this.add(CABlocks.DUPLICATION_FENCE.get(), "Duplication Fence");
            this.add(CABlocks.DUPLICATION_FENCE_GATE.get(), "Duplication Fence Gate");
            this.add(CABlocks.DUPLICATION_LOG.get(), "Duplication Log");
            this.add(CABlocks.DUPLICATION_PLANKS.get(), "Duplication Planks");
            this.add(CABlocks.DUPLICATION_PRESSURE_PLATE.get(), "Duplication Pressure Plate");
            this.add(CABlocks.DUPLICATION_LEAF_CARPET.get(), "Duplication Leaf Carpet");
            this.add(CABlocks.DUPLICATION_LEAVES.get(), "Duplication Leaves");
            this.add(CABlocks.DUPLICATION_SIGN.get(), "Duplication Sign");
            this.add(CABlocks.DUPLICATION_SLAB.get(), "Duplication Slab");
            this.add(CABlocks.DUPLICATION_STAIRS.get(), "Duplication Stairs");
            this.add(CABlocks.DUPLICATION_TRAPDOOR.get(), "Duplication Trapdoor");
            this.add(CABlocks.DUPLICATION_WALL_SIGN.get(), "Duplication Wall Sign");
            this.add(CABlocks.DUPLICATION_WOOD.get(), "Duplication Wood");
            this.add(CABlocks.EMPEROR_SCORPION_SCALE_BLOCK.get(), "Emperor Scorpion Scale Block");
            this.add(CABlocks.ENDER_DRAGON_SCALE_BLOCK.get(), "Ender Dragon Scale Block");
            this.add(CABlocks.ENDER_EYE_BLOCK.get(), "Ender Eye Block");
            this.add(CABlocks.EXTREME_TORCH.get(), "Extreme Torch");
            this.add(CABlocks.FOSSILISED_ACACIA_ENT.get(), "Fossilised Acacia Ent");
            this.add(CABlocks.FOSSILISED_BAT.get(), "Fossilised Bat");
            this.add(CABlocks.FOSSILISED_BEE.get(), "Fossilised Bee");
            this.add(CABlocks.FOSSILISED_BIRD.get(), "Fossilised Bird");
            this.add(CABlocks.FOSSILISED_BLAZE.get(), "Fossilised Blaze");
            this.add(CABlocks.FOSSILISED_BIRCH_ENT.get(), "Fossilised Birch Ent");
            this.add(CABlocks.FOSSILISED_CARROT_PIG.get(), "Fossilised Carrot Pig");
            this.add(CABlocks.FOSSILISED_CAVE_SPIDER.get(), "Fossilised Cave Spider");
            this.add(CABlocks.FOSSILISED_CHICKEN.get(), "Fossilised Chicken");
            this.add(CABlocks.FOSSILISED_COD.get(), "Fossilised Cod");
            this.add(CABlocks.FOSSILISED_COW.get(), "Fossilised Cow");
            this.add(CABlocks.FOSSILISED_CREEPER.get(), "Fossilised Creeper");
            this.add(CABlocks.FOSSILISED_CRIMSON_ENT.get(), "Fossilised Crimson Ent");
            this.add(CABlocks.FOSSILISED_DARK_OAK_ENT.get(), "Fossilised Dark Oak Ent");
            this.add(CABlocks.FOSSILISED_DIMETRODON.get(), "Fossilised Dimetrodon");
            this.add(CABlocks.FOSSILISED_DOLPHIN.get(), "Fossilised Dolphin");
            this.add(CABlocks.FOSSILISED_DONKEY.get(), "Fossilised Donkey");
            this.add(CABlocks.FOSSILISED_DROWNED.get(), "Fossilised Drowned");
            this.add(CABlocks.FOSSILISED_ENDERMAN.get(), "Fossilised Enderman");
            this.add(CABlocks.FOSSILISED_ENDERMAN_END_STONE.get(), "Fossilised Enderman End Stone");
            this.add(CABlocks.FOSSILISED_ENDERMAN_NETHERRACK.get(), "Fossilised Enderman Netherrack");
            this.add(CABlocks.FOSSILISED_ENDERMITE.get(), "Fossilised Endermite");
            this.add(CABlocks.FOSSILISED_EMERALD_GATOR.get(), "Fossilised Emerald Gator");
            this.add(CABlocks.FOSSILISED_EVOKER.get(), "Fossilised Evoker");
            this.add(CABlocks.FOSSILISED_FOX.get(), "Fossilised Fox");
            this.add(CABlocks.FOSSILISED_GHAST.get(), "Fossilised Ghast");
            this.add(CABlocks.FOSSILISED_GIANT.get(), "Fossilised Giant");
            this.add(CABlocks.FOSSILISED_GOLDEN_APPLE_COW.get(), "Fossilised Golden Apple Cow");
            this.add(CABlocks.FOSSILISED_GOLDEN_CARROT_PIG.get(), "Fossilised Golden Carrot Pig");
            this.add(CABlocks.FOSSILISED_HERCULES_BEETLE.get(), "Fossilised Hercules Beetle");
            this.add(CABlocks.FOSSILISED_GUARDIAN.get(), "Fossilised Guardian");
            this.add(CABlocks.FOSSILISED_GREEN_FISH.get(), "Fossilised Green Fish");
            this.add(CABlocks.FOSSILISED_HOGLIN.get(), "Fossilised Hoglin");
            this.add(CABlocks.FOSSILISED_HORSE.get(), "Fossilised Horse");
            this.add(CABlocks.FOSSILISED_HUSK.get(), "Fossilised Husk");
            this.add(CABlocks.FOSSILISED_HUSK_SANDSTONE.get(), "Fossilised Husk Sandstone");
            this.add(CABlocks.FOSSILISED_ILLUSIONER.get(), "Fossilised Illusioner");
            this.add(CABlocks.FOSSILISED_IRON_GOLEM.get(), "Fossilised Iron Golem");
            this.add(CABlocks.FOSSILISED_JUNGLE_ENT.get(), "Fossilised Jungle Ent");
            this.add(CABlocks.FOSSILISED_LLAMA.get(), "Fossilised Llama");
            this.add(CABlocks.FOSSILISED_LAVA_EEL.get(), "Fossilised Lava Eel");
            this.add(CABlocks.FOSSILISED_MAGMA_CUBE_BLACKSTONE.get(), "Fossilised Magma Cube Blackstone");
            this.add(CABlocks.FOSSILISED_MAGMA_CUBE_NETHERRACK.get(), "Fossilised Magma Cube Netherrack");
            this.add(CABlocks.FOSSILISED_MOOSHROOM.get(), "Fossilised Mooshroom");
            this.add(CABlocks.FOSSILISED_OAK_ENT.get(), "Fossilised Oak Ent");
            this.add(CABlocks.FOSSILISED_OCELOT.get(), "Fossilised Ocelot");
            this.add(CABlocks.FOSSILISED_PANDA.get(), "Fossilised Panda");
            this.add(CABlocks.FOSSILISED_PHANTOM.get(), "Fossilised Phantom");
            this.add(CABlocks.FOSSILISED_PIG.get(), "Fossilised Pig");
            this.add(CABlocks.FOSSILISED_PIGLIN.get(), "Fossilised Piglin");
            this.add(CABlocks.FOSSILISED_PILLAGER.get(), "Fossilised Pillager");
            this.add(CABlocks.FOSSILISED_PIRAPORU.get(), "Fossilised Piraporu");
            this.add(CABlocks.FOSSILISED_PUFFERFISH.get(), "Fossilised Pufferfish");
            this.add(CABlocks.FOSSILISED_RABBIT.get(), "Fossilised Rabbit");
            this.add(CABlocks.FOSSILISED_RAVAGER.get(), "Fossilised Ravager");
            this.add(CABlocks.FOSSILISED_ROCK_FISH.get(), "Fossilised Rock Fish");
            this.add(CABlocks.FOSSILISED_RUBY_BUG.get(), "Fossilised Ruby Bug");
            this.add(CABlocks.FOSSILISED_SALMON.get(), "Fossilised Salmon");
            this.add(CABlocks.FOSSILISED_SCORPION.get(), "Fossilised Scorpion");
            this.add(CABlocks.FOSSILISED_SHEEP.get(), "Fossilised Sheep");
            this.add(CABlocks.FOSSILISED_SHULKER.get(), "Fossilised Shulker");
            this.add(CABlocks.FOSSILISED_SKELETON.get(), "Fossilised Skeleton");
            this.add(CABlocks.FOSSILISED_SKELETON_HORSE.get(), "Fossilised Skeleton Horse");
            this.add(CABlocks.FOSSILISED_SKELETON_SOUL_SOIL.get(), "Fossilised Skeleton Soul Soil");
            this.add(CABlocks.FOSSILISED_SLIME.get(), "Fossilised Slime");
            this.add(CABlocks.FOSSILISED_SPARK_FISH.get(), "Fossilised Spark Fish");
            this.add(CABlocks.FOSSILISED_SPIDER.get(), "Fossilised Spider");
            this.add(CABlocks.FOSSILISED_SPRUCE_ENT.get(), "Fossilised Spruce Ent");
            this.add(CABlocks.FOSSILISED_SQUID.get(), "Fossilised Squid");
            this.add(CABlocks.FOSSILISED_STRIDER.get(), "Fossilised Strider");
            this.add(CABlocks.FOSSILISED_TREE_FROG.get(), "Fossilised Tree Frog");
            this.add(CABlocks.FOSSILISED_TURTLE.get(), "Fossilised Turtle");
            this.add(CABlocks.FOSSILISED_TROPICAL_FISH.get(), "Fossilised Tropical Fish");
            this.add(CABlocks.FOSSILISED_VILLAGER.get(), "Fossilised Villager");
            this.add(CABlocks.FOSSILISED_VINDICATOR.get(), "Fossilised Vindicator");
            this.add(CABlocks.FOSSILISED_WANDERING_TRADER.get(), "Fossilised Wandering Trader");
            this.add(CABlocks.FOSSILISED_WARPED_ENT.get(), "Fossilised Warped Ent");
            this.add(CABlocks.FOSSILISED_WASP.get(), "Fossilised Wasp");
            this.add(CABlocks.FOSSILISED_WHALE.get(), "Fossilised Whale");
            this.add(CABlocks.FOSSILISED_WITCH.get(), "Fossilised Witch");
            this.add(CABlocks.FOSSILISED_WITHER_SKELETON.get(), "Fossilised Wither Skeleton");
            this.add(CABlocks.FOSSILISED_WOLF.get(), "Fossilised Wolf");
            this.add(CABlocks.FOSSILISED_WOOD_FISH.get(), "Fossilised Wood Fish");
            this.add(CABlocks.FOSSILISED_WTF.get(), "Fossilised WTF");
            this.add(CABlocks.FOSSILISED_ZOMBIE.get(), "Fossilised Zombie");
            this.add(CABlocks.FOSSILISED_ZOMBIE_HORSE.get(), "Fossilised Zombie Horse");
            this.add(CABlocks.FOSSILISED_ZOMBIFIED_PIGLIN.get(), "Fossilised Zombified Piglin");
            this.add(CABlocks.FROZEN_POLAR_BEAR.get(), "Frozen Polar Bear");
            this.add(CABlocks.FROZEN_SNOW_GOLEM.get(), "Frozen Snow Golem");
            this.add(CABlocks.FROZEN_STRAY.get(), "Frozen Stray");
            this.add(CABlocks.GINKGO_BUTTON.get(), "Ginko Button");
            this.add(CABlocks.GINKGO_DOOR.get(), "Ginko Door");
            this.add(CABlocks.GINKGO_FENCE.get(), "Ginko Fence");
            this.add(CABlocks.GINKGO_FENCE_GATE.get(), "Ginko Fence Gate");
            this.add(CABlocks.GINKGO_GATE_BLOCK.get(), "Ginko Gate Block");
            this.add(CABlocks.GINKGO_LEAF_CARPET.get(), "Ginko Leaf Carpet");
            this.add(CABlocks.GINKGO_LEAVES.get(), "Ginko Leaves");
            this.add(CABlocks.GINKGO_LOG.get(), "Ginko Log");
            this.add(CABlocks.GINKGO_PLANKS.get(), "Ginko Planks");
            this.add(CABlocks.GINKGO_PRESSURE_PLATE.get(), "Ginko Pressure Plate");
            this.add(CABlocks.GINKGO_SIGN.get(), "Ginko Sign");
            this.add(CABlocks.GINKGO_SLAB.get(), "Ginko Slab");
            this.add(CABlocks.GINKGO_STAIRS.get(), "Ginko Stairs");
            this.add(CABlocks.GINKGO_TRAPDOOR.get(), "Ginko Trapdoor");
            this.add(CABlocks.GINKGO_WALL_SIGN.get(), "Ginko Wall Sign");
            this.add(CABlocks.GINKGO_WOOD.get(), "Ginko Wood");
        }
    }
}