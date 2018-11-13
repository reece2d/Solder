package solder;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import solder.proxy.CommonProxy;

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

    public Solder() {

    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            System.out.println("registerItems");
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            System.out.println("registerModels");
        }

    }
}