package github.dx3qOb.deadend.modtabs;

import github.dx3qOb.deadend.DeadEnd;
import github.dx3qOb.deadend.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemTab extends CreativeTabs{
	
	public ItemTab() {
		super(DeadEnd.MOD_ID);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.PRIMOGEM_ITEM);
	}
	

}
