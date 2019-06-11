package unclebrick.core;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import unclebrick.init.ModBlocks;
import unclebrick.init.ModItems;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



@Mod(UnclebricksMod.modid)
public class UnclebricksMod 
{
	public static final String modid = "unclebricksmod";
	public static UnclebricksMod instance;

	public static CommonProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);
	
	public static Logger logger = LogManager.getLogger(modid);
	
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
