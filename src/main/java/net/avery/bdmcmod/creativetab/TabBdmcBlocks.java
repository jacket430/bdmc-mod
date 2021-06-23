
package net.avery.bdmcmod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.avery.bdmcmod.block.BlockBdmcFalloutStone;
import net.avery.bdmcmod.ElementsBdmcModMod;

@ElementsBdmcModMod.ModElement.Tag
public class TabBdmcBlocks extends ElementsBdmcModMod.ModElement {
	public TabBdmcBlocks(ElementsBdmcModMod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabbdmc_blocks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockBdmcFalloutStone.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}