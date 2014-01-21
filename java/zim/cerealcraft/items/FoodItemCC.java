package zim.cerealcraft.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import zim.cerealcraft.CerealCraft;
import zim.cerealcraft.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class FoodItemCC extends ItemFood
{
	public FoodItemCC(int id, int healAmount, float saturation, String name)
	{
		super(id, healAmount, saturation, false);
		setUnlocalizedName(name);
		setCreativeTab(CerealCraft.creativeTab);
		register(name);
	}	
	
	private void register(String name)
	{
		GameRegistry.registerItem(this, name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon(Reference.General.MODID + ":" + getUnlocalizedName().replace("item.", ""));
	}
}
