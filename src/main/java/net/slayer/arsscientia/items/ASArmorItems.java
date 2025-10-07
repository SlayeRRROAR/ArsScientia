package net.slayer.arsscientia.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.slayer.arsscientia.ArsScientia;
import net.slayer.arsscientia.items.armors.ASArmorMaterials;
import net.slayer.arsscientia.util.ItemGroupUtil;

import java.util.function.Function;

@SuppressWarnings({"unused", "SameParameterValue"})
public class ASArmorItems {

    public static final Item SILVER_HELMET = registerItem("silver_helmet", settings -> new Item(settings.armor(ASArmorMaterials.SILVER_ARMOR_MATERIAL,
            EquipmentType.HELMET)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item SILVER_CHESTPLATE = registerItem("silver_chestplate", settings -> new Item(settings.armor(ASArmorMaterials.SILVER_ARMOR_MATERIAL,
            EquipmentType.CHESTPLATE)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item SILVER_LEGGINGS = registerItem("silver_leggings", settings -> new Item(settings.armor(ASArmorMaterials.SILVER_ARMOR_MATERIAL,
            EquipmentType.LEGGINGS)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item SILVER_BOOTS = registerItem("silver_boots", settings -> new Item(settings.armor(ASArmorMaterials.SILVER_ARMOR_MATERIAL,
            EquipmentType.BOOTS)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);    //10

    public static final Item TITANIUM_HELMET = registerItem("titanium_helmet", settings -> new Item(settings.armor(ASArmorMaterials.TITANIUM_ARMOR_MATERIAL,
            EquipmentType.HELMET)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate", settings -> new Item(settings.armor(ASArmorMaterials.TITANIUM_ARMOR_MATERIAL,
            EquipmentType.CHESTPLATE)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item TITANIUM_LEGGINGS = registerItem("titanium_leggings", settings -> new Item(settings.armor(ASArmorMaterials.TITANIUM_ARMOR_MATERIAL,
            EquipmentType.LEGGINGS)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item TITANIUM_BOOTS = registerItem("titanium_boots", settings -> new Item(settings.armor(ASArmorMaterials.TITANIUM_ARMOR_MATERIAL,
            EquipmentType.BOOTS)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);    //36

    public static final Item PLATINUM_HELMET = registerItem("platinum_helmet", settings -> new Item(settings.armor(ASArmorMaterials.PLATINUM_ARMOR_MATERIAL,
            EquipmentType.HELMET)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item PLATINUM_CHESTPLATE = registerItem("platinum_chestplate", settings -> new Item(settings.armor(ASArmorMaterials.PLATINUM_ARMOR_MATERIAL,
            EquipmentType.CHESTPLATE)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item PLATINUM_LEGGINGS = registerItem("platinum_leggings", settings -> new Item(settings.armor(ASArmorMaterials.PLATINUM_ARMOR_MATERIAL,
            EquipmentType.LEGGINGS)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item PLATINUM_BOOTS = registerItem("platinum_boots", settings -> new Item(settings.armor(ASArmorMaterials.PLATINUM_ARMOR_MATERIAL,
            EquipmentType.BOOTS)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);    //34

    public static final Item BRONZE_HELMET = registerItem("bronze_helmet", settings -> new Item(settings.armor(ASArmorMaterials.BRONZE_ARMOR_MATERIAL,
            EquipmentType.HELMET)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item BRONZE_CHESTPLATE = registerItem("bronze_chestplate", settings -> new Item(settings.armor(ASArmorMaterials.BRONZE_ARMOR_MATERIAL,
            EquipmentType.CHESTPLATE)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item BRONZE_LEGGINGS = registerItem("bronze_leggings", settings -> new Item(settings.armor(ASArmorMaterials.BRONZE_ARMOR_MATERIAL,
            EquipmentType.LEGGINGS)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item BRONZE_BOOTS = registerItem("bronze_boots", settings -> new Item(settings.armor(ASArmorMaterials.BRONZE_ARMOR_MATERIAL,
            EquipmentType.BOOTS)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);    //22

    public static final Item STEEL_HELMET = registerItem("steel_helmet", settings -> new Item(settings.armor(ASArmorMaterials.STEEL_ARMOR_MATERIAL,
            EquipmentType.HELMET)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate", settings -> new Item(settings.armor(ASArmorMaterials.STEEL_ARMOR_MATERIAL,
            EquipmentType.CHESTPLATE)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings", settings -> new Item(settings.armor(ASArmorMaterials.STEEL_ARMOR_MATERIAL,
            EquipmentType.LEGGINGS)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item STEEL_BOOTS = registerItem("steel_boots", settings -> new Item(settings.armor(ASArmorMaterials.STEEL_ARMOR_MATERIAL,
            EquipmentType.BOOTS)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);    //38

    public static final Item TUNGSTENSTEEL_HELMET = registerItem("tungstensteel_helmet", settings -> new Item(settings.armor(ASArmorMaterials.TUNGSTENSTEEL_ARMOR_MATERIAL,
            EquipmentType.HELMET)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item TUNGSTENSTEEL_CHESTPLATE = registerItem("tungstensteel_chestplate", settings -> new Item(settings.armor(ASArmorMaterials.TUNGSTENSTEEL_ARMOR_MATERIAL,
            EquipmentType.CHESTPLATE)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item TUNGSTENSTEEL_LEGGINGS = registerItem("tungstensteel_leggings", settings -> new Item(settings.armor(ASArmorMaterials.TUNGSTENSTEEL_ARMOR_MATERIAL,
            EquipmentType.LEGGINGS)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item TUNGSTENSTEEL_BOOTS = registerItem("tungstensteel_boots", settings -> new Item(settings.armor(ASArmorMaterials.TUNGSTENSTEEL_ARMOR_MATERIAL,
            EquipmentType.BOOTS)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);    //41

    public static final Item ARCHEOSITE_HELMET = registerItem("archeosite_helmet", settings -> new Item(settings.armor(ASArmorMaterials.ARCHEOSITE_ARMOR_MATERIAL,
            EquipmentType.HELMET)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item ARCHEOSITE_CHESTPLATE = registerItem("archeosite_chestplate", settings -> new Item(settings.armor(ASArmorMaterials.ARCHEOSITE_ARMOR_MATERIAL,
            EquipmentType.CHESTPLATE)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item ARCHEOSITE_LEGGINGS = registerItem("archeosite_leggings", settings -> new Item(settings.armor(ASArmorMaterials.ARCHEOSITE_ARMOR_MATERIAL,
            EquipmentType.LEGGINGS)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item ARCHEOSITE_BOOTS = registerItem("archeosite_boots", settings -> new Item(settings.armor(ASArmorMaterials.ARCHEOSITE_ARMOR_MATERIAL,
            EquipmentType.BOOTS)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);    //42

    public static final Item VOIDSTEEL_HELMET = registerItem("voidsteel_helmet", settings -> new Item(settings.armor(ASArmorMaterials.VOIDSTEEL_ARMOR_MATERIAL,
            EquipmentType.HELMET)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item VOIDSTEEL_CHESTPLATE = registerItem("voidsteel_chestplate", settings -> new Item(settings.armor(ASArmorMaterials.VOIDSTEEL_ARMOR_MATERIAL,
            EquipmentType.CHESTPLATE)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item VOIDSTEEL_LEGGINGS = registerItem("voidsteel_leggings", settings -> new Item(settings.armor(ASArmorMaterials.VOIDSTEEL_ARMOR_MATERIAL,
            EquipmentType.LEGGINGS)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item VOIDSTEEL_BOOTS = registerItem("voidsteel_boots", settings -> new Item(settings.armor(ASArmorMaterials.VOIDSTEEL_ARMOR_MATERIAL,
            EquipmentType.BOOTS)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);    //46

    public static final Item ADAMANTINE_HELMET = registerItem("adamantine_helmet", settings -> new Item(settings.armor(ASArmorMaterials.ADAMANTINE_ARMOR_MATERIAL,
            EquipmentType.HELMET)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item ADAMANTINE_CHESTPLATE = registerItem("adamantine_chestplate", settings -> new Item(settings.armor(ASArmorMaterials.ADAMANTINE_ARMOR_MATERIAL,
            EquipmentType.CHESTPLATE)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item ADAMANTINE_LEGGINGS = registerItem("adamantine_leggings", settings -> new Item(settings.armor(ASArmorMaterials.ADAMANTINE_ARMOR_MATERIAL,
            EquipmentType.LEGGINGS)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);
    public static final Item ADAMANTINE_BOOTS = registerItem("adamantine_boots", settings -> new Item(settings.armor(ASArmorMaterials.ADAMANTINE_ARMOR_MATERIAL,
            EquipmentType.BOOTS)), new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_COMBAT);    //38


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
