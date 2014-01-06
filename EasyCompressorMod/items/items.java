package EasyCompressorMod.items;

import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import EasyCompressorMod.armor.betterDiamondArmor.hardenedDiamondBoots;
import EasyCompressorMod.armor.betterDiamondArmor.hardenedDiamondChestplate;
import EasyCompressorMod.armor.betterDiamondArmor.hardenedDiamondHelmet;
import EasyCompressorMod.armor.betterDiamondArmor.hardenedDiamondLeggings;
import EasyCompressorMod.armor.betterEmeraldArmor.hardenedEmeraldBoots;
import EasyCompressorMod.armor.betterEmeraldArmor.hardenedEmeraldChestplate;
import EasyCompressorMod.armor.betterEmeraldArmor.hardenedEmeraldHelmet;
import EasyCompressorMod.armor.betterEmeraldArmor.hardenedEmeraldLeggings;
import EasyCompressorMod.armor.betterGoldArmor.hardenedGoldBoots;
import EasyCompressorMod.armor.betterGoldArmor.hardenedGoldChestplate;
import EasyCompressorMod.armor.betterGoldArmor.hardenedGoldHelmet;
import EasyCompressorMod.armor.betterGoldArmor.hardenedGoldLeggings;
import EasyCompressorMod.armor.betterIronArmor.hardenedIronBoots;
import EasyCompressorMod.armor.betterIronArmor.hardenedIronChestplate;
import EasyCompressorMod.armor.betterIronArmor.hardenedIronHelmet;
import EasyCompressorMod.armor.betterIronArmor.hardenedIronLeggings;
import EasyCompressorMod.armor.betterRedstoneArmor.hardenedRedstoneBoots;
import EasyCompressorMod.armor.betterRedstoneArmor.hardenedRedstoneChestplate;
import EasyCompressorMod.armor.betterRedstoneArmor.hardenedRedstoneHelmet;
import EasyCompressorMod.armor.betterRedstoneArmor.hardenedRedstoneLeggings;
import EasyCompressorMod.armor.netherStarArmor.netherStarBoots;
import EasyCompressorMod.armor.netherStarArmor.netherStarChestplate;
import EasyCompressorMod.armor.netherStarArmor.netherStarHelmet;
import EasyCompressorMod.armor.netherStarArmor.netherStarLeggings;
import EasyCompressorMod.blocks.blocks;
import EasyCompressorMod.items.betterIngots.hardenedDiamond;
import EasyCompressorMod.items.betterIngots.hardenedEmerald;
import EasyCompressorMod.items.betterIngots.hardenedGoldIngot;
import EasyCompressorMod.items.betterIngots.hardenedIronIngot;
import EasyCompressorMod.items.betterIngots.hardenedRedstoneIngot;
import EasyCompressorMod.items.betterIngots.itemSteelIngot;
import EasyCompressorMod.items.cores.itemDefectiveHighPressureCore;
import EasyCompressorMod.items.cores.itemDefectiveLowPressureCore;
import EasyCompressorMod.items.cores.itemHighPressureCore;
import EasyCompressorMod.items.cores.itemLowPressureCore;
import EasyCompressorMod.items.otherStuff.itemCompressedAir;
import EasyCompressorMod.items.otherStuff.itemCompressedGlowstone;
import EasyCompressorMod.items.otherStuff.itemNetherStarShards;
import EasyCompressorMod.items.otherStuff.itemSteelRings;
import EasyCompressorMod.items.pieces.itemDiamondPiece;
import EasyCompressorMod.items.pieces.itemEmeraldPiece;
import EasyCompressorMod.items.pieces.itemGoldPiece;
import EasyCompressorMod.items.pieces.itemIronPiece;
import EasyCompressorMod.items.pieces.itemRedstonePiece;
import EasyCompressorMod.tools.hardenedDiamondTools.hardenedDiamondAxe;
import EasyCompressorMod.tools.hardenedDiamondTools.hardenedDiamondHoe;
import EasyCompressorMod.tools.hardenedDiamondTools.hardenedDiamondPickaxe;
import EasyCompressorMod.tools.hardenedDiamondTools.hardenedDiamondShovel;
import EasyCompressorMod.tools.hardenedDiamondTools.hardenedDiamondSword;
import EasyCompressorMod.tools.hardenedEmeraldTools.hardenedEmeraldAxe;
import EasyCompressorMod.tools.hardenedEmeraldTools.hardenedEmeraldHoe;
import EasyCompressorMod.tools.hardenedEmeraldTools.hardenedEmeraldPickaxe;
import EasyCompressorMod.tools.hardenedEmeraldTools.hardenedEmeraldShovel;
import EasyCompressorMod.tools.hardenedEmeraldTools.hardenedEmeraldSword;
import EasyCompressorMod.tools.hardenedGoldTools.hardenedGoldAxe;
import EasyCompressorMod.tools.hardenedGoldTools.hardenedGoldHoe;
import EasyCompressorMod.tools.hardenedGoldTools.hardenedGoldPickaxe;
import EasyCompressorMod.tools.hardenedGoldTools.hardenedGoldShovel;
import EasyCompressorMod.tools.hardenedGoldTools.hardenedGoldSword;
import EasyCompressorMod.tools.hardenedIronTools.hardenedIronAxe;
import EasyCompressorMod.tools.hardenedIronTools.hardenedIronHoe;
import EasyCompressorMod.tools.hardenedIronTools.hardenedIronPickaxe;
import EasyCompressorMod.tools.hardenedIronTools.hardenedIronShovel;
import EasyCompressorMod.tools.hardenedIronTools.hardenedIronSword;
import EasyCompressorMod.tools.hardenedRedstoneTools.hardenedRedstoneAxe;
import EasyCompressorMod.tools.hardenedRedstoneTools.hardenedRedstoneHoe;
import EasyCompressorMod.tools.hardenedRedstoneTools.hardenedRedstonePickaxe;
import EasyCompressorMod.tools.hardenedRedstoneTools.hardenedRedstoneShovel;
import EasyCompressorMod.tools.hardenedRedstoneTools.hardenedRedstoneSword;
import EasyCompressorMod.tools.netherStarTools.netherStarAxe;
import EasyCompressorMod.tools.netherStarTools.netherStarHoe;
import EasyCompressorMod.tools.netherStarTools.netherStarPickaxe;
import EasyCompressorMod.tools.netherStarTools.netherStarShovel;
import EasyCompressorMod.tools.netherStarTools.netherStarSword;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class items {
	
	
	//FOR DISABLE BLOCK RECIPIES
	public static boolean blockCrafting;
	
	//For my Tools
	//Better Iron
	public static EnumToolMaterial hardenedIronMaterial = EnumHelper.addToolMaterial("hardenedIron", 2, 546, 6.5F, 2.5F, 15);
	
	//Better Gold
	public static EnumToolMaterial hardenedGoldMaterial = EnumHelper.addToolMaterial("hardenedGold", 0, 80, 14.5F, 0.5F, 22);
	
	//Better Diamond
	public static EnumToolMaterial hardenedDiamondMaterial = EnumHelper.addToolMaterial("hardenedDiamond", 3, 3200, 9.7F, 3.4F, 13);
	
	//Better Emerald
	public static EnumToolMaterial hardenedEmeraldMaterial = EnumHelper.addToolMaterial("hardenedEmerald", 3, 3200, 14.0F, 5.0F, 30);
	
	//Better Redstone
	public static EnumToolMaterial hardenedRedstoneMaterial = EnumHelper.addToolMaterial("hardenedRedstone", 2, 350, 5.0F, 1.5F, 13);
	
	//Nether Star
	public static EnumToolMaterial netherStarMaterial = EnumHelper.addToolMaterial("netherStar", 3, 6500, 25.0F, 8.5F, 30);

	
	//For Armor
	//Better Iron
	public static EnumArmorMaterial hardenedIronArmorMaterial = EnumHelper.addArmorMaterial("hardenedArmorIron", 30, new int[] {4, 8, 7, 4}, 16);
	
	//Better Gold
	public static EnumArmorMaterial hardenedGoldArmorMaterial = EnumHelper.addArmorMaterial("hardenedArmorGold", 14, new int[] {3, 7, 4, 1}, 30);

	//Better Diamond
	public static EnumArmorMaterial hardenedDiamondArmorMaterial = EnumHelper.addArmorMaterial("hardenedArmorDiamond", 67, new int[] {5, 10, 8, 5}, 15);
	
	//Better Emerald
	public static EnumArmorMaterial hardenedEmeraldArmorMaterial = EnumHelper.addArmorMaterial("hardenedArmorEmerald", 67, new int[] {7, 12, 8, 5}, 30);
	
	//Better Redstone
	public static EnumArmorMaterial hardenedRedstoneArmorMaterial = EnumHelper.addArmorMaterial("hardenedArmorRedstone", 21, new int[] {1, 5, 4, 1}, 14);
	
	//Nether Star
	public static EnumArmorMaterial netherStarArmorMaterial = EnumHelper.addArmorMaterial("netherStar", 135, new int[] {11, 16, 15, 13}, 30);

	
	
	
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
	public static Item emeraldPiece;
	public static Item redstonePiece;
	
	//Ore/Drop
	public static Item compressedAir;
	
	//Steel Things
	public static Item steelIngot;
	public static Item steelRings;
	
	//Other
	public static Item compressedGlowstone;
	public static Item netherStarShards;
	
	//Ingots
	public static Item hardenedDiamond;
	public static Item hardenedIronIngot;
	public static Item hardenedGoldIngot;
	public static Item hardenedEmerald;
	public static Item hardenedRedstoneIngot;
	
	//Tools
	
	//Iron
	public static Item hardenedIronSword;
	public static Item hardenedIronPickaxe;
	public static Item hardenedIronAxe;
	public static Item hardenedIronHoe;
	public static Item hardenedIronShovel;
	
	//Gold
	public static Item hardenedGoldSword;
	public static Item hardenedGoldPickaxe;
	public static Item hardenedGoldAxe;
	public static Item hardenedGoldHoe;
	public static Item hardenedGoldShovel;
	
	//Diamond
	public static Item hardenedDiamondSword;
	public static Item hardenedDiamondPickaxe;
	public static Item hardenedDiamondAxe;
	public static Item hardenedDiamondHoe;
	public static Item hardenedDiamondShovel;
	
	//Emerald
	public static Item hardenedEmeraldSword;
	public static Item hardenedEmeraldPickaxe;
	public static Item hardenedEmeraldAxe;
	public static Item hardenedEmeraldHoe;
	public static Item hardenedEmeraldShovel;
	
	//Redstone
	public static Item hardenedRedstoneSword;
	public static Item hardenedRedstonePickaxe;
	public static Item hardenedRedstoneAxe;
	public static Item hardenedRedstoneHoe;
	public static Item hardenedRedstoneShovel;
	
	//Nether Star
	public static Item netherStarSword;
	public static Item netherStarPickaxe;
	public static Item netherStarAxe;
	public static Item netherStarHoe;
	public static Item netherStarShovel;
	
	//Armor
	
	//Iron
	public static Item hardenedIronHelmet;
	public static Item hardenedIronChestplate;
	public static Item hardenedIronLeggings;
	public static Item hardenedIronBoots;
	
	//Gold
	public static Item hardenedGoldHelmet;
	public static Item hardenedGoldChestplate;
	public static Item hardenedGoldLeggings;
	public static Item hardenedGoldBoots;
	
	//Diamond
	public static Item hardenedDiamondHelmet;
	public static Item hardenedDiamondChestplate;
	public static Item hardenedDiamondLeggings;
	public static Item hardenedDiamondBoots;
	
	//Emerald
	public static Item hardenedEmeraldHelmet;
	public static Item hardenedEmeraldChestplate;
	public static Item hardenedEmeraldLeggings;
	public static Item hardenedEmeraldBoots;
	
	//Redstone
	public static Item hardenedRedstoneHelmet;
	public static Item hardenedRedstoneChestplate;
	public static Item hardenedRedstoneLeggings;
	public static Item hardenedRedstoneBoots;
	
	//Nether Star
	public static Item netherStarHelmet;
	public static Item netherStarChestplate;
	public static Item netherStarLeggings;
	public static Item netherStarBoots;
	
	
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
		emeraldPiece = new itemEmeraldPiece(itemInfo.emeraldPiece_ID);
		redstonePiece = new itemRedstonePiece(itemInfo.redstonePiece_ID);
		
		//CompressedAir
		compressedAir = new itemCompressedAir(itemInfo.compressedAir_ID);
		
		//Steel Things
		steelIngot = new itemSteelIngot(itemInfo.steelIngot_ID);
		steelRings = new itemSteelRings(itemInfo.steelRings_ID);
				
		//Other
		compressedGlowstone = new itemCompressedGlowstone(itemInfo.compressedGlowstone_ID);	
		netherStarShards = new itemNetherStarShards(itemInfo.netherStarShards_ID);
		
		//BetterIngots
		hardenedDiamond = new hardenedDiamond(itemInfo.hardenedDiamond_ID);
		hardenedIronIngot = new hardenedIronIngot(itemInfo.hardenedIronIngot_ID);
		hardenedGoldIngot = new hardenedGoldIngot(itemInfo.hardenedGoldIngot_ID);
		hardenedEmerald = new hardenedEmerald(itemInfo.hardenedEmerald_ID);
		hardenedRedstoneIngot = new hardenedRedstoneIngot(itemInfo.hardenedRedstoneIngot_ID);		
		
		//Tools

		//Iron
		hardenedIronSword = new hardenedIronSword(itemInfo.hardenedIronSword_ID, hardenedIronMaterial);
		hardenedIronPickaxe = new hardenedIronPickaxe(itemInfo.hardenedIronPickaxe_ID, hardenedIronMaterial);
		hardenedIronAxe = new hardenedIronAxe(itemInfo.hardenedIronAxe_ID, hardenedIronMaterial);
		hardenedIronHoe = new hardenedIronHoe(itemInfo.hardenedIronHoe_ID, hardenedIronMaterial);
		hardenedIronShovel = new hardenedIronShovel(itemInfo.hardenedIronShovel_ID, hardenedIronMaterial);
		
		//Gold
		hardenedGoldSword = new hardenedGoldSword(itemInfo.hardenedGoldSword_ID, hardenedGoldMaterial);
		hardenedGoldPickaxe = new hardenedGoldPickaxe(itemInfo.hardenedGoldPickaxe_ID, hardenedGoldMaterial);
		hardenedGoldAxe = new hardenedGoldAxe(itemInfo.hardenedGoldAxe_ID, hardenedGoldMaterial);
		hardenedGoldHoe = new hardenedGoldHoe(itemInfo.hardenedGoldHoe_ID, hardenedGoldMaterial);
		hardenedGoldShovel = new hardenedGoldShovel(itemInfo.hardenedGoldShovel_ID, hardenedGoldMaterial);
		
		//Diamond
		hardenedDiamondSword = new hardenedDiamondSword(itemInfo.hardenedDiamondSword_ID, hardenedDiamondMaterial);
		hardenedDiamondPickaxe = new hardenedDiamondPickaxe(itemInfo.hardenedDiamondPickaxe_ID, hardenedDiamondMaterial);
		hardenedDiamondAxe = new hardenedDiamondAxe(itemInfo.hardenedDiamondAxe_ID, hardenedDiamondMaterial);
		hardenedDiamondHoe = new hardenedDiamondHoe(itemInfo.hardenedDiamondHoe_ID, hardenedDiamondMaterial);
		hardenedDiamondShovel = new hardenedDiamondShovel(itemInfo.hardenedDiamondShovel_ID, hardenedDiamondMaterial);
		
		//Emerald
		hardenedEmeraldSword = new hardenedEmeraldSword(itemInfo.hardenedEmeraldSword_ID, hardenedEmeraldMaterial);
		hardenedEmeraldPickaxe = new hardenedEmeraldPickaxe(itemInfo.hardenedEmeraldPickaxe_ID, hardenedEmeraldMaterial);
		hardenedEmeraldAxe = new hardenedEmeraldAxe(itemInfo.hardenedEmeraldAxe_ID, hardenedEmeraldMaterial);
		hardenedEmeraldHoe = new hardenedEmeraldHoe(itemInfo.hardenedEmeraldHoe_ID, hardenedEmeraldMaterial);
		hardenedEmeraldShovel = new hardenedEmeraldShovel(itemInfo.hardenedEmeraldShovel_ID, hardenedEmeraldMaterial);
		
		//Redstone
		hardenedRedstoneSword = new hardenedRedstoneSword(itemInfo.hardenedRedstoneSword_ID, hardenedRedstoneMaterial);
		hardenedRedstonePickaxe = new hardenedRedstonePickaxe(itemInfo.hardenedRedstonePickaxe_ID, hardenedRedstoneMaterial);
		hardenedRedstoneAxe = new hardenedRedstoneAxe(itemInfo.hardenedRedstoneAxe_ID, hardenedRedstoneMaterial);
		hardenedRedstoneHoe = new hardenedRedstoneHoe(itemInfo.hardenedRedstoneHoe_ID, hardenedRedstoneMaterial);
		hardenedRedstoneShovel = new hardenedRedstoneShovel(itemInfo.hardenedRedstoneShovel_ID, hardenedRedstoneMaterial);
		
		//Nether Star
		netherStarSword = new netherStarSword(itemInfo.netherStarSword_ID, netherStarMaterial);
		netherStarPickaxe = new netherStarPickaxe(itemInfo.netherStarPickaxe_ID, netherStarMaterial);
		netherStarAxe = new netherStarAxe(itemInfo.netherStarAxe_ID, netherStarMaterial);
		netherStarHoe = new netherStarHoe(itemInfo.netherStarHoe_ID, netherStarMaterial);
		netherStarShovel = new netherStarShovel(itemInfo.netherStarShovel_ID, netherStarMaterial);
		
		
		
		//Armour
		
		//Iron
		hardenedIronHelmet = new hardenedIronHelmet(itemInfo.hardenedIronHelmet_ID, hardenedIronArmorMaterial, 3, 0);
		hardenedIronChestplate = new hardenedIronChestplate(itemInfo.hardenedIronChestplate_ID, hardenedIronArmorMaterial, 3 ,1);
		hardenedIronLeggings = new hardenedIronLeggings(itemInfo.hardenedIronLeggings_ID, hardenedIronArmorMaterial, 3 ,2);
		hardenedIronBoots = new hardenedIronBoots(itemInfo.hardenedIronBoots_ID, hardenedIronArmorMaterial, 3 , 3);
		
		//Gold
		hardenedGoldHelmet = new hardenedGoldHelmet(itemInfo.hardenedGoldHelmet_ID, hardenedGoldArmorMaterial, 3, 0);
		hardenedGoldChestplate = new hardenedGoldChestplate(itemInfo.hardenedGoldChestplate_ID, hardenedGoldArmorMaterial, 3 ,1);
		hardenedGoldLeggings = new hardenedGoldLeggings(itemInfo.hardenedGoldLeggings_ID, hardenedGoldArmorMaterial, 3 ,2);
		hardenedGoldBoots = new hardenedGoldBoots(itemInfo.hardenedGoldBoots_ID, hardenedGoldArmorMaterial, 3 , 3);
		
		//Diamond
		hardenedDiamondHelmet = new hardenedDiamondHelmet(itemInfo.hardenedDiamondHelmet_ID, hardenedDiamondArmorMaterial, 3, 0);
		hardenedDiamondChestplate = new hardenedDiamondChestplate(itemInfo.hardenedDiamondChestplate_ID, hardenedDiamondArmorMaterial, 3 ,1);
		hardenedDiamondLeggings = new hardenedDiamondLeggings(itemInfo.hardenedDiamondLeggings_ID, hardenedDiamondArmorMaterial, 3 ,2);
		hardenedDiamondBoots = new hardenedDiamondBoots(itemInfo.hardenedDiamondBoots_ID, hardenedDiamondArmorMaterial, 3 , 3);
		
		//Emerald
		hardenedEmeraldHelmet = new hardenedEmeraldHelmet(itemInfo.hardenedEmeraldHelmet_ID, hardenedEmeraldArmorMaterial, 3, 0);
		hardenedEmeraldChestplate = new hardenedEmeraldChestplate(itemInfo.hardenedEmeraldChestplate_ID, hardenedEmeraldArmorMaterial, 3 ,1);
		hardenedEmeraldLeggings = new hardenedEmeraldLeggings(itemInfo.hardenedEmeraldLeggings_ID, hardenedEmeraldArmorMaterial, 3 ,2);
		hardenedEmeraldBoots = new hardenedEmeraldBoots(itemInfo.hardenedEmeraldBoots_ID, hardenedEmeraldArmorMaterial, 3 , 3);
		
		//Redstone
		hardenedRedstoneHelmet = new hardenedRedstoneHelmet(itemInfo.hardenedRedstoneHelmet_ID, hardenedRedstoneArmorMaterial, 3, 0);
		hardenedRedstoneChestplate = new hardenedRedstoneChestplate(itemInfo.hardenedRedstoneChestplate_ID, hardenedRedstoneArmorMaterial, 3 ,1);
		hardenedRedstoneLeggings = new hardenedRedstoneLeggings(itemInfo.hardenedRedstoneLeggings_ID, hardenedRedstoneArmorMaterial, 3 ,2);
		hardenedRedstoneBoots = new hardenedRedstoneBoots(itemInfo.hardenedRedstoneBoots_ID, hardenedRedstoneArmorMaterial, 3 , 3);
		
		//Nether Star
		netherStarHelmet = new netherStarHelmet(itemInfo.netherStarHelmet_ID, netherStarArmorMaterial, 3, 0);
		netherStarChestplate = new netherStarChestplate(itemInfo.netherStarChestplate_ID, netherStarArmorMaterial, 3 ,1);
		netherStarLeggings = new netherStarLeggings(itemInfo.netherStarLeggings_ID, netherStarArmorMaterial, 3 ,2);
		netherStarBoots = new netherStarBoots(itemInfo.netherStarBoots_ID, netherStarArmorMaterial, 3 , 3);
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
		LanguageRegistry.addName(emeraldPiece, itemInfo.emeraldPiece_NAME);
		LanguageRegistry.addName(redstonePiece, itemInfo.redstonePiece_NAME);

		
		//CompressedAir
		LanguageRegistry.addName(compressedAir, itemInfo.compressedAir_NAME);
		
		//Steel Things
		LanguageRegistry.addName(steelIngot, itemInfo.steelIngot_NAME);
		LanguageRegistry.addName(steelRings, itemInfo.steelRings_NAME);
				
		//Other
		LanguageRegistry.addName(compressedGlowstone, itemInfo.compressedGlowstone_NAME);
		LanguageRegistry.addName(netherStarShards, itemInfo.netherStarShards_NAME);
		
		//BetterIngots
		LanguageRegistry.addName(hardenedDiamond, itemInfo.hardenedDiamond_NAME);
		LanguageRegistry.addName(hardenedIronIngot, itemInfo.hardenedIronIngot_NAME);
		LanguageRegistry.addName(hardenedGoldIngot, itemInfo.hardenedGoldIngot_NAME);
		LanguageRegistry.addName(hardenedEmerald, itemInfo.hardenedEmerald_NAME);
		LanguageRegistry.addName(hardenedRedstoneIngot, itemInfo.hardenedRedstoneIngot_NAME);

		
		//Tools
		
		//Iron
		LanguageRegistry.addName(hardenedIronSword, itemInfo.hardenedIronSword_NAME);
		LanguageRegistry.addName(hardenedIronPickaxe, itemInfo.hardenedIronPickaxe_NAME);
		LanguageRegistry.addName(hardenedIronAxe, itemInfo.hardenedIronAxe_NAME);
		LanguageRegistry.addName(hardenedIronHoe, itemInfo.hardenedIronHoe_NAME);
		LanguageRegistry.addName(hardenedIronShovel, itemInfo.hardenedIronShovel_NAME);
		
		//Gold
		LanguageRegistry.addName(hardenedGoldSword, itemInfo.hardenedGoldSword_NAME);
		LanguageRegistry.addName(hardenedGoldPickaxe, itemInfo.hardenedGoldPickaxe_NAME);
		LanguageRegistry.addName(hardenedGoldAxe, itemInfo.hardenedGoldAxe_NAME);
		LanguageRegistry.addName(hardenedGoldHoe, itemInfo.hardenedGoldHoe_NAME);
		LanguageRegistry.addName(hardenedGoldShovel, itemInfo.hardenedGoldShovel_NAME);
		
		//Diamond
		LanguageRegistry.addName(hardenedDiamondSword, itemInfo.hardenedDiamondSword_NAME);
		LanguageRegistry.addName(hardenedDiamondPickaxe, itemInfo.hardenedDiamondPickaxe_NAME);
		LanguageRegistry.addName(hardenedDiamondAxe, itemInfo.hardenedDiamondAxe_NAME);
		LanguageRegistry.addName(hardenedDiamondHoe, itemInfo.hardenedDiamondHoe_NAME);
		LanguageRegistry.addName(hardenedDiamondShovel, itemInfo.hardenedDiamondShovel_NAME);
		
		//Emerald
		LanguageRegistry.addName(hardenedEmeraldSword, itemInfo.hardenedEmeraldSword_NAME);
		LanguageRegistry.addName(hardenedEmeraldPickaxe, itemInfo.hardenedEmeraldPickaxe_NAME);
		LanguageRegistry.addName(hardenedEmeraldAxe, itemInfo.hardenedEmeraldAxe_NAME);
		LanguageRegistry.addName(hardenedEmeraldHoe, itemInfo.hardenedEmeraldHoe_NAME);
		LanguageRegistry.addName(hardenedEmeraldShovel, itemInfo.hardenedEmeraldShovel_NAME);
		
		//Redstone
		LanguageRegistry.addName(hardenedRedstoneSword, itemInfo.hardenedRedstoneSword_NAME);
		LanguageRegistry.addName(hardenedRedstonePickaxe, itemInfo.hardenedRedstonePickaxe_NAME);
		LanguageRegistry.addName(hardenedRedstoneAxe, itemInfo.hardenedRedstoneAxe_NAME);
		LanguageRegistry.addName(hardenedRedstoneHoe, itemInfo.hardenedRedstoneHoe_NAME);
		LanguageRegistry.addName(hardenedRedstoneShovel, itemInfo.hardenedRedstoneShovel_NAME);
		
		//Nether Star
		LanguageRegistry.addName(netherStarSword, itemInfo.netherStarSword_NAME);
		LanguageRegistry.addName(netherStarPickaxe, itemInfo.netherStarPickaxe_NAME);
		LanguageRegistry.addName(netherStarAxe, itemInfo.netherStarAxe_NAME);
		LanguageRegistry.addName(netherStarHoe, itemInfo.netherStarHoe_NAME);
		LanguageRegistry.addName(netherStarShovel, itemInfo.netherStarShovel_NAME);

		
		
		
		
		//Armor
		
		//Iron
		LanguageRegistry.addName(hardenedIronHelmet, itemInfo.hardenedIronHelmet_NAME);
		LanguageRegistry.addName(hardenedIronChestplate, itemInfo.hardenedIronChestplate_NAME);
		LanguageRegistry.addName(hardenedIronLeggings, itemInfo.hardenedIronLeggings_NAME);
		LanguageRegistry.addName(hardenedIronBoots, itemInfo.hardenedIronBoots_NAME);
		
		//Gold
		LanguageRegistry.addName(hardenedGoldHelmet, itemInfo.hardenedGoldHelmet_NAME);
		LanguageRegistry.addName(hardenedGoldChestplate, itemInfo.hardenedGoldChestplate_NAME);
		LanguageRegistry.addName(hardenedGoldLeggings, itemInfo.hardenedGoldLeggings_NAME);
		LanguageRegistry.addName(hardenedGoldBoots, itemInfo.hardenedGoldBoots_NAME);
		
		//Diamond
		LanguageRegistry.addName(hardenedDiamondHelmet, itemInfo.hardenedDiamondHelmet_NAME);
		LanguageRegistry.addName(hardenedDiamondChestplate, itemInfo.hardenedDiamondChestplate_NAME);
		LanguageRegistry.addName(hardenedDiamondLeggings, itemInfo.hardenedDiamondLeggings_NAME);
		LanguageRegistry.addName(hardenedDiamondBoots, itemInfo.hardenedDiamondBoots_NAME);
		
		//Emerald
		LanguageRegistry.addName(hardenedEmeraldHelmet, itemInfo.hardenedEmeraldHelmet_NAME);
		LanguageRegistry.addName(hardenedEmeraldChestplate, itemInfo.hardenedEmeraldChestplate_NAME);
		LanguageRegistry.addName(hardenedEmeraldLeggings, itemInfo.hardenedEmeraldLeggings_NAME);
		LanguageRegistry.addName(hardenedEmeraldBoots, itemInfo.hardenedEmeraldBoots_NAME);
		
		//Redstone
		LanguageRegistry.addName(hardenedRedstoneHelmet, itemInfo.hardenedRedstoneHelmet_NAME);
		LanguageRegistry.addName(hardenedRedstoneChestplate, itemInfo.hardenedRedstoneChestplate_NAME);
		LanguageRegistry.addName(hardenedRedstoneLeggings, itemInfo.hardenedRedstoneLeggings_NAME);
		LanguageRegistry.addName(hardenedRedstoneBoots, itemInfo.hardenedRedstoneBoots_NAME);
		
		//Nether Star
		LanguageRegistry.addName(netherStarHelmet, itemInfo.netherStarHelmet_NAME);
		LanguageRegistry.addName(netherStarChestplate, itemInfo.netherStarChestplate_NAME);
		LanguageRegistry.addName(netherStarLeggings, itemInfo.netherStarLeggings_NAME);
		LanguageRegistry.addName(netherStarBoots, itemInfo.netherStarBoots_NAME);
		
	}
	
	//Register All Recipies
	public static void registerItemRecipes() {

		//Nether Star Shards
		GameRegistry.addRecipe(new ItemStack(items.netherStarShards, 3),
			new Object[] { 	"  D",
							"DND",
							"DD ",
							
							'D', items.hardenedDiamond,
							'N', Item.netherStar,
							
						 });
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
		if(blockCrafting == false){
			
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
		}
		//hardenedDiamond <- DiamondPiece
		GameRegistry.addRecipe(new ItemStack(hardenedDiamond),
				new Object[] { 	" DD",
								" DD",
								"   ",
								
								'D', items.diamondPiece,
							 });
		//hardenedEmerald <- EmeraldPiece
		GameRegistry.addRecipe(new ItemStack(hardenedEmerald),
				new Object[] { 	" DD",
								" DD",
								"   ",
								
								'D', items.emeraldPiece,
							 });
		//hardenedIronIngot <- IronPiece
		GameRegistry.addRecipe(new ItemStack(hardenedIronIngot),
				new Object[] { 	"III",
								"III",
								"   ",
								
								'I', items.ironPiece,
							 });
		//hardenedRedstoneIngot <- RedstonePiece
		GameRegistry.addRecipe(new ItemStack(hardenedRedstoneIngot),
				new Object[] { 	"III",
								"III",
								"   ",
								
								'I', items.redstonePiece,
							 });
		//hardenedGoldIngot <- GoldPiece
		GameRegistry.addRecipe(new ItemStack(hardenedGoldIngot),
				new Object[] { 	"GGG",
								"GGG",
								"   ",
								
								'G', items.goldPiece,
							 });
		//steelRings <- steelIngot
		GameRegistry.addRecipe(new ItemStack(steelRings, 8),
				new Object[] { 	" I ",
								"I I",
								" I ",
								
								'I', items.steelIngot,
							 });
//-----------------------------------------------------------------------------------------------------------------------------------------------------------
		//Chain Armor
		
		//Helmet
		GameRegistry.addRecipe(new ItemStack(Item.helmetChain),
				new Object[] { 	"III",
								"I I",
								"   ",
								
								'I', items.steelRings,
							 });
		//Chestplate
		GameRegistry.addRecipe(new ItemStack(Item.plateChain),
				new Object[] { 	"I I",
								"III",
								"III",
								
								'I', items.steelRings,
							 });
		//Leggings
		GameRegistry.addRecipe(new ItemStack(Item.legsChain),
				new Object[] { 	"III",
								"I I",
								"I I",
								
								'I', items.steelRings,
							 });
		//Boots
		GameRegistry.addRecipe(new ItemStack(Item.bootsChain),
				new Object[] { 	"I I",
								"I I",
								"   ",
								
								'I', items.steelRings,
							 });
		
//-----------------------------------------------------------------------------------------------------------------------------------------------------------
		//Tools
		
		//Iron
		
		//Sword
		GameRegistry.addRecipe(new ItemStack(hardenedIronSword),
				new Object[] { 	" I ",
								" I ",
								" S ",
								
								'I', items.hardenedIronIngot,
								'S', Item.stick,
							 });
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(hardenedIronPickaxe),
				new Object[] { 	"III",
								" S ",
								" S ",
								
								'I', items.hardenedIronIngot,
								'S', Item.stick,
							 });
		//Axe
		GameRegistry.addRecipe(new ItemStack(hardenedIronAxe),
				new Object[] { 	"II ",
								"IS ",
								" S ",
								
								'I', items.hardenedIronIngot,
								'S', Item.stick,
							 });
		//Hoe
		GameRegistry.addRecipe(new ItemStack(hardenedIronHoe),
				new Object[] { 	"II ",
								" S ",
								" S ",
								
								'I', items.hardenedIronIngot,
								'S', Item.stick,
							 });
		//Shovel
		GameRegistry.addRecipe(new ItemStack(hardenedIronShovel),
				new Object[] { 	" I ",
								" S ",
								" S ",
								
								'I', items.hardenedIronIngot,
								'S', Item.stick,
							 });
