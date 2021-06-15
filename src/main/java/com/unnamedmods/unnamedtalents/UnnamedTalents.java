package com.unnamedmods.unnamedtalents;

import com.google.common.graph.Network;
import com.unnamedmods.unnamedtalents.network.NetworkHandler;
import com.unnamedmods.unnamedtalents.player.playercapability.IPlayerCap;
import com.unnamedmods.unnamedtalents.player.playercapability.PlayerCap;
import com.unnamedmods.unnamedtalents.player.playercapability.PlayerCapStorage;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.lwjgl.glfw.GLFW;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(UnnamedTalents.MOD_ID)
public class UnnamedTalents
{
    public static final String MOD_ID = "unnamedtalents";

    public static KeyBinding keyBindings = new KeyBinding("key.test", KeyConflictContext.UNIVERSAL, InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_G, "key.categories.test");
    public static KeyBinding testBinding = new KeyBinding("key.test2", KeyConflictContext.UNIVERSAL, InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_P, "key.categories.test");


    public UnnamedTalents()
    {
        MinecraftForge.EVENT_BUS.register(new KeyInputEvent());

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        CapabilityManager.INSTANCE.register(IPlayerCap.class, new PlayerCapStorage(), PlayerCap::new);
        NetworkHandler.init();
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
        ClientRegistry.registerKeyBinding(keyBindings);
        ClientRegistry.registerKeyBinding(testBinding);
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {}

    private void processIMC(final InterModProcessEvent event) {}


}
