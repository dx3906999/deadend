package github.dx3qOb.deadend.blocks;

import github.dx3qOb.deadend.DeadEnd;
import github.dx3qOb.deadend.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block{
	
	public BlockBase(String name,Material material) {
		super(material);
		setRegistryName(DeadEnd.MOD_ID,name);
		setUnlocalizedName(DeadEnd.MOD_ID+"."+name);
		setCreativeTab(DeadEnd.WEAPON_TAB);
		
		ModBlocks.MOD_BLOCKS.add(this);
		ModItems.MOD_ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

}
