package EasyCompressorMod.effects;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import EasyCompressorMod.ModInfo;

public class EntityGlowFX extends EntityFX{
	
	private static final ResourceLocation texture = new ResourceLocation(ModInfo.ID, "textures/particle/glow.png");
	
	public EntityGlowFX(World world, double x, double y, double z, double motionX, double motionY, double motionZ) {
		super(world, x, y, z, motionX, motionY, motionZ);
		
		setParticleIcon(EasyCompressorMod.blocks.blockGlowstoneLamp.particleIcon);
		
		particleMaxAge = 200;
		particleScale = 2;
		particleAlpha = rand.nextFloat();
		
		}
	@Override
	public void onUpdate(){
		super.onUpdate();
		particleScale = (1- (float)particleAge / particleMaxAge)* 2;	
	}
	
	@Override
	public int getFXLayer() {
		return 1;
	}
	
}
