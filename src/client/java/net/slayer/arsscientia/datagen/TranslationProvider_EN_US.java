package net.slayer.arsscientia.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.slayer.arsscientia.util.ItemGroupUtil;

import java.util.concurrent.CompletableFuture;

public class TranslationProvider_EN_US extends FabricLanguageProvider {
    public TranslationProvider_EN_US(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {

        //ITEMGROUPS

        translationBuilder.add("itemgroup.1.building_blocks", "Buildings");
        translationBuilder.add("itemgroup.2.decorative_blocks", "Decoratives");
        translationBuilder.add("itemgroup.3.ingredients", "Ingredients");
        translationBuilder.add("itemgroup.4.tools_and_utilities", "Tools & Utilities");
        translationBuilder.add("itemgroup.5.combat", "Combat");


        //ITEMS

        /*
        translationBuilder.add("item.arsscientia.xxx_ingot", "XXX Ingot");
        translationBuilder.add("item.arsscientia.xxx_nugget", "XXX Nugget");
        translationBuilder.add("item.arsscientia.raw_xxx", "Raw XXX");
        translationBuilder.add("item.arsscientia.xxx_dust", "XXX Dust");
        translationBuilder.add("block.arsscientia.xxx_ore", "XXX Ore");
        translationBuilder.add("block.arsscientia.deepslate_xxx_ore", "Deepslate XXX Ore");
        translationBuilder.add("block.arsscientia.nether_xxx_ore", "Nether XXX Ore");
        translationBuilder.add("block.arsscientia.end_xxx_ore", "End XXX Ore");
        translationBuilder.add("block.arsscientia.xxx_block", "Block of XXX");
        translationBuilder.add("block.arsscientia.raw_xxx_block", "Block of Raw XXX");
        translationBuilder.add("item.arsscientia.xxx_helmet", "XXX Helmet");
        translationBuilder.add("item.arsscientia.xxx_chestplate", "XXX Chestplate");
        translationBuilder.add("item.arsscientia.xxx_leggings", "XXX Leggings");
        translationBuilder.add("item.arsscientia.xxx_boots", "XXX Boots");
        translationBuilder.add("item.arsscientia.xxx_sword", "XXX Sword");
        translationBuilder.add("item.arsscientia.xxx_shovel", "XXX Shovel");
        translationBuilder.add("item.arsscientia.xxx_pickaxe", "XXX Pickaxe");
        translationBuilder.add("item.arsscientia.xxx_axe", "XXX Axe");
        translationBuilder.add("item.arsscientia.xxx_hoe", "XXX Hoe");
        translationBuilder.add("item.arsscientia.xxx_katana", "XXX Katana");
        translationBuilder.add("item.arsscientia.xxx_hammer", "XXX Hammer");
        translationBuilder.add("item.arsscientia.xxx_paxel", "XXX Paxel");
        */

        translationBuilder.add("item.arsscientia.coal_piece", "Coal Piece");
        translationBuilder.add("item.arsscientia.coal_dust", "Coal Dust");
        translationBuilder.add("item.arsscientia.copper_dust", "Copper Dust");
        translationBuilder.add("item.arsscientia.iron_dust", "Iron Dust");
        translationBuilder.add("item.arsscientia.gold_dust", "Gold Dust");
        translationBuilder.add("item.arsscientia.lapis_dust", "Lapis Dust");
        translationBuilder.add("item.arsscientia.diamond_dust", "Diamond Dust");
        translationBuilder.add("item.arsscientia.emerald_dust", "Emerald Dust");
        translationBuilder.add("item.arsscientia.amethyst_dust", "Amethyst Dust");
        translationBuilder.add("item.arsscientia.quartz_dust", "Quartz Dust");
        translationBuilder.add("item.arsscientia.netherite_dust", "Netherite Dust");
        translationBuilder.add("item.arsscientia.ender_dust", "Ender Dust");

        translationBuilder.add("item.arsscientia.tin_ingot", "Tin Ingot");
        translationBuilder.add("item.arsscientia.tin_nugget", "Tin Nugget");
        translationBuilder.add("item.arsscientia.raw_tin", "Raw Tin");
        translationBuilder.add("item.arsscientia.tin_dust", "Tin Dust");
        translationBuilder.add("block.arsscientia.tin_ore", "Tin Ore");
        translationBuilder.add("block.arsscientia.deepslate_tin_ore", "Deepslate Tin Ore");
        translationBuilder.add("block.arsscientia.tin_block", "Block of Tin");
        translationBuilder.add("block.arsscientia.raw_tin_block", "Block of Raw Tin");
        translationBuilder.add("item.arsscientia.tin_helmet", "Tin Helmet");
        translationBuilder.add("item.arsscientia.tin_chestplate", "Tin Chestplate");
        translationBuilder.add("item.arsscientia.tin_leggings", "Tin Leggings");
        translationBuilder.add("item.arsscientia.tin_boots", "Tin Boots");
        translationBuilder.add("item.arsscientia.tin_sword", "Tin Sword");
        translationBuilder.add("item.arsscientia.tin_shovel", "Tin Shovel");
        translationBuilder.add("item.arsscientia.tin_pickaxe", "Tin Pickaxe");
        translationBuilder.add("item.arsscientia.tin_axe", "Tin Axe");
        translationBuilder.add("item.arsscientia.tin_hoe", "Tin Hoe");
        translationBuilder.add("item.arsscientia.tin_katana", "Tin Katana");
        translationBuilder.add("item.arsscientia.tin_hammer", "Tin Hammer");
        translationBuilder.add("item.arsscientia.tin_paxel", "Tin Paxel");

        translationBuilder.add("item.arsscientia.silver_ingot", "Silver Ingot");
        translationBuilder.add("item.arsscientia.silver_nugget", "Silver Nugget");
        translationBuilder.add("item.arsscientia.raw_silver", "Raw Silver");
        translationBuilder.add("item.arsscientia.silver_dust", "Silver Dust");
        translationBuilder.add("block.arsscientia.silver_ore", "Silver Ore");
        translationBuilder.add("block.arsscientia.deepslate_silver_ore", "Deepslate Silver Ore");
        translationBuilder.add("block.arsscientia.silver_block", "Block of Silver");
        translationBuilder.add("block.arsscientia.raw_silver_block", "Block of Raw Silver");
        translationBuilder.add("item.arsscientia.silver_helmet", "Silver Helmet");
        translationBuilder.add("item.arsscientia.silver_chestplate", "Silver Chestplate");
        translationBuilder.add("item.arsscientia.silver_leggings", "Silver Leggings");
        translationBuilder.add("item.arsscientia.silver_boots", "Silver Boots");
        translationBuilder.add("item.arsscientia.silver_sword", "Silver Sword");
        translationBuilder.add("item.arsscientia.silver_shovel", "Silver Shovel");
        translationBuilder.add("item.arsscientia.silver_pickaxe", "Silver Pickaxe");
        translationBuilder.add("item.arsscientia.silver_axe", "Silver Axe");
        translationBuilder.add("item.arsscientia.silver_hoe", "Silver Hoe");
        translationBuilder.add("item.arsscientia.silver_katana", "Silver Katana");
        translationBuilder.add("item.arsscientia.silver_hammer", "Silver Hammer");
        translationBuilder.add("item.arsscientia.silver_paxel", "Silver Paxel");

        translationBuilder.add("item.arsscientia.titanium_ingot", "Titanium Ingot");
        translationBuilder.add("item.arsscientia.titanium_nugget", "Titanium Nugget");
        translationBuilder.add("item.arsscientia.raw_titanium", "Raw Titanium");
        translationBuilder.add("item.arsscientia.titanium_dust", "Titanium Dust");
        translationBuilder.add("block.arsscientia.titanium_ore", "Titanium Ore");
        translationBuilder.add("block.arsscientia.deepslate_titanium_ore", "Deepslate Titanium Ore");
        translationBuilder.add("block.arsscientia.titanium_block", "Block of Titanium");
        translationBuilder.add("block.arsscientia.raw_titanium_block", "Block of Raw Titanium");
        translationBuilder.add("item.arsscientia.titanium_helmet", "Titanium Helmet");
        translationBuilder.add("item.arsscientia.titanium_chestplate", "Titanium Chestplate");
        translationBuilder.add("item.arsscientia.titanium_leggings", "Titanium Leggings");
        translationBuilder.add("item.arsscientia.titanium_boots", "Titanium Boots");
        translationBuilder.add("item.arsscientia.titanium_sword", "Titanium Sword");
        translationBuilder.add("item.arsscientia.titanium_shovel", "Titanium Shovel");
        translationBuilder.add("item.arsscientia.titanium_pickaxe", "Titanium Pickaxe");
        translationBuilder.add("item.arsscientia.titanium_axe", "Titanium Axe");
        translationBuilder.add("item.arsscientia.titanium_hoe", "Titanium Hoe");
        translationBuilder.add("item.arsscientia.titanium_katana", "Titanium Katana");
        translationBuilder.add("item.arsscientia.titanium_hammer", "Titanium Hammer");
        translationBuilder.add("item.arsscientia.titanium_paxel", "Titanium Paxel");

        translationBuilder.add("item.arsscientia.tungsten_ingot", "Tungsten Ingot");
        translationBuilder.add("item.arsscientia.tungsten_nugget", "Tungsten Nugget");
        translationBuilder.add("item.arsscientia.raw_tungsten", "Raw Tungsten");
        translationBuilder.add("item.arsscientia.tungsten_dust", "Tungsten Dust");
        translationBuilder.add("block.arsscientia.nether_tungsten_ore", "Nether Tungsten Ore");
        translationBuilder.add("block.arsscientia.tungsten_block", "Block of Tungsten");
        translationBuilder.add("block.arsscientia.raw_tungsten_block", "Block of Raw Tungsten");
        translationBuilder.add("item.arsscientia.tungsten_helmet", "Tungsten Helmet");
        translationBuilder.add("item.arsscientia.tungsten_chestplate", "Tungsten Chestplate");
        translationBuilder.add("item.arsscientia.tungsten_leggings", "Tungsten Leggings");
        translationBuilder.add("item.arsscientia.tungsten_boots", "Tungsten Boots");
        translationBuilder.add("item.arsscientia.tungsten_sword", "Tungsten Sword");
        translationBuilder.add("item.arsscientia.tungsten_shovel", "Tungsten Shovel");
        translationBuilder.add("item.arsscientia.tungsten_pickaxe", "Tungsten Pickaxe");
        translationBuilder.add("item.arsscientia.tungsten_axe", "Tungsten Axe");
        translationBuilder.add("item.arsscientia.tungsten_hoe", "Tungsten Hoe");
        translationBuilder.add("item.arsscientia.tungsten_katana", "Tungsten Katana");
        translationBuilder.add("item.arsscientia.tungsten_hammer", "Tungsten Hammer");
        translationBuilder.add("item.arsscientia.tungsten_paxel", "Tungsten Paxel");

        translationBuilder.add("item.arsscientia.cobalt_ingot", "Cobalt Ingot");
        translationBuilder.add("item.arsscientia.cobalt_nugget", "Cobalt Nugget");
        translationBuilder.add("item.arsscientia.raw_cobalt", "Raw Cobalt");
        translationBuilder.add("item.arsscientia.cobalt_dust", "Cobalt Dust");
        translationBuilder.add("block.arsscientia.nether_cobalt_ore", "Nether Cobalt Ore");
        translationBuilder.add("block.arsscientia.cobalt_block", "Block of Cobalt");
        translationBuilder.add("block.arsscientia.raw_cobalt_block", "Block of Raw Cobalt");
        translationBuilder.add("item.arsscientia.cobalt_helmet", "Cobalt Helmet");
        translationBuilder.add("item.arsscientia.cobalt_chestplate", "Cobalt Chestplate");
        translationBuilder.add("item.arsscientia.cobalt_leggings", "Cobalt Leggings");
        translationBuilder.add("item.arsscientia.cobalt_boots", "Cobalt Boots");
        translationBuilder.add("item.arsscientia.cobalt_sword", "Cobalt Sword");
        translationBuilder.add("item.arsscientia.cobalt_shovel", "Cobalt Shovel");
        translationBuilder.add("item.arsscientia.cobalt_pickaxe", "Cobalt Pickaxe");
        translationBuilder.add("item.arsscientia.cobalt_axe", "Cobalt Axe");
        translationBuilder.add("item.arsscientia.cobalt_hoe", "Cobalt Hoe");
        translationBuilder.add("item.arsscientia.cobalt_katana", "Cobalt Katana");
        translationBuilder.add("item.arsscientia.cobalt_hammer", "Cobalt Hammer");
        translationBuilder.add("item.arsscientia.cobalt_paxel", "Cobalt Paxel");

        translationBuilder.add("item.arsscientia.platinum_ingot", "Platinum Ingot");
        translationBuilder.add("item.arsscientia.platinum_nugget", "Platinum Nugget");
        translationBuilder.add("item.arsscientia.raw_platinum", "Raw Platinum");
        translationBuilder.add("item.arsscientia.platinum_dust", "Platinum Dust");
        translationBuilder.add("block.arsscientia.end_platinum_ore", "End Platinum Ore");
        translationBuilder.add("block.arsscientia.platinum_block", "Block of Platinum");
        translationBuilder.add("block.arsscientia.raw_platinum_block", "Block of Raw Platinum");
        translationBuilder.add("item.arsscientia.platinum_helmet", "Platinum Helmet");
        translationBuilder.add("item.arsscientia.platinum_chestplate", "Platinum Chestplate");
        translationBuilder.add("item.arsscientia.platinum_leggings", "Platinum Leggings");
        translationBuilder.add("item.arsscientia.platinum_boots", "Platinum Boots");
        translationBuilder.add("item.arsscientia.platinum_sword", "Platinum Sword");
        translationBuilder.add("item.arsscientia.platinum_shovel", "Platinum Shovel");
        translationBuilder.add("item.arsscientia.platinum_pickaxe", "Platinum Pickaxe");
        translationBuilder.add("item.arsscientia.platinum_axe", "Platinum Axe");
        translationBuilder.add("item.arsscientia.platinum_hoe", "Platinum Hoe");
        translationBuilder.add("item.arsscientia.platinum_katana", "Platinum Katana");
        translationBuilder.add("item.arsscientia.platinum_hammer", "Platinum Hammer");
        translationBuilder.add("item.arsscientia.platinum_paxel", "Platinum Paxel");

        translationBuilder.add("item.arsscientia.bronze_ingot", "Bronze Ingot");
        translationBuilder.add("item.arsscientia.bronze_nugget", "Bronze Nugget");
        translationBuilder.add("item.arsscientia.bronze_dust", "Bronze Dust");
        translationBuilder.add("block.arsscientia.bronze_block", "Block of Bronze");
        translationBuilder.add("item.arsscientia.bronze_helmet", "Bronze Helmet");
        translationBuilder.add("item.arsscientia.bronze_chestplate", "Bronze Chestplate");
        translationBuilder.add("item.arsscientia.bronze_leggings", "Bronze Leggings");
        translationBuilder.add("item.arsscientia.bronze_boots", "Bronze Boots");
        translationBuilder.add("item.arsscientia.bronze_sword", "Bronze Sword");
        translationBuilder.add("item.arsscientia.bronze_shovel", "Bronze Shovel");
        translationBuilder.add("item.arsscientia.bronze_pickaxe", "Bronze Pickaxe");
        translationBuilder.add("item.arsscientia.bronze_axe", "Bronze Axe");
        translationBuilder.add("item.arsscientia.bronze_hoe", "Bronze Hoe");
        translationBuilder.add("item.arsscientia.bronze_katana", "Bronze Katana");
        translationBuilder.add("item.arsscientia.bronze_hammer", "Bronze Hammer");
        translationBuilder.add("item.arsscientia.bronze_paxel", "Bronze Paxel");

        translationBuilder.add("item.arsscientia.electrum_ingot", "Electrum Ingot");
        translationBuilder.add("item.arsscientia.electrum_nugget", "Electrum Nugget");
        translationBuilder.add("item.arsscientia.electrum_dust", "Electrum Dust");
        translationBuilder.add("block.arsscientia.electrum_block", "Block of Electrum");
        translationBuilder.add("item.arsscientia.electrum_helmet", "Electrum Helmet");
        translationBuilder.add("item.arsscientia.electrum_chestplate", "Electrum Chestplate");
        translationBuilder.add("item.arsscientia.electrum_leggings", "Electrum Leggings");
        translationBuilder.add("item.arsscientia.electrum_boots", "Electrum Boots");
        translationBuilder.add("item.arsscientia.electrum_sword", "Electrum Sword");
        translationBuilder.add("item.arsscientia.electrum_shovel", "Electrum Shovel");
        translationBuilder.add("item.arsscientia.electrum_pickaxe", "Electrum Pickaxe");
        translationBuilder.add("item.arsscientia.electrum_axe", "Electrum Axe");
        translationBuilder.add("item.arsscientia.electrum_hoe", "Electrum Hoe");
        translationBuilder.add("item.arsscientia.electrum_katana", "Electrum Katana");
        translationBuilder.add("item.arsscientia.electrum_hammer", "Electrum Hammer");
        translationBuilder.add("item.arsscientia.electrum_paxel", "Electrum Paxel");

        translationBuilder.add("item.arsscientia.steel_ingot", "Steel Ingot");
        translationBuilder.add("item.arsscientia.steel_nugget", "Steel Nugget");
        translationBuilder.add("item.arsscientia.steel_dust", "Steel Dust");
        translationBuilder.add("block.arsscientia.steel_block", "Block of Steel");
        translationBuilder.add("item.arsscientia.steel_helmet", "Steel Helmet");
        translationBuilder.add("item.arsscientia.steel_chestplate", "Steel Chestplate");
        translationBuilder.add("item.arsscientia.steel_leggings", "Steel Leggings");
        translationBuilder.add("item.arsscientia.steel_boots", "Steel Boots");
        translationBuilder.add("item.arsscientia.steel_sword", "Steel Sword");
        translationBuilder.add("item.arsscientia.steel_shovel", "Steel Shovel");
        translationBuilder.add("item.arsscientia.steel_pickaxe", "Steel Pickaxe");
        translationBuilder.add("item.arsscientia.steel_axe", "Steel Axe");
        translationBuilder.add("item.arsscientia.steel_hoe", "Steel Hoe");
        translationBuilder.add("item.arsscientia.steel_katana", "Steel Katana");
        translationBuilder.add("item.arsscientia.steel_hammer", "Steel Hammer");
        translationBuilder.add("item.arsscientia.steel_paxel", "Steel Paxel");

        translationBuilder.add("item.arsscientia.luminite_ingot", "Luminite Ingot");
        translationBuilder.add("item.arsscientia.luminite_nugget", "Luminite Nugget");
        translationBuilder.add("item.arsscientia.luminite_dust", "Luminite Dust");
        translationBuilder.add("block.arsscientia.luminite_block", "Block of Luminite");
        translationBuilder.add("item.arsscientia.luminite_helmet", "Luminite Helmet");
        translationBuilder.add("item.arsscientia.luminite_chestplate", "Luminite Chestplate");
        translationBuilder.add("item.arsscientia.luminite_leggings", "Luminite Leggings");
        translationBuilder.add("item.arsscientia.luminite_boots", "Luminite Boots");
        translationBuilder.add("item.arsscientia.luminite_sword", "Luminite Sword");
        translationBuilder.add("item.arsscientia.luminite_shovel", "Luminite Shovel");
        translationBuilder.add("item.arsscientia.luminite_pickaxe", "Luminite Pickaxe");
        translationBuilder.add("item.arsscientia.luminite_axe", "Luminite Axe");
        translationBuilder.add("item.arsscientia.luminite_hoe", "Luminite Hoe");
        translationBuilder.add("item.arsscientia.luminite_katana", "Luminite Katana");
        translationBuilder.add("item.arsscientia.luminite_hammer", "Luminite Hammer");
        translationBuilder.add("item.arsscientia.luminite_paxel", "Luminite Paxel");

        translationBuilder.add("item.arsscientia.tungstensteel_ingot", "Tungstensteel Ingot");
        translationBuilder.add("item.arsscientia.tungstensteel_nugget", "Tungstensteel Nugget");
        translationBuilder.add("item.arsscientia.tungstensteel_dust", "Tungstensteel Dust");
        translationBuilder.add("block.arsscientia.tungstensteel_block", "Block of Tungstensteel");
        translationBuilder.add("item.arsscientia.tungstensteel_helmet", "Tungstensteel Helmet");
        translationBuilder.add("item.arsscientia.tungstensteel_chestplate", "Tungstensteel Chestplate");
        translationBuilder.add("item.arsscientia.tungstensteel_leggings", "Tungstensteel Leggings");
        translationBuilder.add("item.arsscientia.tungstensteel_boots", "Tungstensteel Boots");
        translationBuilder.add("item.arsscientia.tungstensteel_sword", "Tungstensteel Sword");
        translationBuilder.add("item.arsscientia.tungstensteel_shovel", "Tungstensteel Shovel");
        translationBuilder.add("item.arsscientia.tungstensteel_pickaxe", "Tungstensteel Pickaxe");
        translationBuilder.add("item.arsscientia.tungstensteel_axe", "Tungstensteel Axe");
        translationBuilder.add("item.arsscientia.tungstensteel_hoe", "Tungstensteel Hoe");
        translationBuilder.add("item.arsscientia.tungstensteel_katana", "Tungstensteel Katana");
        translationBuilder.add("item.arsscientia.tungstensteel_hammer", "Tungstensteel Hammer");
        translationBuilder.add("item.arsscientia.tungstensteel_paxel", "Tungstensteel Paxel");

        translationBuilder.add("item.arsscientia.archeosite_ingot", "Archeosite Ingot");
        translationBuilder.add("item.arsscientia.archeosite_nugget", "Archeosite Nugget");
        translationBuilder.add("item.arsscientia.archeosite_dust", "Archeosite Dust");
        translationBuilder.add("block.arsscientia.archeosite_block", "Block of Archeosite");
        translationBuilder.add("item.arsscientia.archeosite_helmet", "Archeosite Helmet");
        translationBuilder.add("item.arsscientia.archeosite_chestplate", "Archeosite Chestplate");
        translationBuilder.add("item.arsscientia.archeosite_leggings", "Archeosite Leggings");
        translationBuilder.add("item.arsscientia.archeosite_boots", "Archeosite Boots");
        translationBuilder.add("item.arsscientia.archeosite_sword", "Archeosite Sword");
        translationBuilder.add("item.arsscientia.archeosite_shovel", "Archeosite Shovel");
        translationBuilder.add("item.arsscientia.archeosite_pickaxe", "Archeosite Pickaxe");
        translationBuilder.add("item.arsscientia.archeosite_axe", "Archeosite Axe");
        translationBuilder.add("item.arsscientia.archeosite_hoe", "Archeosite Hoe");
        translationBuilder.add("item.arsscientia.archeosite_katana", "Archeosite Katana");
        translationBuilder.add("item.arsscientia.archeosite_hammer", "Archeosite Hammer");
        translationBuilder.add("item.arsscientia.archeosite_paxel", "Archeosite Paxel");

        translationBuilder.add("item.arsscientia.voidsteel_ingot", "Voidsteel Ingot");
        translationBuilder.add("item.arsscientia.voidsteel_nugget", "Voidsteel Nugget");
        translationBuilder.add("item.arsscientia.voidsteel_dust", "Voidsteel Dust");
        translationBuilder.add("block.arsscientia.voidsteel_block", "Block of Voidsteel");
        translationBuilder.add("item.arsscientia.voidsteel_helmet", "Voidsteel Helmet");
        translationBuilder.add("item.arsscientia.voidsteel_chestplate", "Voidsteel Chestplate");
        translationBuilder.add("item.arsscientia.voidsteel_leggings", "Voidsteel Leggings");
        translationBuilder.add("item.arsscientia.voidsteel_boots", "Voidsteel Boots");
        translationBuilder.add("item.arsscientia.voidsteel_sword", "Voidsteel Sword");
        translationBuilder.add("item.arsscientia.voidsteel_shovel", "Voidsteel Shovel");
        translationBuilder.add("item.arsscientia.voidsteel_pickaxe", "Voidsteel Pickaxe");
        translationBuilder.add("item.arsscientia.voidsteel_axe", "Voidsteel Axe");
        translationBuilder.add("item.arsscientia.voidsteel_hoe", "Voidsteel Hoe");
        translationBuilder.add("item.arsscientia.voidsteel_katana", "Voidsteel Katana");
        translationBuilder.add("item.arsscientia.voidsteel_hammer", "Voidsteel Hammer");
        translationBuilder.add("item.arsscientia.voidsteel_paxel", "Voidsteel Paxel");

        translationBuilder.add("item.arsscientia.adamantine_ingot", "Adamantine Ingot");
        translationBuilder.add("item.arsscientia.adamantine_nugget", "Adamantine Nugget");
        translationBuilder.add("item.arsscientia.adamantine_dust", "Adamantine Dust");
        translationBuilder.add("block.arsscientia.adamantine_block", "Block of Adamantine");
        translationBuilder.add("item.arsscientia.adamantine_helmet", "Adamantine Helmet");
        translationBuilder.add("item.arsscientia.adamantine_chestplate", "Adamantine Chestplate");
        translationBuilder.add("item.arsscientia.adamantine_leggings", "Adamantine Leggings");
        translationBuilder.add("item.arsscientia.adamantine_boots", "Adamantine Boots");
        translationBuilder.add("item.arsscientia.adamantine_sword", "Adamantine Sword");
        translationBuilder.add("item.arsscientia.adamantine_shovel", "Adamantine Shovel");
        translationBuilder.add("item.arsscientia.adamantine_pickaxe", "Adamantine Pickaxe");
        translationBuilder.add("item.arsscientia.adamantine_axe", "Adamantine Axe");
        translationBuilder.add("item.arsscientia.adamantine_hoe", "Adamantine Hoe");
        translationBuilder.add("item.arsscientia.adamantine_katana", "Adamantine Katana");
        translationBuilder.add("item.arsscientia.adamantine_hammer", "Adamantine Hammer");
        translationBuilder.add("item.arsscientia.adamantine_paxel", "Adamantine Paxel");


        translationBuilder.add("block.arsscientia.luminite_lamp", "Luminite Lamp");



        //TOOLTIPS

        translationBuilder.add("item.craftlike.press_shift", "§8Press §7SHIFT §8for more info");

    }
}
