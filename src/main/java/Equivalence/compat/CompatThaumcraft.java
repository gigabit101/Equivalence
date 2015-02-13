//package Equivalence.compat;
//
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import net.minecraftforge.fml.common.registry.GameRegistry;
//import net.minecraftforge.oredict.OreDictionary;
//import Equivalence.config.ConfigEquivalence;
//
///**
// * @author Gigabit101
// */
//
//public class CompatThaumcraft 
//{
//	private static ItemStack miniumStoneStack = new ItemStack(ModItems.stoneMinium, 1, OreDictionary.WILDCARD_VALUE);
//
//	private static Item miniumStone = ModItems.stoneMinium;
//	
//	private static Item shard = ConfigItems.itemShard;
//	    
//	public static void init(ConfigEquivalence properties)
//	{
//		//Shards
//		if (properties.Shards2Shards){
//		GameRegistry.addShapelessRecipe(new ItemStack(shard), miniumStoneStack, new ItemStack(shard,1,5));
//		GameRegistry.addShapelessRecipe(new ItemStack(shard,1,1), miniumStoneStack, new ItemStack(shard));
//		GameRegistry.addShapelessRecipe(new ItemStack(shard,1,2), miniumStoneStack, new ItemStack(shard,1,1));
//		GameRegistry.addShapelessRecipe(new ItemStack(shard,1,3), miniumStoneStack, new ItemStack(shard,1,2));
//		GameRegistry.addShapelessRecipe(new ItemStack(shard,1,4), miniumStoneStack, new ItemStack(shard,1,3));
//		GameRegistry.addShapelessRecipe(new ItemStack(shard,1,5), miniumStoneStack, new ItemStack(shard,1,4));
//		}
//	}
//}
