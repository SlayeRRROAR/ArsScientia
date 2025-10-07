package net.slayer.arsscientia.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.slayer.arsscientia.ArsScientia;

@SuppressWarnings("unused")
public class ASTagUtil {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = createTag("needs_netherite_tool");
        public static final TagKey<Block> INCORRECT_FOR_ARCHEOSITE_TOOL = createTag("incorrect_for_archeosite_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ArsScientia.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> SILVER_REPAIR = createTag("silver_repair");
        public static final TagKey<Item> TITANIUM_REPAIR = createTag("titanium_repair");
        public static final TagKey<Item> TUNGSTEN_REPAIR = createTag("tungsten_repair");
        public static final TagKey<Item> PLATINUM_REPAIR = createTag("platinum_repair");
        public static final TagKey<Item> BRONZE_REPAIR = createTag("bronze_repair");
        public static final TagKey<Item> STEEL_REPAIR = createTag("steel_repair");
        public static final TagKey<Item> ELECTRUM_REPAIR = createTag("electrum_repair");
        public static final TagKey<Item> TUNGSTENSTEEL_REPAIR = createTag("tungstensteel_repair");
        public static final TagKey<Item> SIGNALUM_REPAIR = createTag("signalum_repair");
        public static final TagKey<Item> ARCHEOSITE_REPAIR = createTag("archeosite_repair");
        public static final TagKey<Item> VOIDSTEEL_REPAIR = createTag("voidsteel_repair");
        public static final TagKey<Item> ENDERIUM_REPAIR = createTag("enderium_repair");
        public static final TagKey<Item> ADAMANTINE_REPAIR = createTag("adamantine_repair");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(ArsScientia.MOD_ID, name));
        }
    }

}