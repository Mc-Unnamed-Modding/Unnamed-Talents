package com.unnamedmods.unnamedtalents.player.skills.activeskills;

import com.unnamedmods.unnamedtalents.player.playercapimpl.PlayerCapProvider;
import net.minecraft.entity.player.PlayerEntity;

public class SkillUndyingSpirit extends ActiveSkills
{

    public SkillUndyingSpirit(PlayerEntity entity)
    {
        super(entity);
    }

    @Override
    public void doActiveSkill ()
    {
        entity.getCapability(PlayerCapProvider.PLAYER_CAP_CAPABILITY, null)
                .filter(iPlayerCap -> !iPlayerCap.isAdrenalineUnlocked())
                .filter(iPlayerCap -> entity.isDeadOrDying())
                .ifPresent(iPlayerCap -> {entity.setHealth(1);});
    }
}
