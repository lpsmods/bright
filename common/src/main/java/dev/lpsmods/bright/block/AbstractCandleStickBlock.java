//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dev.lpsmods.bright.block;

import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractCandleStickBlock extends Block {
    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    protected abstract MapCodec<? extends AbstractCandleStickBlock> codec();

    protected AbstractCandleStickBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    protected abstract Iterable<Vec3> getParticleOffsets(BlockState var1);

    public static boolean isLit(BlockState state) {
        return state.hasProperty(LIT) && (state.is(BlockTags.CANDLES) || state.is(BlockTags.CANDLE_CAKES)) && (Boolean)state.getValue(LIT);
    }

    protected void onProjectileHit(Level level, BlockState state, BlockHitResult hit, Projectile projectile) {
        if (!level.isClientSide && projectile.isOnFire() && this.canBeLit(state)) {
            setLit(level, state, hit.getBlockPos(), true);
        }
    }

    protected boolean canBeLit(BlockState state) {
        return !(Boolean)state.getValue(LIT);
    }

    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if ((Boolean)state.getValue(LIT)) {
            this.getParticleOffsets(state).forEach((p_220695_) -> {
                addParticlesAndSound(level, p_220695_.add((double)pos.getX(), (double)pos.getY(), (double)pos.getZ()), random);
            });
        }
    }

    private static void addParticlesAndSound(Level level, Vec3 pos, RandomSource random) {
        float $$3 = random.nextFloat();
        if ($$3 < 0.3F) {
            level.addParticle(ParticleTypes.SMOKE, pos.x, pos.y, pos.z, 0.0, 0.0, 0.0);
            if ($$3 < 0.17F) {
                level.playLocalSound(pos.x + 0.5, pos.y + 0.5, pos.z + 0.5, SoundEvents.CANDLE_AMBIENT, SoundSource.BLOCKS, 1.0F + random.nextFloat(), random.nextFloat() * 0.7F + 0.3F, false);
            }
        }

        level.addParticle(ParticleTypes.SMALL_FLAME, pos.x, pos.y, pos.z, 0.0, 0.0, 0.0);
    }

    public static void extinguish(@Nullable Player player, BlockState state, LevelAccessor level, BlockPos pos) {
        setLit(level, state, pos, false);
        if (state.getBlock() instanceof AbstractCandleStickBlock) {
            ((AbstractCandleStickBlock)state.getBlock()).getParticleOffsets(state).forEach((p_151926_) -> {
                level.addParticle(ParticleTypes.SMOKE, (double)pos.getX() + p_151926_.x(), (double)pos.getY() + p_151926_.y(), (double)pos.getZ() + p_151926_.z(), 0.0, 0.10000000149011612, 0.0);
            });
        }

        level.playSound((Player)null, pos, SoundEvents.CANDLE_EXTINGUISH, SoundSource.BLOCKS, 1.0F, 1.0F);
        level.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
    }

    private static void setLit(LevelAccessor level, BlockState state, BlockPos pos, boolean value) {
        level.setBlock(pos, (BlockState)state.setValue(LIT, value), 11);
    }

    protected void onExplosionHit(BlockState state, Level level, BlockPos pos, Explosion explosion, BiConsumer<ItemStack, BlockPos> consumer) {
        if (explosion.canTriggerBlocks() && (Boolean)state.getValue(LIT)) {
            extinguish((Player)null, state, level, pos);
        }
        super.onExplosionHit(state, level, pos, explosion, consumer);
    }
}
