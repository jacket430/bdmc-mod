
package net.avery.bdmcmod.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.avery.bdmcmod.block.BlockBdmcFalloutLogSpruce;
import net.avery.bdmcmod.block.BlockBdmcFalloutLogOak;
import net.avery.bdmcmod.block.BlockBdmcFalloutLogJungle;
import net.avery.bdmcmod.block.BlockBdmcFalloutLogDarkOak;
import net.avery.bdmcmod.block.BlockBdmcFalloutLogBirch;
import net.avery.bdmcmod.block.BlockBdmcFalloutLogAcacia;
import net.avery.bdmcmod.ElementsBdmcModMod;

@ElementsBdmcModMod.ModElement.Tag
public class OreDictLogBlocks extends ElementsBdmcModMod.ModElement {
	public OreDictLogBlocks(ElementsBdmcModMod instance) {
		super(instance, 36);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("logs", new ItemStack(BlockBdmcFalloutLogOak.block, (int) (1)));
		OreDictionary.registerOre("logs", new ItemStack(BlockBdmcFalloutLogDarkOak.block, (int) (1)));
		OreDictionary.registerOre("logs", new ItemStack(BlockBdmcFalloutLogBirch.block, (int) (1)));
		OreDictionary.registerOre("logs", new ItemStack(BlockBdmcFalloutLogAcacia.block, (int) (1)));
		OreDictionary.registerOre("logs", new ItemStack(BlockBdmcFalloutLogSpruce.block, (int) (1)));
		OreDictionary.registerOre("logs", new ItemStack(BlockBdmcFalloutLogJungle.block, (int) (1)));
	}
}
