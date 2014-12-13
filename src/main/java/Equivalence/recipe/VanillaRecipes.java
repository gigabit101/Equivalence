package Equivalence.recipe;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import Equivalence.config.ConfigEquivalence;
import Equivalence.util.CraftingHelper;

import com.pahimar.ee3.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author Gigabit101
 */

public class VanillaRecipes 
{
    private static ItemStack miniumStoneStack = new ItemStack(ModItems.stoneMinium, 1, OreDictionary.WILDCARD_VALUE);

    private static Item miniumStone = ModItems.stoneMinium;
    
    private static ItemStack anyWood = new ItemStack(Blocks.log, 1, OreDictionary.WILDCARD_VALUE);

    
	public static void init(ConfigEquivalence properties)
	{
		//GoldBlock To DiamondBlock and Back
		if (properties.GoldBlock2DiamandBlock){
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.diamond_block), miniumStoneStack, Blocks.gold_block, Blocks.gold_block, Blocks.gold_block, Blocks.gold_block);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gold_block,4), miniumStoneStack, Blocks.diamond_block);
		}
		//Gold To Diamond and Diamond to Gold
		if (properties.Gold2Diamand){
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond), miniumStoneStack, Items.gold_ingot, Items.gold_ingot, Items.gold_ingot, Items.gold_ingot);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot,4), miniumStoneStack, Items.diamond);
		}
		//IronBlock To GoldBlock and Back
		if (properties.Ironblock2GoldBlock){
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gold_block), miniumStoneStack, Blocks.iron_block, Blocks.iron_block, Blocks.iron_block, Blocks.iron_block, Blocks.iron_block, Blocks.iron_block, Blocks.iron_block, Blocks.iron_block);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot,8), miniumStoneStack, Items.gold_ingot);
		}
		//Iron To Gold and Gold To Iron
		if (properties.Iron2Gold){
		GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot), miniumStoneStack, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot,8), miniumStoneStack, Items.gold_ingot);
		}
		//Iron To Ender Perl and Back
		if (properties.Iron2EnderPerl){
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ender_pearl), miniumStoneStack, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot,4), miniumStoneStack, Items.ender_pearl);
		}
		//Wood To Obsidian
		if (properties.Wood2Obsidian){
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian), miniumStoneStack, anyWood, anyWood);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.log,2), miniumStoneStack, Blocks.obsidian);
		}
		//Cobble To Flint
		if (properties.Cobble2Flint){
		GameRegistry.addShapelessRecipe(new ItemStack(Items.flint), miniumStoneStack, Blocks.cobblestone, Blocks.cobblestone, Blocks.cobblestone, Blocks.cobblestone);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone,4), miniumStoneStack, Items.flint);
		}
		//Sticks To Planks
		if (properties.Stick2Plank){
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks), miniumStone, Items.stick, Items.stick);
		}
		//Clay Block To Clay
		if (properties.ClayBlock2Clay){
		GameRegistry.addShapelessRecipe(new ItemStack(Items.clay_ball,4), miniumStone, Blocks.clay);
		}
		//SandStone 2 Sand
		if (properties.SandStone2Sand){
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sand,4), miniumStone, Blocks.sand, Blocks.sand, Blocks.sand, Blocks.sand);
		}
		//Dirt To Cobble To Sand To Dirt
		if (properties.Dirt2Cobble2Sand){
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone), miniumStoneStack, Blocks.dirt);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sand), miniumStoneStack, Blocks.cobblestone);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.dirt), miniumStoneStack, Blocks.sand);
		}
		//Dyes
		if (properties.Dyes2Dyes){
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,0), miniumStoneStack, new ItemStack(Items.dye,1,15));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,1), miniumStoneStack, new ItemStack(Items.dye,1,0));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,2), miniumStoneStack, new ItemStack(Items.dye,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,3), miniumStoneStack, new ItemStack(Items.dye,1,2));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,4), miniumStoneStack, new ItemStack(Items.dye,1,3));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,5), miniumStoneStack, new ItemStack(Items.dye,1,4));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,6), miniumStoneStack, new ItemStack(Items.dye,1,5));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,7), miniumStoneStack, new ItemStack(Items.dye,1,6));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,8), miniumStoneStack, new ItemStack(Items.dye,1,7));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,9), miniumStoneStack, new ItemStack(Items.dye,1,8));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,10), miniumStoneStack, new ItemStack(Items.dye,1,9));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,11), miniumStoneStack, new ItemStack(Items.dye,1,10));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,12), miniumStoneStack, new ItemStack(Items.dye,1,11));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,13), miniumStoneStack, new ItemStack(Items.dye,1,12));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,14), miniumStoneStack, new ItemStack(Items.dye,1,13));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,15), miniumStoneStack, new ItemStack(Items.dye,1,14));
		}
		//Fish
		if (properties.Fish2Fish){
		GameRegistry.addShapelessRecipe(new ItemStack(Items.fish,1,1), miniumStone, new ItemStack(Items.fish,1,0));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.fish,1,2), miniumStone, new ItemStack(Items.fish,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.fish,1,3), miniumStone, new ItemStack(Items.fish,1,2));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.fish,1,0), miniumStone, new ItemStack(Items.fish,1,3));
		}

		miniumStone.setContainerItem(miniumStone);
	}

}
