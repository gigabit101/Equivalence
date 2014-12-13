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
	public static boolean Cobble2Flint;
	public static boolean Stick2Plank;
	public static boolean SandStone2Sand;
	public static boolean ClayBlock2Clay;
	public static boolean Ironblock2GoldBlock;
	public static boolean GoldBlock2DiamandBlock;



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
		Cobble2Flint = config.get(CATEGORY_RECIPES,
				"Add Cobble2Flint Transmutation Recipe", true,
				"Add or Remove Cobble2Flint Transmutation Recipe").getBoolean(true);
		Stick2Plank = config.get(CATEGORY_RECIPES,
				"Add Stick2Plank Transmutation Recipe", true,
				"Add or Remove Stick2Plank Transmutation Recipe").getBoolean(true);
		SandStone2Sand = config.get(CATEGORY_RECIPES,
				"Add SandStone2Sand Transmutation Recipe", true,
				"Add or Remove SandStone2Sand Transmutation Recipe").getBoolean(true);
		ClayBlock2Clay = config.get(CATEGORY_RECIPES,
				"Add ClayBlock2Clay Transmutation Recipe", true,
				"Add or Remove ClayBlock2Clay Transmutation Recipe").getBoolean(true);
		Cobble2Flint = config.get(CATEGORY_RECIPES,
				"Add Cobble2Flint Transmutation Recipe", true,
				"Add or Remove Cobble2Flint Transmutation Recipe").getBoolean(true);
		GoldBlock2DiamandBlock = config.get(CATEGORY_RECIPES,
				"Add GoldBlock2DiamandBlock Transmutation Recipe", true,
				"Add or Remove GoldBlock2DiamandBlock Transmutation Recipe").getBoolean(true);
		Ironblock2GoldBlock = config.get(CATEGORY_RECIPES,
				"Add Ironblock2GoldBlock Transmutation Recipe", true,
				"Add or Remove Ironblock2GoldBlock Transmutation Recipe").getBoolean(true);

		
		
		if (config.hasChanged())
			config.save();		
	}

}
