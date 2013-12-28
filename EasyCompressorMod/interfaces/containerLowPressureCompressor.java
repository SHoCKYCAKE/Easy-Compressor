package EasyCompressorMod.interfaces;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import EasyCompressorMod.tileentity.tileEntityLowPressureCompressor;


public class containerLowPressureCompressor extends Container{
	
	private tileEntityLowPressureCompressor lpc;

	public containerLowPressureCompressor(InventoryPlayer invPlayer, tileEntityLowPressureCompressor lpc){
		this.lpc = lpc;
	}
	
	
	
	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return lpc.isUseableByPlayer(entityplayer);
	}

}
