package com.dasalvarp.unobtaniumplus.creativeTab;

import com.dasalvarp.unobtaniumplus.init.ModItems;
import com.dasalvarp.unobtaniumplus.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Alvarp on 10/22/2014.
 */
public class CreativeTabUnPlus
{
    public static final CreativeTabs UNPLUS_TAB = new CreativeTabs(Reference.MODID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.FirestoneGem;
        }

        public String getTranslatedTabLabel()
        {
            return "Unobtanium Plus";
        }
    };
}
