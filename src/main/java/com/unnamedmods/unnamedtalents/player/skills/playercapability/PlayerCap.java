package com.unnamedmods.unnamedtalents.player.skills.playercapability;

public class PlayerCap implements IPlayerCap
{
    private byte combatLevel;
    private byte attackLevel;
    private boolean skillPersistence;
    private boolean skillIntuition;
    private byte defenseLevel;
    private boolean skillAdrenaline;
    private boolean skillUndyingSpirit;
    private byte archeryLevel;
    private boolean skillLuckyShot;
    private boolean skillEagleEye;
    private byte survivalLevel;
    private byte smeltingLevel;
    private boolean skillEfficiency;
    private boolean skillChef;
    private byte foragingLevel;
    private boolean skillSated;
    private boolean skillHealthyLiving;
    private byte farmingLevel;
    private boolean skillNature;
    private boolean skillFarmer;
    private byte magicLevel;
    private byte alchemyLevel;
    private boolean skillAlchemy;
    private boolean skillPotion;
    private byte agilityLevel;
    private boolean skillQuickStep;
    private boolean skillPhantomShift;
    private byte enchantingLevel;
    private boolean skillSpecialist;
    private boolean skillEnchanter;
    private byte laborLevel;
    private byte miningLevel;
    private boolean skillDemolist;
    private boolean skillMiner;
    private byte excavationLevel;
    private boolean skillBulldozer;
    private boolean skillExcavator;
    private byte buildingLevel;
    private boolean skillConstructor;
    private boolean skillBuilder;

    public PlayerCap ()
    {
        this.combatLevel = 0;
        this.attackLevel = 0;
        this.skillPersistence = false;
        this.skillIntuition = false;
        this.defenseLevel = 0;
        this.skillAdrenaline = false;
        this.skillUndyingSpirit = false;
        this.archeryLevel = 0;
        this.skillLuckyShot = false;
        this.skillEagleEye = false;
        this.survivalLevel = 0;
        this.smeltingLevel = 0;
        this.skillEfficiency = false;
        this.skillChef = false;
        this.foragingLevel = 0;
        this.skillSated = false;
        this.skillHealthyLiving = false;
        this.farmingLevel = 0;
        this.skillNature = false;
        this.skillFarmer = false;
        this.magicLevel = 0;
        this.alchemyLevel = 0;
        this.skillAlchemy = false;
        this.skillPotion = false;
        this.agilityLevel = 0;
        this.skillQuickStep = false;
        this.skillPhantomShift = false;
        this.enchantingLevel = 0;
        this.skillSpecialist = false;
        this.skillEnchanter = false;
        this.laborLevel = 0;
        this.miningLevel = 0;
        this.skillDemolist = false;
        this.skillMiner = false;
        this.excavationLevel = 0;
        this.skillBulldozer = false;
        this.skillExcavator = false;
        this.buildingLevel = 0;
        this.skillConstructor = false;
        this.skillBuilder = false;
    }

    @Override
    public byte getCombatLevel()
    {
        return this.combatLevel;
    }

    @Override
    public byte getAttackLevel()
    {
        return this.attackLevel;
    }

    @Override
    public boolean isPersistenceUnlocked()
    {
        return this.skillPersistence;
    }

    @Override
    public boolean isIntuitionUnlocked()
    {
        return this.skillIntuition;
    }

    @Override
    public byte getDefenseLevel()
    {
        return this.defenseLevel;
    }

    @Override
    public boolean isAdrenalineUnlocked()
    {
        return this.skillAdrenaline;
    }

    @Override
    public boolean isUndyingUnlocked()
    {
        return this.skillUndyingSpirit;
    }

    @Override
    public byte getArcheryLevel()
    {
        return this.archeryLevel;
    }

    @Override
    public boolean isLuckyShotUnlocked()
    {
        return this.skillLuckyShot;
    }

    @Override
    public boolean isEagleEyeUnlocked()
    {
        return this.skillEagleEye;
    }

    @Override
    public void setCombatLevel(byte combatLevel)
    {
        this.combatLevel = combatLevel;
    }

