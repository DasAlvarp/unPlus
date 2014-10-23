package com.dasalvarp.unobtaniumplus.item;

import com.dasalvarp.unobtaniumplus.init.ModBlocks;
import com.dasalvarp.unobtaniumplus.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Alvarp on 10/22/2014.
 */
public class Recepies
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.FirestoneGem), " s ", " d ", " s ", 's', "gemEmerald", 'd', "gemDiamond"));//follows method for earlier. But they can use an oreDictionary entry.
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.firestoneOre), new ItemStack(ModItems.FirestoneGem)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.FirestoneGem), new ItemStack(ModBlocks.firestoneOre)));
    }

}
