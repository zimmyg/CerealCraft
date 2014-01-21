package zim.cerealcraft.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import zim.cerealcraft.items.ItemInfo;
import zim.cerealcraft.items.Items;

public class ConfigHandler 
{
	public static void init(File file)
	{
		Configuration config = new Configuration(file);
		
		config.load();
		
		ItemInfo.WAND_ID = config.getItem(ItemInfo.WAND_KEY, ItemInfo.WAND_DEFAULT).getInt() - 256;
		Items.init();
		
		config.save();
	}
}
