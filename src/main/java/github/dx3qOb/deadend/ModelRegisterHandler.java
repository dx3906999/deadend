package github.dx3qOb.deadend;

import github.dx3qOb.deadend.items.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(modid = DeadEnd.MOD_ID,value = Side.CLIENT)
public class ModelRegisterHandler {
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		
		//ModelLoader.setCustomModelResourceLocation(ModItems.PRIMOGEM_ITEM, 0, new ModelResourceLocation(ModItems.PRIMOGEM_ITEM.getRegistryName(), "inventory"));
		//for MOD_ITEMS
		
		for (Item modItem : ModItems.MOD_ITEMS.values()) {
			ModelLoader.setCustomModelResourceLocation(modItem, 0, new ModelResourceLocation(modItem.getRegistryName(),"inventory"));
		}
		
		//for other
	}
		
	
}
