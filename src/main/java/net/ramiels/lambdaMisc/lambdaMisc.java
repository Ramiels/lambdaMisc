package net.ramiels.lambdaMisc;

import net.fabricmc.api.ModInitializer;
import net.ramiels.lambdaMisc.block.ModBlocks;
import net.ramiels.lambdaMisc.item.ModItems;
import net.ramiels.lambdaMisc.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class lambdaMisc implements ModInitializer {
	public static final String MOD_ID = "lambdamisc";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();
	}
}
