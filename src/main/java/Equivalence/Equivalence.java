package Equivalence;

import java.io.File;

import Equivalence.config.ConfigEquivalence;
import Equivalence.lib.ModInfo;
import Equivalence.recipe.VanillaRecipes;
import Equivalence.util.CompatHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

/**
 * @author Gigabit101
 */

@Mod(name = ModInfo.MOD_NAME, modid = ModInfo.MOD_ID, version = ModInfo.MOD_VERSION, dependencies = ModInfo.MOD_DEPENDECIES)
public class Equivalence 
{
	public static ConfigEquivalence properties;

	@Instance("Equivalence")
	public static Equivalence instance;
	
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
