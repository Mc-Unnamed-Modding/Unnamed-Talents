package com.unnamedmods.unnamedtalents.skills.activeskills;

import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;

public class SkillUndyingSpirit extends ActiveSkills
{
    public SkillUndyingSpirit(PlayerEntity entity)
    {
        super(entity);
    }

    @Override
    public void doActiveSkill ()
    {
        entity.teleportTo(10,100,10);
    }
}
