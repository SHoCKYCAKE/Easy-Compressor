package EasyCompressorMod.armor.betterRedstoneArmor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import EasyCompressorMod.CreativTab;
import EasyCompressorMod.items.itemInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class hardenedRedstoneChestplate extends ItemArmor{

	public hardenedRedstoneChestplate(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		setCreativeTab(CreativTab.tabMex);
		setMaxStackSize(1);
		setUnlocalizedName(itemInfo.hardenedRedstoneChestplate_UNLOCALIZED_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(itemInfo.TEXTURE_LOC + ":" + itemInfo.hardenedRedstoneChestplate_ICON);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer){
		return "easycompressor:textures/models/armor/redstone_layer_1.png";
	}

}
