package com.unnamedmods.unnamedtalents.player.playercap.playerskills;

public interface IMagicSkills
{
    boolean isAlchemistUnlocked();
    byte getAlchemistLevel();
    boolean isProjectPotionUnlocked();
    byte getProjectPotionLevel();

    boolean isQuickStepUnlocked();
    byte getQuickStepLevel();
    boolean isPhantomShiftUnlocked();
    byte getPhantomShiftLevel();

    boolean isSpecialistUnlocked();
    byte getSpecialistLevel();
    boolean isEnchanterUnlocked();
    byte getEnchanterLevel();

    void setAlchemistUnlocked(boolean skillAlchemy);
    void setAlchemistLevel(byte level);
    void setProjectPotionUnlocked(boolean skillPotion);
    void setProjectPotionLevel(byte level);

    void setQuickStepUnlocked(boolean skillQuickStep);
    void setQuickStepLevel(byte level);
    void setPhantomShiftUnlocked(boolean skillPhantomShift);
    void setPhantomShiftLevel(byte level);

    void setSpecialistUnlocked(boolean skillSpecialist);
    void setSpecialistLevel(byte level);
    void setEnchanterUnlocked(boolean skillEnchanter);
    void setEnchanterLevel(byte level);
}
