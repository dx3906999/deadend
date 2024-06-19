package github.dx3qOb.deadend.blocks;

import java.util.Random;

import github.dx3qOb.deadend.DeadEnd;
import github.dx3qOb.deadend.items.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class PrimogemBlock extends BlockBase{
	
	public String NAME_STRING=null;
	
	public PrimogemBlock(String name,Material material,CreativeTabs creativeTabs) {
		
		super(name,material);
		this.NAME_STRING=name;
		setCreativeTab(DeadEnd.WEAPON_TAB);
		setSoundType(SoundType.STONE);
		setHardness(6.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(20.0f);
		
	}
	
	@Override
	public Item getItemDropped(IBlockState state,Random random,int fortune) {
		return ModItems.MOD_ITEMS.get(this.NAME_STRING);
	}
	
	@Override
	public int quantityDropped(Random random) {
		return 1;
	}

}
