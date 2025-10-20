package net.slayer.arsscientia.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.slayer.arsscientia.ArsScientia;
import net.slayer.arsscientia.util.ItemGroupUtil;

import java.util.function.Function;

@SuppressWarnings({"unused", "SameParameterValue"})
public class ASBlocks {

    public static final Block TIN_ORE = registerBlock("tin_ore", (settings) ->
                    new ExperienceDroppingBlock(ConstantIntProvider.create(0), settings), AbstractBlock.Settings.create()
                    .strength(3.0F, 3.0F).requiresTool().sounds(BlockSoundGroup.STONE),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", (settings) ->
                    new ExperienceDroppingBlock(ConstantIntProvider.create(0), settings), AbstractBlock.Settings.create()
                    .strength(4.5F, 3.0F).requiresTool().sounds(BlockSoundGroup.DEEPSLATE),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block SILVER_ORE = registerBlock("silver_ore", (settings) ->
                    new ExperienceDroppingBlock(UniformIntProvider.create(1, 2), settings), AbstractBlock.Settings.create()
                    .strength(3.0F, 3.0F).requiresTool().sounds(BlockSoundGroup.STONE),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", (settings) ->
                    new ExperienceDroppingBlock(UniformIntProvider.create(1, 2), settings),  AbstractBlock.Settings.create()
                    .strength(4.5F, 3.0F).requiresTool().sounds(BlockSoundGroup.DEEPSLATE),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block TITANIUM_ORE = registerBlock("titanium_ore", (settings) ->
                    new ExperienceDroppingBlock(UniformIntProvider.create(1, 2), settings), AbstractBlock.Settings.create()
                    .strength(3.0F, 3.0F).requiresTool().sounds(BlockSoundGroup.STONE),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore", (settings) ->
                    new ExperienceDroppingBlock(UniformIntProvider.create(1, 2), settings),  AbstractBlock.Settings.create()
                    .strength(4.5F, 3.0F).requiresTool().sounds(BlockSoundGroup.DEEPSLATE),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block NETHER_TUNGSTEN_ORE = registerBlock("nether_tungsten_ore", (settings) ->
                    new ExperienceDroppingBlock(UniformIntProvider.create(1, 3), settings),  AbstractBlock.Settings.create()
                    .strength(4.5F, 3.0F).requiresTool().sounds(BlockSoundGroup.NETHER_ORE),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block NETHER_COBALT_ORE = registerBlock("nether_cobalt_ore", (settings) ->
                    new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), settings),  AbstractBlock.Settings.create()
                    .strength(4.5F, 3.0F).requiresTool().sounds(BlockSoundGroup.NETHER_ORE),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block END_PLATINUM_ORE = registerBlock("end_platinum_ore", (settings) ->
                    new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), settings),  AbstractBlock.Settings.create()
                    .strength(10.0F, 9.0F).requiresTool().sounds(BlockSoundGroup.STONE),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);


    public static final Block TIN_BLOCK = registerBlock("tin_block", Block::new, AbstractBlock.Settings.create()
                    .strength(3.0F, 6.0F).requiresTool().sounds(BlockSoundGroup.METAL),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block SILVER_BLOCK = registerBlock("silver_block", Block::new, AbstractBlock.Settings.create()
                    .strength(5.0F, 6.0F).requiresTool().sounds(BlockSoundGroup.METAL),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block", Block::new, AbstractBlock.Settings.create()
                    .strength(5.0F, 6.0F).requiresTool().sounds(BlockSoundGroup.METAL),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block TUNGSTEN_BLOCK = registerBlock("tungsten_block", Block::new, AbstractBlock.Settings.create()
                    .strength(10.0F, 18.0F).requiresTool().sounds(BlockSoundGroup.METAL),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block COBALT_BLOCK = registerBlock("cobalt_block", Block::new, AbstractBlock.Settings.create()
                    .strength(8.0F, 16.0F).requiresTool().sounds(BlockSoundGroup.METAL),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block", Block::new, AbstractBlock.Settings.create()
                    .strength(16.0F, 32.0F).requiresTool().sounds(BlockSoundGroup.METAL),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block", Block::new, AbstractBlock.Settings.create()
                    .strength(5.0F, 6.0F).requiresTool().sounds(BlockSoundGroup.METAL),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block ELECTRUM_BLOCK = registerBlock("electrum_block", Block::new, AbstractBlock.Settings.create()
                    .strength(5.0F, 10.0F).requiresTool().sounds(BlockSoundGroup.METAL),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block STEEL_BLOCK = registerBlock("steel_block", Block::new, AbstractBlock.Settings.create()
                    .strength(8.0F, 18.0F).requiresTool().sounds(BlockSoundGroup.METAL),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block LUMINITE_BLOCK = registerBlock("luminite_block", Block::new, AbstractBlock.Settings.create()
                    .strength(5.0F, 6.0F).luminance(state -> 15).requiresTool().sounds(BlockSoundGroup.METAL),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block TUNGSTENSTEEL_BLOCK = registerBlock("tungstensteel_block", Block::new, AbstractBlock.Settings.create()
                    .strength(30.0F, 1200.0F).requiresTool().sounds(BlockSoundGroup.METAL),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block ARCHEOSITE_BLOCK = registerBlock("archeosite_block", Block::new, AbstractBlock.Settings.create()
                    .strength(50.0F, 1200.0F).requiresTool().sounds(BlockSoundGroup.NETHERITE),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block VOIDSTEEL_BLOCK = registerBlock("voidsteel_block", Block::new, AbstractBlock.Settings.create()
                    .strength(50.0F, 1200.0F).requiresTool().sounds(BlockSoundGroup.NETHERITE),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block ADAMANTINE_BLOCK = registerBlock("adamantine_block", Block::new, AbstractBlock.Settings.create()
                    .strength(50.0F, 1200.0F).luminance((state) -> 7).requiresTool().sounds(BlockSoundGroup.NETHERITE),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);

    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block", Block::new, AbstractBlock.Settings.create()
                    .strength(3.0F, 6.0F).requiresTool().sounds(BlockSoundGroup.METAL),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block", Block::new, AbstractBlock.Settings.create()
                    .strength(5.0F, 6.0F).requiresTool().sounds(BlockSoundGroup.METAL),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block", Block::new, AbstractBlock.Settings.create()
                    .strength(5.0F, 6.0F).requiresTool().sounds(BlockSoundGroup.METAL),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block", Block::new, AbstractBlock.Settings.create()
                    .strength(10.0F, 18.0F).requiresTool().sounds(BlockSoundGroup.METAL),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block RAW_COBALT_BLOCK = registerBlock("raw_cobalt_block", Block::new, AbstractBlock.Settings.create()
                    .strength(8.0F, 16.0F).requiresTool().sounds(BlockSoundGroup.METAL),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);
    public static final Block RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block", Block::new, AbstractBlock.Settings.create()
                    .strength(16.0F, 32.0F).requiresTool().sounds(BlockSoundGroup.METAL),
            true, true, ItemGroupUtil.ARSSCIENTIA_BLOCKS);


    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem, boolean shouldRegisterItemGroup, RegistryKey<ItemGroup> group) {
        new Item.Settings().useBlockPrefixedTranslationKey();

        RegistryKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey).useBlockPrefixedTranslationKey());
            Registry.register(Registries.ITEM, itemKey, blockItem);
            if (shouldRegisterItemGroup) {
                registerBlockItemGroup(name, block, group);
            }
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ArsScientia.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ArsScientia.MOD_ID, name));
    }

    private static void registerBlockItemGroup(String name, Block block, RegistryKey<ItemGroup> group) {
        ItemGroupEvents.modifyEntriesEvent(group).register((itemGroup) -> itemGroup.add(block.asItem()));
    }

    public static void register() {
    }

}
