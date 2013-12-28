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
		itemInfo.defectiveLowPressureCore_ID = config.getItem(itemInfo.defectiveLowPressureCore_KEY, itemInfo.defectiveLowPressureCore_DEFAULT).getInt() - 256;
		itemInfo.defectiveHighPressureCore_ID = config.getItem(itemInfo.defectiveHighPressureCore_KEY, itemInfo.defectiveHighPressureCore_DEFAULT).getInt() - 256;
		itemInfo.lowPressureCore_ID = config.getItem(itemInfo.lowPressureCore_KEY, itemInfo.lowPressureCore_DEFAULT).getInt() - 256;
		itemInfo.highPressureCore_ID = config.getItem(itemInfo.highPressureCore_KEY, itemInfo.highPressureCore_DEFAULT).getInt() - 256;
		
		itemInfo.ironPiece_ID = config.getItem(itemInfo.ironPiece_KEY, itemInfo.ironPiece_DEFAULT).getInt() - 256;
		itemInfo.goldPiece_ID = config.getItem(itemInfo.goldPiece_KEY, itemInfo.goldPiece_DEFAULT).getInt() - 256;
		itemInfo.diamondPiece_ID = config.getItem(itemInfo.diamondPiece_KEY, itemInfo.diamondPiece_DEFAULT).getInt() - 256;
		itemInfo.compressedAir_ID = config.getItem(itemInfo.compressedAir_KEY, itemInfo.compressedAir_DEFAULT).getInt() - 256;

		
		//Blocks
		blockInfo.highPressureCompressor_ID = config.getBlock(blockInfo.highPressureCompressor_KEY, blockInfo.highPressureCompressor_DEFAULT).getInt();
		blockInfo.lowPressureCompressor_ID = config.getBlock(blockInfo.lowPressureCompressor_KEY, blockInfo.lowPressureCompressor_DEFAULT).getInt();
		blockInfo.compressedAirOre_ID = config.getBlock(blockInfo.compressedAirOre_KEY, blockInfo.compressedAirOre_DEFAULT).getInt();
		
		
		config.save();
		
	}
	
}