//----------------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Gold
		
		//Sword
		GameRegistry.addRecipe(new ItemStack(hardenedGoldSword),
				new Object[] { 	" I ",
								" I ",
								" S ",
								
								'I', items.hardenedGoldIngot,
								'S', Item.stick,
							 });
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(hardenedGoldPickaxe),
				new Object[] { 	"III",
								" S ",
								" S ",
								
								'I', items.hardenedGoldIngot,
								'S', Item.stick,
							 });
		//Axe
		GameRegistry.addRecipe(new ItemStack(hardenedGoldAxe),
				new Object[] { 	"II ",
								"IS ",
								" S ",
								
								'I', items.hardenedGoldIngot,
								'S', Item.stick,
							 });
		//Hoe
		GameRegistry.addRecipe(new ItemStack(hardenedGoldHoe),
				new Object[] { 	"II ",
								" S ",
								" S ",
								
								'I', items.hardenedGoldIngot,
								'S', Item.stick,
							 });
		//Shovel
		GameRegistry.addRecipe(new ItemStack(hardenedGoldShovel),
				new Object[] { 	" I ",
								" S ",
								" S ",
								
								'I', items.hardenedGoldIngot,
								'S', Item.stick,
							 });

//--------------------------------------------------------------------------------------------------------------------------------------------------------
		//Diamond
		
		//Sword
		GameRegistry.addRecipe(new ItemStack(hardenedDiamondSword),
				new Object[] { 	" I ",
								" I ",
								" S ",
								
								'I', items.hardenedDiamond,
								'S', Item.stick,
							 });
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(hardenedDiamondPickaxe),
				new Object[] { 	"III",
								" S ",
								" S ",
								
								'I', items.hardenedDiamond,
								'S', Item.stick,
							 });
		//Axe
		GameRegistry.addRecipe(new ItemStack(hardenedDiamondAxe),
				new Object[] { 	"II ",
								"IS ",
								" S ",
								
								'I', items.hardenedDiamond,
								'S', Item.stick,
							 });
		//Hoe
		GameRegistry.addRecipe(new ItemStack(hardenedDiamondHoe),
				new Object[] { 	"II ",
								" S ",
								" S ",
								
								'I', items.hardenedDiamond,
								'S', Item.stick,
							 });
		//Shovel
		GameRegistry.addRecipe(new ItemStack(hardenedDiamondShovel),
				new Object[] { 	" I ",
								" S ",
								" S ",
								
								'I', items.hardenedDiamond,
								'S', Item.stick,
							 });
