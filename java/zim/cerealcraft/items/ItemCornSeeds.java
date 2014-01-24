package zim.cerealcraft.items;

import zim.cerealcraft.Reference;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class ItemCornSeeds extends ItemCC implements IPlantable
{
	public ItemCornSeeds(int id, String name)
	{
		super(id, name);
	}

	@Override
	public EnumPlantType getPlantType(World world, int x, int y, int z)
	{
		return EnumPlantType.Crop;
	}

	@Override
	public int getPlantID(World world, int x, int y, int z)
	{
		return Reference.ModBlocks.CORNCROP_ID;
	}

	@Override
	public int getPlantMetadata(World world, int x, int y, int z)
	{
		return 0;
	}
}
