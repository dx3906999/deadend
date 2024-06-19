package github.dx3qOb.deadend;

import github.dx3qOb.deadend.modtabs.WeaponTab;
import github.dx3qOb.deadend.world.ModWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = DeadEnd.MOD_ID,name = DeadEnd.NAME,version = DeadEnd.VERSION)
public class DeadEnd {
	
	public static final String MOD_ID="deadend";
	public static final String NAME="Dead End";
	public static final String VERSION="1.0";
	public static final String ACCEPTED_VERSION="[1.12.2]";
	
	public static final CreativeTabs WEAPON_TAB=new WeaponTab();
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
	}
	
}
