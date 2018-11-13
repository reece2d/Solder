package solder;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
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

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}