package net.slayer.arsscientia.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.slayer.arsscientia.blocks.ASBlocks;
import net.slayer.arsscientia.items.ASItems;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.DEEPSLATE_TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.DEEPSLATE_SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.DEEPSLATE_TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.NETHER_TUNGSTEN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.NETHER_COBALT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.END_PLATINUM_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.TITANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.TUNGSTEN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.COBALT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.PLATINUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.BRONZE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.ELECTRUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.LUMINITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.TUNGSTENSTEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.ARCHEOSITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.VOIDSTEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.ADAMANTINE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.RAW_TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.RAW_SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.RAW_TITANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.RAW_TUNGSTEN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.RAW_COBALT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ASBlocks.RAW_PLATINUM_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ASItems.TIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ASItems.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ASItems.TITANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ASItems.TUNGSTEN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ASItems.COBALT_INGOT, Models.GENERATED);
        itemModelGenerator.register(ASItems.PLATINUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ASItems.BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ASItems.ELECTRUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ASItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ASItems.LUMINITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ASItems.TUNGSTENSTEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ASItems.ARCHEOSITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ASItems.VOIDSTEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ASItems.ADAMANTINE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ASItems.COAL_PIECE, Models.GENERATED);
        itemModelGenerator.register(ASItems.TIN_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ASItems.SILVER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ASItems.TITANIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ASItems.TUNGSTEN_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ASItems.COBALT_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ASItems.PLATINUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ASItems.BRONZE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ASItems.ELECTRUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ASItems.STEEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ASItems.LUMINITE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ASItems.TUNGSTENSTEEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ASItems.ARCHEOSITE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ASItems.VOIDSTEEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ASItems.ADAMANTINE_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ASItems.RAW_TIN, Models.GENERATED);
        itemModelGenerator.register(ASItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(ASItems.RAW_TITANIUM, Models.GENERATED);
        itemModelGenerator.register(ASItems.RAW_TUNGSTEN, Models.GENERATED);
        itemModelGenerator.register(ASItems.RAW_COBALT, Models.GENERATED);
        itemModelGenerator.register(ASItems.RAW_PLATINUM, Models.GENERATED);

        itemModelGenerator.register(ASItems.COAL_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.COPPER_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.IRON_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.GOLD_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.LAPIS_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.DIAMOND_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.EMERALD_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.AMETHYST_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.QUARTZ_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.NETHERITE_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.ENDER_DUST, Models.GENERATED);

        itemModelGenerator.register(ASItems.TIN_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.SILVER_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.TITANIUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.TUNGSTEN_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.COBALT_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.PLATINUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.BRONZE_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.ELECTRUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.STEEL_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.LUMINITE_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.TUNGSTENSTEEL_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.ARCHEOSITE_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.VOIDSTEEL_DUST, Models.GENERATED);
        itemModelGenerator.register(ASItems.ADAMANTINE_DUST, Models.GENERATED);

        //itemModelGenerator.register(ASTools.SWORD, Models.HANDHELD);

    }

}