//-------------------------------------------------------------------------------------------------------------------------------------------------------//
		//Emerald
		
		//Sword
		GameRegistry.addRecipe(new ItemStack(hardenedEmeraldSword),
				new Object[] { 	" I ",
								" I ",
								" S ",
								
								'I', items.hardenedEmerald,
								'S', Item.stick,
							 });
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(hardenedEmeraldPickaxe),
				new Object[] { 	"III",
								" S ",
								" S ",
								
								'I', items.hardenedEmerald,
								'S', Item.stick,
							 });
		//Axe
		GameRegistry.addRecipe(new ItemStack(hardenedEmeraldAxe),
				new Object[] { 	"II ",
								"IS ",
								" S ",
								
								'I', items.hardenedEmerald,
								'S', Item.stick,
							 });
		//Hoe
		GameRegistry.addRecipe(new ItemStack(hardenedEmeraldHoe),
				new Object[] { 	"II ",
								" S ",
								" S ",
								
								'I', items.hardenedEmerald,
								'S', Item.stick,
							 });
		//Shovel
		GameRegistry.addRecipe(new ItemStack(hardenedEmeraldShovel),
				new Object[] { 	" I ",
								" S ",
								" S ",
								
								'I', items.hardenedEmerald,
								'S', Item.stick,
							 });
