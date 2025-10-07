package net.slayer.arsscientia.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE);
        //.add(ASBlocks.BLOCK);

        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL);

        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL);

        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        //valueLookupBuilder(TagUtil.Blocks.NEEDS_NETHERITE_TOOL);


    }
}
