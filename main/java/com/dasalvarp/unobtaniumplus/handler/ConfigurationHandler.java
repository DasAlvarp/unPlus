package com.dasalvarp.unobtaniumplus.handler;

import com.dasalvarp.unobtaniumplus.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * @author dasalvarp
 */
public class ConfigurationHandler {
    public static Configuration configuration;
    public static boolean explicitMode = false;

    public static void init(File configFile) {
        // Create the configuration object from the given configuration file
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MODID)) {
            loadConfiguration();
        }
    }

    private static void loadConfiguration() {
        explicitMode = configuration.getBoolean("explicitMode", Configuration.CATEGORY_GENERAL, false, "I'm allowed to curse at you.");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}