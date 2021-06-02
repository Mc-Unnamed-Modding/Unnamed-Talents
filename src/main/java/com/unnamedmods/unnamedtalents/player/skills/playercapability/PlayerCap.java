package com.unnamedmods.unnamedtalents.player.skills.playercapability;

public class PlayerCap implements IPlayerCap
{
    private byte maxAbilityLevel;
    private final int XPThreshold;
    private short skillPoints;
    private byte combatLevel;
    private int combatXP;
    private byte attackLevel;
    private int attackXP;
    private boolean skillPersistence;
    private byte persistenceLevel;
    private boolean skillIntuition;
    private byte intuitionLevel;
    private byte defenseLevel;
    private int defenseXP;
    private boolean skillAdrenaline;
    private byte adrenalineLevel;
    private boolean skillUndyingSpirit;
    private byte undyingSpiritLevel;
    private byte archeryLevel;
    private int archeryXP;
    private boolean skillLuckyShot;
    private byte luckyShotLevel;
    private boolean skillEagleEye;
    private byte eagleEyeLevel;
    private byte survivalLevel;
    private int survivalXP;
    private byte smeltingLevel;
    private int smeltingXP;
    private boolean skillEfficiency;
    private byte efficiencyLevel;
    private boolean skillChef;
    private byte chefLevel;
    private byte foragingLevel;
    private int foragingXP;
    private boolean skillSated;
    private byte satedLevel;
    private boolean skillHealthyLiving;
    private byte healthyLivingLevel;
    private byte farmingLevel;
    private int farmingXP;
    private boolean skillNature;
    private byte natureLevel;
    private boolean skillFarmer;
    private byte farmerLevel;
    private byte magicLevel;
    private int magicXP;
    private byte alchemyLevel;
    private int alchemyXP;
    private boolean skillAlchemy;
    private byte masterAlchemyLevel;
    private boolean skillPotion;
    private byte potionLevel;
    private byte agilityLevel;
    private int agilityXP;
    private boolean skillQuickStep;
    private byte quickStepLevel;
    private boolean skillPhantomShift;
    private byte phantomShiftLevel;
    private byte enchantingLevel;
    private int enchantingXP;
    private boolean skillSpecialist;
    private byte specialistLevel;
    private boolean skillEnchanter;
    private byte enchanterLevel;
    private byte laborLevel;
    private int laborXP;
    private byte miningLevel;
    private int miningXP;
    private boolean skillDemolist;
    private byte demolistLevel;
    private boolean skillMiner;
    private byte minerLevel;
    private byte excavationLevel;
    private int excavationXP;
    private boolean skillBulldozer;
    private byte bulldozerLevel;
    private boolean skillExcavator;
    private byte excavatorLevel;
    private byte buildingLevel;
    private int buildingXP;
    private boolean skillConstructor;
    private byte constructorLevel;
    private boolean skillBuilder;
    private byte builderLevel;

