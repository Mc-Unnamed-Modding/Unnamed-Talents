package com.unnamedmods.unnamedtalents.player.playercap.playerraw;

public interface ILaborAbilities
{
    byte getLaborLevel();
    int getLaborXP();

    byte getMiningLevel();
    int getMiningXP();

    byte getExcavationLevel();
    int getExcavationXP();

    byte getBuildingLevel();
    int getBuildingXP();

    void setLaborLevel(byte laborLevel);
    void setLaborXP(int laborXP);

    void setMiningLevel(byte miningLevel);
    void setMiningXP(int miningXP);

    void setExcavationLevel(byte excavationLevel);
    void setExcavationXP(int excavationXP);

    void setBuildingLevel(byte buildingLevel);
    void setBuildingXP(int buildingXP);
}
