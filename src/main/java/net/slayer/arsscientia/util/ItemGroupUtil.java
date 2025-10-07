package net.slayer.arsscientia.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.slayer.arsscientia.ArsScientia;

public class ItemGroupUtil {

    public static final RegistryKey<ItemGroup> ARSSCIENTIA_BLOCKS = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(ArsScientia.MOD_ID, "a-blocks"));
    public static final RegistryKey<ItemGroup> ARSSCIENTIA_DECORATIONS = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(ArsScientia.MOD_ID, "b-decorations"));
    public static final RegistryKey<ItemGroup> ARSSCIENTIA_INGREDIENTS = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(ArsScientia.MOD_ID, "c-tems"));
    public static final RegistryKey<ItemGroup> ARSSCIENTIA_COMBAT = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(ArsScientia.MOD_ID, "d-combat"));
    public static final RegistryKey<ItemGroup> ARSSCIENTIA_TOOLS = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(ArsScientia.MOD_ID, "e-tools"));


    public static void register() {

        Registry.register(Registries.ITEM_GROUP, ARSSCIENTIA_BLOCKS, FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.1.building_blocks"))
                .icon(() -> new ItemStack(Blocks.IRON_BLOCK)).build());

        Registry.register(Registries.ITEM_GROUP, ARSSCIENTIA_DECORATIONS, FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.2.decorative_blocks"))
                .icon(() -> new ItemStack(Blocks.REDSTONE_LAMP)).build());

        Registry.register(Registries.ITEM_GROUP, ARSSCIENTIA_INGREDIENTS, FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.3.ingredients"))
                .icon(() -> new ItemStack(Items.IRON_INGOT)).build());

        Registry.register(Registries.ITEM_GROUP, ARSSCIENTIA_TOOLS, FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.4.tools_and_utilities"))
                .icon(() -> new ItemStack(Items.IRON_PICKAXE)).build());

        Registry.register(Registries.ITEM_GROUP, ARSSCIENTIA_COMBAT, FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.5.combat"))
                .icon(() -> new ItemStack(Items.IRON_SWORD)).build());
    }

}