    public PlayerCap ()
    {
        this.maxAbilityLevel = 3;
        this.XPThreshold = 64;
        this.skillPoints = 0;
        this.combatLevel = 0;
        this.combatXP = 0;
        this.attackLevel = 0;
        this.attackXP = 0;
        this.skillPersistence = false;
        this.persistenceLevel = 0;
        this.skillIntuition = false;
        this.intuitionLevel = 0;
        this.defenseLevel = 0;
        this.defenseXP = 0;
        this.skillAdrenaline = false;
        this.adrenalineLevel = 0;
        this.skillUndyingSpirit = false;
        this.undyingSpiritLevel = 0;
        this.archeryLevel = 0;
        this.archeryXP = 0;
        this.skillLuckyShot = false;
        this.luckyShotLevel = 0;
        this.skillEagleEye = false;
        this.eagleEyeLevel = 0;
        this.survivalLevel = 0;
        this.survivalXP = 0;
        this.smeltingLevel = 0;
        this.smeltingXP = 0;
        this.skillEfficiency = false;
        this.efficiencyLevel = 0;
        this.skillChef = false;
        this.chefLevel = 0;
        this.foragingLevel = 0;
        this.foragingXP = 0;
        this.skillSated = false;
        this.satedLevel = 0;
        this.skillHealthyLiving = false;
        this.healthyLivingLevel = 0;
        this.farmingLevel = 0;
        this.farmingXP = 0;
        this.skillNature = false;
        this.natureLevel = 0;
        this.skillFarmer = false;
        this.farmerLevel = 0;
        this.magicLevel = 0;
        this.magicXP = 0;
        this.alchemyLevel = 0;
        this.alchemyXP = 0;
        this.skillAlchemy = false;
        this.masterAlchemyLevel = 0;
        this.skillPotion = false;
        this.potionLevel = 0;
        this.agilityLevel = 0;
        this.agilityXP = 0;
        this.skillQuickStep = false;
        this.quickStepLevel = 0;
        this.skillPhantomShift = false;
        this.phantomShiftLevel = 0;
        this.enchantingLevel = 0;
        this.enchantingXP = 0;
        this.skillSpecialist = false;
        this.specialistLevel = 0;
        this.skillEnchanter = false;
        this.enchanterLevel = 0;
        this.laborLevel = 0;
        this.laborXP = 0;
        this.miningLevel = 0;
        this.miningXP = 0;
        this.skillDemolist = false;
        this.demolistLevel = 0;
        this.skillMiner = false;
        this.minerLevel = 0;
        this.excavationLevel = 0;
        this.excavationXP = 0;
        this.skillBulldozer = false;
        this.bulldozerLevel = 0;
        this.skillExcavator = false;
        this.excavatorLevel = 0;
        this.buildingLevel = 0;
        this.buildingXP = 0;
        this.skillConstructor = false;
        this.constructorLevel = 0;
        this.skillBuilder = false;
        this.builderLevel = 0;
    }

    @Override
    public short getSkillPoints()
    {
        return this.skillPoints;
    }

    @Override
    public void setSkillPoints(short skillPoints)
    {
        this.skillPoints = skillPoints;
    }

    @Override
    public byte getCombatLevel()
    {
        return this.combatLevel;
    }

    @Override
    public int getCombatXP()
    {
        return this.combatXP;
    }

    @Override
    public byte getMaxAbilityLevel()
    {
        return this.maxAbilityLevel;
    }

    @Override
    public int getXPThreshold()
    {
        return this.XPThreshold;
    }

    @Override
    public byte getAttackLevel()
    {
        return this.attackLevel;
    }

    @Override
    public int getAttackXP()
    {
        return this.attackXP;
    }

    @Override
    public boolean isPersistenceUnlocked()
    {
        return this.skillPersistence;
    }

    @Override
    public byte getPersistenceLevel()
    {
        return this.persistenceLevel;
    }

    @Override
    public boolean isIntuitionUnlocked()
    {
        return this.skillIntuition;
    }

    @Override
    public byte getIntuitionLevel()
    {
        return this.intuitionLevel;
    }

    @Override
    public byte getDefenseLevel()
    {
        return this.defenseLevel;
    }

    @Override
    public int getDefenseXP()
    {
        return this.defenseXP;
    }

    @Override
    public boolean isAdrenalineUnlocked()
    {
        return this.skillAdrenaline;
    }

    @Override
    public byte getAdrenalineLevel()
    {
        return this.adrenalineLevel;
    }

    @Override
    public boolean isUndyingUnlocked()
    {
        return this.skillUndyingSpirit;
    }

    @Override
    public byte getUndyingLevel()
    {
        return this.undyingSpiritLevel;
    }

    @Override
    public byte getArcheryLevel()
    {
        return this.archeryLevel;
    }

    @Override
    public int getArcheryXP()
    {
        return this.archeryXP;
    }

    @Override
    public boolean isLuckyShotUnlocked()
    {
        return this.skillLuckyShot;
    }

