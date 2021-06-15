package com.unnamedmods.unnamedtalents.player.skills;

import com.unnamedmods.unnamedtalents.UnnamedTalents;
import net.minecraftforge.fml.common.Mod;

import java.util.AbstractMap;
import java.util.HashMap;

// Handles XP
@Mod.EventBusSubscriber(modid = UnnamedTalents.MOD_ID)
public class SkillHelper
{
    HashMap<Integer, String> playerData = new HashMap<>();

    public HashMap<Integer, String> getPlayerData()
    {
        return playerData;
    }

    public void setPlayerData(HashMap<Integer, String> playerData)
    {
        this.playerData = playerData;

    }
}
