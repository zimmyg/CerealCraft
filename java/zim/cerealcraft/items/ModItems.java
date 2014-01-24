package zim.cerealcraft.items;

import zim.cerealcraft.Reference;

public class ModItems
{
	public static ItemCerealBowl cerealBowl;
	public static ItemDebugTool debugTool;
	public static ItemSmashedCorn smashedCorn;
	public static ItemShreddedWheat shreddedWheat;
	public static ItemCerealBox cerealBox;
	public static ItemCornSeeds cornSeeds;
	
	public static void initItems()
	{
		cerealBowl = new ItemCerealBowl(Reference.ModItems.CEREALBOWL_ID, Reference.ModItems.CEREALBOWL_NAME);
		debugTool = new ItemDebugTool(Reference.ModItems.DEBUGTOOL_ID, Reference.ModItems.DEBUGTOOL_NAME);
		smashedCorn = new ItemSmashedCorn(Reference.ModItems.SMASHEDCORN_ID, Reference.ModItems.SMASHEDCORN_NAME);
		shreddedWheat = new ItemShreddedWheat(Reference.ModItems.SHREDEDWHEAT_ID, Reference.ModItems.SHREDDEDWHEAT_NAME);
		cerealBox = new ItemCerealBox(Reference.ModItems.CEREALBOX_ID, Reference.ModItems.CEREALBOX_NAME);
		cornSeeds = new ItemCornSeeds(Reference.ModItems.CORNSEEDS_ID, Reference.ModItems.CORNSEEDS_NAME);
	}
	
	public static void registerRecipes()
	{
		cerealBowl.registerRecipe();
		smashedCorn.registerRecipe();
		shreddedWheat.registerRecipe();
		cerealBox.registerRecipe();
	}
}
