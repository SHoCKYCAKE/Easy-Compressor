package EasyCompressorMod.items;

import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import EasyCompressorMod.armor.betterDiamondArmor.betterDiamondBoots;
import EasyCompressorMod.armor.betterDiamondArmor.betterDiamondChestplate;
import EasyCompressorMod.armor.betterDiamondArmor.betterDiamondHelmet;
import EasyCompressorMod.armor.betterDiamondArmor.betterDiamondLeggings;
import EasyCompressorMod.armor.betterGoldArmor.betterGoldBoots;
import EasyCompressorMod.armor.betterGoldArmor.betterGoldChestplate;
import EasyCompressorMod.armor.betterGoldArmor.betterGoldHelmet;
import EasyCompressorMod.armor.betterGoldArmor.betterGoldLeggings;
import EasyCompressorMod.armor.betterIronArmor.betterIronBoots;
import EasyCompressorMod.armor.betterIronArmor.betterIronChestplate;
import EasyCompressorMod.armor.betterIronArmor.betterIronHelmet;
import EasyCompressorMod.armor.betterIronArmor.betterIronLeggings;
import EasyCompressorMod.blocks.blocks;
import EasyCompressorMod.items.betterIngots.betterDiamond;
import EasyCompressorMod.items.betterIngots.betterGoldIngot;
import EasyCompressorMod.items.betterIngots.betterIronIngot;
import EasyCompressorMod.items.cores.itemDefectiveHighPressureCore;
import EasyCompressorMod.items.cores.itemDefectiveLowPressureCore;
import EasyCompressorMod.items.cores.itemHighPressureCore;
import EasyCompressorMod.items.cores.itemLowPressureCore;
import EasyCompressorMod.items.otherStuff.itemCompressedAir;
import EasyCompressorMod.items.pieces.itemDiamondPiece;
import EasyCompressorMod.items.pieces.itemGoldPiece;
import EasyCompressorMod.items.pieces.itemIronPiece;
import EasyCompressorMod.tools.betterDiamondTools.betterDiamondAxe;
import EasyCompressorMod.tools.betterDiamondTools.betterDiamondHoe;
import EasyCompressorMod.tools.betterDiamondTools.betterDiamondPickaxe;
import EasyCompressorMod.tools.betterDiamondTools.betterDiamondShovel;
import EasyCompressorMod.tools.betterDiamondTools.betterDiamondSword;
import EasyCompressorMod.tools.betterGoldTools.betterGoldAxe;
import EasyCompressorMod.tools.betterGoldTools.betterGoldHoe;
import EasyCompressorMod.tools.betterGoldTools.betterGoldPickaxe;
import EasyCompressorMod.tools.betterGoldTools.betterGoldShovel;
import EasyCompressorMod.tools.betterGoldTools.betterGoldSword;
import EasyCompressorMod.tools.betterIronTools.betterIronAxe;
import EasyCompressorMod.tools.betterIronTools.betterIronHoe;
import EasyCompressorMod.tools.betterIronTools.betterIronPickaxe;
import EasyCompressorMod.tools.betterIronTools.betterIronShovel;
import EasyCompressorMod.tools.betterIronTools.betterIronSword;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class items {
	
	//For my Tools
	//Better Iron
	public static EnumToolMaterial betterIronMaterial = EnumHelper.addToolMaterial("betterIron", 2, 546, 6.5F, 2.5F, 15);
	
	//Better Gold
	public static EnumToolMaterial betterGoldMaterial = EnumHelper.addToolMaterial("betterGold", 0, 80, 14.5F, 0.5F, 22);
	
	//Better Diamond
	public static EnumToolMaterial betterDiamondMaterial = EnumHelper.addToolMaterial("betterDiamond", 3, 3200, 9.7F, 3.4F, 13);

	
	//For Armor
	//Better Iron
	public static EnumArmorMaterial betterIronArmorMaterial = EnumHelper.addArmorMaterial("betterArmorIron", 30, new int[] {3, 7, 6, 3}, 16);
	
	//Better Gold
	public static EnumArmorMaterial betterGoldArmorMaterial = EnumHelper.addArmorMaterial("betterArmorGold", 14, new int[] {2, 6, 4, 1}, 30);

	//Better Diamond
	public static EnumArmorMaterial betterDiamondArmorMaterial = EnumHelper.addArmorMaterial("betterArmorDiamond", 67, new int[] {3, 9, 6, 3}, 15);

	
	
	
	//Create field for use
	
	//Cores
	public static Item defectiveHighPressureCore;
	public static Item defectiveLowPressureCore;
	public static Item lowPressureCore;
	public static Item highPressureCore;
	
	//Pieces
	public static Item ironPiece;
	public static Item goldPiece;
	public static Item diamondPiece;
	
	//Ore/Drop
	public static Item compressedAir;
	
	//Ingots
	public static Item betterDiamond;
	public static Item betterIronIngot;
	public static Item betterGoldIngot;
	
	//Tools
	
	//Iron
	public static Item betterIronSword;
	public static Item betterIronPickaxe;
	public static Item betterIronAxe;
	public static Item betterIronHoe;
	public static Item betterIronShovel;
	
	//Gold
	public static Item betterGoldSword;
	public static Item betterGoldPickaxe;
	public static Item betterGoldAxe;
	public static Item betterGoldHoe;
	public static Item betterGoldShovel;
	
	//Diamond
	public static Item betterDiamondSword;
	public static Item betterDiamondPickaxe;
	public static Item betterDiamondAxe;
	public static Item betterDiamondHoe;
	public static Item betterDiamondShovel;
	
	//Armor
	
	//Iron
	public static Item betterIronHelmet;
	public static Item betterIronChestplate;
	public static Item betterIronLeggings;
	public static Item betterIronBoots;
	
	//Gold
	public static Item betterGoldHelmet;
	public static Item betterGoldChestplate;
	public static Item betterGoldLeggings;
	public static Item betterGoldBoots;
	
	//Diamond
	public static Item betterDiamondHelmet;
	public static Item betterDiamondChestplate;
	public static Item betterDiamondLeggings;
	public static Item betterDiamondBoots;
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
		betterDiamond = new betterDiamond(itemInfo.betterDiamond_ID);
		betterIronIngot = new betterIronIngot(itemInfo.betterIronIngot_ID);
		betterGoldIngot = new betterGoldIngot(itemInfo.betterGoldIngot_ID);
		
		//Tools

		//Iron
		betterIronSword = new betterIronSword(itemInfo.betterIronSword_ID, betterIronMaterial);
		betterIronPickaxe = new betterIronPickaxe(itemInfo.betterIronPickaxe_ID, betterIronMaterial);
		betterIronAxe = new betterIronAxe(itemInfo.betterIronAxe_ID, betterIronMaterial);
		betterIronHoe = new betterIronHoe(itemInfo.betterIronHoe_ID, betterIronMaterial);
		betterIronShovel = new betterIronShovel(itemInfo.betterIronShovel_ID, betterIronMaterial);
		
		//Gold
		betterGoldSword = new betterGoldSword(itemInfo.betterGoldSword_ID, betterGoldMaterial);
		betterGoldPickaxe = new betterGoldPickaxe(itemInfo.betterGoldPickaxe_ID, betterGoldMaterial);
		betterGoldAxe = new betterGoldAxe(itemInfo.betterGoldAxe_ID, betterGoldMaterial);
		betterGoldHoe = new betterGoldHoe(itemInfo.betterGoldHoe_ID, betterGoldMaterial);
		betterGoldShovel = new betterGoldShovel(itemInfo.betterGoldShovel_ID, betterGoldMaterial);
		
		//Diamond
		betterDiamondSword = new betterDiamondSword(itemInfo.betterDiamondSword_ID, betterDiamondMaterial);
		betterDiamondPickaxe = new betterDiamondPickaxe(itemInfo.betterDiamondPickaxe_ID, betterDiamondMaterial);
		betterDiamondAxe = new betterDiamondAxe(itemInfo.betterDiamondAxe_ID, betterDiamondMaterial);
		betterDiamondHoe = new betterDiamondHoe(itemInfo.betterDiamondHoe_ID, betterDiamondMaterial);
		betterDiamondShovel = new betterDiamondShovel(itemInfo.betterDiamondShovel_ID, betterDiamondMaterial);

		
		//Armour
		
		//Iron
		betterIronHelmet = new betterIronHelmet(itemInfo.betterIronHelmet_ID, betterIronArmorMaterial, 3, 0);
		betterIronChestplate = new betterIronChestplate(itemInfo.betterIronChestplate_ID, betterIronArmorMaterial, 3 ,1);
		betterIronLeggings = new betterIronLeggings(itemInfo.betterIronLeggings_ID, betterIronArmorMaterial, 3 ,2);
		betterIronBoots = new betterIronBoots(itemInfo.betterIronBoots_ID, betterIronArmorMaterial, 3 , 3);
		
		//Gold
		betterGoldHelmet = new betterGoldHelmet(itemInfo.betterGoldHelmet_ID, betterGoldArmorMaterial, 3, 0);
		betterGoldChestplate = new betterGoldChestplate(itemInfo.betterGoldChestplate_ID, betterGoldArmorMaterial, 3 ,1);
		betterGoldLeggings = new betterGoldLeggings(itemInfo.betterGoldLeggings_ID, betterGoldArmorMaterial, 3 ,2);
		betterGoldBoots = new betterGoldBoots(itemInfo.betterGoldBoots_ID, betterGoldArmorMaterial, 3 , 3);
		
		//Diamond
		betterDiamondHelmet = new betterDiamondHelmet(itemInfo.betterDiamondHelmet_ID, betterDiamondArmorMaterial, 3, 0);
		betterDiamondChestplate = new betterDiamondChestplate(itemInfo.betterDiamondChestplate_ID, betterDiamondArmorMaterial, 3 ,1);
		betterDiamondLeggings = new betterDiamondLeggings(itemInfo.betterDiamondLeggings_ID, betterDiamondArmorMaterial, 3 ,2);
		betterDiamondBoots = new betterDiamondBoots(itemInfo.betterDiamondBoots_ID, betterDiamondArmorMaterial, 3 , 3);
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
		
		//Tools
		
		//Iron
		LanguageRegistry.addName(betterIronSword, itemInfo.betterIronSword_NAME);
		LanguageRegistry.addName(betterIronPickaxe, itemInfo.betterIronPickaxe_NAME);
		LanguageRegistry.addName(betterIronAxe, itemInfo.betterIronAxe_NAME);
		LanguageRegistry.addName(betterIronHoe, itemInfo.betterIronHoe_NAME);
		LanguageRegistry.addName(betterIronShovel, itemInfo.betterIronShovel_NAME);
		
		//Gold
		LanguageRegistry.addName(betterGoldSword, itemInfo.betterGoldSword_NAME);
		LanguageRegistry.addName(betterGoldPickaxe, itemInfo.betterGoldPickaxe_NAME);
		LanguageRegistry.addName(betterGoldAxe, itemInfo.betterGoldAxe_NAME);
		LanguageRegistry.addName(betterGoldHoe, itemInfo.betterGoldHoe_NAME);
		LanguageRegistry.addName(betterGoldShovel, itemInfo.betterGoldShovel_NAME);
		
		//Diamond
		LanguageRegistry.addName(betterDiamondSword, itemInfo.betterDiamondSword_NAME);
		LanguageRegistry.addName(betterDiamondPickaxe, itemInfo.betterDiamondPickaxe_NAME);
		LanguageRegistry.addName(betterDiamondAxe, itemInfo.betterDiamondAxe_NAME);
		LanguageRegistry.addName(betterDiamondHoe, itemInfo.betterDiamondHoe_NAME);
		LanguageRegistry.addName(betterDiamondShovel, itemInfo.betterDiamondShovel_NAME);
		
		//Armor
		
		//Iron
		LanguageRegistry.addName(betterIronHelmet, itemInfo.betterIronHelmet_NAME);
		LanguageRegistry.addName(betterIronChestplate, itemInfo.betterIronChestplate_NAME);
		LanguageRegistry.addName(betterIronLeggings, itemInfo.betterIronLeggings_NAME);
		LanguageRegistry.addName(betterIronBoots, itemInfo.betterIronBoots_NAME);
		
		//Gold
		LanguageRegistry.addName(betterGoldHelmet, itemInfo.betterGoldHelmet_NAME);
		LanguageRegistry.addName(betterGoldChestplate, itemInfo.betterGoldChestplate_NAME);
		LanguageRegistry.addName(betterGoldLeggings, itemInfo.betterGoldLeggings_NAME);
		LanguageRegistry.addName(betterGoldBoots, itemInfo.betterGoldBoots_NAME);
		
		//Diamond
		LanguageRegistry.addName(betterDiamondHelmet, itemInfo.betterDiamondHelmet_NAME);
		LanguageRegistry.addName(betterDiamondChestplate, itemInfo.betterDiamondChestplate_NAME);
		LanguageRegistry.addName(betterDiamondLeggings, itemInfo.betterDiamondLeggings_NAME);
		LanguageRegistry.addName(betterDiamondBoots, itemInfo.betterDiamondBoots_NAME);
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
//-----------------------------------------------------------------------------------------------------------------------------------------------------------
		//Tools
		
		//Iron
		
		//Sword
		GameRegistry.addRecipe(new ItemStack(betterIronSword),
				new Object[] { 	" I ",
								" I ",
								" S ",
								
								'I', items.betterIronIngot,
								'S', Item.stick,
							 });
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(betterIronPickaxe),
				new Object[] { 	"III",
								" S ",
								" S ",
								
								'I', items.betterIronIngot,
								'S', Item.stick,
							 });
		//Axe
		GameRegistry.addRecipe(new ItemStack(betterIronAxe),
				new Object[] { 	"II ",
								"IS ",
								" S ",
								
								'I', items.betterIronIngot,
								'S', Item.stick,
							 });
		//Hoe
		GameRegistry.addRecipe(new ItemStack(betterIronHoe),
				new Object[] { 	"II ",
								" S ",
								" S ",
								
								'I', items.betterIronIngot,
								'S', Item.stick,
							 });
		//Shovel
		GameRegistry.addRecipe(new ItemStack(betterIronShovel),
				new Object[] { 	" I ",
								" S ",
								" S ",
								
								'I', items.betterIronIngot,
								'S', Item.stick,
							 });
