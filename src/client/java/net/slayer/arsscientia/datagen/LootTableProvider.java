package net.slayer.arsscientia.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.slayer.arsscientia.blocks.ASBlocks;
import net.slayer.arsscientia.items.ASItems;

import java.util.concurrent.CompletableFuture;

public class LootTableProvider extends FabricBlockLootTableProvider {
    public LootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(ASBlocks.TIN_BLOCK);
        addDrop(ASBlocks.SILVER_BLOCK);
        addDrop(ASBlocks.TITANIUM_BLOCK);
        addDrop(ASBlocks.TUNGSTEN_BLOCK);
        addDrop(ASBlocks.COBALT_BLOCK);
        addDrop(ASBlocks.PLATINUM_BLOCK);
        addDrop(ASBlocks.BRONZE_BLOCK);
        addDrop(ASBlocks.ELECTRUM_BLOCK);
        addDrop(ASBlocks.STEEL_BLOCK);
        addDrop(ASBlocks.LUMINITE_BLOCK);
        addDrop(ASBlocks.TUNGSTENSTEEL_BLOCK);
        addDrop(ASBlocks.ARCHEOSITE_BLOCK);
        addDrop(ASBlocks.VOIDSTEEL_BLOCK);
        addDrop(ASBlocks.ADAMANTINE_BLOCK);

        addDrop(ASBlocks.RAW_TIN_BLOCK);
        addDrop(ASBlocks.RAW_SILVER_BLOCK);
        addDrop(ASBlocks.RAW_TITANIUM_BLOCK);
        addDrop(ASBlocks.RAW_TUNGSTEN_BLOCK);
        addDrop(ASBlocks.RAW_COBALT_BLOCK);
        addDrop(ASBlocks.RAW_PLATINUM_BLOCK);

        addDrop(ASBlocks.TIN_ORE, multipleOreDrops(ASBlocks.TIN_ORE, ASItems.RAW_TIN, 1, 3));
        addDrop(ASBlocks.DEEPSLATE_TIN_ORE, multipleOreDrops(ASBlocks.DEEPSLATE_TIN_ORE, ASItems.RAW_TIN, 1, 3));
        addDrop(ASBlocks.SILVER_ORE, oreDrops(ASBlocks.SILVER_ORE, ASItems.RAW_SILVER));
        addDrop(ASBlocks.DEEPSLATE_SILVER_ORE, oreDrops(ASBlocks.DEEPSLATE_SILVER_ORE, ASItems.RAW_SILVER));
        addDrop(ASBlocks.TITANIUM_ORE, oreDrops(ASBlocks.TITANIUM_ORE, ASItems.RAW_TITANIUM));
        addDrop(ASBlocks.DEEPSLATE_TITANIUM_ORE, oreDrops(ASBlocks.DEEPSLATE_TITANIUM_ORE, ASItems.RAW_TITANIUM));
        addDrop(ASBlocks.NETHER_TUNGSTEN_ORE, oreDrops(ASBlocks.NETHER_TUNGSTEN_ORE, ASItems.RAW_TUNGSTEN));
        addDrop(ASBlocks.NETHER_COBALT_ORE, oreDrops(ASBlocks.NETHER_COBALT_ORE, ASItems.RAW_COBALT));
        addDrop(ASBlocks.END_PLATINUM_ORE, oreDrops(ASBlocks.END_PLATINUM_ORE, ASItems.RAW_PLATINUM));

        //addDrop(ASBlocks.MULTI_ORE, multipleOreDrops(ASBlocks.MULTI_ORE, ASItems.MULTI_RAW, 1, 3));
        //addDrop(ASBlocks.SINGLE_ORE, oreDrops(ASBlocks.SINGLE_ORE, ASItems.SINGLE_RAW));

    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }

}