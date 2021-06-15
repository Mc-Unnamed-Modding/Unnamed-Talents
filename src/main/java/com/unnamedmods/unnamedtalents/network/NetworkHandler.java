package com.unnamedmods.unnamedtalents.network;

import com.unnamedmods.unnamedtalents.UnnamedTalents;
import com.unnamedmods.unnamedtalents.network.message.InputMessage;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class NetworkHandler
{
    public static final String NETWORK_VERSION = "0.1.0";
    private static int nextInt = 0;


    public static final SimpleChannel CHANNEL = NetworkRegistry.newSimpleChannel
                    (new ResourceLocation(UnnamedTalents.MOD_ID, "network"),
                    () -> NETWORK_VERSION,
                    version -> version.equals(NETWORK_VERSION),
                    version -> version.equals(NETWORK_VERSION));

    public static void init()
    {
        CHANNEL.registerMessage(nextInt, InputMessage.class, InputMessage::encode, InputMessage::decode, InputMessage::handle);
    }
}
