package com.syntthetix.main;

import com.syntthetix.items.SwordsItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingManager {
	
	public static void addCraftingRec() {
		GameRegistry.addShapedRecipe(new ItemStack(SwordsItems.eluc, 1), new Object[] {
			 " o ",
			 "oo ",
			 " s ",
			 'o', Blocks.obsidian,
			 's', Items.stick
		});
		GameRegistry.addShapedRecipe(new ItemStack(SwordsItems.darkRep), new Object[] {
			" e ",
			"ede",
			" s ",
			's', Items.stick,
			'e', Items.emerald,
			'd', Items.diamond
		});
		GameRegistry.addShapedRecipe(new ItemStack(SwordsItems.mSword), new Object[] {
			" m ",
			"mgm",
			" s ",
			's', Items.stick,
			'g', Items.gold_ingot,
			'm', SwordsItems.mCrystal
		});
		GameRegistry.addShapedRecipe(new ItemStack(SwordsItems.eSword), new Object[] {
			"l l",
			"l l",
			"lil",
			'i', Items.iron_ingot,
			'l', SwordsItems.lCrystal
		});
		GameRegistry.addShapedRecipe(new ItemStack(SwordsItems.saber), new Object[] {
			" l ",
			" l ",
			" o ",
			'o', Blocks.obsidian,
			'l', SwordsItems.lCrystal
		});
		GameRegistry.addShapedRecipe(new ItemStack(SwordsItems.lCrystal), new Object[] {
			"ggg",
			"grg",
			"ggg",
			'g', Blocks.glass,
			'r', Items.redstone
		});
	}
}