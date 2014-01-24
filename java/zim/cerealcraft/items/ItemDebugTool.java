package zim.cerealcraft.items;

import org.lwjgl.input.Keyboard;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemDebugTool extends ItemCC
{
	private enum DBMode
	{
		CLR_HUNGR
	}
	
	private DBMode mode = DBMode.CLR_HUNGR;

	public ItemDebugTool(int id, String name)
	{
		super(id, name);
		setMaxStackSize(1);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
	{
		if(!world.isRemote){			
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)){
				cycleMode();	
				player.addChatMessage("Debug Mode: " + mode);
			} else {
				switch(mode){
					case CLR_HUNGR:
						player.getFoodStats().setFoodLevel(0);
						player.getFoodStats().setFoodSaturationLevel(0);
						break;
				}
			}
		}
		
		return itemStack;
	}
	
	private void cycleMode()
	{
		DBMode[] modes = mode.values();
		int ord = mode.ordinal();
		
		if(++ord >= modes.length)
			ord = 0;
			
		mode = modes[ord];
	}
}