//----------------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Redstone
		
		//Sword
		GameRegistry.addRecipe(new ItemStack(hardenedRedstoneSword),
				new Object[] { 	" I ",
								" I ",
								" S ",
								
								'I', items.hardenedRedstoneIngot,
								'S', Item.stick,
							 });
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(hardenedRedstonePickaxe),
				new Object[] { 	"III",
								" S ",
								" S ",
								
								'I', items.hardenedRedstoneIngot,
								'S', Item.stick,
							 });
		//Axe
		GameRegistry.addRecipe(new ItemStack(hardenedRedstoneAxe),
				new Object[] { 	"II ",
								"IS ",
								" S ",
								
								'I', items.hardenedRedstoneIngot,
								'S', Item.stick,
							 });
		//Hoe
		GameRegistry.addRecipe(new ItemStack(hardenedRedstoneHoe),
				new Object[] { 	"II ",
								" S ",
								" S ",
								
								'I', items.hardenedRedstoneIngot,
								'S', Item.stick,
							 });
		//Shovel
		GameRegistry.addRecipe(new ItemStack(hardenedRedstoneShovel),
				new Object[] { 	" I ",
								" S ",
								" S ",
								
								'I', items.hardenedRedstoneIngot,
								'S', Item.stick,
							 });

//--------------------------------------------------------------------------------------------------------------------------------------------------------
		//Nether Star
		
		//Sword
		GameRegistry.addRecipe(new ItemStack(netherStarSword),
				new Object[] { 	" I ",
								" N ",
								" S ",
								
								'I', items.hardenedDiamond,
								'S', Item.stick,
								'N', items.netherStarShards,
							 });
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(netherStarPickaxe),
				new Object[] { 	"INI",
								" S ",
								" S ",
								
								'I', items.hardenedDiamond,
								'S', Item.stick,
								'N', items.netherStarShards,
							 });
		//Axe
		GameRegistry.addRecipe(new ItemStack(netherStarAxe),
				new Object[] { 	"NI ",
								"IS ",
								" S ",
								
								'I', items.hardenedDiamond,
								'S', Item.stick,
								'N', items.netherStarShards,
							 });
		//Hoe
		GameRegistry.addRecipe(new ItemStack(netherStarHoe),
				new Object[] { 	"IN ",
								" S ",
								" S ",
								
								'I', items.hardenedDiamond,
								'S', Item.stick,
								'N', items.netherStarShards,
							 });
		//Shovel
		GameRegistry.addRecipe(new ItemStack(netherStarShovel),
				new Object[] { 	" N ",
								" S ",
								" S ",
								
								'S', Item.stick,
								'N', items.netherStarShards,
							 });
