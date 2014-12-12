package Equivalence.recipe;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.pahimar.ee3.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author Gigabit101
 */

public class VanillaRecipes 
{
    private static ItemStack miniumStoneStack = new ItemStack(ModItems.stoneMinium, 1, OreDictionary.WILDCARD_VALUE);

    public static Item miniumStone = ModItems.stoneMinium;
    
	public static void init()
	{
		//Gold To Diamond and Diamond to Gold
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond), miniumStoneStack, Items.gold_ingot, Items.gold_ingot, Items.gold_ingot, Items.gold_ingot);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot,4), miniumStoneStack, Items.diamond);
		
		//Iron To Gold and Gold To Iron
		GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot), miniumStoneStack, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot,8), miniumStoneStack, Items.gold_ingot);
		
		//Iron To Ender Perl and Back
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ender_pearl), miniumStoneStack, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot,4), miniumStoneStack, Items.ender_pearl);
		
		//Wood To Obsidian
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian), miniumStoneStack, Blocks.log, Blocks.log);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.log,2), miniumStoneStack, Blocks.obsidian);
		
		//Dirt To Cobble To Sand To Dirt
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone), miniumStoneStack, Blocks.dirt);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sand), miniumStoneStack, Blocks.cobblestone);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.dirt), miniumStoneStack, Blocks.sand);
		
		//Dyes
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
		
		//Fish
		GameRegistry.addShapelessRecipe(new ItemStack(Items.fish,1,1), miniumStone, new ItemStack(Items.fish,1,0));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.fish,1,2), miniumStone, new ItemStack(Items.fish,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.fish,1,3), miniumStone, new ItemStack(Items.fish,1,2));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.fish,1,0), miniumStone, new ItemStack(Items.fish,1,3));


		
		miniumStone.setContainerItem(miniumStone);
	}

}
