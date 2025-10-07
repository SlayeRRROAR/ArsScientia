package net.slayer.arsscientia.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

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

        translationBuilder.add("item.arsscentia.coal_piece", "Coal Piece");


        //TOOLTIPS

        translationBuilder.add("item.craftlike.press_shift", "§8Press §7SHIFT §8for more info");

    }
}
