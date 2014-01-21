package zim.cerealcraft.items;

import zim.cerealcraft.Reference;

public class ModItems
{
	public static ItemCerealBowl cerealBowl;
	
	public static void initItems()
	{
		cerealBowl = new ItemCerealBowl(Reference.ModItems.CEREALBOWL_ID, Reference.ModItems.CEREALBOWL_NAME);
	}
}
