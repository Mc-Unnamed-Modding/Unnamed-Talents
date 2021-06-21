package com.unnamedmods.unnamedtalents.player.playercap.playerraw;

public interface ISurvivalAbilities
{
    byte getSurvivalLevel();
    int getSurvivalXP();

    byte getSmeltingLevel();
    int getSmeltingXP();

    byte getForagingLevel();
    int getForagingXP();

    byte getFarmingLevel();
    int getFarmingXP();

    void setSurvivalLevel(byte survivalLevel);
    void setSurvivalXP(int survivalXP);

    void setSmeltingLevel(byte smeltingLevel);
    void setSmeltingXP(int smeltingXP);

    void setForagingLevel(byte foragingLevel);
    void setForagingXP(int foragingXP);

    void setFarmingLevel(byte farmingLevel);
    void setFarmingXP(int farmingXP);
}
