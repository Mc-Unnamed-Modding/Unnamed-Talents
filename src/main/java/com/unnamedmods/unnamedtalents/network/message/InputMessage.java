package com.unnamedmods.unnamedtalents.network.message;

import com.unnamedmods.unnamedtalents.player.playercapability.IPlayerCap;
import com.unnamedmods.unnamedtalents.player.playercapability.PlayerCapProvider;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class InputMessage
{
    public int key;

    public InputMessage() {}

    public InputMessage(int key)
    {
        this.key = key;
    }

    public static void encode(InputMessage message, PacketBuffer buffer)
    {
        buffer.writeInt(message.key);
    }

    public static InputMessage decode(PacketBuffer buffer)
    {
        return new InputMessage(buffer.readInt());
    }

    public static void handle(InputMessage message, Supplier<NetworkEvent.Context> contextSupplier)
    {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();
            player.getCapability(PlayerCapProvider.PLAYER_CAP_CAPABILITY, null)
                    .ifPresent(iPlayerCap -> iPlayerCap.setKeyPressed(true));
        });
        context.setPacketHandled(true);
    }
}
