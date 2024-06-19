package github.dx3qOb.deadend.blocks;

import java.util.HashMap;
import java.util.Map;

import github.dx3qOb.deadend.DeadEnd;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	//public static final List<Block> MOD_BLOCKS=new ArrayList<Block>();
	public static final Map<String, Block> MOD_BLOCKS=new HashMap<String, Block>();
	
	public static final Block PRIMOGEM_ORE_BLOCK=new PrimogemOre("primogem_ore", Material.ROCK,DeadEnd.WEAPON_TAB);
	
	public static final Block PRIMOGEM_BLOCK=new PrimogemBlock("primogem_block", Material.ROCK,DeadEnd.WEAPON_TAB);
	
}
