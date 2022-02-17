package net.ramiels.lambdaMisc.item.custom;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.util.math.Vector3d;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import java.util.List;

public class LutusWandItem extends Item {
    public LutusWandItem(Settings settings) { super(settings); }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        if(Screen.hasShiftDown()) {
            tooltip.add( new TranslatableText("item.lambdamisc.lutus_wand.tooltip").formatted(Formatting.DARK_GRAY) );
        } else {
            tooltip.add( new TranslatableText("item.lambdamisc.default.tooltip"));
        }


    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (world.isClient()) {
            ItemStack itemStack = player.getStackInHand(hand);
            Vec3d playerLook = player.getRotationVector();
            Vec3d playerVelocity = player.getVelocity();
            Vec3d playerLaunchedVelocity = playerVelocity.add(playerLook);
            player.setVelocity(playerLaunchedVelocity);
            itemStack.damage(1, player, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
            return TypedActionResult.success(itemStack);
        }
        return TypedActionResult.pass(player.getStackInHand(hand));
    }
}
