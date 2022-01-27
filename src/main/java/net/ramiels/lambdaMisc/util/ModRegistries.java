package net.ramiels.lambdaMisc.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.ramiels.lambdaMisc.item.ModItems;
import net.ramiels.lambdaMisc.lambdaMisc;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }

     private static void registerFuels() {
         lambdaMisc.LOGGER.info("Registering Fuels for " + lambdaMisc.MOD_ID);

         FuelRegistry registry = FuelRegistry.INSTANCE;

         registry.add(ModItems.HELLDUST, 1800);
         registry.add(ModItems.BLAZEBRICK, 3200);
     }
}
