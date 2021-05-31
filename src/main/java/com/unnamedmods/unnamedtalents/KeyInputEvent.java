package com.unnamedmods.unnamedtalents;

import net.minecraft.client.Minecraft;
import net.minecraftforge.event.TickEvent;
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
    }
}
