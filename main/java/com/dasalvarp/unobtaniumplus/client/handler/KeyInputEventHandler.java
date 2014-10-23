package com.dasalvarp.unobtaniumplus.client.handler;

import com.dasalvarp.unobtaniumplus.client.settings.Keybindings;
import com.dasalvarp.unobtaniumplus.reference.Key;
import com.dasalvarp.unobtaniumplus.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

/**
 * Created by Alvarp on 10/22/2014.
 */
public class KeyInputEventHandler
{
    private static Key getPressedKeyBinding()
    {
        if(Keybindings.charge.isPressed())
        {
            return Key.CHARGE;
        }
        else if(Keybindings.release.isPressed())
        {
            return Key.RELEASE;
        }
        else
        {
            return Key.UNKNOWN;
        }
    }


    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        LogHelper.info(getPressedKeyBinding());
    }
}
