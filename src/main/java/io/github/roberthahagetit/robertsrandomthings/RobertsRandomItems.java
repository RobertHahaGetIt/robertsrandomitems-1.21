package io.github.roberthahagetit.robertsrandomthings;

import io.github.roberthahagetit.robertsrandomthings.item.ModItemGroups;
import io.github.roberthahagetit.robertsrandomthings.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RobertsRandomItems implements ModInitializer {
	public static final String MOD_ID = "robertsrandomitems";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}