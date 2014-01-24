package zim.cerealcraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.CraftingManager;
import zim.cerealcraft.blocks.ModBlocks;
import zim.cerealcraft.config.ConfigHandler;
import zim.cerealcraft.crafting.CraftingHandlerCC;
import zim.cerealcraft.items.ModItems;
import zim.cerealcraft.network.PacketHandler;
import zim.cerealcraft.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Reference.General.MODID, name = Reference.General.MODNAME)
@NetworkMod(channels = {Reference.General.NETCHANNEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class CerealCraft
{   
    @Instance(Reference.General.MODID)
    public static CerealCraft instance;
    
    @SidedProxy(clientSide = "zim.cerealcraft.proxies.ClientProxy", serverSide = "zim.cerealcraft.proxies.CommonProxy")
    public static CommonProxy proxy;
    
    public static CreativeTabs creativeTab = new CreativeTabs(Reference.General.MODID)
    {
    	@Override
    	@SideOnly(Side.CLIENT)
    	public Item getTabIconItem() 
    	{
    		return Item.bowlSoup;
    	}
    };
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ConfigHandler.init(event.getSuggestedConfigurationFile());
    	
    	proxy.initSounds();
    	proxy.initRenderers();
    	
    	ModItems.initItems();
    	ModBlocks.initBlocks();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	GameRegistry.registerCraftingHandler(new CraftingHandlerCC());
    	ModItems.registerRecipes();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
