package EasyCompressorMod.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import EasyCompressorMod.items.cores.itemDefectiveHighPressureCore;
import EasyCompressorMod.items.cores.itemDefectiveLowPressureCore;
import EasyCompressorMod.items.cores.itemHighPressureCore;
import EasyCompressorMod.items.cores.itemLowPressureCore;
import EasyCompressorMod.items.otherStuff.itemCompressedAir;
import EasyCompressorMod.items.pieces.itemDiamondPiece;
import EasyCompressorMod.items.pieces.itemGoldPiece;
import EasyCompressorMod.items.pieces.itemIronPiece;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class items {

	//Create field for use
	public static Item defectiveHighPressureCore;
	public static Item defectiveLowPressureCore;
	public static Item lowPressureCore;
	public static Item highPressureCore;
	
	public static Item ironPiece;
	public static Item goldPiece;
	public static Item diamondPiece;
	
	public static Item compressedAir;
	
	public static Item betterDiamond;
	public static Item betterIronIngot;
	public static Item betterGoldIngot;
	
	//Initilize Items
	public static void init() {
		
		//Cores
		defectiveHighPressureCore = new itemDefectiveHighPressureCore(itemInfo.defectiveHighPressureCore_ID);
		defectiveLowPressureCore = new itemDefectiveLowPressureCore(itemInfo.defectiveLowPressureCore_ID);
		highPressureCore = new itemHighPressureCore(itemInfo.highPressureCore_ID);
		lowPressureCore = new itemLowPressureCore(itemInfo.lowPressureCore_ID);
		
		//Pieces
		ironPiece = new itemIronPiece(itemInfo.ironPiece_ID);
		goldPiece = new itemGoldPiece(itemInfo.goldPiece_ID);
		diamondPiece = new itemDiamondPiece(itemInfo.diamondPiece_ID);
		
		//CompressedAir
		compressedAir = new itemCompressedAir(itemInfo.compressedAir_ID);
		
		//BetterIngots
		betterDiamond = new itemCompressedAir(itemInfo.betterDiamond_ID);
		betterIronIngot = new itemCompressedAir(itemInfo.betterIronIngot_ID);
		betterGoldIngot = new itemCompressedAir(itemInfo.betterGoldIngot_ID);

	}
	
	
	//Add names
	public static void addNames() {
		
		//Cores
		LanguageRegistry.addName(defectiveHighPressureCore, itemInfo.defectiveHighPressureCore_NAME);	
		LanguageRegistry.addName(defectiveLowPressureCore, itemInfo.defectiveLowPressureCore_NAME);
		LanguageRegistry.addName(highPressureCore, itemInfo.highPressureCore_NAME);	
		LanguageRegistry.addName(lowPressureCore, itemInfo.lowPressureCore_NAME);
		
		//Pieces
		LanguageRegistry.addName(ironPiece, itemInfo.ironPiece_NAME);
		LanguageRegistry.addName(goldPiece, itemInfo.goldPiece_NAME);
		LanguageRegistry.addName(diamondPiece, itemInfo.diamondPiece_NAME);
		
		//CompressedAir
		LanguageRegistry.addName(compressedAir, itemInfo.compressedAir_NAME);
		
		//BetterIngots
		LanguageRegistry.addName(betterDiamond, itemInfo.betterDiamond_NAME);
		LanguageRegistry.addName(betterIronIngot, itemInfo.betterIronIngot_NAME);
		LanguageRegistry.addName(betterGoldIngot, itemInfo.betterGoldIngot_NAME);
	}
	
	//Register All Recipies
	public static void registerItemRecipes() {
		
		//defectiveLowPressureCore
		GameRegistry.addRecipe(new ItemStack(defectiveLowPressureCore),
			new Object[] { 	"SPS",
							"I I",
							"SIS",
							
							'S', Block.stone,
							'P', Block.pistonBase,
							'I', Item.ingotIron,
							
						 });	
		
		//defectiveHighPressureCore
		GameRegistry.addRecipe(new ItemStack(defectiveHighPressureCore),
				new Object[] { 	"GPG",
								"RDR",
								"GPG",
								
								'G', Item.ingotGold,
								'P', Block.pistonBase,
								'R', Item.redstoneRepeater,
								'D', Item.diamond,
							 });
		
		//IronBlock <- IronPiece
		GameRegistry.addRecipe(new ItemStack(Block.blockIron),
				new Object[] { 	"III",
								"III",
								"III",
								
								'I', items.ironPiece,
							 });
		
		//GoldBlock <- GoldPiece
		GameRegistry.addRecipe(new ItemStack(Block.blockGold),
				new Object[] { 	"GGG",
								"GGG",
								"GGG",
								
								'G', items.goldPiece,
							 });
		
		//DiamondBlock <- DiamondPieces
		GameRegistry.addRecipe(new ItemStack(Block.blockDiamond),
				new Object[] { 	"DDD",
								"DDD",
								"DDD",
								
								'D', items.diamondPiece,
							 });
		//betterDiamond <- DiamondPiece
		GameRegistry.addRecipe(new ItemStack(betterDiamond),
				new Object[] { 	"DDD",
								"DDD",
								"   ",
								
								'D', items.diamondPiece,
							 });
		//betterIronIngot <- IronPiece
		GameRegistry.addRecipe(new ItemStack(betterIronIngot),
				new Object[] { 	"III",
								"III",
								"   ",
								
								'I', items.ironPiece,
							 });
		//betterGoldIngot <- GoldPiece
		GameRegistry.addRecipe(new ItemStack(betterGoldIngot),
				new Object[] { 	"GGG",
								"GGG",
								"   ",
								
								'G', items.goldPiece,
							 });
	
	}
	
	//Register all Smelting Recipies
	public static void registerSmelting(){
		
		GameRegistry.addSmelting(itemInfo.defectiveLowPressureCore_DEFAULT, new ItemStack(items.lowPressureCore), 0.1f);

	}
}
