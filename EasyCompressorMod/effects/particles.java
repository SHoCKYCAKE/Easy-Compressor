package EasyCompressorMod.effects;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;

public enum particles {
	GLOW;
	
	public void spawnParticle(World world, double x, double y, double z , double motionX, double motionY, double motionZ){
		Minecraft mc = Minecraft.getMinecraft();
		if(mc != null && mc.renderViewEntity != null && mc.effectRenderer != null){
			int particleSetting = mc.gameSettings.particleSetting;
			
			if((particleSetting == 2 && world.rand.nextInt(100) == 1 || (particleSetting == 1 && world.rand.nextInt(600) == 1))){
				return;
			}
			double distanceX = mc.renderViewEntity.posX - x;
			double distanceY = mc.renderViewEntity.posY - y;
			double distanceZ = mc.renderViewEntity.posZ - z;
			
			double maxDistance = 32;
			if(distanceX * distanceX + distanceY * distanceY + distanceZ * distanceZ > maxDistance * maxDistance){
				return;
			}
			EntityFX particleEffect = null;
			
			switch(this){
			case GLOW:
				particleEffect = new EntityGlowFX(world, x, y, z, motionX, motionY, motionZ);
				break;
			}
			if(particleEffect != null){
				Minecraft.getMinecraft().effectRenderer.addEffect(particleEffect);
			}

		}
		
	}

}
