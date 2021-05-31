package com.unnamedmods.unnamedtalents.player.skills.playercapability;

public interface IPlayerCap
{
    // Combat
    byte getCombatLevel();

    byte getAttackLevel();
    boolean isPersistenceUnlocked();
    boolean isIntuitionUnlocked();

    byte getDefenseLevel();
    boolean isAdrenalineUnlocked();
    boolean isUndyingUnlocked();

    byte getArcheryLevel();
    boolean isLuckyShotUnlocked();
    boolean isEagleEyeUnlocked();

    void setCombatLevel(byte combatLevel);

    void setAttackLevel(byte attackLevel);
    void setPersistenceUnlocked(boolean skillPersistence);
    void setIntuitionUnlocked(boolean skillIntuition);

    void setDefenseLevel(byte defenseLevel);
    void setAdrenalineUnlocked(boolean skillAdrenaline);
    void setUndyingUnlocked(boolean skillUndyingSpirit);

    void setArcheryLevel(byte archeryLevel);
    void setLuckyShotUnlocked(boolean skillLuckyShot);
    void setEagleEyeUnlocked(boolean skillEagleEye);

    // Survival
    byte getSurvivalLevel();

    byte getSmeltingLevel();
    boolean isEfficiencyUnlocked();
    boolean isChefUnlocked();

    byte getForagingLevel();
    boolean isSatedUnlocked();
    boolean isHealthyLivingUnlocked();

    byte getFarmingLevel();
    boolean isNatureUnlocked();
    boolean isFarmerUnlocked();

    void setSurvivalLevel(byte survivalLevel);

    void setSmeltingLevel(byte smeltingLevel);
    void setEfficiencyUnlocked(boolean skillEfficiency);
    void setChefUnlocked(boolean skillChef);

    void setForagingLevel(byte foragingLevel);
    void setSatedUnlocked(boolean skillSated);
    void setHealthyLivingUnlocked(boolean skillHealthyLiving);

    void setFarmingLevel(byte farmingLevel);
    void setNatureUnlocked(boolean skillNature);
    void setFarmerUnlocked(boolean skillFarmer);

    // Magic
    byte getMagicLevel();

    byte getAlchemyLevel();
    boolean isAlchemistUnlocked();
    boolean isProjectPotionUnlocked();

    byte getAgilityLevel();
    boolean isQuickStepUnlocked();
    boolean isPhantomShiftUnlocked();

    byte getEnchantingLevel();
    boolean isSpecialistUnlocked();
    boolean isEnchanterUnlocked();

    void setMagicLevel(byte magicLevel);

    void setAlchemyLevel(byte alchemyLevel);
    void setAlchemistUnlocked(boolean skillAlchemy);
    void setProjectPotionUnlocked(boolean skillPotion);

    void setAgilityLevel(byte agilityLevel);
    void setQuickStepUnlocked(boolean skillQuickStep);
    void setPhantomShiftUnlocked(boolean skillPhantomShift);

    void setEnchantingLevel(byte enchantingLevel);
    void setSpecialistUnlocked(boolean skillSpecialist);
    void setEnchanterUnlocked(boolean skillEnchanter);

    // Labor
    byte getLaborLevel();

    byte getMiningLevel();
    boolean isDemolistUnlocked();
    boolean isMinerUnlocked();

    byte getExcavationLevel();
    boolean isBulldozerUnlocked();
    boolean isExcavatorUnlocked();

    byte getBuildingLevel();
    boolean isConstructorUnlocked();
    boolean isBuilderUnlocked();

    void setLaborLevel(byte laborLevel);

    void setMiningLevel(byte miningLevel);
    void setDemolistUnlocked(boolean skillDemolist);
    void setMinerUnlocked(boolean skillMiner);

    void setExcavationLevel(byte excavationLevel);
    void setBulldozerUnlocked(boolean skillBulldozer);
    void setExcavatorUnlocked(boolean skillExcavator);

    void setBuildingLevel(byte buildingLevel);
    void setConstructorUnlocked(boolean skillConstructor);
    void setBuilderUnlocked(boolean skillBuilder);
}
