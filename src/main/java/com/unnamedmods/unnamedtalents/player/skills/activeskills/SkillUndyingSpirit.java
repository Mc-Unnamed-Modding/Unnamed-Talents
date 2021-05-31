package com.unnamedmods.unnamedtalents.player.skills.activeskills;

import com.unnamedmods.unnamedtalents.player.skills.activeskills.ActiveSkills;
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
        assert entity != null;
    }
}
