package EasyCompressorMod.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import EasyCompressorMod.blocks.blockInfo;
import EasyCompressorMod.items.itemInfo;


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
		
		//Ore/Drop
		itemInfo.compressedAir_ID = config.getItem(itemInfo.compressedAir_KEY, itemInfo.compressedAir_DEFAULT).getInt() - 256;
		
		//Ingots
		itemInfo.betterDiamond_ID = config.getItem(itemInfo.betterDiamond_KEY, itemInfo.betterDiamond_DEFAULT).getInt() - 256;
		itemInfo.betterIronIngot_ID = config.getItem(itemInfo.betterIronIngot_KEY, itemInfo.betterIronIngot_DEFAULT).getInt() - 256;
		itemInfo.betterGoldIngot_ID = config.getItem(itemInfo.betterGoldIngot_KEY, itemInfo.betterGoldIngot_DEFAULT).getInt() - 256;
		
		//Tools

		//Iron
		itemInfo.betterIronSword_ID = config.getItem(itemInfo.betterIronSword_KEY, itemInfo.betterIronSword_DEFAULT).getInt() - 256;
		itemInfo.betterIronPickaxe_ID = config.getItem(itemInfo.betterIronPickaxe_KEY, itemInfo.betterIronPickaxe_DEFAULT).getInt() - 256;
		itemInfo.betterIronAxe_ID = config.getItem(itemInfo.betterIronAxe_KEY, itemInfo.betterIronAxe_DEFAULT).getInt() - 256;
		itemInfo.betterIronHoe_ID = config.getItem(itemInfo.betterIronHoe_KEY, itemInfo.betterIronHoe_DEFAULT).getInt() - 256;
		itemInfo.betterIronShovel_ID = config.getItem(itemInfo.betterIronShovel_KEY, itemInfo.betterIronShovel_DEFAULT).getInt() - 256;
		
		//Gold
		itemInfo.betterGoldSword_ID = config.getItem(itemInfo.betterGoldSword_KEY, itemInfo.betterGoldSword_DEFAULT).getInt() - 256;
		itemInfo.betterGoldPickaxe_ID = config.getItem(itemInfo.betterGoldPickaxe_KEY, itemInfo.betterGoldPickaxe_DEFAULT).getInt() - 256;
		itemInfo.betterGoldAxe_ID = config.getItem(itemInfo.betterGoldAxe_KEY, itemInfo.betterGoldAxe_DEFAULT).getInt() - 256;
		itemInfo.betterGoldHoe_ID = config.getItem(itemInfo.betterGoldHoe_KEY, itemInfo.betterGoldHoe_DEFAULT).getInt() - 256;
		itemInfo.betterGoldShovel_ID = config.getItem(itemInfo.betterGoldShovel_KEY, itemInfo.betterGoldShovel_DEFAULT).getInt() - 256;
		
		//Diamond
		itemInfo.betterDiamondSword_ID = config.getItem(itemInfo.betterDiamondSword_KEY, itemInfo.betterDiamondSword_DEFAULT).getInt() - 256;
		itemInfo.betterDiamondPickaxe_ID = config.getItem(itemInfo.betterDiamondPickaxe_KEY, itemInfo.betterDiamondPickaxe_DEFAULT).getInt() - 256;
		itemInfo.betterDiamondAxe_ID = config.getItem(itemInfo.betterDiamondAxe_KEY, itemInfo.betterDiamondAxe_DEFAULT).getInt() - 256;
		itemInfo.betterDiamondHoe_ID = config.getItem(itemInfo.betterDiamondHoe_KEY, itemInfo.betterDiamondHoe_DEFAULT).getInt() - 256;
		itemInfo.betterDiamondShovel_ID = config.getItem(itemInfo.betterDiamondShovel_KEY, itemInfo.betterDiamondShovel_DEFAULT).getInt() - 256;
		
		
		
		
		
		
		//Blocks
		blockInfo.highPressureCompressor_ID = config.getBlock(blockInfo.highPressureCompressor_KEY, blockInfo.highPressureCompressor_DEFAULT).getInt();
		blockInfo.lowPressureCompressor_ID = config.getBlock(blockInfo.lowPressureCompressor_KEY, blockInfo.lowPressureCompressor_DEFAULT).getInt();
		blockInfo.compressedAirOre_ID = config.getBlock(blockInfo.compressedAirOre_KEY, blockInfo.compressedAirOre_DEFAULT).getInt();
		blockInfo.myLeaf_ID = config.getBlock(blockInfo.myLeaf_KEY, blockInfo.myLeaf_DEFAULT).getInt();
		blockInfo.myWood_ID = config.getBlock(blockInfo.myWood_KEY, blockInfo.myWood_DEFAULT).getInt();
		blockInfo.mySapling_ID = config.getBlock(blockInfo.mySapling_KEY, blockInfo.mySapling_DEFAULT).getInt();
		
		
		config.save();
		
	}
	
}
