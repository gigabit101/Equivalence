package Equivalence.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import Equivalence.lib.ModInfo;

public class ModItems {
	
	public static Item tarnsStone;
	
	public static void init()
	{
		tarnsStone = new ItemTransmutationStone();
		GameRegistry.registerItem(tarnsStone, ModInfo.TRANS_STONE_NAME);
		registerRecipes();
	}

	@SideOnly(Side.CLIENT)
	public static void registerRenders()
	{
		registerRender(tarnsStone);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ModInfo.MOD_ID.toLowerCase() + ":" + item.getUnlocalizedName().toLowerCase().substring(5), "inventory"));
	}
	
	public static void registerRecipes()
	{

		GameRegistry.addShapedRecipe(new ItemStack (tarnsStone),
						new Object[] { "GRG", "RDR", "GRG", 'G',
								Items.glowstone_dust, 'R', Items.redstone, 'D',
								Items.diamond });	}
	}
