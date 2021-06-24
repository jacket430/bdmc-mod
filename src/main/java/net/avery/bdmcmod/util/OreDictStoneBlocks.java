
package net.avery.bdmcmod.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.avery.bdmcmod.block.BlockBdmcFalloutStone;
import net.avery.bdmcmod.ElementsBdmcModMod;

@ElementsBdmcModMod.ModElement.Tag
public class OreDictStoneBlocks extends ElementsBdmcModMod.ModElement {
	public OreDictStoneBlocks(ElementsBdmcModMod instance) {
		super(instance, 22);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("stone", new ItemStack(BlockBdmcFalloutStone.block, (int) (1)));
	}
}
