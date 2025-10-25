package net.slayer.arsscientia.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.slayer.arsscientia.blocks.ASBlocks;
import net.slayer.arsscientia.blocks.ASDecoBlocks;
import net.slayer.arsscientia.util.ASTagUtil;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ASBlocks.TIN_ORE)
                .add(ASBlocks.DEEPSLATE_TIN_ORE)
                .add(ASBlocks.TIN_BLOCK)
                .add(ASBlocks.RAW_TIN_BLOCK)
                .add(ASBlocks.SILVER_ORE)
                .add(ASBlocks.DEEPSLATE_SILVER_ORE)
                .add(ASBlocks.SILVER_BLOCK)
                .add(ASBlocks.RAW_SILVER_BLOCK)
                .add(ASBlocks.TITANIUM_ORE)
                .add(ASBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(ASBlocks.TITANIUM_BLOCK)
                .add(ASBlocks.RAW_TITANIUM_BLOCK)
                .add(ASBlocks.NETHER_TUNGSTEN_ORE)
                .add(ASBlocks.TUNGSTEN_BLOCK)
                .add(ASBlocks.RAW_TUNGSTEN_BLOCK)
                .add(ASBlocks.NETHER_COBALT_ORE)
                .add(ASBlocks.COBALT_BLOCK)
                .add(ASBlocks.RAW_COBALT_BLOCK)
                .add(ASBlocks.END_PLATINUM_ORE)
                .add(ASBlocks.PLATINUM_BLOCK)
                .add(ASBlocks.RAW_PLATINUM_BLOCK)
                .add(ASBlocks.BRONZE_BLOCK)
                .add(ASBlocks.ELECTRUM_BLOCK)
                .add(ASBlocks.STEEL_BLOCK)
                .add(ASBlocks.LUMINITE_BLOCK)
                .add(ASBlocks.TUNGSTENSTEEL_BLOCK)
                .add(ASBlocks.ARCHEOSITE_BLOCK)
                .add(ASBlocks.VOIDSTEEL_BLOCK)
                .add(ASBlocks.ADAMANTINE_BLOCK)

                .add(ASDecoBlocks.LUMINITE_LAMP);

        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ASBlocks.TIN_ORE)
                .add(ASBlocks.DEEPSLATE_TIN_ORE)
                .add(ASBlocks.TIN_BLOCK)
                .add(ASBlocks.RAW_TIN_BLOCK)
                .add(ASBlocks.BRONZE_BLOCK);

        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ASBlocks.SILVER_ORE)
                .add(ASBlocks.DEEPSLATE_SILVER_ORE)
                .add(ASBlocks.SILVER_BLOCK)
                .add(ASBlocks.RAW_SILVER_BLOCK)
                .add(ASBlocks.TITANIUM_ORE)
                .add(ASBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(ASBlocks.TITANIUM_BLOCK)
                .add(ASBlocks.RAW_TITANIUM_BLOCK)
                .add(ASBlocks.ELECTRUM_BLOCK)
                .add(ASBlocks.STEEL_BLOCK)
                .add(ASBlocks.LUMINITE_BLOCK);

        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ASBlocks.NETHER_TUNGSTEN_ORE)
                .add(ASBlocks.TUNGSTEN_BLOCK)
                .add(ASBlocks.RAW_TUNGSTEN_BLOCK)
                .add(ASBlocks.NETHER_COBALT_ORE)
                .add(ASBlocks.COBALT_BLOCK)
                .add(ASBlocks.RAW_COBALT_BLOCK)
                .add(ASBlocks.TUNGSTENSTEEL_BLOCK);

        valueLookupBuilder(ASTagUtil.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ASBlocks.END_PLATINUM_ORE)
                .add(ASBlocks.PLATINUM_BLOCK)
                .add(ASBlocks.RAW_PLATINUM_BLOCK)
                .add(ASBlocks.ARCHEOSITE_BLOCK)
                .add(ASBlocks.VOIDSTEEL_BLOCK)
                .add(ASBlocks.ADAMANTINE_BLOCK);


    }
}
