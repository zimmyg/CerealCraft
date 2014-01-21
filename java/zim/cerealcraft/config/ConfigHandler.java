package zim.cerealcraft.config;

import java.io.File;

import zim.cerealcraft.Reference;
import net.minecraftforge.common.Configuration;

public class ConfigHandler 
{
	public static void init(File file)
	{
		Configuration config = new Configuration(file);
		
		config.load();
		
		Reference.ModItems.CEREALBOWL_ID = config.get("IDs", Reference.ModItems.CEREALBOWL_NAME, Reference.ModItems.CEREALBOWL_ID_DEFAULT).getInt();
		Reference.ModItems.DEBUGTOOL_ID = config.get("IDs", Reference.ModItems.DEBUGTOOL_NAME, Reference.ModItems.DEBUGTOOL_ID_DEFAULT).getInt();
		Reference.ModItems.SMASHEDCORN_ID = config.get("IDs", Reference.ModItems.SMASHEDCORN_NAME, Reference.ModItems.SMASHEDCORN_ID_DEFAULT).getInt();
		
		config.save();
	}
}
