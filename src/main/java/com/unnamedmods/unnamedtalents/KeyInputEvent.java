package com.unnamedmods.unnamedtalents;

import com.unnamedmods.unnamedtalents.skills.activeskills.SkillUndyingSpirit;
import net.java.games.input.Keyboard;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.monster.piglin.PiglinEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = UnnamedTalents.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
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
