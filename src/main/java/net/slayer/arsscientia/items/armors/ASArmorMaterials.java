package net.slayer.arsscientia.items.armors;

import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.slayer.arsscientia.ArsScientia;
import net.slayer.arsscientia.util.ASTagUtil;

import java.util.EnumMap;

public class ASArmorMaterials {

    public static final RegistryKey<EquipmentAsset> SILVER_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(ArsScientia.MOD_ID, "silver"));
    public static final ArmorMaterial SILVER_ARMOR_MATERIAL = new ArmorMaterial(10, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 1);
        map.put(EquipmentType.LEGGINGS, 4);
        map.put(EquipmentType.CHESTPLATE, 5);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 4);
    }), 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, ASTagUtil.Items.SILVER_REPAIR,
            SILVER_ARMOR_MATERIAL_KEY);

    public static final RegistryKey<EquipmentAsset> TITANIUM_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(ArsScientia.MOD_ID, "titanium"));
    public static final ArmorMaterial TITANIUM_ARMOR_MATERIAL = new ArmorMaterial(36, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 7);
    }), 4, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F, ASTagUtil.Items.TITANIUM_REPAIR,
            TITANIUM_ARMOR_MATERIAL_KEY);

    public static final RegistryKey<EquipmentAsset> TUNGSTEN_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(ArsScientia.MOD_ID, "tungsten"));
    public static final ArmorMaterial TUNGSTEN_ARMOR_MATERIAL = new ArmorMaterial(36, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 7);
    }), 4, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F, ASTagUtil.Items.TUNGSTEN_REPAIR,
            TUNGSTEN_ARMOR_MATERIAL_KEY);

    public static final RegistryKey<EquipmentAsset> PLATINUM_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(ArsScientia.MOD_ID, "platinum"));
    public static final ArmorMaterial PLATINUM_ARMOR_MATERIAL = new ArmorMaterial(34, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0F, 0.0F, ASTagUtil.Items.PLATINUM_REPAIR,
            PLATINUM_ARMOR_MATERIAL_KEY);

    public static final RegistryKey<EquipmentAsset> BRONZE_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(ArsScientia.MOD_ID, "bronze"));
    public static final ArmorMaterial BRONZE_ARMOR_MATERIAL = new ArmorMaterial(22, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 1);
        map.put(EquipmentType.LEGGINGS, 4);
        map.put(EquipmentType.CHESTPLATE, 5);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 4);
    }), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, ASTagUtil.Items.BRONZE_REPAIR,
            BRONZE_ARMOR_MATERIAL_KEY);


    public static final RegistryKey<EquipmentAsset> STEEL_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(ArsScientia.MOD_ID, "steel"));
    public static final ArmorMaterial STEEL_ARMOR_MATERIAL = new ArmorMaterial(38, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 5, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, ASTagUtil.Items.STEEL_REPAIR,
            STEEL_ARMOR_MATERIAL_KEY);

    public static final RegistryKey<EquipmentAsset> ELECTRUM_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(ArsScientia.MOD_ID, "electrum"));
    public static final ArmorMaterial ELECTRUM_ARMOR_MATERIAL = new ArmorMaterial(28, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F, 0.0F, ASTagUtil.Items.ELECTRUM_REPAIR,
            ELECTRUM_ARMOR_MATERIAL_KEY);


    public static final RegistryKey<EquipmentAsset> TUNGSTENSTEEL_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(ArsScientia.MOD_ID, "tungstensteel"));
    public static final ArmorMaterial TUNGSTENSTEEL_ARMOR_MATERIAL = new ArmorMaterial(41, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, ASTagUtil.Items.TUNGSTENSTEEL_REPAIR,
            TUNGSTENSTEEL_ARMOR_MATERIAL_KEY);

    public static final RegistryKey<EquipmentAsset> SIGNALUM_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(ArsScientia.MOD_ID, "signalum"));
    public static final ArmorMaterial SIGNALUM_ARMOR_MATERIAL = new ArmorMaterial(33, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 5);
        map.put(EquipmentType.LEGGINGS, 9);
        map.put(EquipmentType.CHESTPLATE, 11);
        map.put(EquipmentType.HELMET, 6);
        map.put(EquipmentType.BODY, 15);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0F, 0.2F, ASTagUtil.Items.SIGNALUM_REPAIR,
            SIGNALUM_ARMOR_MATERIAL_KEY);


    public static final RegistryKey<EquipmentAsset> ARCHEOSITE_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(ArsScientia.MOD_ID, "archeosite"));
    public static final ArmorMaterial ARCHEOSITE_ARMOR_MATERIAL = new ArmorMaterial(42, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 5);
        map.put(EquipmentType.LEGGINGS, 9);
        map.put(EquipmentType.CHESTPLATE, 11);
        map.put(EquipmentType.HELMET, 6);
        map.put(EquipmentType.BODY, 15);
    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,0,0, ASTagUtil.Items.ARCHEOSITE_REPAIR,
            ARCHEOSITE_ARMOR_MATERIAL_KEY);


    public static final RegistryKey<EquipmentAsset> VOIDSTEEL_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(ArsScientia.MOD_ID, "voidsteel"));
    public static final ArmorMaterial VOIDSTEEL_ARMOR_MATERIAL = new ArmorMaterial(46, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 5);
        map.put(EquipmentType.LEGGINGS, 9);
        map.put(EquipmentType.CHESTPLATE, 11);
        map.put(EquipmentType.HELMET, 6);
        map.put(EquipmentType.BODY, 15);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5.0F, 0.3F, ASTagUtil.Items.VOIDSTEEL_REPAIR,
            VOIDSTEEL_ARMOR_MATERIAL_KEY);

    public static final RegistryKey<EquipmentAsset> ENDERIUM_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(ArsScientia.MOD_ID, "enderium"));
    public static final ArmorMaterial ENDERIUM_ARMOR_MATERIAL = new ArmorMaterial(38, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 5);
        map.put(EquipmentType.LEGGINGS, 9);
        map.put(EquipmentType.CHESTPLATE, 11);
        map.put(EquipmentType.HELMET, 6);
        map.put(EquipmentType.BODY, 15);
    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 6.0F, 0.4F, ASTagUtil.Items.ENDERIUM_REPAIR,
            ENDERIUM_ARMOR_MATERIAL_KEY);

    public static final RegistryKey<EquipmentAsset> ADAMANTINE_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(ArsScientia.MOD_ID, "adamantine"));
    public static final ArmorMaterial ADAMANTINE_ARMOR_MATERIAL = new ArmorMaterial(38, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 5);
        map.put(EquipmentType.LEGGINGS, 9);
        map.put(EquipmentType.CHESTPLATE, 11);
        map.put(EquipmentType.HELMET, 6);
        map.put(EquipmentType.BODY, 15);
    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 6.0F, 0.4F, ASTagUtil.Items.ADAMANTINE_REPAIR,
            ADAMANTINE_ARMOR_MATERIAL_KEY);

}
