package com.syntthetix.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class mOre extends Block{

	public mOre(Material ground) {
		super(ground);
		this.setUnlocalizedName("mOre");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(3.5f);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeStone);
	}

}
