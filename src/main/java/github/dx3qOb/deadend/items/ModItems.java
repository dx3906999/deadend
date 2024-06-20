package github.dx3qOb.deadend.items;

import java.util.HashMap;
import java.util.Map;

import github.dx3qOb.deadend.DeadEnd;
import net.minecraft.item.Item;

public class ModItems {

	
	//public static final List<Item> MOD_ITEMS=new ArrayList<Item>();
	public static final Map<String, Item> MOD_ITEMS=new HashMap<String, Item>();
	
	public static final Item PRIMOGEM_ITEM=new ItemBase("primogem", DeadEnd.WEAPON_TAB);
	
	public static final Item PRIMOGEM_WAND_ITEM=new ItemBase("primogem_wand", DeadEnd.WEAPON_TAB);
	
}
