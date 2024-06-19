package github.dx3qOb.deadend.items;

import github.dx3qOb.deadend.DeadEnd;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {
	
	public ItemBase(String name,CreativeTabs tab) {
		setRegistryName(DeadEnd.MOD_ID,name);
		setCreativeTab(tab);
		setUnlocalizedName(DeadEnd.MOD_ID+"."+name);
		
		ModItems.MOD_ITEMS.add(this);
	}
	
}