    @Override
    public byte getLuckyShotLevel()
    {
        return this.luckyShotLevel;
    }

    @Override
    public boolean isEagleEyeUnlocked()
    {
        return this.skillEagleEye;
    }

    @Override
    public byte getEagleEyeLevel()
    {
        return this.eagleEyeLevel;
    }

    @Override
    public void setCombatLevel(byte combatLevel)
    {
        this.combatLevel = combatLevel;
    }

    @Override
    public void setCombatXP(int combatXP)
    {
        this.combatXP = combatXP;
    }

    @Override
    public void setAttackLevel(byte attackLevel)
    {
        this.attackLevel = attackLevel;
    }

    @Override
    public void setAttackXP(int attackXP)
    {
        this.attackXP = attackXP;
    }

    @Override
    public void setPersistenceUnlocked(boolean skillPersistence)
    {
        this.skillPersistence = skillPersistence;
    }

    @Override
    public void setPersistenceLevel(byte level)
    {
        this.persistenceLevel = level;
    }

    @Override
    public void setIntuitionUnlocked(boolean skillIntuition)
    {
        this.skillIntuition = skillIntuition;
    }

    @Override
    public void setIntuitionLevel(byte level)
    {
        this.intuitionLevel = level;
    }

    @Override
    public void setDefenseLevel(byte defenseLevel)
    {
        this.defenseLevel = defenseLevel;
    }

    @Override
    public void setDefenseXP(int defenseXP)
    {
        this.defenseXP = defenseXP;
    }

    @Override
    public void setAdrenalineUnlocked(boolean skillAdrenaline)
    {
        this.skillAdrenaline = skillAdrenaline;
    }

    @Override
    public void setAdrenalineLevel(byte level)
    {
        this.adrenalineLevel = level;
    }

    @Override
    public void setUndyingUnlocked(boolean skillUndyingSpirit)
    {
        this.skillUndyingSpirit  = skillUndyingSpirit;
    }

    @Override
    public void setUndyingLevel(byte level)
    {
        this.undyingSpiritLevel = level;
    }

    @Override
    public void setArcheryLevel(byte archeryLevel)
    {
        this.archeryLevel = archeryLevel;
    }

    @Override
    public void setArcheryXP(int archeryXP)
    {
        this.archeryXP = archeryXP;
    }

    @Override
    public void setLuckyShotUnlocked(boolean skillLuckyShot)
    {
        this.skillLuckyShot = skillLuckyShot;
    }

    @Override
    public void setLuckyShotLevel(byte level)
    {
        this.luckyShotLevel = level;
    }

    @Override
    public void setEagleEyeUnlocked(boolean skillEagleEye)
    {
        this.skillEagleEye = skillEagleEye;
    }

    @Override
    public void setEagleEyeLevel(byte level)
    {
        this.eagleEyeLevel = level;
    }

    @Override
    public byte getSurvivalLevel()
    {
        return this.survivalLevel;
    }

    @Override
    public int getSurvivalXP()
    {
        return this.survivalXP;
    }

    @Override
    public byte getSmeltingLevel()
    {
        return this.smeltingLevel;
    }

    @Override
    public int getSmeltingXP()
    {
        return this.smeltingXP;
    }

    @Override
    public boolean isEfficiencyUnlocked()
    {
        return this.skillEfficiency;
    }

    @Override
    public byte getEfficiencyLevel()
    {
        return this.efficiencyLevel;
    }

    @Override
    public boolean isChefUnlocked()
    {
        return this.skillChef;
    }

    @Override
    public byte getChefLevel()
    {
        return this.chefLevel;
    }

    @Override
    public byte getForagingLevel()
    {
        return this.foragingLevel;
    }

    @Override
    public int getForagingXP()
    {
        return this.foragingXP;
    }

    @Override
    public boolean isSatedUnlocked()
    {
        return this.skillSated;
    }

    @Override
    public byte getSatedLevel()
    {
        return this.satedLevel;
    }

    @Override
    public boolean isHealthyLivingUnlocked()
    {
        return this.skillHealthyLiving;
    }

