package net.terk.mccourse;

import net.fabricmc.api.ModInitializer;

import net.terk.mccourse.block.ModBlocks;
import net.terk.mccourse.item.ModItemGroup;
import net.terk.mccourse.item.ModItems;
import net.terk.mccourse.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();


		ModItems.registerModItems();
		ModBlocks.registerModBlock();

		ModRegistries.registerModStuffs();
	}
}