    @Override
    public void setAttackLevel(byte attackLevel)
    {
        this.attackLevel = attackLevel;
    }

    @Override
    public void setPersistenceUnlocked(boolean skillPersistence)
    {
        this.skillPersistence = skillPersistence;
    }

    @Override
    public void setIntuitionUnlocked(boolean skillIntuition)
    {
        this.skillIntuition = skillIntuition;
    }

    @Override
    public void setDefenseLevel(byte defenseLevel)
    {
        this.defenseLevel = defenseLevel;
    }

    @Override
    public void setAdrenalineUnlocked(boolean skillAdrenaline)
    {
        this.skillAdrenaline = skillAdrenaline;
    }

    @Override
    public void setUndyingUnlocked(boolean skillUndyingSpirit)
    {
        this.skillUndyingSpirit  = skillUndyingSpirit;
    }

    @Override
    public void setArcheryLevel(byte archeryLevel)
    {
        this.archeryLevel = archeryLevel;
    }

    @Override
    public void setLuckyShotUnlocked(boolean skillLuckyShot)
    {
        this.skillLuckyShot = skillLuckyShot;
    }

    @Override
    public void setEagleEyeUnlocked(boolean skillEagleEye)
    {
        this.skillEagleEye = skillEagleEye;
    }

    @Override
    public byte getSurvivalLevel()
    {
        return this.survivalLevel;
    }

    @Override
    public byte getSmeltingLevel()
    {
        return this.smeltingLevel;
    }

    @Override
    public boolean isEfficiencyUnlocked()
    {
        return this.skillEfficiency;
    }

    @Override
    public boolean isChefUnlocked()
    {
        return this.skillChef;
    }

    @Override
    public byte getForagingLevel()
    {
        return this.foragingLevel;
    }

    @Override
    public boolean isSatedUnlocked()
    {
        return this.skillSated;
    }

    @Override
    public boolean isHealthyLivingUnlocked()
    {
        return this.skillHealthyLiving;
    }

    @Override
    public byte getFarmingLevel()
    {
        return this.farmingLevel;
    }

    @Override
    public boolean isNatureUnlocked()
    {
        return this.skillNature;
    }

    @Override
    public boolean isFarmerUnlocked()
    {
        return this.skillFarmer;
    }

    @Override
    public void setSurvivalLevel(byte survivalLevel)
    {
        this.survivalLevel = survivalLevel;
    }

    @Override
    public void setSmeltingLevel(byte smeltingLevel)
    {
        this.smeltingLevel = smeltingLevel;
    }

    @Override
    public void setEfficiencyUnlocked(boolean skillEfficiency)
    {
        this.skillEfficiency = skillEfficiency;
    }

    @Override
    public void setChefUnlocked(boolean skillChef)
    {
        this.skillChef = skillChef;
    }

    @Override
    public void setForagingLevel(byte foragingLevel)
    {
        this.foragingLevel = foragingLevel;
    }

    @Override
    public void setSatedUnlocked(boolean skillSated)
    {
        this.skillSated = skillSated;
    }

    @Override
    public void setHealthyLivingUnlocked(boolean skillHealthyLiving)
    {
        this.skillHealthyLiving = skillHealthyLiving;
    }

    @Override
    public void setFarmingLevel(byte farmingLevel)
    {
        this.farmingLevel = farmingLevel;
    }

    @Override
    public void setNatureUnlocked(boolean skillNature)
    {
        this.skillNature = skillNature;
    }

    @Override
    public void setFarmerUnlocked(boolean skillFarmer)
    {
        this.skillFarmer = skillFarmer;
    }

    @Override
    public byte getMagicLevel()
    {
        return this.magicLevel;
    }

    @Override
    public byte getAlchemyLevel()
    {
        return this.alchemyLevel;
    }

    @Override
    public boolean isAlchemistUnlocked()
    {
        return this.skillAlchemy;
    }

    @Override
    public boolean isProjectPotionUnlocked()
    {
        return this.skillPotion;
    }

    @Override
    public byte getAgilityLevel()
    {
        return this.agilityLevel;
    }

    @Override
    public boolean isQuickStepUnlocked()
    {
        return this.skillQuickStep;
    }

