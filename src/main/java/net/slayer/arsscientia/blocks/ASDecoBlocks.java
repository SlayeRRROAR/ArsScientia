package net.slayer.arsscientia.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FilledMapItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.slayer.arsscientia.ArsScientia;
import net.slayer.arsscientia.blocks.custom.LuminiteLampBlock;
import net.slayer.arsscientia.util.ItemGroupUtil;

import java.util.function.Function;

@SuppressWarnings({"unused", "SameParameterValue"})
public class ASDecoBlocks {

    public static final Block LUMINITE_LAMP = registerBlock("luminite_lamp", LuminiteLampBlock::new, AbstractBlock.Settings.create()
                    .strength(3.0F, 6.0F)
                    .luminance(state -> state.get(LuminiteLampBlock.LIT) ? 0 : 15)
                    .sounds(BlockSoundGroup.GLASS),
            true, true, ItemGroupUtil.ARSSCIENTIA_DECORATIONS);

    public static final Block WORN_STRONGBOX = registerBlock("worn_strongbox", Block::new, AbstractBlock.Settings.create()
                    .strength(2.5F, 2.5F)
                    .sounds(BlockSoundGroup.WOOD),
            true, true, ItemGroupUtil.ARSSCIENTIA_DECORATIONS);
    public static final Block STRONGBOX = registerBlock("strongbox", Block::new, AbstractBlock.Settings.create()
                    .strength(2.5F, 2.5F)
                    .sounds(BlockSoundGroup.WOOD),
            true, true, ItemGroupUtil.ARSSCIENTIA_DECORATIONS);
    public static final Block PRISTINE_STRONGBOX = registerBlock("pristine_strongbox", Block::new, AbstractBlock.Settings.create()
                    .strength(2.5F, 2.5F)
                    .sounds(BlockSoundGroup.WOOD),
            true, true, ItemGroupUtil.ARSSCIENTIA_DECORATIONS);
    public static final Block LEGENDARY_STRONGBOX = registerBlock("legendary_strongbox", Block::new, AbstractBlock.Settings.create()
                    .strength(2.5F, 2.5F)
                    .sounds(BlockSoundGroup.WOOD),
            true, true, ItemGroupUtil.ARSSCIENTIA_DECORATIONS);
    public static final Block MYTHICAL_STRONGBOX = registerBlock("mythical_strongbox", Block::new, AbstractBlock.Settings.create()
                    .strength(2.5F, 2.5F)
                    .sounds(BlockSoundGroup.WOOD),
            true, true, ItemGroupUtil.ARSSCIENTIA_DECORATIONS);



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
