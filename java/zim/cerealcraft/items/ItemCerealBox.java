package zim.cerealcraft.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

public class ItemCerealBox extends ItemCC
{
	public ItemCerealBox(int id, String name)
	{
		super(id, name);
		setMaxStackSize(1);
		setMaxDamage(3);
	}

	public static void registerRecipe()
	{
		CraftingManager cm = CraftingManager.getInstance();

		cm.addRecipe(new ItemStack(ModItems.cerealBox), 
				new Object[] { "PWP", "PWP", "PWP", Character.valueOf('P'), new ItemStack(Item.paper), 
													Character.valueOf('W'),	new ItemStack(ModItems.shreddedWheat) });

		cm.addRecipe(new ItemStack(ModItems.cerealBox),	
				new Object[] { "PCP", "PCP", "PCP", Character.valueOf('P'),	new ItemStack(Item.paper), 
													Character.valueOf('C'),	new ItemStack(ModItems.smashedCorn) });
	}
}
