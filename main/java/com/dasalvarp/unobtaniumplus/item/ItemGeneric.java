package com.dasalvarp.unobtaniumplus.item;

import com.dasalvarp.unobtaniumplus.creativeTab.CreativeTabUnPlus;
import com.dasalvarp.unobtaniumplus.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Alvarp on 10/22/2014.
 *
 * this is going to act as a kind of wrapper class
 */
public class ItemGeneric extends Item
{
    public ItemGeneric()
    {
        super();
        this.setMaxStackSize(64);
        this.setCreativeTab(CreativeTabUnPlus.UNPLUS_TAB);

    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    }

    protected String getUnwrappedUnlocalizedName (String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    }
}