//----------------------------------------------------------------------------------------------------------------------------------------------------------
		//Armor
		
		//Iron
		
		//Helmet
		GameRegistry.addRecipe(new ItemStack(hardenedIronHelmet),
				new Object[] { 	"III",
								"I I",
								"   ",
								
								'I', items.hardenedIronIngot,
							 });
		//Chestplate
		GameRegistry.addRecipe(new ItemStack(hardenedIronChestplate),
				new Object[] { 	"I I",
								"III",
								"III",
								
								'I', items.hardenedIronIngot,
							 });
		//Leggings
		GameRegistry.addRecipe(new ItemStack(hardenedIronLeggings),
				new Object[] { 	"III",
								"I I",
								"I I",
								
								'I', items.hardenedIronIngot,
							 });
		//Boots
		GameRegistry.addRecipe(new ItemStack(hardenedIronBoots),
				new Object[] { 	"I I",
								"I I",
								"   ",
								
								'I', items.hardenedIronIngot,
							 });
//------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Gold
		
		//Helmet
		GameRegistry.addRecipe(new ItemStack(hardenedGoldHelmet),
				new Object[] { 	"III",
								"I I",
								"   ",
								
								'I', items.hardenedGoldIngot,
							 });
		//Chestplate
		GameRegistry.addRecipe(new ItemStack(hardenedGoldChestplate),
				new Object[] { 	"I I",
								"III",
								"III",
								
								'I', items.hardenedGoldIngot,
							 });
		//Leggings
		GameRegistry.addRecipe(new ItemStack(hardenedGoldLeggings),
				new Object[] { 	"III",
								"I I",
								"I I",
								
								'I', items.hardenedGoldIngot,
							 });
		//Boots
		GameRegistry.addRecipe(new ItemStack(hardenedGoldBoots),
				new Object[] { 	"I I",
								"I I",
								"   ",
								
								'I', items.hardenedGoldIngot,
							 });
