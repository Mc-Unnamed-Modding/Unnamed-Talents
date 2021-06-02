package com.unnamedmods.unnamedtalents.player.skills.playercapability;

public interface IPlayerCap
{
    short getSkillPoints();
    void setSkillPoints(short skillPoints);

    // Combat
    byte getCombatLevel();
    int getCombatXP();

    byte getMaxAbilityLevel();
    int getXPThreshold();

    byte getAttackLevel();
    int getAttackXP();

    boolean isPersistenceUnlocked();
    byte getPersistenceLevel();
    boolean isIntuitionUnlocked();
    byte getIntuitionLevel();

    byte getDefenseLevel();
    int getDefenseXP();

    boolean isAdrenalineUnlocked();
    byte getAdrenalineLevel();
    boolean isUndyingUnlocked();
    byte getUndyingLevel();

    byte getArcheryLevel();
    int getArcheryXP();

    boolean isLuckyShotUnlocked();
    byte getLuckyShotLevel();
    boolean isEagleEyeUnlocked();
    byte getEagleEyeLevel();

    void setCombatLevel(byte combatLevel);
    void setCombatXP(int combatXP);

    void setAttackLevel(byte attackLevel);
    void setAttackXP(int attackXP);
    void setPersistenceUnlocked(boolean skillPersistence);
    void setPersistenceLevel(byte level);
    void setIntuitionUnlocked(boolean skillIntuition);
    void setIntuitionLevel(byte level);

    void setDefenseLevel(byte defenseLevel);
    void setDefenseXP(int defenseXP);
    void setAdrenalineUnlocked(boolean skillAdrenaline);
    void setAdrenalineLevel(byte level);
    void setUndyingUnlocked(boolean skillUndyingSpirit);
    void setUndyingLevel(byte level);

    void setArcheryLevel(byte archeryLevel);
    void setArcheryXP(int archeryXP);
    void setLuckyShotUnlocked(boolean skillLuckyShot);
    void setLuckyShotLevel(byte level);
    void setEagleEyeUnlocked(boolean skillEagleEye);
    void setEagleEyeLevel(byte level);

    // Survival
    byte getSurvivalLevel();
    int getSurvivalXP();
    byte getSmeltingLevel();
    int getSmeltingXP();
    boolean isEfficiencyUnlocked();
    byte getEfficiencyLevel();
    boolean isChefUnlocked();
    byte getChefLevel();

    byte getForagingLevel();
    int getForagingXP();
    boolean isSatedUnlocked();
    byte getSatedLevel();
    boolean isHealthyLivingUnlocked();
    byte getHealthyLivingLevel();

    byte getFarmingLevel();
    int getFarmingXP();
    boolean isNatureUnlocked();
    byte getNatureLevel();
    boolean isFarmerUnlocked();
    byte getFarmerLevel();

    void setSurvivalLevel(byte survivalLevel);
    void setSurvivalXP(int survivalXP);

    void setSmeltingLevel(byte smeltingLevel);
    void setSmeltingXP(int smeltingXP);
    void setEfficiencyUnlocked(boolean skillEfficiency);
    void setEfficiencyLevel(byte level);
    void setChefUnlocked(boolean skillChef);
    void setChefLevel(byte level);

    void setForagingLevel(byte foragingLevel);
    void setForagingXP(int foragingXP);
    void setSatedUnlocked(boolean skillSated);
    void setSatedLevel(byte level);
    void setHealthyLivingUnlocked(boolean skillHealthyLiving);
    void setHealthyLivingLevel(byte level);

    void setFarmingLevel(byte farmingLevel);
    void setFarmingXP(int farmingXP);
    void setNatureUnlocked(boolean skillNature);
    void setNatureLevel(byte level);
    void setFarmerUnlocked(boolean skillFarmer);
    void setFarmerLevel(byte level);

    // Magic
    byte getMagicLevel();
    int getMagicXP();

    byte getAlchemyLevel();
    int getAlchemyXP();
    boolean isAlchemistUnlocked();
    byte getAlchemistLevel();
    boolean isProjectPotionUnlocked();
    byte getProjectPotionLevel();

    byte getAgilityLevel();
    int getAgilityXP();
    boolean isQuickStepUnlocked();
    byte getQuickStepLevel();
    boolean isPhantomShiftUnlocked();
    byte getPhantomShiftLevel();

    byte getEnchantingLevel();
    int getEnchantingXP();
    boolean isSpecialistUnlocked();
    byte getSpecialistLevel();
    boolean isEnchanterUnlocked();
    byte getEnchanterLevel();

    void setMagicLevel(byte magicLevel);
    void setMagicXP(int magicXP);

    void setAlchemyLevel(byte alchemyLevel);
    void setAlchemyXP(int alchemyXP);
    void setAlchemistUnlocked(boolean skillAlchemy);
    void setAlchemistLevel(byte level);
    void setProjectPotionUnlocked(boolean skillPotion);
    void setProjectPotionLevel(byte level);

    void setAgilityLevel(byte agilityLevel);
    void setAgilityXP(int agilityXP);
    void setQuickStepUnlocked(boolean skillQuickStep);
    void setQuickStepLevel(byte level);
    void setPhantomShiftUnlocked(boolean skillPhantomShift);
    void setPhantomShiftLevel(byte level);

    void setEnchantingLevel(byte enchantingLevel);
    void setEnchantingXP(int enchantingXP);
    void setSpecialistUnlocked(boolean skillSpecialist);
    void setSpecialistLevel(byte level);
    void setEnchanterUnlocked(boolean skillEnchanter);
    void setEnchanterLevel(byte level);
    // Labor
    byte getLaborLevel();
    int getLaborXP();

    byte getMiningLevel();
    int getMiningXP();

    boolean isDemolistUnlocked();
    byte getDemolistLevel();
    boolean isMinerUnlocked();
    byte getMinerLevel();

    byte getExcavationLevel();
    int getExcavationXP();

    boolean isBulldozerUnlocked();
    byte getBulldozerLevel();
    boolean isExcavatorUnlocked();
    byte getExcavatorLevel();

    byte getBuildingLevel();
    int getBuildingXP();
    boolean isConstructorUnlocked();
    byte getConstructorLevel();
    boolean isBuilderUnlocked();
    byte getBuilderLevel();

    void setLaborLevel(byte laborLevel);
    void setLaborXP(int laborXP);

    void setMiningLevel(byte miningLevel);
    void setMiningXP(int miningXP);
    void setDemolistUnlocked(boolean skillDemolist);
    void setDemolistLevel(byte level);
    void setMinerUnlocked(boolean skillMiner);
    void setMinerLevel(byte level);

    void setExcavationLevel(byte excavationLevel);
    void setExcavationXP(int excavationXP);
    void setBulldozerUnlocked(boolean skillBulldozer);
    void setBulldozerLevel(byte level);
    void setExcavatorUnlocked(boolean skillExcavator);
    void setExcavatorLevel(byte level);

    void setBuildingLevel(byte buildingLevel);
    void setBuildingXP(int buildingXP);
    void setConstructorUnlocked(boolean skillConstructor);
    void setConstructorLevel(byte level);
    void setBuilderUnlocked(boolean skillBuilder);
    void setBuilderLevel(byte level);
}
