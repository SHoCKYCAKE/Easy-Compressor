package EasyCompressorMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CreativTab {
	public static void load(){
	     LanguageRegistry.instance().addStringLocalization("itemGroup.tabMex", "en_US", "Hardened Things");
	}
	 public static CreativeTabs tabMex = new CreativeTabs("tabMex") {
	     public ItemStack getIconItemStack() {
	            return new ItemStack(EasyCompressorMod.items.items.defectiveHighPressureCore) ;
	            }
	    };

}
