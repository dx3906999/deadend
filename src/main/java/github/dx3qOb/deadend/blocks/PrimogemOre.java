package github.dx3qOb.deadend.blocks;

import java.util.Random;

import github.dx3qOb.deadend.items.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PrimogemOre extends BlockBase{
	
	public PrimogemOre(String name,Material material,CreativeTabs creativeTabs) {
		super(name, material);
		setCreativeTab(creativeTabs);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 2);
		setHardness(4.0f);
		setResistance(20.0f);
		setLightLevel(12.0f);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random random, int fortune) {
		return ModItems.PRIMOGEM_ITEM;
	}
	
	@Override
	public int quantityDropped(Random random) {
		int min=1;
		int max=2;
		return random.nextInt(max)+min;
	}

}
