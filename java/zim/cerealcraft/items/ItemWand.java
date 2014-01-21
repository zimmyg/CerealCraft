package zim.cerealcraft.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWand extends Item
{
	public ItemWand(int id) {
		super(id);
		setCreativeTab(CreativeTabs.tabCombat);
		setMaxStackSize(1);
		setUnlocalizedName(ItemInfo.WAND_UNLOCALISED_NAME);
	}
	
	@Override
	public boolean itemInteractionForEntity(ItemStack itemStack, EntityPlayer player, EntityLivingBase target)
    {
		if(!target.worldObj.isRemote)
		{
			target.motionY = 2;
			itemStack.setItemDamage(itemStack.getItemDamage() + 1);
		}
			
        return false;
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register)
	{
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_PATH + ":" + ItemInfo.WAND_ICON);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List info, boolean useExtraInformation)
	{
		info.add("This has been used " + itemStack.getItemDamage() + " times");
	}
}
