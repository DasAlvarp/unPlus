package com.dasalvarp.unobtaniumplus.client.settings;

import com.dasalvarp.unobtaniumplus.reference.Names;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

/**
 * Created by Alvarp on 10/22/2014.
 */
public class Keybindings
{
    public static KeyBinding charge = new KeyBinding(Names.Keys.CHARGE, Keyboard.KEY_F, Names.Keys.CATEGORY);
    public static KeyBinding release = new KeyBinding(Names.Keys.RELEASE, Keyboard.KEY_G, Names.Keys.CATEGORY);
}
