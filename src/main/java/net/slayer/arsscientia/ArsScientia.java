package net.slayer.arsscientia;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.slayer.arsscientia.blocks.ASBlockRegistry;
import net.slayer.arsscientia.items.ASItemRegistry;
import net.slayer.arsscientia.items.ASItems;
import net.slayer.arsscientia.util.HammerMiningEvent;
import net.slayer.arsscientia.util.ItemGroupUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArsScientia implements ModInitializer {
	public static final String MOD_ID = "arsscientia";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ASItemRegistry.register();

		ASBlockRegistry.register();

		ItemGroupUtil.register();

        PlayerBlockBreakEvents.BEFORE.register(new HammerMiningEvent());

        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(ASItems.COAL_PIECE, context.baseSmeltTime() / 8);
            builder.add(ASItems.COAL_DUST, context.baseSmeltTime());
        });

	}
}