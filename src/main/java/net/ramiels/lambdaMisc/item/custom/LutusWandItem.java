package net.ramiels.lambdaMisc.item.custom;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class LutusWandItem extends Item {
    public LutusWandItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {


        return super.useOnBlock(context);
    }

    private void outputValuableCoordinates(BlockPos blockPos, PlayerEntity player, Block blockBelow) {

    }




}
