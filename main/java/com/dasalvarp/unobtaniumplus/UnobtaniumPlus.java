package com.dasalvarp.unobtaniumplus;



import com.dasalvarp.unobtaniumplus.handler.ConfigurationHandler;
import com.dasalvarp.unobtaniumplus.init.ModBlocks;
import com.dasalvarp.unobtaniumplus.init.ModItems;
import com.dasalvarp.unobtaniumplus.proxy.IProxy;
import com.dasalvarp.unobtaniumplus.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;


@Mod(modid=Reference.MODID, name=Reference.MODNAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)//registers it as a mod.
public class UnobtaniumPlus {


    @Mod.Instance(Reference.MODID)
    public static UnobtaniumPlus instance;//static object that's the mod, completely untouched by man. safe.

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)//can be whatever I want to call it. Arg is the only important thing.
    {
        //load configs
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());


        //resgister assets.textures.items
        ModItems.init();

        //register blocks
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)//veeery basic structure of a mod.
    {

    }
}


/*
phases of how a mod loads:

FML and MCF use and event system.


go thrugh library/cpwmods.fml/common/eventand then find stuff.

Pre-initialization phase is when FML loads configs, sets stuff up, etc...
That's where I set up blocks, etc.


Initialization: set up GUI handler, tile entities, start recepies, etc...

Post-initialization: will look at it later.




*/