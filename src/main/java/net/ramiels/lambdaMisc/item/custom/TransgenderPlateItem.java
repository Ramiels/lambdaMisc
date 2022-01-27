package net.ramiels.lambdaMisc.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TransgenderPlateItem extends Item {
    public TransgenderPlateItem(Settings settings) {
        super(settings);
    }
    
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }


}
