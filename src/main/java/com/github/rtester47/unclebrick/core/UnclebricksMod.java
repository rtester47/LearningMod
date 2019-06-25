package com.github.rtester47.unclebrick.core;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.rtester47.unclebrick.init.ModBlocks;
import com.github.rtester47.unclebrick.init.ModItems;



@Mod(UnclebricksMod.MODID)
public class UnclebricksMod 
{
	public static final String MODID = "unclebricksmod";
	public static UnclebricksMod instance;

	public static CommonProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);
	
	public static Logger logger = LogManager.getLogger(MODID);
	
	public UnclebricksMod()
	{
		instance = this;
		
	    FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
	    FMLJavaModLoadingContext.get().getModEventBus().addListener(this::loadComplete);
	    MinecraftForge.EVENT_BUS.addListener(this::serverStarting);
		
		ModBlocks.init();
		ModItems.init();
	}
	
	  private void clientSetup(final FMLClientSetupEvent event)
	    {
	        
	    }

	    private void loadComplete(final FMLLoadCompleteEvent event)
	    {
	        proxy.init();
	    }

	    public void serverStarting(FMLServerStartingEvent evt)
	    {

	    }
}
