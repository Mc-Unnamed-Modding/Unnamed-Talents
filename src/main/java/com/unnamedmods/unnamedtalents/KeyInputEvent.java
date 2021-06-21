package com.unnamedmods.unnamedtalents;

import com.unnamedmods.unnamedtalents.network.NetworkHandler;
import com.unnamedmods.unnamedtalents.network.message.InputMessage;
import com.unnamedmods.unnamedtalents.player.playercap.IPlayerCap;
import com.unnamedmods.unnamedtalents.player.playercapimpl.PlayerCapProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = UnnamedTalents.MOD_ID)
public class KeyInputEvent
{

    @SubscribeEvent
    public void keyInputEvent (TickEvent.ClientTickEvent event)
    {
        if (UnnamedTalents.keyBindings.isDown())
        {
            Minecraft.getInstance().setScreen(new TalentGUIMain(null));
        }


        else if (UnnamedTalents.testBinding.isDown())
        {
            NetworkHandler.CHANNEL.sendToServer(new InputMessage(UnnamedTalents.testBinding.getKey().getValue()));
        }
    }

    @SubscribeEvent
    public static void test (LivingDamageEvent event)
    {

        if (event.getEntityLiving() != null  && event.getEntityLiving() instanceof PlayerEntity && !(event.getSource().getDirectEntity() instanceof PlayerEntity) && !event.getEntityLiving().getCommandSenderWorld().isClientSide)
        {
            PlayerEntity player = (PlayerEntity) event.getEntityLiving();
            if (event.getSource().getDirectEntity() != null)
            {
                player.swing(Hand.MAIN_HAND, true);
                event.setCanceled(true);
                event.getSource().getDirectEntity().setDeltaMovement(event.getSource().getDirectEntity().getLookAngle().reverse().multiply(0.5, 0, 0.5));
            }
        }
    }



    @SubscribeEvent
    public static void testEvent (TickEvent.PlayerTickEvent event)
    {


        if (event.player != null && !event.player.getCommandSenderWorld().isClientSide)
        {
            PlayerEntity player = event.player;

            player.getCapability(PlayerCapProvider.PLAYER_CAP_CAPABILITY, null)
                    .filter(IPlayerCap::isKeyPressed)
                    .ifPresent(iPlayerCap ->
                    {

                    });

        }
    }
}
