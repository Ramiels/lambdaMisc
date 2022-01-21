package net.ramiels.lambdaMisc.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.ramiels.lambdaMisc.lambdaMisc;

public class ModBlocks {

    public static final Block LUTUS_BLOCK = registerBlock("lutus_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool().luminance(12).emissiveLighting((state, world, pos) -> true)), ItemGroup.MISC);
    public static final Block LUTUS_ORE = registerBlock("lutus_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool().luminance(9)), ItemGroup.MISC);
    public static final Block DEEPSLTATE_LUTUS_ORE = registerBlock("deepslate_lutus_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool().luminance(9)), ItemGroup.MISC);





    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(lambdaMisc.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(lambdaMisc.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        lambdaMisc.LOGGER.info("Registering ModBlocks for " + lambdaMisc.MOD_ID);
    }

}