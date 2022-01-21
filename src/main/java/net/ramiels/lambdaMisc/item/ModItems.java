package net.ramiels.lambdaMisc.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.ramiels.lambdaMisc.lambdaMisc;


public class ModItems {

    public static final Item LUTUS_CLUMP = registerItem( "lutus_clump",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item REFINED_LUTUS = registerItem( "refined_lutus",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(lambdaMisc.MOD_ID, name), item);
    }

    public static void registerModItems() {
        lambdaMisc.LOGGER.info("Registering Mod Items for " + lambdaMisc.MOD_ID);
    }

}
