package zim.cerealcraft.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import zim.cerealcraft.CerealCraft;
import zim.cerealcraft.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class ItemCC extends Item
{
	public ItemCC(int id, String name)
	{
		super(id);
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
