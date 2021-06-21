package com.unnamedmods.unnamedtalents.player.skills;

import com.unnamedmods.unnamedtalents.UnnamedTalents;
import net.minecraftforge.fml.common.Mod;

import java.util.HashMap;

// Handles XP
@Mod.EventBusSubscriber(modid = UnnamedTalents.MOD_ID)
public class SkillHelper
{
    int value = 10;

    public String toString()
    {
        return this.value < 10 ? "0" + this.value : "" + this.value;
    }
}