//------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Diamond
		
		//Helmet
		GameRegistry.addRecipe(new ItemStack(hardenedDiamondHelmet),
				new Object[] { 	"III",
								"I I",
								"   ",
								
								'I', items.hardenedDiamond,
							 });
		//Chestplate
		GameRegistry.addRecipe(new ItemStack(hardenedDiamondChestplate),
				new Object[] { 	"I I",
								"III",
								"III",
								
								'I', items.hardenedDiamond,
							 });
		//Leggings
		GameRegistry.addRecipe(new ItemStack(hardenedDiamondLeggings),
				new Object[] { 	"III",
								"I I",
								"I I",
								
								'I', items.hardenedDiamond,
							 });
		//Boots
		GameRegistry.addRecipe(new ItemStack(hardenedDiamondBoots),
				new Object[] { 	"I I",
								"I I",
								"   ",
								
								'I', items.hardenedDiamond,
							 });
		//-------------------------------------------------------------------------------------------------------------------------------------------------------//
				//Armor
				
				//Emerald
				
				//Helmet
				GameRegistry.addRecipe(new ItemStack(hardenedEmeraldHelmet),
						new Object[] { 	"III",
										"I I",
										"   ",
										
										'I', items.hardenedEmerald,
									 });
				//Chestplate
				GameRegistry.addRecipe(new ItemStack(hardenedEmeraldChestplate),
						new Object[] { 	"I I",
										"III",
										"III",
										
										'I', items.hardenedEmerald,
									 });
				//Leggings
				GameRegistry.addRecipe(new ItemStack(hardenedEmeraldLeggings),
						new Object[] { 	"III",
										"I I",
										"I I",
										
										'I', items.hardenedEmerald,
									 });
				//Boots
				GameRegistry.addRecipe(new ItemStack(hardenedEmeraldBoots),
						new Object[] { 	"I I",
										"I I",
										"   ",
										
										'I', items.hardenedEmerald,
									 });
		//------------------------------------------------------------------------------------------------------------------------------------------------------------
				//Redstone
				
				//Helmet
				GameRegistry.addRecipe(new ItemStack(hardenedRedstoneHelmet),
						new Object[] { 	"III",
										"I I",
										"   ",
										
										'I', items.hardenedRedstoneIngot,
									 });
				//Chestplate
				GameRegistry.addRecipe(new ItemStack(hardenedRedstoneChestplate),
						new Object[] { 	"I I",
										"III",
										"III",
										
										'I', items.hardenedRedstoneIngot,
									 });
				//Leggings
				GameRegistry.addRecipe(new ItemStack(hardenedRedstoneLeggings),
						new Object[] { 	"III",
										"I I",
										"I I",
										
										'I', items.hardenedRedstoneIngot,
									 });
				//Boots
				GameRegistry.addRecipe(new ItemStack(hardenedRedstoneBoots),
						new Object[] { 	"I I",
										"I I",
										"   ",
										
										'I', items.hardenedRedstoneIngot,
									 });
		//------------------------------------------------------------------------------------------------------------------------------------------------------------
				//Nether Star
				
				//Helmet
				GameRegistry.addRecipe(new ItemStack(netherStarHelmet),
						new Object[] { 	"INI",
										"I I",
										"   ",
										
										'I', items.hardenedDiamond,
										'N', items.netherStarShards,

									 });
				//Chestplate
				GameRegistry.addRecipe(new ItemStack(netherStarChestplate),
						new Object[] { 	"I I",
										"INI",
										"III",
										
										'I', items.hardenedDiamond,
										'N', items.netherStarShards,

									 });
				//Leggings
				GameRegistry.addRecipe(new ItemStack(netherStarLeggings),
						new Object[] { 	"INI",
										"I I",
										"I I",
										
										'I', items.hardenedDiamond,
										'N', items.netherStarShards,

									 });
				//Boots
				GameRegistry.addRecipe(new ItemStack(netherStarBoots),
						new Object[] { 	"INI",
										"I I",
										"   ",
										
										'I', items.hardenedDiamond,
										'N', items.netherStarShards,

									 });
		//------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	}
	
	//Register all Smelting Recipies
	public static void registerItemSmelting(){
		GameRegistry.addSmelting(items.defectiveLowPressureCore.itemID, new ItemStack(items.lowPressureCore), 0.1f);	
		GameRegistry.addSmelting(items.hardenedIronIngot.itemID, new ItemStack(items.steelIngot), 0.3f);
	}
	public static void registerShaplessCrafting(){
        GameRegistry.addShapelessRecipe(new ItemStack(Block.planks, 5), new ItemStack(blocks.blockMyWood, 1));
	}
}
