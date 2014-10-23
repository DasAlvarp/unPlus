package com.dasalvarp.unobtaniumplus.init;

import com.dasalvarp.unobtaniumplus.item.ItemFirestoneGem;
import com.dasalvarp.unobtaniumplus.item.ItemGeneric;
import com.dasalvarp.unobtaniumplus.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Alvarp on 10/22/2014.
 */


@GameRegistry.ObjectHolder(Reference.MODID)
public class ModItems {
    public static final ItemGeneric FirestoneGem = new ItemFirestoneGem();

    public static void init()
    {
        GameRegistry.registerItem(FirestoneGem, "FirestoneGem");
    }
}
