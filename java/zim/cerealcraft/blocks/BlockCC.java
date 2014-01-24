package zim.cerealcraft.blocks;

import javax.imageio.spi.RegisterableService;

import cpw.mods.fml.common.registry.GameRegistry;
import zim.cerealcraft.CerealCraft;
import zim.cerealcraft.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public abstract class BlockCC extends Block
{
	public BlockCC(int id, Material material, String name)
	{
		super(id, material);
		setUnlocalizedName(name);
		setCreativeTab(CerealCraft.creativeTab);
		register(name);
	}
	
	private void register(String name)
	{
		GameRegistry.registerBlock(this, name);
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon(Reference.General.MODID + ":" + getUnlocalizedName().replace("tile.", ""));
	}
}
