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
    public static final int LIGHT_PER_CANDLE = 3;
    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    protected abstract MapCodec<? extends AbstractCandleStickBlock> codec();

    protected AbstractCandleStickBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    protected abstract Iterable<Vec3> getParticleOffsets(BlockState var1);

    public static boolean isLit(BlockState p_151934_) {
        return p_151934_.hasProperty(LIT) && (p_151934_.is(BlockTags.CANDLES) || p_151934_.is(BlockTags.CANDLE_CAKES)) && (Boolean)p_151934_.getValue(LIT);
    }

    protected void onProjectileHit(Level p_151905_, BlockState p_151906_, BlockHitResult p_151907_, Projectile p_151908_) {
        if (!p_151905_.isClientSide && p_151908_.isOnFire() && this.canBeLit(p_151906_)) {
            setLit(p_151905_, p_151906_, p_151907_.getBlockPos(), true);
        }

    }

    protected boolean canBeLit(BlockState p_151935_) {
        return !(Boolean)p_151935_.getValue(LIT);
    }

    public void animateTick(BlockState p_220697_, Level p_220698_, BlockPos p_220699_, RandomSource p_220700_) {
        if ((Boolean)p_220697_.getValue(LIT)) {
            this.getParticleOffsets(p_220697_).forEach((p_220695_) -> {
                addParticlesAndSound(p_220698_, p_220695_.add((double)p_220699_.getX(), (double)p_220699_.getY(), (double)p_220699_.getZ()), p_220700_);
            });
        }
    }

    private static void addParticlesAndSound(Level p_220688_, Vec3 p_220689_, RandomSource p_220690_) {
        float $$3 = p_220690_.nextFloat();
        if ($$3 < 0.3F) {
            p_220688_.addParticle(ParticleTypes.SMOKE, p_220689_.x, p_220689_.y, p_220689_.z, 0.0, 0.0, 0.0);
            if ($$3 < 0.17F) {
                p_220688_.playLocalSound(p_220689_.x + 0.5, p_220689_.y + 0.5, p_220689_.z + 0.5, SoundEvents.CANDLE_AMBIENT, SoundSource.BLOCKS, 1.0F + p_220690_.nextFloat(), p_220690_.nextFloat() * 0.7F + 0.3F, false);
            }
        }

        p_220688_.addParticle(ParticleTypes.SMALL_FLAME, p_220689_.x, p_220689_.y, p_220689_.z, 0.0, 0.0, 0.0);
    }

    public static void extinguish(@Nullable Player p_151900_, BlockState p_151901_, LevelAccessor p_151902_, BlockPos p_151903_) {
        setLit(p_151902_, p_151901_, p_151903_, false);
        if (p_151901_.getBlock() instanceof AbstractCandleStickBlock) {
            ((AbstractCandleStickBlock)p_151901_.getBlock()).getParticleOffsets(p_151901_).forEach((p_151926_) -> {
                p_151902_.addParticle(ParticleTypes.SMOKE, (double)p_151903_.getX() + p_151926_.x(), (double)p_151903_.getY() + p_151926_.y(), (double)p_151903_.getZ() + p_151926_.z(), 0.0, 0.10000000149011612, 0.0);
            });
        }

        p_151902_.playSound((Player)null, p_151903_, SoundEvents.CANDLE_EXTINGUISH, SoundSource.BLOCKS, 1.0F, 1.0F);
        p_151902_.gameEvent(p_151900_, GameEvent.BLOCK_CHANGE, p_151903_);
    }

    private static void setLit(LevelAccessor p_151919_, BlockState p_151920_, BlockPos p_151921_, boolean p_151922_) {
        p_151919_.setBlock(p_151921_, (BlockState)p_151920_.setValue(LIT, p_151922_), 11);
    }

    protected void onExplosionHit(BlockState p_310999_, Level p_310314_, BlockPos p_311846_, Explosion p_310799_, BiConsumer<ItemStack, BlockPos> p_310677_) {
        if (p_310799_.canTriggerBlocks() && (Boolean)p_310999_.getValue(LIT)) {
            extinguish((Player)null, p_310999_, p_310314_, p_311846_);
        }

        super.onExplosionHit(p_310999_, p_310314_, p_311846_, p_310799_, p_310677_);
    }
}
