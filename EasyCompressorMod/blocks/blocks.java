package EasyCompressorMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import EasyCompressorMod.items.itemBLOCKS;
import EasyCompressorMod.items.items;
import EasyCompressorMod.tileentity.tileEntityLowPressureCompressor;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class blocks {

	public static Block blockLowPressureCompressor;
	public static Block blockHighPressureCompressor;
	public static Block blockCompressedAir;
	public static Item itemLowPressureCore;
	public static Item itemHighPressureCore;
	
	
	//Register Tile Entities
	public static void registerTileEntities(){
		GameRegistry.registerTileEntity(tileEntityLowPressureCompressor.class, blockInfo.lowPressureCompressor_TE_KEY);
	}
		
	//Initilize Blocks
	public static void init() {
		blockHighPressureCompressor = new blockHighPressureCompressor(blockInfo.highPressureCompressor_ID);
		GameRegistry.registerBlock(blockHighPressureCompressor, itemBLOCKS.class, blockInfo.highPressureCompressor_KEY);
		
		blockLowPressureCompressor = new blockLowPressureCompressor(blockInfo.lowPressureCompressor_ID);
		GameRegistry.registerBlock(blockLowPressureCompressor, itemBLOCKS.class, blockInfo.lowPressureCompressor_KEY);
		
		blockCompressedAir = new blockCompressedAir(blockInfo.compressedAirOre_ID);
		GameRegistry.registerBlock(blockCompressedAir, itemBLOCKS.class, blockInfo.compressedAirOre_KEY);
		
	}
	
	//Add all Names 
	public static void addNames() {
		LanguageRegistry.addName(blockHighPressureCompressor, blockInfo.highPressureCompressor_NAME);
		
		LanguageRegistry.addName(blockLowPressureCompressor, blockInfo.lowPressureCompressor_NAME);
		
		LanguageRegistry.addName(blockCompressedAir, blockInfo.compressedAirOre_NAME);

	}
	
	//Register all Recipies
	public static void registerBlockRecipes() {
		GameRegistry.addRecipe(new ItemStack(blockLowPressureCompressor),
			new Object[] { 	"IPI",
							"ICI",
							"BPB",
							
							'I', Item.ingotIron,
							'P', Block.pistonBase,
							'C', items.lowPressureCore,
							'B', Block.blockIron,
							
						 });	
		GameRegistry.addRecipe(new ItemStack(blockHighPressureCompressor),
				new Object[] { 	"OPO",
								"PCP",
								"OPO",
								
								'O', Block.obsidian,
								'P', Block.pistonBase,
								'C', items.highPressureCore,
							 });	
	}
	
}
