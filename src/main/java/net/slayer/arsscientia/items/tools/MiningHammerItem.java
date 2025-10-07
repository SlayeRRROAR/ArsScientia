package net.slayer.arsscientia.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class MiningHammerItem extends Item {
    public MiningHammerItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(settings.pickaxe(material, attackDamage, attackSpeed));
    }

    public static List<BlockPos> getBlocksToBeDestroyed(int range, BlockPos initalBlockPos, ServerPlayerEntity player) {
        List<BlockPos> positions = new ArrayList<>();
        HitResult hit = player.raycast(20, 0, false);
        if (hit.getType() == HitResult.Type.BLOCK) {
            BlockHitResult blockHit = (BlockHitResult) hit;
            World world = player.getEntityWorld();

            if (world.getBlockState(initalBlockPos).isIn(BlockTags.PICKAXE_MINEABLE)) {
                if(blockHit.getSide() == Direction.DOWN || blockHit.getSide() == Direction.UP) {
                    for(int x = -range; x <= range; x++) {
                        for(int y = -range; y <= range; y++) {
                            positions.add(new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY(), initalBlockPos.getZ() + y));
                            positions.remove(initalBlockPos);
                        }
                    }
                }

                if(blockHit.getSide() == Direction.NORTH || blockHit.getSide() == Direction.SOUTH) {
                    for(int x = -range; x <= range; x++) {
                        for(int y = -range; y <= range; y++) {
                            positions.add(new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY() + y, initalBlockPos.getZ()));
                            positions.remove(initalBlockPos);
                        }
                    }
                }

                if(blockHit.getSide() == Direction.EAST || blockHit.getSide() == Direction.WEST) {
                    for(int x = -range; x <= range; x++) {
                        for(int y = -range; y <= range; y++) {
                            positions.add(new BlockPos(initalBlockPos.getX(), initalBlockPos.getY() + y, initalBlockPos.getZ() + x));
                            positions.remove(initalBlockPos);
                        }
                    }
                }
            }
        }

        return positions;
    }



}