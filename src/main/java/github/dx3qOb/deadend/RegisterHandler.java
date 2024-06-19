package github.dx3qOb.deadend;


import github.dx3qOb.deadend.blocks.ModBlocks;
import github.dx3qOb.deadend.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = DeadEnd.MOD_ID)
public class RegisterHandler {
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		for (Item modItem : ModItems.MOD_ITEMS) {
			event.getRegistry().register(modItem);
		}
	}
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		for (Block modBlock : ModBlocks.MOD_BLOCKS) {
			event.getRegistry().register(modBlock);
		}
	}
	
}
