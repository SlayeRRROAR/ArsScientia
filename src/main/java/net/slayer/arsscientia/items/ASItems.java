package net.slayer.arsscientia.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.slayer.arsscientia.ArsScientia;
import net.slayer.arsscientia.util.ItemGroupUtil;

import java.util.function.Function;

@SuppressWarnings({"unused", "SameParameterValue"})
public class ASItems {

    public static final Item TIN_INGOT = registerItem("tin_ingot", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item SILVER_INGOT = registerItem("silver_ingot", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item COBALT_INGOT = registerItem("cobalt_ingot", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item ELECTRUM_INGOT = registerItem("electrum_ingot", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item STEEL_INGOT = registerItem("steel_ingot", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item LUMINITE_INGOT = registerItem("luminite_ingot", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item TUNGSTENSTEEL_INGOT = registerItem("tungstensteel_ingot", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item ARCHEOSITE_INGOT = registerItem("archeosite_ingot", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item VOIDSTEEL_INGOT = registerItem("voidsteel_ingot", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item ADAMANTINE_INGOT = registerItem("adamantine_ingot", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);

    public static final Item COAL_PIECE = registerItem("coal_piece", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item TIN_NUGGET = registerItem("tin_nugget", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item TUNGSTEN_NUGGET = registerItem("tungsten_nugget", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item COBALT_NUGGET = registerItem("cobalt_nugget", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item PLATINUM_NUGGET = registerItem("platinum_nugget", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item BRONZE_NUGGET = registerItem("bronze_nugget", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item ELECTRUM_NUGGET = registerItem("electrum_nugget", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item LUMINITE_NUGGET = registerItem("luminite_nugget", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item TUNGSTENSTEEL_NUGGET = registerItem("tungstensteel_nugget", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item ARCHEOSITE_NUGGET = registerItem("archeosite_nugget", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item VOIDSTEEL_NUGGET = registerItem("voidsteel_nugget", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item ADAMANTINE_NUGGET = registerItem("adamantine_nugget", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);

    public static final Item RAW_TIN = registerItem("raw_tin", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item RAW_SILVER = registerItem("raw_silver", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item RAW_TITANIUM = registerItem("raw_titanium", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item RAW_COBALT = registerItem("raw_cobalt", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item RAW_PLATINUM = registerItem("raw_platinum", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);

    public static final Item COAL_DUST = registerItem("coal_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item COPPER_DUST = registerItem("copper_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item IRON_DUST = registerItem("iron_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item GOLD_DUST = registerItem("gold_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item LAPIS_DUST = registerItem("lapis_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item DIAMOND_DUST = registerItem("diamond_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item EMERALD_DUST = registerItem("emerald_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item AMETHYST_DUST = registerItem("amethyst_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item QUARTZ_DUST = registerItem("quartz_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item NETHERITE_DUST = registerItem("netherite_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item ENDER_DUST = registerItem("ender_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);

    public static final Item TIN_DUST = registerItem("tin_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item SILVER_DUST = registerItem("silver_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item TITANIUM_DUST = registerItem("titanium_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item TUNGSTEN_DUST = registerItem("tungsten_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item COBALT_DUST = registerItem("cobalt_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item PLATINUM_DUST = registerItem("platinum_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item BRONZE_DUST = registerItem("bronze_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item ELECTRUM_DUST = registerItem("electrum_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item STEEL_DUST = registerItem("steel_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item LUMINITE_DUST = registerItem("luminite_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item TUNGSTENSTEEL_DUST = registerItem("tungstensteel_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item ARCHEOSITE_DUST = registerItem("archeosite_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item VOIDSTEEL_DUST = registerItem("voidsteel_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);
    public static final Item ADAMANTINE_DUST = registerItem("adamantine_dust", Item::new, new Item.Settings(), true, ItemGroupUtil.ARSSCIENTIA_INGREDIENTS);


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
        ArsScientia.LOGGER.info(ArsScientia.MOD_ID + " registered items");
    }

}
