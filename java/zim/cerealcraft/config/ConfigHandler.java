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
		
		Reference.ModItems.CEREALBOWL_ID = config.get("ItemIDs", Reference.ModItems.CEREALBOWL_NAME, Reference.ModItems.CEREALBOWL_ID_DEFAULT).getInt();
		Reference.ModItems.DEBUGTOOL_ID = config.get("ItemIDs", Reference.ModItems.DEBUGTOOL_NAME, Reference.ModItems.DEBUGTOOL_ID_DEFAULT).getInt();
		Reference.ModItems.SMASHEDCORN_ID = config.get("ItemIDs", Reference.ModItems.SMASHEDCORN_NAME, Reference.ModItems.SMASHEDCORN_ID_DEFAULT).getInt();
		Reference.ModItems.SHREDEDWHEAT_ID = config.get("ItemIDs", Reference.ModItems.SHREDDEDWHEAT_NAME, Reference.ModItems.SHREDDEDWHEAT_ID_DEFAULT).getInt();
		Reference.ModItems.CEREALBOX_ID = config.get("ItemIDs", Reference.ModItems.CEREALBOX_NAME, Reference.ModItems.CEREALBOX_ID_DEFAULT).getInt();
		Reference.ModItems.CORNSEEDS_ID = config.get("ItemIDs", Reference.ModItems.CORNSEEDS_NAME, Reference.ModItems.CORNSEEDS_ID_DEFAULT).getInt();
		
		Reference.ModBlocks.CORNCROP_ID = config.get("BlockIDs", Reference.ModBlocks.CORNCROP_NAME, Reference.ModBlocks.CORNCROP_ID_DEFAULT).getInt();
		
		config.save();
	}
}
