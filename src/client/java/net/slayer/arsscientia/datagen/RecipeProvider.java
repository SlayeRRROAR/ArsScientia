package net.slayer.arsscientia.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.slayer.arsscientia.blocks.ASBlocks;
import net.slayer.arsscientia.items.ASItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class RecipeProvider extends FabricRecipeProvider {
    public RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {

                List<ItemConvertible> COALs_SMELTABLES = List.of(ASItems.COAL_DUST);
                offerSmelting(COALs_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.0F, 200, "coal");
                offerBlasting(COALs_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.0F, 100, "coal");

                List<ItemConvertible> COPPER_SMELTABLES = List.of(ASItems.COPPER_DUST);
                offerSmelting(COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.0F, 200, "copper_ingot");
                offerBlasting(COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.0F, 100, "copper_ingot");

                List<ItemConvertible> IRON_SMELTABLES = List.of(ASItems.IRON_DUST);
                offerSmelting(IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.0F, 200, "iron_ingot");
                offerBlasting(IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.0F, 100, "iron_ingot");

                List<ItemConvertible> GOLD_SMELTABLES = List.of(ASItems.GOLD_DUST);
                offerSmelting(GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 0.0F, 200, "gold_ingot");
                offerBlasting(GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 0.0F, 100, "gold_ingot");

                List<ItemConvertible> LAPIS_SMELTABLES = List.of(ASItems.LAPIS_DUST);
                offerSmelting(LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.0F, 200, "lapis_lazuli");
                offerBlasting(LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.0F, 100, "lapis_lazuli");

                List<ItemConvertible> DIAMOND_SMELTABLES = List.of(ASItems.DIAMOND_DUST);
                offerSmelting(DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.0F, 200, "diamond");
                offerBlasting(DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.0F, 100, "diamond");

                List<ItemConvertible> EMERALD_SMELTABLES = List.of(ASItems.EMERALD_DUST);
                offerSmelting(EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.0F, 200, "emerald");
                offerBlasting(EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.0F, 100, "emerald");

                List<ItemConvertible> AMETHYST_SMELTABLES = List.of(ASItems.AMETHYST_DUST);
                offerSmelting(AMETHYST_SMELTABLES, RecipeCategory.MISC, Items.AMETHYST_SHARD, 0.0F, 200, "amethyst_shard");
                offerBlasting(AMETHYST_SMELTABLES, RecipeCategory.MISC, Items.AMETHYST_SHARD, 0.0F, 100, "amethyst_shard");

                List<ItemConvertible> QUARTZ_SMELTABLES = List.of(ASItems.QUARTZ_DUST);
                offerSmelting(QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 0.0F, 200, "quartz");
                offerBlasting(QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 0.0F, 100, "quartz");

                List<ItemConvertible> NETHERITE_SMELTABLES = List.of(ASItems.NETHERITE_DUST);
                offerSmelting(NETHERITE_SMELTABLES, RecipeCategory.MISC, Items.NETHERITE_INGOT, 0.0F, 200, "netherite_ingot");
                offerBlasting(NETHERITE_SMELTABLES, RecipeCategory.MISC, Items.NETHERITE_INGOT, 0.0F, 100, "netherite_ingot");

                List<ItemConvertible> ENDER_SMELTABLES = List.of(ASItems.ENDER_DUST);
                offerSmelting(ENDER_SMELTABLES, RecipeCategory.MISC, Items.ENDER_PEARL, 0.0F, 200, "ender_pearl");
                offerBlasting(ENDER_SMELTABLES, RecipeCategory.MISC, Items.ENDER_PEARL, 0.0F, 100, "ender_pearl");

                List<ItemConvertible> TIN_ORES = List.of(ASBlocks.TIN_ORE.asItem(), ASBlocks.DEEPSLATE_TIN_ORE.asItem(), ASItems.RAW_TIN);
                offerSmelting(TIN_ORES, RecipeCategory.MISC, ASItems.TIN_INGOT, 3.0F, 200, "tin_ingot");
                offerBlasting(TIN_ORES, RecipeCategory.MISC, ASItems.TIN_INGOT, 3.0F, 100, "tin_ingot");
                List<ItemConvertible> TIN_DUST = List.of(ASItems.TIN_DUST);
                offerSmelting(TIN_DUST, RecipeCategory.MISC, ASItems.TIN_INGOT, 0.0F, 200, "tin_ingot");
                offerBlasting(TIN_DUST, RecipeCategory.MISC, ASItems.TIN_INGOT, 0.0F, 100, "tin_ingot");
                offerReversibleCompactingRecipesWithReverseRecipeGroup(RecipeCategory.MISC, ASItems.TIN_INGOT, RecipeCategory.BUILDING_BLOCKS, ASBlocks.TIN_BLOCK, "tin_ingot_from_tin_block", "tin_ingot");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.TIN_NUGGET, RecipeCategory.MISC, ASItems.TIN_INGOT, "tin_ingot_from_nuggets", "tin_nugget");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.RAW_TIN, RecipeCategory.MISC, ASBlocks.RAW_TIN_BLOCK, "raw_tin_block", "raw_tin");

                List<ItemConvertible> SILVER_ORES = List.of(ASBlocks.SILVER_ORE.asItem(), ASBlocks.DEEPSLATE_SILVER_ORE.asItem(), ASItems.RAW_SILVER);
                offerSmelting(SILVER_ORES, RecipeCategory.MISC, ASItems.SILVER_INGOT, 3.0F, 200, "silver_ingot");
                offerBlasting(SILVER_ORES, RecipeCategory.MISC, ASItems.SILVER_INGOT, 3.0F, 100, "silver_ingot");
                List<ItemConvertible> SILVER_DUST = List.of(ASItems.SILVER_DUST);
                offerSmelting(SILVER_DUST, RecipeCategory.MISC, ASItems.SILVER_INGOT, 0.0F, 200, "silver_ingot");
                offerBlasting(SILVER_DUST, RecipeCategory.MISC, ASItems.SILVER_INGOT, 0.0F, 100, "silver_ingot");
                offerReversibleCompactingRecipesWithReverseRecipeGroup(RecipeCategory.MISC, ASItems.SILVER_INGOT, RecipeCategory.BUILDING_BLOCKS, ASBlocks.SILVER_BLOCK, "silver_ingot_from_block", "silver_ingot");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.SILVER_NUGGET, RecipeCategory.MISC, ASItems.SILVER_INGOT, "silver_ingot_from_nuggets", "silver_nugget");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.RAW_SILVER, RecipeCategory.MISC, ASBlocks.RAW_SILVER_BLOCK, "raw_silver_block", "raw_silver");

                List<ItemConvertible> TITANIUM_ORES = List.of(ASBlocks.TITANIUM_ORE.asItem(), ASBlocks.DEEPSLATE_TITANIUM_ORE.asItem(), ASItems.RAW_TITANIUM);
                offerSmelting(TITANIUM_ORES, RecipeCategory.MISC, ASItems.TITANIUM_INGOT, 3.0F, 200, "titanium_ingot");
                offerBlasting(TITANIUM_ORES, RecipeCategory.MISC, ASItems.TITANIUM_INGOT, 3.0F, 100, "titanium_ingot");
                List<ItemConvertible> TITANIUM_DUST = List.of(ASItems.TITANIUM_DUST);
                offerSmelting(TITANIUM_DUST, RecipeCategory.MISC, ASItems.TITANIUM_INGOT, 0.0F, 200, "titanium_ingot");
                offerBlasting(TITANIUM_DUST, RecipeCategory.MISC, ASItems.TITANIUM_INGOT, 0.0F, 100, "titanium_ingot");
                offerReversibleCompactingRecipesWithReverseRecipeGroup(RecipeCategory.MISC, ASItems.TITANIUM_INGOT, RecipeCategory.BUILDING_BLOCKS, ASBlocks.TITANIUM_BLOCK, "titanium_ingot_from_block", "titanium_ingot");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.TITANIUM_NUGGET, RecipeCategory.MISC, ASItems.TITANIUM_INGOT, "titanium_ingot_from_nuggets", "titanium_nugget");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.RAW_TITANIUM, RecipeCategory.MISC, ASBlocks.RAW_TITANIUM_BLOCK, "raw_titanium_block", "raw_titanium");

                List<ItemConvertible> TUNGSTEN_ORES = List.of(ASBlocks.NETHER_TUNGSTEN_ORE.asItem(), ASItems.RAW_TUNGSTEN);
                offerSmelting(TUNGSTEN_ORES, RecipeCategory.MISC, ASItems.TUNGSTEN_INGOT, 3.0F, 200, "tungsten_ingot");
                offerBlasting(TUNGSTEN_ORES, RecipeCategory.MISC, ASItems.TUNGSTEN_INGOT, 3.0F, 100, "tungsten_ingot");
                List<ItemConvertible> TUNGSTEN_DUST = List.of(ASItems.TUNGSTEN_DUST);
                offerSmelting(TUNGSTEN_DUST, RecipeCategory.MISC, ASItems.TUNGSTEN_INGOT, 0.0F, 200, "tungsten_ingot");
                offerBlasting(TUNGSTEN_DUST, RecipeCategory.MISC, ASItems.TUNGSTEN_INGOT, 0.0F, 100, "tungsten_ingot");
                offerReversibleCompactingRecipesWithReverseRecipeGroup(RecipeCategory.MISC, ASItems.TUNGSTEN_INGOT, RecipeCategory.BUILDING_BLOCKS, ASBlocks.TUNGSTEN_BLOCK, "tungsten_ingot_from_block", "tungsten_ingot");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.TUNGSTEN_NUGGET, RecipeCategory.MISC, ASItems.TUNGSTEN_INGOT, "tungsten_ingot_from_nuggets", "tungsten_nugget");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.RAW_TUNGSTEN, RecipeCategory.MISC, ASBlocks.RAW_TUNGSTEN_BLOCK, "raw_tungsten_block", "raw_tungsten");

                List<ItemConvertible> COBALT_ORES = List.of(ASBlocks.NETHER_COBALT_ORE.asItem(), ASItems.RAW_COBALT);
                offerSmelting(COBALT_ORES, RecipeCategory.MISC, ASItems.COBALT_INGOT, 3.0F, 200, "cobalt_ingot");
                offerBlasting(COBALT_ORES, RecipeCategory.MISC, ASItems.COBALT_INGOT, 3.0F, 100, "cobalt_ingot");
                List<ItemConvertible> COBALT_DUST = List.of(ASItems.COBALT_DUST);
                offerSmelting(COBALT_DUST, RecipeCategory.MISC, ASItems.COBALT_INGOT, 0.0F, 200, "cobalt_ingot");
                offerBlasting(COBALT_DUST, RecipeCategory.MISC, ASItems.COBALT_INGOT, 0.0F, 100, "cobalt_ingot");
                offerReversibleCompactingRecipesWithReverseRecipeGroup(RecipeCategory.MISC, ASItems.COBALT_INGOT, RecipeCategory.BUILDING_BLOCKS, ASBlocks.COBALT_BLOCK, "cobalt_ingot_from_block", "cobalt_ingot");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.COBALT_NUGGET, RecipeCategory.MISC, ASItems.COBALT_INGOT, "cobalt_ingot_from_nuggets", "cobalt_nugget");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.RAW_COBALT, RecipeCategory.MISC, ASBlocks.RAW_COBALT_BLOCK, "raw_cobalt_block", "raw_cobalt");

                List<ItemConvertible> PLATINUM_ORES = List.of(ASBlocks.END_PLATINUM_ORE.asItem(), ASItems.RAW_PLATINUM);
                offerSmelting(PLATINUM_ORES, RecipeCategory.MISC, ASItems.PLATINUM_INGOT, 3.0F, 200, "platinum_ingot");
                offerBlasting(PLATINUM_ORES, RecipeCategory.MISC, ASItems.PLATINUM_INGOT, 3.0F, 100, "platinum_ingot");
                List<ItemConvertible> PLATINUM_DUST = List.of(ASItems.PLATINUM_DUST);
                offerSmelting(PLATINUM_DUST, RecipeCategory.MISC, ASItems.PLATINUM_INGOT, 0.0F, 200, "platinum_ingot");
                offerBlasting(PLATINUM_DUST, RecipeCategory.MISC, ASItems.PLATINUM_INGOT, 0.0F, 100, "platinum_ingot");
                offerReversibleCompactingRecipesWithReverseRecipeGroup(RecipeCategory.MISC, ASItems.PLATINUM_INGOT, RecipeCategory.BUILDING_BLOCKS, ASBlocks.PLATINUM_BLOCK, "platinum_ingot_from_block", "platinum_ingot");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.PLATINUM_NUGGET, RecipeCategory.MISC, ASItems.PLATINUM_INGOT, "platinum_ingot_from_nuggets", "platinum_nugget");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.RAW_PLATINUM, RecipeCategory.MISC, ASBlocks.RAW_PLATINUM_BLOCK, "raw_platinum_block", "raw_platinum");

                List<ItemConvertible> BRONZE_ORES = List.of(ASItems.BRONZE_DUST);
                offerSmelting(BRONZE_ORES, RecipeCategory.MISC, ASItems.BRONZE_INGOT, 0.0F, 200, "bronze_ingot");
                offerBlasting(BRONZE_ORES, RecipeCategory.MISC, ASItems.BRONZE_INGOT, 0.0F, 100, "bronze_ingot");
                offerReversibleCompactingRecipesWithReverseRecipeGroup(RecipeCategory.MISC, ASItems.BRONZE_INGOT, RecipeCategory.BUILDING_BLOCKS, ASBlocks.BRONZE_BLOCK, "bronze_ingot_from_block", "bronze_ingot");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.BRONZE_NUGGET, RecipeCategory.MISC, ASItems.BRONZE_INGOT, "bronze_ingot_from_nuggets", "bronze_nugget");
                createShapeless(RecipeCategory.MISC, ASItems.BRONZE_DUST, 4)
                        .input(ASItems.COPPER_DUST, 3)
                        .input(ASItems.TIN_DUST, 1)
                        .group("bronze_dust")
                        .criterion(hasItem(ASItems.COPPER_DUST), conditionsFromItem(ASItems.COPPER_DUST))
                        .offerTo(exporter);


                List<ItemConvertible> STEEL_SMELTABLES = List.of(ASItems.STEEL_DUST);
                offerSmelting(STEEL_SMELTABLES, RecipeCategory.MISC, ASItems.STEEL_INGOT, 0.0F, 200, "steel_ingot");
                offerBlasting(STEEL_SMELTABLES, RecipeCategory.MISC, ASItems.STEEL_INGOT, 0.0F, 100, "steel_ingot");
                offerReversibleCompactingRecipesWithReverseRecipeGroup(RecipeCategory.MISC, ASItems.STEEL_INGOT, RecipeCategory.BUILDING_BLOCKS, ASBlocks.STEEL_BLOCK, "steel_ingot_from_block", "steel_ingot");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.STEEL_NUGGET, RecipeCategory.MISC, ASItems.STEEL_INGOT, "steel_ingot_from_nuggets", "steel_nugget");
                createShapeless(RecipeCategory.MISC, ASItems.STEEL_DUST, 1)
                        .input(ASItems.IRON_DUST, 1)
                        .input(ASItems.COAL_DUST, 2)
                        .group("steel_dust")
                        .criterion(hasItem(ASItems.IRON_DUST), conditionsFromItem(ASItems.IRON_DUST))
                        .offerTo(exporter);

                List<ItemConvertible> ELECTRUM_SMELTABLES = List.of(ASItems.ELECTRUM_DUST);
                offerSmelting(ELECTRUM_SMELTABLES, RecipeCategory.MISC, ASItems.ELECTRUM_INGOT, 0.0F, 200, "electrum_ingot");
                offerBlasting(ELECTRUM_SMELTABLES, RecipeCategory.MISC, ASItems.ELECTRUM_INGOT, 0.0F, 100, "electrum_ingot");
                offerReversibleCompactingRecipesWithReverseRecipeGroup(RecipeCategory.MISC, ASItems.ELECTRUM_INGOT, RecipeCategory.BUILDING_BLOCKS, ASBlocks.ELECTRUM_BLOCK, "electrum_ingot_from_block", "electrum_ingot");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.ELECTRUM_NUGGET, RecipeCategory.MISC, ASItems.ELECTRUM_INGOT, "electrum_ingot_from_nuggets", "electrum_nugget");
                createShapeless(RecipeCategory.MISC, ASItems.ELECTRUM_DUST, 2)
                        .input(ASItems.GOLD_DUST, 1)
                        .input(ASItems.SILVER_DUST, 1)
                        .group("electrum_dust")
                        .criterion(hasItem(ASItems.GOLD_DUST), conditionsFromItem(ASItems.GOLD_DUST))
                        .offerTo(exporter);


                List<ItemConvertible> TUNGSTENSTEEL_SMELTABLES = List.of(ASItems.TUNGSTENSTEEL_DUST);
                offerSmelting(TUNGSTENSTEEL_SMELTABLES, RecipeCategory.MISC, ASItems.TUNGSTENSTEEL_INGOT, 0.0F, 200, "tungstensteel_ingot");
                offerBlasting(TUNGSTENSTEEL_SMELTABLES, RecipeCategory.MISC, ASItems.TUNGSTENSTEEL_INGOT, 0.0F, 100, "tungstensteel_ingot");
                offerReversibleCompactingRecipesWithReverseRecipeGroup(RecipeCategory.MISC, ASItems.TUNGSTENSTEEL_INGOT, RecipeCategory.BUILDING_BLOCKS, ASBlocks.TUNGSTENSTEEL_BLOCK, "tungstensteel_ingot_from_block", "tungstensteel_ingot");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.TUNGSTENSTEEL_NUGGET, RecipeCategory.MISC, ASItems.TUNGSTENSTEEL_INGOT, "tungstensteel_ingot_from_nuggets", "tungstensteel_nugget");
                createShapeless(RecipeCategory.MISC, ASItems.TUNGSTENSTEEL_DUST, 1)
                        .input(ASItems.STEEL_DUST, 3)
                        .input(ASItems.TUNGSTEN_DUST, 1)
                        .input(Items.REDSTONE, 4)
                        .group("tungstensteel_dust")
                        .criterion(hasItem(ASItems.TUNGSTEN_DUST), conditionsFromItem(ASItems.TUNGSTEN_DUST))
                        .offerTo(exporter);


                List<ItemConvertible> LUMINITE_SMELTABLES = List.of(ASItems.LUMINITE_DUST);
                offerSmelting(LUMINITE_SMELTABLES, RecipeCategory.MISC, ASItems.LUMINITE_INGOT, 0.0F, 200, "luminite_ingot");
                offerBlasting(LUMINITE_SMELTABLES, RecipeCategory.MISC, ASItems.LUMINITE_INGOT, 0.0F, 100, "luminite_ingot");
                offerReversibleCompactingRecipesWithReverseRecipeGroup(RecipeCategory.MISC, ASItems.LUMINITE_INGOT, RecipeCategory.BUILDING_BLOCKS, ASBlocks.LUMINITE_BLOCK, "luminite_ingot_from_block", "luminite_ingot");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.LUMINITE_NUGGET, RecipeCategory.MISC, ASItems.LUMINITE_INGOT, "luminite_ingot_from_nuggets", "luminite_nugget");
                createShapeless(RecipeCategory.MISC, ASItems.LUMINITE_DUST, 4)
                        .input(ASItems.SILVER_DUST, 3)
                        .input(ASItems.TIN_DUST, 1)
                        .input(Items.GLOWSTONE_DUST, 4)
                        .group("luminite_dust")
                        .criterion(hasItem(Items.GLOWSTONE_DUST), conditionsFromItem(Items.GLOWSTONE_DUST))
                        .offerTo(exporter);

                List<ItemConvertible> ARCHEOSITE_SMELTABLES = List.of(ASItems.ARCHEOSITE_DUST);
                offerSmelting(ARCHEOSITE_SMELTABLES, RecipeCategory.MISC, ASItems.ARCHEOSITE_INGOT,0.0F, 200, "archeosite_ingot");
                offerBlasting(ARCHEOSITE_SMELTABLES, RecipeCategory.MISC, ASItems.ARCHEOSITE_INGOT, 0.0F, 100, "archeosite_ingot");
                offerReversibleCompactingRecipesWithReverseRecipeGroup(RecipeCategory.MISC, ASItems.ARCHEOSITE_INGOT, RecipeCategory.BUILDING_BLOCKS, ASBlocks.ARCHEOSITE_BLOCK, "archeosite_ingot_from_block", "archeosite_ingot");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.ARCHEOSITE_NUGGET, RecipeCategory.MISC, ASItems.ARCHEOSITE_INGOT, "archeosite_ingot_from_nuggets", "archeosite_nugget");
                createShapeless(RecipeCategory.MISC, ASItems.ARCHEOSITE_DUST, 1)
                        .input(ASItems.NETHERITE_DUST, 3)
                        .input(ASItems.DIAMOND_DUST, 2)
                        .input(ASItems.PLATINUM_DUST, 1)
                        .group("archeosite_dust")
                        .criterion(hasItem(ASItems.PLATINUM_DUST), conditionsFromItem(ASItems.PLATINUM_DUST))
                        .offerTo(exporter);

                List<ItemConvertible> VOIDSTEEL_SMELTABLES = List.of(ASItems.VOIDSTEEL_DUST);
                offerSmelting(VOIDSTEEL_SMELTABLES, RecipeCategory.MISC, ASItems.VOIDSTEEL_INGOT, 0.0F, 200, "voidsteel_ingot");
                offerBlasting(VOIDSTEEL_SMELTABLES, RecipeCategory.MISC, ASItems.VOIDSTEEL_INGOT, 0.0F, 100, "voidsteel_ingot");
                offerReversibleCompactingRecipesWithReverseRecipeGroup(RecipeCategory.MISC, ASItems.VOIDSTEEL_INGOT, RecipeCategory.BUILDING_BLOCKS, ASBlocks.VOIDSTEEL_BLOCK, "voidsteel_ingot_from_block", "voidsteel_ingot");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.VOIDSTEEL_NUGGET, RecipeCategory.MISC, ASItems.VOIDSTEEL_INGOT, "voidsteel_ingot_from_nuggets", "voidsteel_nugget");
                createShapeless(RecipeCategory.MISC, ASItems.VOIDSTEEL_DUST, 1)
                        .input(ASItems.TUNGSTENSTEEL_DUST, 3)
                        .input(ASItems.ENDER_DUST, 2)
                        .input(ASItems.COBALT_DUST, 1)
                        .group("voidsteel_dust")
                        .criterion(hasItem(ASItems.COBALT_DUST), conditionsFromItem(ASItems.COBALT_DUST))
                        .offerTo(exporter);

                List<ItemConvertible> ADAMANTINE_SMELTABLES = List.of(ASItems.ADAMANTINE_DUST);
                offerSmelting(ADAMANTINE_SMELTABLES, RecipeCategory.MISC, ASItems.ADAMANTINE_INGOT, 0.0F, 200, "adamantine_ingot");
                offerBlasting(ADAMANTINE_SMELTABLES, RecipeCategory.MISC, ASItems.ADAMANTINE_INGOT, 0.0F, 100, "adamantine_ingot");
                offerReversibleCompactingRecipesWithReverseRecipeGroup(RecipeCategory.MISC, ASItems.ADAMANTINE_INGOT, RecipeCategory.BUILDING_BLOCKS, ASBlocks.ADAMANTINE_BLOCK, "adamantine_ingot_from_block", "adamantine_ingot");
                offerReversibleCompactingRecipesWithCompactingRecipeGroup(RecipeCategory.MISC, ASItems.ADAMANTINE_NUGGET, RecipeCategory.MISC, ASItems.ADAMANTINE_INGOT, "adamantine_ingot_from_nuggets", "adamantine_nugget");
                createShapeless(RecipeCategory.MISC, ASItems.ADAMANTINE_DUST, 1)
                        .input(ASItems.ELECTRUM_DUST, 4)
                        .input(ASItems.EMERALD_DUST, 2)
                        .input(Items.NETHER_STAR, 1)
                        .group("adamantine_dust")
                        .criterion(hasItem(Items.NETHER_STAR), conditionsFromItem(Items.NETHER_STAR))
                        .offerTo(exporter);

            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
