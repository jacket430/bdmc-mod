
package net.avery.bdmcmod.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.avery.bdmcmod.creativetab.TabBdmcBlocks;
import net.avery.bdmcmod.ElementsBdmcModMod;

@ElementsBdmcModMod.ModElement.Tag
public class BlockBdmcFalloutAndesite extends ElementsBdmcModMod.ModElement {
	@GameRegistry.ObjectHolder("bdmc_mod:bdmc_fallout_andesite")
	public static final Block block = null;
	public BlockBdmcFalloutAndesite(ElementsBdmcModMod instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("bdmc_fallout_andesite"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("bdmc_mod:bdmc_fallout_andesite", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("bdmc_fallout_andesite");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 1);
			setHardness(1.5F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabBdmcBlocks.tab);
		}
	}
}
