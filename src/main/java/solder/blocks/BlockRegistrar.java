package solder.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import solder.Solder;

public class BlockRegistrar {

    public static BlockBase oreTin = new BlockBase(Material.ROCK, "ore_copper").setCreativeTab(Solder.creativeTab);

	public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
            oreTin
        );
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
            oreTin.createItemBlock()
        );
	}

	public static void registerModels() {
        oreTin.registerItemModel(Item.getItemFromBlock(oreTin));
	}

}