package net.slayer.arsscientia;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.slayer.arsscientia.datagen.*;

public class ArsScientiaDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		//pack.addProvider(RegistryDataGenerator::new);
		pack.addProvider(BlockTagProvider::new);
		pack.addProvider(ItemTagProvider::new);
		pack.addProvider(LootTableProvider::new);
		pack.addProvider(ModelProvider::new);
		pack.addProvider(RecipeProvider::new);
		pack.addProvider(TranslationProvider_EN_US::new);

	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		DataGeneratorEntrypoint.super.buildRegistry(registryBuilder);
	}
}
