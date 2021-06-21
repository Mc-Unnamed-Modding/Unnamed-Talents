package com.unnamedmods.unnamedtalents.player.playercap.playerraw;

public interface ICombatAbilities
{
    byte getCombatLevel();
    int getCombatXP();

    byte getAttackLevel();
    int getAttackXP();

    byte getDefenseLevel();
    int getDefenseXP();

    byte getArcheryLevel();
    int getArcheryXP();

    void setCombatLevel(byte combatLevel);
    void setCombatXP(int combatXP);

    void setAttackLevel(byte attackLevel);
    void setAttackXP(int attackXP);

    void setDefenseLevel(byte defenseLevel);
    void setDefenseXP(int defenseXP);

    void setArcheryLevel(byte archeryLevel);
    void setArcheryXP(int archeryXP);
}
