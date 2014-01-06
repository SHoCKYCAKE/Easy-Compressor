package EasyCompressorMod.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import EasyCompressorMod.blocks.blockInfo;
import EasyCompressorMod.items.itemInfo;
import EasyCompressorMod.items.items;


public class configHandler {
	
	public static void init(File file) {
		Configuration config = new Configuration(file);
		
		
		config.load();
		
		//Items
		
		//Cores
		itemInfo.defectiveLowPressureCore_ID = config.getItem(itemInfo.defectiveLowPressureCore_KEY, itemInfo.defectiveLowPressureCore_DEFAULT).getInt() - 256;
		itemInfo.defectiveHighPressureCore_ID = config.getItem(itemInfo.defectiveHighPressureCore_KEY, itemInfo.defectiveHighPressureCore_DEFAULT).getInt() - 256;
		itemInfo.lowPressureCore_ID = config.getItem(itemInfo.lowPressureCore_KEY, itemInfo.lowPressureCore_DEFAULT).getInt() - 256;
		itemInfo.highPressureCore_ID = config.getItem(itemInfo.highPressureCore_KEY, itemInfo.highPressureCore_DEFAULT).getInt() - 256;
		
		//Pieces
		itemInfo.ironPiece_ID = config.getItem(itemInfo.ironPiece_KEY, itemInfo.ironPiece_DEFAULT).getInt() - 256;
		itemInfo.goldPiece_ID = config.getItem(itemInfo.goldPiece_KEY, itemInfo.goldPiece_DEFAULT).getInt() - 256;
		itemInfo.diamondPiece_ID = config.getItem(itemInfo.diamondPiece_KEY, itemInfo.diamondPiece_DEFAULT).getInt() - 256;
		itemInfo.emeraldPiece_ID = config.getItem(itemInfo.emeraldPiece_KEY, itemInfo.emeraldPiece_DEFAULT).getInt() - 256;
		itemInfo.redstonePiece_ID = config.getItem(itemInfo.redstonePiece_KEY, itemInfo.redstonePiece_DEFAULT).getInt() - 256;

		
		//Ore/Drop
		itemInfo.compressedAir_ID = config.getItem(itemInfo.compressedAir_KEY, itemInfo.compressedAir_DEFAULT).getInt() - 256;
		
		//Steel things
		itemInfo.steelIngot_ID = config.getItem(itemInfo.steelIngot_KEY, itemInfo.steelIngot_DEFAULT).getInt() - 256;
		itemInfo.steelRings_ID = config.getItem(itemInfo.steelRings_KEY, itemInfo.steelRings_DEFAULT).getInt() - 256;
		
		//Other
		itemInfo.compressedGlowstone_ID = config.getItem(itemInfo.compressedGlowstone_KEY, itemInfo.compressedGlowstone_DEFAULT).getInt() - 256;
		itemInfo.netherStarShards_ID = config.getItem(itemInfo.netherStarShards_KEY, itemInfo.netherStarShards_DEFAULT).getInt() - 256;

		
		//Ingots
		itemInfo.hardenedDiamond_ID = config.getItem(itemInfo.hardenedDiamond_KEY, itemInfo.hardenedDiamond_DEFAULT).getInt() - 256;
		itemInfo.hardenedIronIngot_ID = config.getItem(itemInfo.hardenedIronIngot_KEY, itemInfo.hardenedIronIngot_DEFAULT).getInt() - 256;
		itemInfo.hardenedGoldIngot_ID = config.getItem(itemInfo.hardenedGoldIngot_KEY, itemInfo.hardenedGoldIngot_DEFAULT).getInt() - 256;
		itemInfo.hardenedEmerald_ID = config.getItem(itemInfo.hardenedEmerald_KEY, itemInfo.hardenedEmerald_DEFAULT).getInt() - 256;
		itemInfo.hardenedRedstoneIngot_ID = config.getItem(itemInfo.hardenedRedstoneIngot_KEY, itemInfo.hardenedRedstoneIngot_DEFAULT).getInt() - 256;

		
		//Tools

		//Iron
		itemInfo.hardenedIronSword_ID = config.getItem(itemInfo.hardenedIronSword_KEY, itemInfo.hardenedIronSword_DEFAULT).getInt() - 256;
		itemInfo.hardenedIronPickaxe_ID = config.getItem(itemInfo.hardenedIronPickaxe_KEY, itemInfo.hardenedIronPickaxe_DEFAULT).getInt() - 256;
		itemInfo.hardenedIronAxe_ID = config.getItem(itemInfo.hardenedIronAxe_KEY, itemInfo.hardenedIronAxe_DEFAULT).getInt() - 256;
		itemInfo.hardenedIronHoe_ID = config.getItem(itemInfo.hardenedIronHoe_KEY, itemInfo.hardenedIronHoe_DEFAULT).getInt() - 256;
		itemInfo.hardenedIronShovel_ID = config.getItem(itemInfo.hardenedIronShovel_KEY, itemInfo.hardenedIronShovel_DEFAULT).getInt() - 256;
		
		//Gold
		itemInfo.hardenedGoldSword_ID = config.getItem(itemInfo.hardenedGoldSword_KEY, itemInfo.hardenedGoldSword_DEFAULT).getInt() - 256;
		itemInfo.hardenedGoldPickaxe_ID = config.getItem(itemInfo.hardenedGoldPickaxe_KEY, itemInfo.hardenedGoldPickaxe_DEFAULT).getInt() - 256;
		itemInfo.hardenedGoldAxe_ID = config.getItem(itemInfo.hardenedGoldAxe_KEY, itemInfo.hardenedGoldAxe_DEFAULT).getInt() - 256;
		itemInfo.hardenedGoldHoe_ID = config.getItem(itemInfo.hardenedGoldHoe_KEY, itemInfo.hardenedGoldHoe_DEFAULT).getInt() - 256;
		itemInfo.hardenedGoldShovel_ID = config.getItem(itemInfo.hardenedGoldShovel_KEY, itemInfo.hardenedGoldShovel_DEFAULT).getInt() - 256;
		
		//Diamond
		itemInfo.hardenedDiamondSword_ID = config.getItem(itemInfo.hardenedDiamondSword_KEY, itemInfo.hardenedDiamondSword_DEFAULT).getInt() - 256;
		itemInfo.hardenedDiamondPickaxe_ID = config.getItem(itemInfo.hardenedDiamondPickaxe_KEY, itemInfo.hardenedDiamondPickaxe_DEFAULT).getInt() - 256;
		itemInfo.hardenedDiamondAxe_ID = config.getItem(itemInfo.hardenedDiamondAxe_KEY, itemInfo.hardenedDiamondAxe_DEFAULT).getInt() - 256;
		itemInfo.hardenedDiamondHoe_ID = config.getItem(itemInfo.hardenedDiamondHoe_KEY, itemInfo.hardenedDiamondHoe_DEFAULT).getInt() - 256;
		itemInfo.hardenedDiamondShovel_ID = config.getItem(itemInfo.hardenedDiamondShovel_KEY, itemInfo.hardenedDiamondShovel_DEFAULT).getInt() - 256;
		
		//Emerald
		itemInfo.hardenedEmeraldSword_ID = config.getItem(itemInfo.hardenedEmeraldSword_KEY, itemInfo.hardenedEmeraldSword_DEFAULT).getInt() - 256;
		itemInfo.hardenedEmeraldPickaxe_ID = config.getItem(itemInfo.hardenedEmeraldPickaxe_KEY, itemInfo.hardenedEmeraldPickaxe_DEFAULT).getInt() - 256;
		itemInfo.hardenedEmeraldAxe_ID = config.getItem(itemInfo.hardenedEmeraldAxe_KEY, itemInfo.hardenedEmeraldAxe_DEFAULT).getInt() - 256;
		itemInfo.hardenedEmeraldHoe_ID = config.getItem(itemInfo.hardenedEmeraldHoe_KEY, itemInfo.hardenedEmeraldHoe_DEFAULT).getInt() - 256;
		itemInfo.hardenedEmeraldShovel_ID = config.getItem(itemInfo.hardenedEmeraldShovel_KEY, itemInfo.hardenedEmeraldShovel_DEFAULT).getInt() - 256;
		
		//Redstone
		itemInfo.hardenedRedstoneSword_ID = config.getItem(itemInfo.hardenedRedstoneSword_KEY, itemInfo.hardenedRedstoneSword_DEFAULT).getInt() - 256;
		itemInfo.hardenedRedstonePickaxe_ID = config.getItem(itemInfo.hardenedRedstonePickaxe_KEY, itemInfo.hardenedRedstonePickaxe_DEFAULT).getInt() - 256;
		itemInfo.hardenedRedstoneAxe_ID = config.getItem(itemInfo.hardenedRedstoneAxe_KEY, itemInfo.hardenedRedstoneAxe_DEFAULT).getInt() - 256;
		itemInfo.hardenedRedstoneHoe_ID = config.getItem(itemInfo.hardenedRedstoneHoe_KEY, itemInfo.hardenedRedstoneHoe_DEFAULT).getInt() - 256;
		itemInfo.hardenedRedstoneShovel_ID = config.getItem(itemInfo.hardenedRedstoneShovel_KEY, itemInfo.hardenedRedstoneShovel_DEFAULT).getInt() - 256;
		
		//Nether Star
		itemInfo.netherStarSword_ID = config.getItem(itemInfo.netherStarSword_KEY, itemInfo.netherStarSword_DEFAULT).getInt() - 256;
		itemInfo.netherStarPickaxe_ID = config.getItem(itemInfo.netherStarPickaxe_KEY, itemInfo.netherStarPickaxe_DEFAULT).getInt() - 256;
		itemInfo.netherStarAxe_ID = config.getItem(itemInfo.netherStarAxe_KEY, itemInfo.netherStarAxe_DEFAULT).getInt() - 256;
		itemInfo.netherStarHoe_ID = config.getItem(itemInfo.netherStarHoe_KEY, itemInfo.netherStarHoe_DEFAULT).getInt() - 256;
		itemInfo.netherStarShovel_ID = config.getItem(itemInfo.netherStarShovel_KEY, itemInfo.netherStarShovel_DEFAULT).getInt() - 256;

		
		
		
		//Armor
		
		//Iron
		itemInfo.hardenedIronHelmet_ID = config.getItem(itemInfo.hardenedIronHelmet_KEY, itemInfo.hardenedIronHelmet_DEFAULT).getInt() - 256;
		itemInfo.hardenedIronChestplate_ID = config.getItem(itemInfo.hardenedIronChestplate_KEY, itemInfo.hardenedIronChestplate_DEFAULT).getInt() - 256;
		itemInfo.hardenedIronLeggings_ID = config.getItem(itemInfo.hardenedIronLeggings_KEY, itemInfo.hardenedIronLeggings_DEFAULT).getInt() - 256;
		itemInfo.hardenedIronBoots_ID = config.getItem(itemInfo.hardenedIronBoots_KEY, itemInfo.hardenedIronBoots_DEFAULT).getInt() - 256; 
		
		//Gold
		itemInfo.hardenedGoldHelmet_ID = config.getItem(itemInfo.hardenedGoldHelmet_KEY, itemInfo.hardenedGoldHelmet_DEFAULT).getInt() - 256;
		itemInfo.hardenedGoldChestplate_ID = config.getItem(itemInfo.hardenedGoldChestplate_KEY, itemInfo.hardenedGoldChestplate_DEFAULT).getInt() - 256;
		itemInfo.hardenedGoldLeggings_ID = config.getItem(itemInfo.hardenedGoldLeggings_KEY, itemInfo.hardenedGoldLeggings_DEFAULT).getInt() - 256;
		itemInfo.hardenedGoldBoots_ID = config.getItem(itemInfo.hardenedGoldBoots_KEY, itemInfo.hardenedGoldBoots_DEFAULT).getInt() - 256; 
		
		//Diamond
		itemInfo.hardenedDiamondHelmet_ID = config.getItem(itemInfo.hardenedDiamondHelmet_KEY, itemInfo.hardenedDiamondHelmet_DEFAULT).getInt() - 256;
		itemInfo.hardenedDiamondChestplate_ID = config.getItem(itemInfo.hardenedDiamondChestplate_KEY, itemInfo.hardenedDiamondChestplate_DEFAULT).getInt() - 256;
		itemInfo.hardenedDiamondLeggings_ID = config.getItem(itemInfo.hardenedDiamondLeggings_KEY, itemInfo.hardenedDiamondLeggings_DEFAULT).getInt() - 256;
		itemInfo.hardenedDiamondBoots_ID = config.getItem(itemInfo.hardenedDiamondBoots_KEY, itemInfo.hardenedDiamondBoots_DEFAULT).getInt() - 256; 
		
		//Emerald
		itemInfo.hardenedEmeraldHelmet_ID = config.getItem(itemInfo.hardenedEmeraldHelmet_KEY, itemInfo.hardenedEmeraldHelmet_DEFAULT).getInt() - 256;
		itemInfo.hardenedEmeraldChestplate_ID = config.getItem(itemInfo.hardenedEmeraldChestplate_KEY, itemInfo.hardenedEmeraldChestplate_DEFAULT).getInt() - 256;
		itemInfo.hardenedEmeraldLeggings_ID = config.getItem(itemInfo.hardenedEmeraldLeggings_KEY, itemInfo.hardenedEmeraldLeggings_DEFAULT).getInt() - 256;
		itemInfo.hardenedEmeraldBoots_ID = config.getItem(itemInfo.hardenedEmeraldBoots_KEY, itemInfo.hardenedEmeraldBoots_DEFAULT).getInt() - 256; 
		
		//Redstone
		itemInfo.hardenedRedstoneHelmet_ID = config.getItem(itemInfo.hardenedRedstoneHelmet_KEY, itemInfo.hardenedRedstoneHelmet_DEFAULT).getInt() - 256;
		itemInfo.hardenedRedstoneChestplate_ID = config.getItem(itemInfo.hardenedRedstoneChestplate_KEY, itemInfo.hardenedRedstoneChestplate_DEFAULT).getInt() - 256;
		itemInfo.hardenedRedstoneLeggings_ID = config.getItem(itemInfo.hardenedRedstoneLeggings_KEY, itemInfo.hardenedRedstoneLeggings_DEFAULT).getInt() - 256;
		itemInfo.hardenedRedstoneBoots_ID = config.getItem(itemInfo.hardenedRedstoneBoots_KEY, itemInfo.hardenedRedstoneBoots_DEFAULT).getInt() - 256; 
		
		//Nether Star
		itemInfo.netherStarHelmet_ID = config.getItem(itemInfo.netherStarHelmet_KEY, itemInfo.netherStarHelmet_DEFAULT).getInt() - 256;
		itemInfo.netherStarChestplate_ID = config.getItem(itemInfo.netherStarChestplate_KEY, itemInfo.netherStarChestplate_DEFAULT).getInt() - 256;
		itemInfo.netherStarLeggings_ID = config.getItem(itemInfo.netherStarLeggings_KEY, itemInfo.netherStarLeggings_DEFAULT).getInt() - 256;
		itemInfo.netherStarBoots_ID = config.getItem(itemInfo.netherStarBoots_KEY, itemInfo.netherStarBoots_DEFAULT).getInt() - 256; 
		
		
       	//Blocks
		blockInfo.highPressureCompressor_ID = config.getBlock(blockInfo.highPressureCompressor_KEY, blockInfo.highPressureCompressor_DEFAULT).getInt();
		blockInfo.lowPressureCompressor_ID = config.getBlock(blockInfo.lowPressureCompressor_KEY, blockInfo.lowPressureCompressor_DEFAULT).getInt();
		blockInfo.compressedAirOre_ID = config.getBlock(blockInfo.compressedAirOre_KEY, blockInfo.compressedAirOre_DEFAULT).getInt();
		blockInfo.myLeaf_ID = config.getBlock(blockInfo.myLeaf_KEY, blockInfo.myLeaf_DEFAULT).getInt();
		blockInfo.myWood_ID = config.getBlock(blockInfo.myWood_KEY, blockInfo.myWood_DEFAULT).getInt();
		blockInfo.mySapling_ID = config.getBlock(blockInfo.mySapling_KEY, blockInfo.mySapling_DEFAULT).getInt();
		blockInfo.hardenedGlass_ID = config.getBlock(blockInfo.hardenedGlass_KEY, blockInfo.hardenedGlass_DEFAULT).getInt();
		blockInfo.glowstoneLamp_ID = config.getBlock(blockInfo.glowstoneLamp_KEY, blockInfo.glowstoneLamp_DEFAULT).getInt();

		
		
		
		
		final String BOOLEANS = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "booleans";
		//ALLOW TO DISABLE BLOCK CRAFTING
		items.blockCrafting = config.get(BOOLEANS, "Disable Block Crafting (default = false)", false).getBoolean(false);
		
		
		config.save();
		
	}
	
}
