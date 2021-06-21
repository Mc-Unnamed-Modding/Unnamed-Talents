package com.unnamedmods.unnamedtalents.player.playercap.playerskills;

public interface ILaborSkills
{
    boolean isDemolistUnlocked();
    byte getDemolistLevel();
    boolean isMinerUnlocked();
    byte getMinerLevel();

    boolean isBulldozerUnlocked();
    byte getBulldozerLevel();
    boolean isExcavatorUnlocked();
    byte getExcavatorLevel();

    boolean isConstructorUnlocked();
    byte getConstructorLevel();
    boolean isBuilderUnlocked();
    byte getBuilderLevel();

    void setDemolistUnlocked(boolean skillDemolist);
    void setDemolistLevel(byte level);
    void setMinerUnlocked(boolean skillMiner);
    void setMinerLevel(byte level);

    void setBulldozerUnlocked(boolean skillBulldozer);
    void setBulldozerLevel(byte level);
    void setExcavatorUnlocked(boolean skillExcavator);
    void setExcavatorLevel(byte level);

    void setConstructorUnlocked(boolean skillConstructor);
    void setConstructorLevel(byte level);
    void setBuilderUnlocked(boolean skillBuilder);
    void setBuilderLevel(byte level);
}
