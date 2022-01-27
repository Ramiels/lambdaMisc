package net.ramiels.lambdaMisc.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.ramiels.lambdaMisc.lambdaMisc;

public class ModItemGroup {
    public static final ItemGroup LUTUS = FabricItemGroupBuilder.build(new Identifier(lambdaMisc.MOD_ID,"lutus"),
            () -> new ItemStack(ModItems.LUTUS_CLUMP));
    public static final ItemGroup TRANS = FabricItemGroupBuilder.build(new Identifier(lambdaMisc.MOD_ID,"transgender"),
            () -> new ItemStack(ModItems.TRANSGENDER_DUST));
    public static final ItemGroup LAMBDAMISC = FabricItemGroupBuilder.build(new Identifier(lambdaMisc.MOD_ID,"lambdamisc"),
            () -> new ItemStack(ModItems.TEMPERED_STEEL_INGOT));
}
