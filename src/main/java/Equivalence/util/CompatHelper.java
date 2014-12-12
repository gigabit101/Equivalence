package Equivalence.util;

import Equivalence.compat.CompatIc2;
import Equivalence.compat.CompatThaumcraft;
import cpw.mods.fml.common.Loader;

/**
 * @author Gigabit101
 */

public class CompatHelper 
{
	public static void init()
	{
		if (Loader.isModLoaded("IC2"))
		{
			CompatIc2.init();
		}
		
		if (Loader.isModLoaded("Thaumcraft"))
		{
			CompatThaumcraft.init();
		}
	}

}
