package Equivalence;

import Equivalence.lib.ModInfo;
import Equivalence.recipe.VanillaRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author Gigabit101
 */

@Mod(name = ModInfo.MOD_NAME, modid = ModInfo.MOD_ID, version = ModInfo.MOD_VERSION, dependencies = ModInfo.MOD_DEPENDECIES)
public class Equivalence 
{
	@Instance("Equivalence")
	public static Equivalence instance;
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		//Loads Vanilla Transmutation Recipes
		VanillaRecipes.init();
	}
	
	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent event)
	{
		
	}

}
