package com.unnamedmods.unnamedtalents.player.playercapimpl;

import com.unnamedmods.unnamedtalents.player.playercap.IPlayerCap;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;

import javax.annotation.Nullable;

public class PlayerCapStorage implements Capability.IStorage<IPlayerCap>
{
    @Nullable
    @Override
    public INBT writeNBT(Capability<IPlayerCap> capability, IPlayerCap instance, Direction side)
    {
        CompoundNBT tag = new CompoundNBT();
        tag.putShort("skillPoints", instance.getSkillPoints());
        tag.putInt("XPThreshold",  instance.getXPMax());
        tag.putInt("skillCategoryXPThreshold", instance.getSkillCategoryXPMax());
        tag.putByte("combatLevel", instance.getCombatLevel());
        tag.putInt("combatXP", instance.getCombatXP());

        tag.putByte("combatLevel", instance.getCombatLevel());
        tag.putByte("attackLevel", instance.getAttackLevel());
        tag.putBoolean("skillPersistence", instance.isPersistenceUnlocked());
        tag.putBoolean("skillIntuition", instance.isIntuitionUnlocked());
        tag.putByte("defenseLevel", instance.getDefenseLevel());
        tag.putBoolean("skillAdrenaline", instance.isAdrenalineUnlocked());
        tag.putBoolean("skillUndyingSpirit", instance.isUndyingUnlocked());
        tag.putByte("archeryLevel", instance.getArcheryLevel());
        tag.putBoolean("skillLuckyShot", instance.isLuckyShotUnlocked());
        tag.putBoolean("skillEagleEye", instance.isEagleEyeUnlocked());
        tag.putByte("survivalLevel", instance.getSurvivalLevel());
        tag.putByte("smeltingLevel", instance.getSmeltingLevel());
        tag.putBoolean("skillEfficiency", instance.isEfficiencyUnlocked());
        tag.putBoolean("skillChef", instance.isChefUnlocked());
        tag.putByte("foragingLevel", instance.getForagingLevel());
        tag.putBoolean("skillSated", instance.isSatedUnlocked());
        tag.putBoolean("skillHealthyLiving", instance.isHealthyLivingUnlocked());
        tag.putByte("farmingLevel", instance.getFarmingLevel());
        tag.putBoolean("skillNature", instance.isNatureUnlocked());
        tag.putBoolean("skillFarmer", instance.isFarmerUnlocked());
        tag.putByte("magicLevel", instance.getMagicLevel());
        tag.putByte("alchemyLevel", instance.getAlchemyLevel());
        tag.putBoolean("skillAlchemy", instance.isAlchemistUnlocked());
        tag.putBoolean("skillPotion", instance.isProjectPotionUnlocked());
        tag.putByte("agilityLevel", instance.getAgilityLevel());
        tag.putBoolean("skillQuickStep", instance.isQuickStepUnlocked());
        tag.putBoolean("skillPhantomShift", instance.isPhantomShiftUnlocked());
        tag.putByte("enchantingLevel", instance.getEnchantingLevel());
        tag.putBoolean("skillSpecialist", instance.isSpecialistUnlocked());
        tag.putBoolean("skillEnchanter", instance.isEnchanterUnlocked());
        tag.putByte("laborLevel", instance.getLaborLevel());
        tag.putByte("miningLevel", instance.getMiningLevel());
        tag.putBoolean("skillDemolist", instance.isDemolistUnlocked());
        tag.putBoolean("skillMiner", instance.isMinerUnlocked());
        tag.putByte("excavationLevel", instance.getExcavationLevel());
        tag.putBoolean("skillBulldozer", instance.isBulldozerUnlocked());
        tag.putBoolean("skillExcavator", instance.isExcavatorUnlocked());
        tag.putByte("buildingLevel", instance.getBuildingLevel());
        tag.putBoolean("skillConstructor", instance.isConstructorUnlocked());
        tag.putBoolean("skillBuilder", instance.isBuilderUnlocked());
        return tag;
    }

    @Override
    public void readNBT(Capability<IPlayerCap> capability, IPlayerCap instance, Direction side, INBT nbt)
    {
        CompoundNBT tag = (CompoundNBT) nbt;
        instance.setSkillPoints(tag.getShort("skillPoints"));
        instance.setCombatLevel(tag.getByte("combatLevel"));
        instance.setAttackLevel(tag.getByte("attackLevel"));
        instance.setPersistenceUnlocked(tag.getBoolean("skillPersistence"));
        instance.setIntuitionUnlocked(tag.getBoolean("skillIntuition"));
        instance.setDefenseLevel(tag.getByte("defenseLevel"));
        instance.setAdrenalineUnlocked(tag.getBoolean("skillAdrenaline"));
        instance.setUndyingUnlocked(tag.getBoolean("skillUndyingSpirit"));
        instance.setArcheryLevel(tag.getByte("archeryLevel"));
        instance.setLuckyShotUnlocked(tag.getBoolean("skillLuckyShot"));
        instance.setEagleEyeUnlocked(tag.getBoolean("skillEagleEye"));
        instance.setSurvivalLevel(tag.getByte("survivalLevel"));
        instance.setSmeltingLevel(tag.getByte("smeltingLevel"));
        instance.setEfficiencyUnlocked(tag.getBoolean("skillEfficiency"));
        instance.setChefUnlocked(tag.getBoolean("skillChef"));
        instance.setForagingLevel(tag.getByte("foragingLevel"));
        instance.setSatedUnlocked(tag.getBoolean("skillSated"));
        instance.setHealthyLivingUnlocked(tag.getBoolean("skillHealthyLiving"));
        instance.setFarmingLevel(tag.getByte("farmingLevel"));
        instance.setNatureUnlocked(tag.getBoolean("skillNature"));
        instance.setFarmerUnlocked(tag.getBoolean("skillFarmer"));
        instance.setMagicLevel(tag.getByte("magicLevel"));
        instance.setAlchemyLevel(tag.getByte("alchemyLevel"));
        instance.setAlchemistUnlocked(tag.getBoolean("skillAlchemy"));
        instance.setProjectPotionUnlocked(tag.getBoolean("skillPotion"));
        instance.setAgilityLevel(tag.getByte("agilityLevel"));
        instance.setQuickStepUnlocked(tag.getBoolean("skillQuickStep"));
        instance.setPhantomShiftUnlocked(tag.getBoolean("skillPhantomShift"));
        instance.setEnchantingLevel(tag.getByte("enchantingLevel"));
        instance.setSpecialistUnlocked(tag.getBoolean("skillSpecialist"));
        instance.setEnchanterUnlocked(tag.getBoolean("skillEnchanter"));
        instance.setLaborLevel(tag.getByte("laborLevel"));
        instance.setMiningLevel(tag.getByte("miningLevel"));
        instance.setDemolistUnlocked(tag.getBoolean("skillDemolist"));
        instance.setMinerUnlocked(tag.getBoolean("skillMiner"));
        instance.setExcavationLevel(tag.getByte("excavationLevel"));
        instance.setBulldozerUnlocked(tag.getBoolean("skillBulldozer"));
        instance.setExcavatorUnlocked(tag.getBoolean("skillExcavator"));
        instance.setBuildingLevel(tag.getByte("buildingLevel"));
        instance.setConstructorUnlocked(tag.getBoolean("skillConstructor"));
        instance.setBuilderUnlocked(tag.getBoolean("skillBuilder"));
    }
}
