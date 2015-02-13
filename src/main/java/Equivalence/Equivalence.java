package Equivalence;

import java.io.File;

import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import Equivalence.config.ConfigEquivalence;
import Equivalence.item.ModItems;
import Equivalence.lib.ModInfo;
import Equivalence.recipe.VanillaRecipes;
import Equivalence.util.CompatHelper;

/**
 * @author Gigabit101
 */

@Mod(name = ModInfo.MOD_NAME, modid = ModInfo.MOD_ID, version = ModInfo.MOD_VERSION, dependencies = ModInfo.MOD_DEPENDECIES)
public class Equivalence 
{
	public static ConfigEquivalence properties;

	@Instance("Equivalence")
	public static Equivalence instance;
	
	@SidedProxy(clientSide = ModInfo.CLIENT_PROXY_CLASS, serverSide = ModInfo.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		instance = this;
		//Loads Config
		String path = event.getSuggestedConfigurationFile().getAbsolutePath()
				.replace(ModInfo.MOD_ID, "Equivalence");
		
		properties = ConfigEquivalence.initialize(new File(path));
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		//Load TransmutationStone
		ModItems.init();
		//Load Renders
		proxy.registerRender();
		//Loads Vanilla Transmutation Recipes
		VanillaRecipes.init(properties);
		//Loads Mod Compat
		CompatHelper.init();
	}
	
	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent event){}
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent cfgChange)
	{
		if (cfgChange.modID.equals("Equivalence")) {
			ConfigEquivalence.Configs();

		}
	}

}
