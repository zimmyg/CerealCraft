package zim.cerealcraft.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCerealBowl extends FoodItemCC
{
	public ItemCerealBowl(int id, String name)
	{
		super(id, 8, 0.7F, name);
		setMaxStackSize(1);
		//setPotionEffect(1, 4, 0, 1.0F);
	}
	
	public static void registerRecipe()
	{
		CraftingManager.getInstance().addShapelessRecipe(new ItemStack(ModItems.cerealBowl), 
				new Object[] { new ItemStack(ModItems.cerealBox, 1, OreDictionary.WILDCARD_VALUE), 
							   new ItemStack(Item.bucketMilk), 
							   new ItemStack(Item.bowlEmpty) });
	}
	
	@Override
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		super.onEaten(par1ItemStack, par2World, par3EntityPlayer);
		return new ItemStack(Item.bowlEmpty);
	}
}
