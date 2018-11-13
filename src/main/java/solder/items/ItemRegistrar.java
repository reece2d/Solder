package solder.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemRegistrar {

    public static CreativeTabs solderTab = new CreativeTabs("solder"){
        @Override
        public ItemStack getTabIconItem(){
            return new ItemStack(Items.GLOWSTONE_DUST);
        }
    };

    public static ItemBase toolJackhammer = new ItemBase("jackhammer").setCreativeTab(solderTab);

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
            toolJackhammer
        );
    }
    public static void registerModels() {
        toolJackhammer.registerItemModel();
    }

}