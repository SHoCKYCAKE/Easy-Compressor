package EasyCompressorMod.blocks;


import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import EasyCompressorMod.CreativTab;
import EasyCompressorMod.effects.EntityGlowFX;
import EasyCompressorMod.effects.particles;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class blockGlowstoneLamp extends Block{

	public blockGlowstoneLamp(int par1, Material par2Material) {
		super(par1, par2Material);
		
		setCreativeTab(CreativTab.tabMex);
		setHardness(6f);
		setStepSound(Block.soundMetalFootstep);
		setUnlocalizedName(blockInfo.glowstoneLamp_UNLOCALIZED_NAME);
		setLightValue(1.0F);
	}
	
	@SideOnly(Side.CLIENT)
	private Icon topIcon;
	@SideOnly(Side.CLIENT)
	private Icon botIcon;
	@SideOnly(Side.CLIENT)
	private Icon sideIcon;
	
    @SideOnly(Side.CLIENT)
    public static Icon particleIcon;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		topIcon = register.registerIcon(blockInfo.TEXTURE_LOC + ":" + blockInfo.glowstoneLampTOP);
		botIcon = register.registerIcon(blockInfo.TEXTURE_LOC + ":" + blockInfo.glowstoneLampBOTTOM);
		
		sideIcon = register.registerIcon(blockInfo.TEXTURE_LOC + ":" + blockInfo.glowstoneLampSIDE);	
		particleIcon = register.registerIcon(blockInfo.TEXTURE_LOC + ":" + blockInfo.glow_PARTICLE_TEXTURE);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta) {
		if (side == 0) {
			return botIcon;
		}else if(side == 1) {
			return topIcon;
		}else{
			return sideIcon;
		}	
	}
	

    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random rand){
    	for(int i = 0; i < 4; i++){
    		float particleX = x + rand.nextFloat();
    		float particleY = y + rand.nextFloat();
    		float particleZ = z + rand.nextFloat();
    		
    		float particleMotionX = -0.5F + rand.nextFloat();
    		float particleMotionY = -0.5F + rand.nextFloat();
    		float particleMotionZ = 0.000000001F;
    	
    		particles.GLOW.spawnParticle(world, particleX, particleY, particleZ, particleMotionX, particleMotionY, particleMotionZ);
    	}
    }
	
}
