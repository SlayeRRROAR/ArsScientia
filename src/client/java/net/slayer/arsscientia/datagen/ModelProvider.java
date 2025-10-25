package net.slayer.arsscientia.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.ModelVariant;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.Pool;
import net.slayer.arsscientia.blocks.ASBlocks;
import net.slayer.arsscientia.blocks.ASDecoBlocks;
import net.slayer.arsscientia.blocks.custom.LuminiteLampBlock;
import net.slayer.arsscientia.items.ASArmorItems;
import net.slayer.arsscientia.items.ASItems;
import net.slayer.arsscientia.items.armors.ASArmorMaterials;

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

        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ASDecoBlocks.LUMINITE_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(ASDecoBlocks.LUMINITE_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockModelDefinitionCreator.of(ASDecoBlocks.LUMINITE_LAMP)
                .with(BlockStateModelGenerator.createBooleanModelMap(LuminiteLampBlock.LIT,
                        new WeightedVariant(Pool.<ModelVariant>builder().add(new ModelVariant(lampOnIdentifier)).build()),
                        new WeightedVariant(Pool.<ModelVariant>builder().add(new ModelVariant(lampOffIdentifier)).build()))));

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

        /*
        itemModelGenerator.registerArmor(ASArmorItems.XXX_HELMET, ASArmorMaterials.XXX_ARMOR_MATERIAL_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.XXX_CHESTPLATE, ASArmorMaterials.XXX_ARMOR_MATERIAL_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.XXX_LEGGINGS, ASArmorMaterials.XXX_ARMOR_MATERIAL_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.XXX_BOOTS, ASArmorMaterials.XXX_ARMOR_MATERIAL_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);
        */

        itemModelGenerator.registerArmor(ASArmorItems.SILVER_HELMET, ASArmorMaterials.SILVER_ARMOR_MATERIAL_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.SILVER_CHESTPLATE, ASArmorMaterials.SILVER_ARMOR_MATERIAL_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.SILVER_LEGGINGS, ASArmorMaterials.SILVER_ARMOR_MATERIAL_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.SILVER_BOOTS, ASArmorMaterials.SILVER_ARMOR_MATERIAL_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ASArmorItems.TITANIUM_HELMET, ASArmorMaterials.TITANIUM_ARMOR_MATERIAL_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.TITANIUM_CHESTPLATE, ASArmorMaterials.TITANIUM_ARMOR_MATERIAL_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.TITANIUM_LEGGINGS, ASArmorMaterials.TITANIUM_ARMOR_MATERIAL_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.TITANIUM_BOOTS, ASArmorMaterials.TITANIUM_ARMOR_MATERIAL_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ASArmorItems.PLATINUM_HELMET, ASArmorMaterials.PLATINUM_ARMOR_MATERIAL_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.PLATINUM_CHESTPLATE, ASArmorMaterials.PLATINUM_ARMOR_MATERIAL_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.PLATINUM_LEGGINGS, ASArmorMaterials.PLATINUM_ARMOR_MATERIAL_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.PLATINUM_BOOTS, ASArmorMaterials.PLATINUM_ARMOR_MATERIAL_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ASArmorItems.BRONZE_HELMET, ASArmorMaterials.BRONZE_ARMOR_MATERIAL_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.BRONZE_CHESTPLATE, ASArmorMaterials.BRONZE_ARMOR_MATERIAL_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.BRONZE_LEGGINGS, ASArmorMaterials.BRONZE_ARMOR_MATERIAL_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.BRONZE_BOOTS, ASArmorMaterials.BRONZE_ARMOR_MATERIAL_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ASArmorItems.STEEL_HELMET, ASArmorMaterials.STEEL_ARMOR_MATERIAL_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.STEEL_CHESTPLATE, ASArmorMaterials.STEEL_ARMOR_MATERIAL_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.STEEL_LEGGINGS, ASArmorMaterials.STEEL_ARMOR_MATERIAL_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.STEEL_BOOTS, ASArmorMaterials.STEEL_ARMOR_MATERIAL_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ASArmorItems.TUNGSTENSTEEL_HELMET, ASArmorMaterials.TUNGSTENSTEEL_ARMOR_MATERIAL_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.TUNGSTENSTEEL_CHESTPLATE, ASArmorMaterials.TUNGSTENSTEEL_ARMOR_MATERIAL_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.TUNGSTENSTEEL_LEGGINGS, ASArmorMaterials.TUNGSTENSTEEL_ARMOR_MATERIAL_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.TUNGSTENSTEEL_BOOTS, ASArmorMaterials.TUNGSTENSTEEL_ARMOR_MATERIAL_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ASArmorItems.ARCHEOSITE_HELMET, ASArmorMaterials.ARCHEOSITE_ARMOR_MATERIAL_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.ARCHEOSITE_CHESTPLATE, ASArmorMaterials.ARCHEOSITE_ARMOR_MATERIAL_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.ARCHEOSITE_LEGGINGS, ASArmorMaterials.ARCHEOSITE_ARMOR_MATERIAL_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.ARCHEOSITE_BOOTS, ASArmorMaterials.ARCHEOSITE_ARMOR_MATERIAL_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ASArmorItems.VOIDSTEEL_HELMET, ASArmorMaterials.VOIDSTEEL_ARMOR_MATERIAL_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.VOIDSTEEL_CHESTPLATE, ASArmorMaterials.VOIDSTEEL_ARMOR_MATERIAL_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.VOIDSTEEL_LEGGINGS, ASArmorMaterials.VOIDSTEEL_ARMOR_MATERIAL_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.VOIDSTEEL_BOOTS, ASArmorMaterials.VOIDSTEEL_ARMOR_MATERIAL_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(ASArmorItems.ADAMANTINE_HELMET, ASArmorMaterials.ADAMANTINE_ARMOR_MATERIAL_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.ADAMANTINE_CHESTPLATE, ASArmorMaterials.ADAMANTINE_ARMOR_MATERIAL_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.ADAMANTINE_LEGGINGS, ASArmorMaterials.ADAMANTINE_ARMOR_MATERIAL_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ASArmorItems.ADAMANTINE_BOOTS, ASArmorMaterials.ADAMANTINE_ARMOR_MATERIAL_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);


    }

}