    @Override
    public byte getHealthyLivingLevel()
    {
        return this.healthyLivingLevel;
    }

    @Override
    public byte getFarmingLevel()
    {
        return this.farmingLevel;
    }

    @Override
    public int getFarmingXP()
    {
        return this.farmingXP;
    }

    @Override
    public boolean isNatureUnlocked()
    {
        return this.skillNature;
    }

    @Override
    public byte getNatureLevel()
    {
        return this.natureLevel;
    }

    @Override
    public boolean isFarmerUnlocked()
    {
        return this.skillFarmer;
    }

    @Override
    public byte getFarmerLevel()
    {
        return this.farmerLevel;
    }

    @Override
    public void setSurvivalLevel(byte survivalLevel)
    {
        this.survivalLevel = survivalLevel;
    }

    @Override
    public void setSurvivalXP(int survivalXP)
    {
        this.survivalXP = survivalXP;
    }

    @Override
    public void setSmeltingLevel(byte smeltingLevel)
    {
        this.smeltingLevel = smeltingLevel;
    }

    @Override
    public void setSmeltingXP(int smeltingXP)
    {
        this.smeltingXP = smeltingXP;
    }

    @Override
    public void setEfficiencyUnlocked(boolean skillEfficiency)
    {
        this.skillEfficiency = skillEfficiency;
    }

    @Override
    public void setEfficiencyLevel(byte level)
    {
        this.efficiencyLevel = level;
    }

    @Override
    public void setChefUnlocked(boolean skillChef)
    {
        this.skillChef = skillChef;
    }

    @Override
    public void setChefLevel(byte level)
    {
        this.chefLevel = level;
    }

    @Override
    public void setForagingLevel(byte foragingLevel)
    {
        this.foragingLevel = foragingLevel;
    }

    @Override
    public void setForagingXP(int foragingXP)
    {
        this.foragingXP = foragingXP;
    }

    @Override
    public void setSatedUnlocked(boolean skillSated)
    {
        this.skillSated = skillSated;
    }

    @Override
    public void setSatedLevel(byte level)
    {
        this.satedLevel = level;
    }

    @Override
    public void setHealthyLivingUnlocked(boolean skillHealthyLiving)
    {
        this.skillHealthyLiving = skillHealthyLiving;
    }

    @Override
    public void setHealthyLivingLevel(byte level)
    {
        this.healthyLivingLevel = level;
    }

    @Override
    public void setFarmingLevel(byte farmingLevel)
    {
        this.farmingLevel = farmingLevel;
    }

    @Override
    public void setFarmingXP(int farmingXP)
    {
        this.farmingXP = farmingXP;
    }

    @Override
    public void setNatureUnlocked(boolean skillNature)
    {
        this.skillNature = skillNature;
    }

    @Override
    public void setNatureLevel(byte level)
    {
        this.natureLevel = level;
    }

    @Override
    public void setFarmerUnlocked(boolean skillFarmer)
    {
        this.skillFarmer = skillFarmer;
    }

    @Override
    public void setFarmerLevel(byte level)
    {
        this.farmerLevel = level;
    }

    @Override
    public byte getMagicLevel()
    {
        return this.magicLevel;
    }

    @Override
    public int getMagicXP()
    {
        return this.magicXP;
    }

    @Override
    public byte getAlchemyLevel()
    {
        return this.alchemyLevel;
    }

    @Override
    public int getAlchemyXP()
    {
        return this.alchemyXP;
    }

    @Override
    public boolean isAlchemistUnlocked()
    {
        return this.skillAlchemy;
    }

    @Override
    public byte getAlchemistLevel()
    {
        return this.masterAlchemyLevel;
    }

    @Override
    public boolean isProjectPotionUnlocked()
    {
        return this.skillPotion;
    }

    @Override
    public byte getProjectPotionLevel()
    {
        return this.potionLevel;
    }

    @Override
    public byte getAgilityLevel()
    {
        return this.agilityLevel;
    }

