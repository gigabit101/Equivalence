package Equivalence.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigEquivalence 
{
	private static ConfigEquivalence instance = null;
	
	public static String CATEGORY_RECIPES = "Recipes";
	
	//Vanilla
	public static boolean Iron2Gold;
	public static boolean Gold2Diamand;
	public static boolean Iron2EnderPerl;
	public static boolean Wood2Obsidian;
	public static boolean Dirt2Cobble2Sand;
	public static boolean Dyes2Dyes;
	public static boolean Fish2Fish;

	public static Configuration config;

	private ConfigEquivalence(File configFile) {
		config = new Configuration(configFile);
		config.load();
		ConfigEquivalence.Configs();
		config.save();
	}

	public static ConfigEquivalence initialize(File configFile) {

		if (instance == null)
			instance = new ConfigEquivalence(configFile);
		else
			throw new IllegalStateException(
					"Cannot initialize ConfigEquivalence twice");

		return instance;
	}

	public static ConfigEquivalence instance() {
		if (instance == null) {

			throw new IllegalStateException(
					"Instance of ConfigEquivalence requested before initialization");
		}
		return instance;
	}
	
	public static void Configs() {
		//Vanilla
		Iron2Gold = config.get(CATEGORY_RECIPES,
				"Add Iron2Gold Transmutation Recipe", true,
				"Add or Remove Iron2Gold Transmutation Recipe").getBoolean(true);
		Gold2Diamand = config.get(CATEGORY_RECIPES,
				"Add Gold2Diamand Transmutation Recipe", true,
				"Add or Remove Gold2Diamand Transmutation Recipe").getBoolean(true);
		Iron2EnderPerl = config.get(CATEGORY_RECIPES,
				"Add Iron2EnderPerl Transmutation Recipe", true,
				"Add or Remove Iron2EnderPerl Transmutation Recipe").getBoolean(true);
		Wood2Obsidian = config.get(CATEGORY_RECIPES,
				"Add Wood2Obsidian Transmutation Recipe", true,
				"Add or Remove Wood2Obsidian Transmutation Recipe").getBoolean(true);
		Dirt2Cobble2Sand = config.get(CATEGORY_RECIPES,
				"Add Dirt2Cobble2Sand Transmutation Recipe", true,
				"Add or Remove Dirt2Cobble2Sand Transmutation Recipe").getBoolean(true);
		Dyes2Dyes = config.get(CATEGORY_RECIPES,
				"Add Dyes2Dyes Transmutation Recipe", true,
				"Add or Remove Dyes2Dyes Transmutation Recipe").getBoolean(true);

		
		
		if (config.hasChanged())
			config.save();		
	}

}
