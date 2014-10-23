package com.dasalvarp.unobtaniumplus.init;

import com.dasalvarp.unobtaniumplus.block.BlockFirestoneOre;
import com.dasalvarp.unobtaniumplus.block.BlockGeneric;
import com.dasalvarp.unobtaniumplus.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Alvarp on 10/22/2014.
 */

@GameRegistry.ObjectHolder(Reference.MODID)
public class ModBlocks
{
    public static final BlockGeneric firestoneOre = new BlockFirestoneOre();
    public static void init()
    {
        GameRegistry.registerBlock(firestoneOre, "FirestoneOre");
    }
}
