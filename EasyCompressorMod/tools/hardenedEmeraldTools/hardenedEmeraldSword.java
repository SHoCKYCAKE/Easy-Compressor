package EasyCompressorMod.tools.hardenedEmeraldTools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;
import EasyCompressorMod.CreativTab;
import EasyCompressorMod.items.itemInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class hardenedEmeraldSword extends ItemSword{

	public hardenedEmeraldSword(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id, par2EnumToolMaterial);
		setCreativeTab(CreativTab.tabMex);
		setMaxStackSize(1);
		setUnlocalizedName(itemInfo.hardenedEmeraldSword_UNLOCALIZED_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(itemInfo.TEXTURE_LOC + ":" + itemInfo.hardenedEmeraldSword_ICON);
	}

}