//----------------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Gold
		
		//Sword
		GameRegistry.addRecipe(new ItemStack(betterGoldSword),
				new Object[] { 	" I ",
								" I ",
								" S ",
								
								'I', items.betterGoldIngot,
								'S', Item.stick,
							 });
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(betterGoldPickaxe),
				new Object[] { 	"III",
								" S ",
								" S ",
								
								'I', items.betterGoldIngot,
								'S', Item.stick,
							 });
		//Axe
		GameRegistry.addRecipe(new ItemStack(betterGoldAxe),
				new Object[] { 	"II ",
								"IS ",
								" S ",
								
								'I', items.betterGoldIngot,
								'S', Item.stick,
							 });
		//Hoe
		GameRegistry.addRecipe(new ItemStack(betterGoldHoe),
				new Object[] { 	"II ",
								" S ",
								" S ",
								
								'I', items.betterGoldIngot,
								'S', Item.stick,
							 });
		//Shovel
		GameRegistry.addRecipe(new ItemStack(betterGoldShovel),
				new Object[] { 	" I ",
								" S ",
								" S ",
								
								'I', items.betterGoldIngot,
								'S', Item.stick,
							 });

//--------------------------------------------------------------------------------------------------------------------------------------------------------
		//Diamond
		
		//Sword
		GameRegistry.addRecipe(new ItemStack(betterDiamondSword),
				new Object[] { 	" I ",
								" I ",
								" S ",
								
								'I', items.betterDiamond,
								'S', Item.stick,
							 });
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(betterDiamondPickaxe),
				new Object[] { 	"III",
								" S ",
								" S ",
								
								'I', items.betterDiamond,
								'S', Item.stick,
							 });
		//Axe
		GameRegistry.addRecipe(new ItemStack(betterDiamondAxe),
				new Object[] { 	"II ",
								"IS ",
								" S ",
								
								'I', items.betterDiamond,
								'S', Item.stick,
							 });
		//Hoe
		GameRegistry.addRecipe(new ItemStack(betterDiamondHoe),
				new Object[] { 	"II ",
								" S ",
								" S ",
								
								'I', items.betterDiamond,
								'S', Item.stick,
							 });
		//Shovel
		GameRegistry.addRecipe(new ItemStack(betterDiamondShovel),
				new Object[] { 	" I ",
								" S ",
								" S ",
								
								'I', items.betterDiamond,
								'S', Item.stick,
							 });

	
	}
	
	//Register all Smelting Recipies
	public static void registerItemSmelting(){
		
		GameRegistry.addSmelting(itemInfo.defectiveLowPressureCore_DEFAULT, new ItemStack(items.lowPressureCore), 0.1f);

	}
	public static void registerShaplessCrafting(){
        GameRegistry.addShapelessRecipe(new ItemStack(Block.planks, 5), new ItemStack(blocks.blockMyWood, 1));
	}
}
