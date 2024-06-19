package github.dx3qOb.deadend.blocks;

import java.util.ArrayList;
import java.util.List;

import github.dx3qOb.deadend.DeadEnd;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> MOD_BLOCKS=new ArrayList<Block>();
	
	public static final Block PRIMOGEM_ORE_BLOCK=new PrimogemOre("primogem_ore", Material.ROCK,DeadEnd.WEAPON_TAB);
	
	
}
