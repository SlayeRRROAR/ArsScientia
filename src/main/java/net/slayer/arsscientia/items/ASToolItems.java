package net.slayer.arsscientia.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.slayer.arsscientia.ArsScientia;
import net.slayer.arsscientia.items.tools.ASToolMaterials;
import net.slayer.arsscientia.items.tools.MiningHammerItem;
import net.slayer.arsscientia.util.ItemGroupUtil;

import java.util.function.Function;

@SuppressWarnings("unused")
public class ASToolItems {

    public static final Item WOODEN_KATANA = registerItem("wooden_katana", settings ->
                    new Item(settings.sword(ToolMaterial.WOOD,1, -1.6F)),
            new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item WOODEN_HAMMER = registerItem("wooden_hammer",  settings ->
                    new MiningHammerItem(ASToolMaterials.WOOD_H, 4.0F, -3.0F, settings),
            new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_TOOLS);
    public static final Item STONE_KATANA = registerItem("stone_katana",  settings ->
                    new Item(settings.sword(ToolMaterial.STONE, 2, -2.0F)),
            new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item STONE_HAMMER = registerItem("stone_hammer",  settings ->
                    new MiningHammerItem(ASToolMaterials.STONE_H,  4.0F, -3.0F, settings),
            new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_TOOLS);

    public static final Item IRON_KATANA = registerItem("iron_katana",  settings ->
                    new Item(settings.sword(ToolMaterial.WOOD, 1, -1.6F)),
            new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item IRON_HAMMER = registerItem("iron_hammer",  settings ->
                    new MiningHammerItem(ASToolMaterials.IRON_H, 4.0F, -3.0F, settings),
            new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_TOOLS);
    public static final Item GOLDEN_KATANA = registerItem("golden_katana",  settings ->
                    new Item(settings.sword(ToolMaterial.GOLD, 2, -2.0F)),
            new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item GOLDEN_HAMMER = registerItem("golden_hammer",  settings ->
                    new MiningHammerItem(ASToolMaterials.GOLD_H, 4.0F, -3.0F, settings),
            new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_TOOLS);
    public static final Item DIAMOND_KATANA = registerItem("diamond_katana",  settings ->
                    new Item(settings.sword(ToolMaterial.DIAMOND, 0, -1.6F)),
            new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",  settings ->
                    new MiningHammerItem(ASToolMaterials.DIAMOND_H, 4.0F, -3.0F, settings),
            new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_TOOLS);
    public static final Item NETHERITE_KATANA = registerItem("netherite_katana",  settings ->
                    new Item(settings.sword(ToolMaterial.NETHERITE, 0, -1.6F)),
            new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",  settings ->
                    new MiningHammerItem(ASToolMaterials.NETHERITE_H, 4.0F, -3.0F, settings),
            new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_TOOLS);


    public static Item registerItem(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings, boolean shouldRegisterItemGroup, RegistryKey<ItemGroup> group) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ArsScientia.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, item);

        if (shouldRegisterItemGroup) {
            registerItemGroup(item, group);
        }
        return item;
    }

    private static void registerItemGroup(Item item, RegistryKey<ItemGroup> group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void register() {

    }

}
