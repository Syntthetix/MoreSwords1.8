package com.syntthetix.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.syntthetix.lib.RefStrings;

public class SwordsBlocks {
	
	public static void mainRegistry() {
		initializeBlock();
		registerBlock();
	}

	public static Block mOre;
	
	
	public static void initializeBlock() {
		mOre = new mOre(Material.ground);
	}
	
	public static void registerBlock() {
		GameRegistry.registerBlock(mOre, mOre.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders() {
		registerRender(mOre);
	}
	
	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(RefStrings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));;
	}
}
