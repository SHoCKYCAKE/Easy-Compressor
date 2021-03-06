package EasyCompressorMod.items.cores;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import EasyCompressorMod.CreativTab;
import EasyCompressorMod.items.itemInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

	public class itemHighPressureCore extends Item{

		public itemHighPressureCore(int id) {
			super(id);
			setCreativeTab(CreativTab.tabMex);
			setMaxStackSize(64);
			setUnlocalizedName(itemInfo.highPressureCore_UNLOCALIZED_NAME);
		}

		
		
		@Override
		@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister register) {
			itemIcon = register.registerIcon(itemInfo.TEXTURE_LOC + ":" + itemInfo.highPressureCore_ICON);
		}	
		
		//Makes a shiny effect
		@SideOnly(Side.CLIENT)
		public boolean hasEffect(ItemStack par1ItemStack){
			return true;
		}
		
		//Make blue name
		@Override
		@SideOnly(Side.CLIENT)
		public EnumRarity getRarity(ItemStack par1ItemStack){
			return EnumRarity.rare;
		}
}