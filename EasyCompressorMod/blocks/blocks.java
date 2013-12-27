package EasyCompressorMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import EasyCompressorMod.items.items;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import example.items.ItemMachine;

public class blocks {

	public static Block blockLowPressureCompressor;
	public static Block blockHighPressureCompressor;
	public static Item itemLowPressureCore;
	public static Item itemHighPressureCore;
	
	public static void init() {
		blockHighPressureCompressor = new blockHighPressureCompressor(blockInfo.highPressureCompressor_ID);
		GameRegistry.registerBlock(blockHighPressureCompressor, ItemMachine.class, blockInfo.highPressureCompressor_KEY);
		
		blockLowPressureCompressor = new blockLowPressureCompressor(blockInfo.lowPressureCompressor_ID);
		GameRegistry.registerBlock(blockLowPressureCompressor, ItemMachine.class, blockInfo.lowPressureCompressor_KEY);
		
	}
	
	public static void addNames() {
		LanguageRegistry.addName(blockHighPressureCompressor, blockInfo.highPressureCompressor_NAME);
		
		LanguageRegistry.addName(blockLowPressureCompressor, blockInfo.lowPressureCompressor_NAME);
	}
	
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
