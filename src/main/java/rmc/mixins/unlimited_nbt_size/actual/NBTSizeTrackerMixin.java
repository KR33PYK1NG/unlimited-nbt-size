package rmc.mixins.unlimited_nbt_size.actual;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.nbt.NBTSizeTracker;

/**
 * Developed by RMC Team, 2021
 */
@Mixin(value = NBTSizeTracker.class)
public abstract class NBTSizeTrackerMixin {

    @Overwrite
    public void read(long bits) {}

}