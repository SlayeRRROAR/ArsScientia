package net.slayer.arsscientia.items.tools;

import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.slayer.arsscientia.util.ASTagUtil;

@SuppressWarnings("unused")
public class ASToolMaterials {

    public static final ToolMaterial WOOD_H = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            99, 1.0F, 0.0F, 15, ItemTags.WOODEN_TOOL_MATERIALS);
    public static final ToolMaterial STONE_H = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL,
            219, 1.0F, 1.0F, 5, ItemTags.STONE_TOOL_MATERIALS);
    public static final ToolMaterial IRON_H = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
            417, 3.0F, 2.0F, 14, ItemTags.IRON_TOOL_MATERIALS);
    public static final ToolMaterial GOLD_H = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL,
            54, 9.0F, 0.0F, 22, ItemTags.GOLD_TOOL_MATERIALS);
    public static final ToolMaterial DIAMOND_H = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            2602, 5.0F, 3.0F, 10, ItemTags.DIAMOND_TOOL_MATERIALS);
    public static final ToolMaterial NETHERITE_H = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            3385, 6.0F, 4.0F, 15, ItemTags.NETHERITE_TOOL_MATERIALS);

    public static final ToolMaterial SILVER = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
            167, 5.0F, 1.0F, 25, ASTagUtil.Items.SILVER_REPAIR);
    public static final ToolMaterial SILVER_H = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
            279, 2.0F, 1.0F, 25, ASTagUtil.Items.SILVER_REPAIR);

    public static final ToolMaterial TITANIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1702, 7.0F, 2.0F, 4, ASTagUtil.Items.TITANIUM_REPAIR);
    public static final ToolMaterial TITANIUM_H = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            2837, 4.0F, 2.0F, 4, ASTagUtil.Items.TITANIUM_REPAIR);

    public static final ToolMaterial PLATINUM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            1866, 8.0F, 3.0F, 15, ASTagUtil.Items.PLATINUM_REPAIR);
    public static final ToolMaterial PLATINUM_H = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            3110, 5.0F, 3.0F, 15, ASTagUtil.Items.PLATINUM_REPAIR);

    public static final ToolMaterial BRONZE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
            390, 5.0F, 1.0F, 9, ASTagUtil.Items.BRONZE_REPAIR);
    public static final ToolMaterial BRONZE_H = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
            650, 2.0F, 1.0F, 9, ASTagUtil.Items.BRONZE_REPAIR);

    public static final ToolMaterial STEEL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1798, 8.0F, 3.0F, 5, ASTagUtil.Items.STEEL_REPAIR);
    public static final ToolMaterial STEEL_H = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            2997, 5.0F, 3.0F, 5, ASTagUtil.Items.STEEL_REPAIR);

    public static final ToolMaterial TUNGSTENSTEEL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            2151, 9.0F, 4.0F, 10, ASTagUtil.Items.TUNGSTENSTEEL_REPAIR);
    public static final ToolMaterial TUNGSTENSTEEL_H = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            3585, 6.0F, 4.0F, 10, ASTagUtil.Items.TUNGSTENSTEEL_REPAIR);

    public static final ToolMaterial ARCHEOSITE = new ToolMaterial(ASTagUtil.Blocks.INCORRECT_FOR_ARCHEOSITE_TOOL,
            2898, 11.0F, 6.0F, 20, ASTagUtil.Items.ARCHEOSITE_REPAIR);
    public static final ToolMaterial ARCHEOSITE_H = new ToolMaterial(ASTagUtil.Blocks.INCORRECT_FOR_ARCHEOSITE_TOOL,
            4830, 8.0F, 6.0F, 20, ASTagUtil.Items.ARCHEOSITE_REPAIR);
    public static final ToolMaterial VOIDSTEEL = new ToolMaterial(ASTagUtil.Blocks.INCORRECT_FOR_ARCHEOSITE_TOOL,
            3174, 11.0F, 6.0F, 15, ASTagUtil.Items.VOIDSTEEL_REPAIR);
    public static final ToolMaterial VOIDSTEEL_H = new ToolMaterial(ASTagUtil.Blocks.INCORRECT_FOR_ARCHEOSITE_TOOL,
            5290, 8.0F, 6.0F, 15, ASTagUtil.Items.VOIDSTEEL_REPAIR);
    public static final ToolMaterial ADAMANTINE = new ToolMaterial(ASTagUtil.Blocks.INCORRECT_FOR_ARCHEOSITE_TOOL,
            2622, 12.0F, 7.0F, 20,ASTagUtil.Items.ADAMANTINE_REPAIR);
    public static final ToolMaterial ADAMANTINE_H = new ToolMaterial(ASTagUtil.Blocks.INCORRECT_FOR_ARCHEOSITE_TOOL,
            4370, 9.0F, 7.0F, 20, ASTagUtil.Items.ADAMANTINE_REPAIR);

}