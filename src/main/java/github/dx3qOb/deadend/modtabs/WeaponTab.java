package github.dx3qOb.deadend.modtabs;

import github.dx3qOb.deadend.DeadEnd;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WeaponTab extends CreativeTabs{
	
	public WeaponTab() {
		super(DeadEnd.MOD_ID+"."+"DE_Weapon");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.DIAMOND_SWORD);
	}
}