    @Override
    public boolean isPhantomShiftUnlocked()
    {
        return this.skillPhantomShift;
    }

    @Override
    public byte getEnchantingLevel()
    {
        return this.enchantingLevel;
    }

    @Override
    public boolean isSpecialistUnlocked()
    {
        return this.skillSpecialist;
    }

    @Override
    public boolean isEnchanterUnlocked()
    {
        return this.skillEnchanter;
    }

    @Override
    public void setMagicLevel(byte magicLevel)
    {
        this.magicLevel = magicLevel;
    }

    @Override
    public void setAlchemyLevel(byte alchemyLevel)
    {
        this.alchemyLevel = alchemyLevel;
    }

    @Override
    public void setAlchemistUnlocked(boolean skillAlchemy)
    {
        this.skillAlchemy = skillAlchemy;
    }

    @Override
    public void setProjectPotionUnlocked(boolean skillPotion)
    {
        this.skillPotion = skillPotion;
    }

    @Override
    public void setAgilityLevel(byte agilityLevel)
    {
        this.agilityLevel = agilityLevel;
    }

    @Override
    public void setQuickStepUnlocked(boolean skillQuickStep)
    {
        this.skillQuickStep = skillQuickStep;
    }

    @Override
    public void setPhantomShiftUnlocked(boolean skillPhantomShift)
    {
        this.skillPhantomShift = skillPhantomShift;
    }

    @Override
    public void setEnchantingLevel(byte enchantingLevel)
    {
        this.enchantingLevel = enchantingLevel;
    }

    @Override
    public void setSpecialistUnlocked(boolean skillSpecialist)
    {
        this.skillSpecialist = skillSpecialist;
    }

    @Override
    public void setEnchanterUnlocked(boolean skillEnchanter)
    {
        this.skillEnchanter = skillEnchanter;
    }

    @Override
    public byte getLaborLevel()
    {
        return this.laborLevel;
    }

    @Override
    public byte getMiningLevel()
    {
        return this.miningLevel;
    }

    @Override
    public boolean isDemolistUnlocked()
    {
        return this.skillDemolist;
    }

    @Override
    public boolean isMinerUnlocked()
    {
        return this.skillMiner;
    }

    @Override
    public byte getExcavationLevel()
    {
        return this.excavationLevel;
    }

    @Override
    public boolean isBulldozerUnlocked()
    {
        return this.skillBulldozer;
    }

    @Override
    public boolean isExcavatorUnlocked()
    {
        return this.skillExcavator;
    }

    @Override
    public byte getBuildingLevel()
    {
        return this.buildingLevel;
    }

    @Override
    public boolean isConstructorUnlocked()
    {
        return this.skillConstructor;
    }

    @Override
    public boolean isBuilderUnlocked()
    {
        return this.skillBuilder;
    }

    @Override
    public void setLaborLevel(byte laborLevel)
    {
        this.laborLevel = laborLevel;
    }

    @Override
    public void setMiningLevel(byte miningLevel)
    {
        this.miningLevel = miningLevel;
    }

    @Override
    public void setDemolistUnlocked(boolean skillDemolist)
    {
        this.skillDemolist = skillDemolist;
    }

    @Override
    public void setMinerUnlocked(boolean skillMiner)
    {
        this.skillMiner = skillMiner;
    }

    @Override
    public void setExcavationLevel(byte excavationLevel)
    {
        this.excavationLevel = excavationLevel;
    }

    @Override
    public void setBulldozerUnlocked(boolean skillBulldozer)
    {
        this.skillBulldozer = skillBulldozer;
    }

    @Override
    public void setExcavatorUnlocked(boolean skillExcavator)
    {
        this.skillExcavator = skillExcavator;
    }

    @Override
    public void setBuildingLevel(byte buildingLevel)
    {
        this.buildingLevel = buildingLevel;
    }

    @Override
    public void setConstructorUnlocked(boolean skillConstructor)
    {
        this.skillConstructor = skillConstructor;
    }

    @Override
    public void setBuilderUnlocked(boolean skillBuilder)
    {
        this.skillBuilder = skillBuilder;
    }
}
