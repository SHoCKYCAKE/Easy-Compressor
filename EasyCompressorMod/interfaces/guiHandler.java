package EasyCompressorMod.interfaces;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import EasyCompressorMod.Main;
import EasyCompressorMod.tileentity.tileEntityLowPressureCompressor;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class guiHandler implements IGuiHandler{

	public guiHandler(){
		NetworkRegistry.instance().registerGuiHandler(Main.instance, this);
	}
	
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		
		switch(ID){
		case 0:
			TileEntity te = world.getBlockTileEntity(x, y, z);
			if(te != null && te instanceof tileEntityLowPressureCompressor){
				return new containerLowPressureCompressor(player.inventory, (tileEntityLowPressureCompressor)te);
			}
			break;
		}

		return null;
		
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		
		switch(ID){
		case 0:
			TileEntity te = world.getBlockTileEntity(x, y, z);
			if(te != null && te instanceof tileEntityLowPressureCompressor){
				return new guiLowPressureCompressor(player.inventory, (tileEntityLowPressureCompressor)te);
			}
			break;
		}

		return null;
	}

}
