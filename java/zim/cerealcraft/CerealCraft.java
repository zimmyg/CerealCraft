package zim.cerealcraft;

import zim.cerealcraft.config.ConfigHandler;
import zim.cerealcraft.items.Items;
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

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
@NetworkMod(channels = {Reference.NETCHANNEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class CerealCraft
{   
    @Instance(Reference.MODID)
    public static CerealCraft instance;
    
    @SidedProxy(clientSide = "zim.cerealcraft.proxies.ClientProxy", serverSide = "zim.cerealcraft.proxies.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ConfigHandler.init(event.getSuggestedConfigurationFile());
    	Items.init();
    	
    	proxy.initSounds();
    	proxy.initRenderers();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	Items.addNames();
    	Items.registerRecipes();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
