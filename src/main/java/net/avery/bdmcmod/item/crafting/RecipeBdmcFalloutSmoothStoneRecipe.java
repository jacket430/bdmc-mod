
package net.avery.bdmcmod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.avery.bdmcmod.block.BlockBdmcFalloutStone;
import net.avery.bdmcmod.block.BlockBdmcFalloutSmoothStone;
import net.avery.bdmcmod.ElementsBdmcModMod;

@ElementsBdmcModMod.ModElement.Tag
public class RecipeBdmcFalloutSmoothStoneRecipe extends ElementsBdmcModMod.ModElement {
	public RecipeBdmcFalloutSmoothStoneRecipe(ElementsBdmcModMod instance) {
		super(instance, 34);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockBdmcFalloutStone.block, (int) (1)), new ItemStack(BlockBdmcFalloutSmoothStone.block, (int) (1)),
				1F);
	}
}
