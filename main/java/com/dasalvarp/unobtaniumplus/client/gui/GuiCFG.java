package com.dasalvarp.unobtaniumplus.client.gui;

/**
 * Created by Alvarp on 10/22/2014.
 */

        import com.dasalvarp.unobtaniumplus.handler.ConfigurationHandler;
        import com.dasalvarp.unobtaniumplus.reference.Reference;
        import cpw.mods.fml.client.config.GuiConfig;
        import net.minecraft.client.gui.GuiScreen;
        import net.minecraftforge.common.config.ConfigElement;
        import net.minecraftforge.common.config.Configuration;

public class GuiCFG extends GuiConfig
{
    public GuiCFG(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MODID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}