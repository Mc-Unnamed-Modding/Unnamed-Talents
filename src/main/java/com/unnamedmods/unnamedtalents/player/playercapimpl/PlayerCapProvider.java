package com.unnamedmods.unnamedtalents.player.playercapimpl;

import com.unnamedmods.unnamedtalents.player.playercap.IPlayerCap;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class PlayerCapProvider implements ICapabilitySerializable<INBT>
{
    @CapabilityInject(IPlayerCap.class)
    public static final Capability<IPlayerCap> PLAYER_CAP_CAPABILITY = null;

    private LazyOptional<IPlayerCap> instance = LazyOptional.of(PLAYER_CAP_CAPABILITY::getDefaultInstance);

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side)
    {
        return cap == PLAYER_CAP_CAPABILITY ? instance.cast() : LazyOptional.empty();
    }

    @Override
    public INBT serializeNBT()
    {
        return PLAYER_CAP_CAPABILITY.getStorage().writeNBT(PLAYER_CAP_CAPABILITY, this.instance.orElseThrow(() -> new IllegalArgumentException("LazyOptional must not be Empty!")), null);
    }

    @Override
    public void deserializeNBT(INBT nbt)
    {
        PLAYER_CAP_CAPABILITY.getStorage().readNBT(PLAYER_CAP_CAPABILITY, this.instance.orElseThrow(() -> new IllegalArgumentException("LazyOptional must not be Empty!")), null, nbt);
    }
}
