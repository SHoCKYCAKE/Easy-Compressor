package EasyCompressorMod.items.cores;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import EasyCompressorMod.CreativTab;
import EasyCompressorMod.items.itemInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

	public class itemDefectiveLowPressureCore extends Item{
		
		public itemDefectiveLowPressureCore(int id) {
			super(id);
			setCreativeTab(CreativTab.tabMex);
			setMaxStackSize(64);
			setUnlocalizedName(itemInfo.defectiveLowPressureCore_UNLOCALIZED_NAME);
		}

		
		
		@Override
		@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister register) {
			itemIcon = register.registerIcon(itemInfo.TEXTURE_LOC + ":" + itemInfo.defectiveLowPressureCore_ICON);
		}	
}