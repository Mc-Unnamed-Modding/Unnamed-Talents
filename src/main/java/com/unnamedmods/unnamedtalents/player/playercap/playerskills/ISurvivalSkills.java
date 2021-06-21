package com.unnamedmods.unnamedtalents.player.playercap.playerskills;

public interface ISurvivalSkills
{
    boolean isEfficiencyUnlocked();
    byte getEfficiencyLevel();
    boolean isChefUnlocked();
    byte getChefLevel();

    boolean isSatedUnlocked();
    byte getSatedLevel();
    boolean isHealthyLivingUnlocked();
    byte getHealthyLivingLevel();

    boolean isNatureUnlocked();
    byte getNatureLevel();
    boolean isFarmerUnlocked();
    byte getFarmerLevel();

    void setEfficiencyUnlocked(boolean skillEfficiency);
    void setEfficiencyLevel(byte level);
    void setChefUnlocked(boolean skillChef);
    void setChefLevel(byte level);

    void setSatedUnlocked(boolean skillSated);
    void setSatedLevel(byte level);
    void setHealthyLivingUnlocked(boolean skillHealthyLiving);
    void setHealthyLivingLevel(byte level);

    void setNatureUnlocked(boolean skillNature);
    void setNatureLevel(byte level);
    void setFarmerUnlocked(boolean skillFarmer);
    void setFarmerLevel(byte level);
}
