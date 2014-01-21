package zim.cerealcraft.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemCerealBowl extends FoodItemCC
{
	public ItemCerealBowl(int id, String name)
	{
		super(id, 8, 0.7F, name);
		setMaxStackSize(1);
		setPotionEffect(1, 4, 0, 1.0F);
	}
	
	public static void registerRecipe()
	{
		CraftingManager.getInstance().addRecipe(new ItemStack(ModItems.cerealBowl), 
	    		new Object[] { "CCC", " M ", " U ", Character.valueOf('C'), new ItemStack(ModItems.smashedCorn),
	    											Character.valueOf('M'), new ItemStack(Item.bucketMilk),
	    											Character.valueOf('U'), new ItemStack(Item.bowlEmpty)});
	}
}
