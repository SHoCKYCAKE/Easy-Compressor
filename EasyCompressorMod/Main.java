package EasyCompressorMod;

import EasyCompressorMod.blocks.blocks;
import EasyCompressorMod.config.configHandler;
import EasyCompressorMod.items.items;
import EasyCompressorMod.network.packetHandler;
import EasyCompressorMod.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(channels = {ModInfo.CHANNEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = packetHandler.class)


public class Main {
	

	@Instance(ModInfo.ID)
	public static Main instance;

	@SidedProxy(clientSide = "EasyCompressorMod.proxies.ClientProxy", serverSide = "EasyCompressor.proxies.CommonProxy")
	public static CommonProxy proxy;

	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		configHandler.init(event.getSuggestedConfigurationFile());
				
		items.init();
		blocks.init();
		
		proxy.initSounds();
		proxy.initRenderers();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		items.addNames();
		blocks.addNames();
		
		items.registerItemRecipes();
		blocks.registerBlockRecipes();
		items.registerSmelting();
	}
	
	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent event) {
	
	}

	
}