    @Override
    public int getAgilityXP()
    {
        return this.agilityXP;
    }

    @Override
    public boolean isQuickStepUnlocked()
    {
        return this.skillQuickStep;
    }

    @Override
    public byte getQuickStepLevel()
    {
        return this.quickStepLevel;
    }

    @Override
    public boolean isPhantomShiftUnlocked()
    {
        return this.skillPhantomShift;
    }

    @Override
    public byte getPhantomShiftLevel()
    {
        return this.phantomShiftLevel;
    }

    @Override
    public byte getEnchantingLevel()
    {
        return this.enchantingLevel;
    }

    @Override
    public int getEnchantingXP()
    {
        return this.enchantingXP;
    }

    @Override
    public boolean isSpecialistUnlocked()
    {
        return this.skillSpecialist;
    }

    @Override
    public byte getSpecialistLevel()
    {
        return this.specialistLevel;
    }

    @Override
    public boolean isEnchanterUnlocked()
    {
        return this.skillEnchanter;
    }

    @Override
    public byte getEnchanterLevel()
    {
        return this.enchanterLevel;
    }

    @Override
    public void setMagicLevel(byte magicLevel)
    {
        this.magicLevel = magicLevel;
    }

    @Override
    public void setMagicXP(int magicXP)
    {
        this.magicXP = magicXP;
    }

    @Override
    public void setAlchemyLevel(byte alchemyLevel)
    {
        this.alchemyLevel = alchemyLevel;
    }

    @Override
    public void setAlchemyXP(int alchemyXP)
    {
        this.alchemyXP = alchemyXP;
    }

    @Override
    public void setAlchemistUnlocked(boolean skillAlchemy)
    {
        this.skillAlchemy = skillAlchemy;
    }

    @Override
    public void setAlchemistLevel(byte level)
    {
        this.masterAlchemyLevel = level;
    }

    @Override
    public void setProjectPotionUnlocked(boolean skillPotion)
    {
        this.skillPotion = skillPotion;
    }

    @Override
    public void setProjectPotionLevel(byte level)
    {
        this.potionLevel = level;
    }

    @Override
    public void setAgilityLevel(byte agilityLevel)
    {
        this.agilityLevel = agilityLevel;
    }

    @Override
    public void setAgilityXP(int agilityXP)
    {
        this.agilityXP = agilityXP;
    }

    @Override
    public void setQuickStepUnlocked(boolean skillQuickStep)
    {
        this.skillQuickStep = skillQuickStep;
    }

    @Override
    public void setQuickStepLevel(byte level)
    {
        this.quickStepLevel = level;
    }

    @Override
    public void setPhantomShiftUnlocked(boolean skillPhantomShift)
    {
        this.skillPhantomShift = skillPhantomShift;
    }

    @Override
    public void setPhantomShiftLevel(byte level)
    {
        this.phantomShiftLevel = level;
    }

    @Override
    public void setEnchantingLevel(byte enchantingLevel)
    {
        this.enchantingLevel = enchantingLevel;
    }

    @Override
    public void setEnchantingXP(int enchantingXP)
    {
        this.enchantingXP = enchantingXP;
    }

    @Override
    public void setSpecialistUnlocked(boolean skillSpecialist)
    {
        this.skillSpecialist = skillSpecialist;
    }

    @Override
    public void setSpecialistLevel(byte level)
    {
        this.specialistLevel = level;
    }

    @Override
    public void setEnchanterUnlocked(boolean skillEnchanter)
    {
        this.skillEnchanter = skillEnchanter;
    }

    @Override
    public void setEnchanterLevel(byte level)
    {
        this.enchanterLevel = level;
    }

    @Override
    public byte getLaborLevel()
    {
        return this.laborLevel;
    }

    @Override
    public int getLaborXP()
    {
        return this.laborXP;
    }

    @Override
    public byte getMiningLevel()
    {
        return this.miningLevel;
    }

