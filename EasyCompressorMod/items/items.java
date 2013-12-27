package EasyCompressorMod.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
								
								'G', items.ironPiece,
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
								
								'G', items.diamondPiece,
							 });
	
	}
	
	//Register all Smelting Recipies
	public static void registerSmelting(){
		
		GameRegistry.addSmelting(itemInfo.defectiveLowPressureCore_DEFAULT, new ItemStack(items.lowPressureCore), 0.1f);

	}
}
