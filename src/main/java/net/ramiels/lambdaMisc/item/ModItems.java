package net.ramiels.lambdaMisc.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.ramiels.lambdaMisc.item.custom.BlazebrickItem;
import net.ramiels.lambdaMisc.item.custom.LutusWandItem;
import net.ramiels.lambdaMisc.item.custom.TransgenderDustItem;
import net.ramiels.lambdaMisc.item.custom.TransgenderIngotItem;
import net.ramiels.lambdaMisc.lambdaMisc;


public class ModItems {

    public static final Item LUTUS_CLUMP = registerItem( "lutus_clump",
            new Item(new FabricItemSettings().group(ModItemGroup.LUTUS)));
    public static final Item REFINED_LUTUS = registerItem( "refined_lutus",
            new Item(new FabricItemSettings().group(ModItemGroup.LUTUS)));
    public static final Item LUTUS_WAND = registerItem("lutus_wand",
            new LutusWandItem(new FabricItemSettings().group(ModItemGroup.LUTUS).rarity(Rarity.UNCOMMON).maxDamage(16)));
    public static final Item TRANSGENDER_DUST = registerItem("transgender_dust",
            new TransgenderDustItem(new FabricItemSettings().group(ModItemGroup.TRANS).rarity(Rarity.UNCOMMON)));
    public static final Item TRANSGENDER_INGOT = registerItem( "transgender_ingot",
            new TransgenderIngotItem(new FabricItemSettings().group(ModItemGroup.TRANS).rarity(Rarity.UNCOMMON)));
    public static final Item TEMPERED_STEEL_INGOT = registerItem( "tempered_steel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.LAMBDAMISC)));
    public static final Item BLAZEBRICK = registerItem( "blazebrick",
            new BlazebrickItem(new FabricItemSettings().group(ModItemGroup.LAMBDAMISC).rarity(Rarity.UNCOMMON).maxCount(16)));
    public static final Item HELLDUST = registerItem( "helldust",
            new Item(new FabricItemSettings().group(ModItemGroup.LAMBDAMISC)));
    public static final Item IRON_PLATE = registerItem( "iron_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.LAMBDAMISC)));
    public static final Item COPPER_PLATE = registerItem( "copper_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.LAMBDAMISC)));
    public static final Item GOLD_PLATE = registerItem( "gold_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.LAMBDAMISC)));
    public static final Item NETHERITE_PLATE = registerItem( "netherite_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.LAMBDAMISC)));
    public static final Item TRANSGENDER_PLATE = registerItem( "transgender_plate",
            new TransgenderIngotItem(new FabricItemSettings().group(ModItemGroup.TRANS).rarity(Rarity.UNCOMMON)));
    public static final Item TEMPERED_STEEL_PLATE = registerItem( "tempered_steel_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.LAMBDAMISC)));
    public static final Item ABS_DUST = registerItem( "abs_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.LAMBDAMISC)));
    public static final Item ABS_SHEET = registerItem( "abs_sheet",
            new Item(new FabricItemSettings().group(ModItemGroup.LAMBDAMISC)));
    public static final Item GLASS_BEAKER = registerItem( "glass_beaker",
            new Item(new FabricItemSettings().group(ModItemGroup.LAMBDAMISC)));
    public static final Item STYRENE_BEAKER = registerItem( "styrene_beaker",
            new Item(new FabricItemSettings().group(ModItemGroup.LAMBDAMISC)));
    public static final Item POLYBUTADIENE = registerItem( "polybutadiene",
            new Item(new FabricItemSettings().group(ModItemGroup.LAMBDAMISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(lambdaMisc.MOD_ID, name), item);
    }

    public static void registerModItems() {
        lambdaMisc.LOGGER.info("Registering Mod Items for " + lambdaMisc.MOD_ID);
    }

}
