package solder;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import solder.blocks.BlockRegistrar;
import solder.items.ItemRegistrar;
import solder.proxy.CommonProxy;
import solder.world.WorldGen;

@Mod(
    modid = "solder",
	name = "Solder",
	version = "0.1"
)
public class Solder {

    @Mod.Instance("solder")
    public static Solder instance;

    @SidedProxy(serverSide = "solder.proxy.CommonProxy", clientSide = "solder.proxy.ClientProxy")
    public static CommonProxy proxy;

    public static CreativeTabs creativeTab = new CreativeTabs("solder")
    { @Override public ItemStack getTabIconItem() {
        return new ItemStack(Items.GLOWSTONE_DUST);
    }};

    public Solder() {
        // Entry
    }

    @Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// ...
		GameRegistry.registerWorldGenerator(new WorldGen(), 3);
	}

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ItemRegistrar.register(event.getRegistry());
            BlockRegistrar.registerItemBlocks(event.getRegistry());
        }
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            BlockRegistrar.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            ItemRegistrar.registerModels();
            BlockRegistrar.registerModels();
        }

    }
}