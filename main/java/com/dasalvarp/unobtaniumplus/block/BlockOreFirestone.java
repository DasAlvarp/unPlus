package com.dasalvarp.unobtaniumplus.block;

import com.dasalvarp.unobtaniumplus.init.ModBlocks;
import com.dasalvarp.unobtaniumplus.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Alvarp on 10/22/2014.
 */
public class BlockOreFirestone extends BlockGeneric
{

    Random randy = new Random();

    public BlockOreFirestone()
    {
        super();
        this.setBlockName("oreFirestone");
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setBlockTextureName("oreFirestone");
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune)
    {
        return this == ModBlocks.firestoneOre ? ModItems.FirestoneGem: Item.getItemFromBlock(this);
    }



    public int getExpDrop()
    {

        return randy.nextInt(3) + 2;
    }
}
