package Equivalence;

import Equivalence.item.ModItems;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRender()
	{
		ModItems.registerRenders();
	}

}
