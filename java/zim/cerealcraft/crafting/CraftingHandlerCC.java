package zim.cerealcraft.crafting;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import zim.cerealcraft.items.ModItems;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftingHandlerCC implements ICraftingHandler
{
	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory inv)
	{
		for(int i = 0; i < inv.getSizeInventory(); i++)
		{
			if(inv.getStackInSlot(i) != null)
			{
				ItemStack stack = inv.getStackInSlot(i);
				if(stack.getItem() != null && stack.getItem() == ModItems.cerealBox)
				{
					ItemStack newStack = new ItemStack(ModItems.cerealBox, 2, stack.getItemDamage() + 1); 
					inv.setInventorySlotContents(i, newStack);
				}
			}
		}
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item)
	{
	}
}
