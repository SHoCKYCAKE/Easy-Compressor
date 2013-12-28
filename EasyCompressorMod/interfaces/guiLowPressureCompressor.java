package EasyCompressorMod.interfaces;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import EasyCompressorMod.tileentity.tileEntityLowPressureCompressor;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class guiLowPressureCompressor extends GuiContainer{

	public guiLowPressureCompressor(InventoryPlayer invPlayer, tileEntityLowPressureCompressor lpc) {
		
		super(new containerLowPressureCompressor(invPlayer, lpc));
		
		xSize = 175;
		ySize = 153;
	}
	
	private static final ResourceLocation texture = new ResourceLocation("easycompressor", "textures/gui/lowPressureCompressorGUI.png");

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1, 1, 1, 1);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
	    drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	
	}

}