    @Override
    public int getMiningXP()
    {
        return this.miningXP;
    }

    @Override
    public boolean isDemolistUnlocked()
    {
        return this.skillDemolist;
    }

    @Override
    public byte getDemolistLevel()
    {
        return this.demolistLevel;
    }

    @Override
    public boolean isMinerUnlocked()
    {
        return this.skillMiner;
    }

    @Override
    public byte getMinerLevel()
    {
        return this.minerLevel;
    }

    @Override
    public byte getExcavationLevel()
    {
        return this.excavationLevel;
    }

    @Override
    public int getExcavationXP()
    {
        return this.excavationXP;
    }

    @Override
    public boolean isBulldozerUnlocked()
    {
        return this.skillBulldozer;
    }

    @Override
    public byte getBulldozerLevel()
    {
        return this.bulldozerLevel;
    }

    @Override
    public boolean isExcavatorUnlocked()
    {
        return this.skillExcavator;
    }

    @Override
    public byte getExcavatorLevel()
    {
        return this.excavatorLevel;
    }

    @Override
    public byte getBuildingLevel()
    {
        return this.buildingLevel;
    }

    @Override
    public int getBuildingXP()
    {
        return this.buildingXP;
    }

    @Override
    public boolean isConstructorUnlocked()
    {
        return this.skillConstructor;
    }

    @Override
    public byte getConstructorLevel()
    {
        return this.constructorLevel;
    }

    @Override
    public boolean isBuilderUnlocked()
    {
        return this.skillBuilder;
    }

    @Override
    public byte getBuilderLevel()
    {
        return this.builderLevel;
    }

    @Override
    public void setLaborLevel(byte laborLevel)
    {
        this.laborLevel = laborLevel;
    }

    @Override
    public void setLaborXP(int laborXP)
    {
        this.laborXP = laborXP;
    }

    @Override
    public void setMiningLevel(byte miningLevel)
    {
        this.miningLevel = miningLevel;
    }

    @Override
    public void setMiningXP(int miningXP)
    {
        this.miningXP = miningXP;
    }

    @Override
    public void setDemolistUnlocked(boolean skillDemolist)
    {
        this.skillDemolist = skillDemolist;
    }

    @Override
    public void setDemolistLevel(byte level)
    {
        this.demolistLevel = level;
    }

    @Override
    public void setMinerUnlocked(boolean skillMiner)
    {
        this.skillMiner = skillMiner;
    }

    @Override
    public void setMinerLevel(byte level)
    {
        this.minerLevel = level;
    }

    @Override
    public void setExcavationLevel(byte excavationLevel)
    {
        this.excavationLevel = excavationLevel;
    }

    @Override
    public void setExcavationXP(int excavationXP)
    {
        this.excavationXP = excavationXP;
    }

    @Override
    public void setBulldozerUnlocked(boolean skillBulldozer)
    {
        this.skillBulldozer = skillBulldozer;
    }

    @Override
    public void setBulldozerLevel(byte level)
    {
        this.bulldozerLevel = level;
    }

    @Override
    public void setExcavatorUnlocked(boolean skillExcavator)
    {
        this.skillExcavator = skillExcavator;
    }

    @Override
    public void setExcavatorLevel(byte level)
    {
        this.excavatorLevel = level;
    }

    @Override
    public void setBuildingLevel(byte buildingLevel)
    {
        this.buildingLevel = buildingLevel;
    }

    @Override
    public void setBuildingXP(int buildingXP)
    {
        this.buildingXP = buildingXP;
    }

    @Override
    public void setConstructorUnlocked(boolean skillConstructor)
    {
        this.skillConstructor = skillConstructor;
    }

    @Override
    public void setConstructorLevel(byte level)
    {
        this.constructorLevel = level;
    }

    @Override
    public void setBuilderUnlocked(boolean skillBuilder)
    {
        this.skillBuilder = skillBuilder;
    }

    @Override
    public void setBuilderLevel(byte level)
    {
        this.builderLevel = level;
    }
}
