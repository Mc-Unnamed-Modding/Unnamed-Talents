package com.unnamedmods.unnamedtalents.player.playercap.playerskills;

public interface ICombatSkills
{
    boolean isPersistenceUnlocked();
    byte getPersistenceLevel();
    boolean isIntuitionUnlocked();
    byte getIntuitionLevel();

    boolean isAdrenalineUnlocked();
    byte getAdrenalineLevel();
    boolean isUndyingUnlocked();
    byte getUndyingLevel();

    boolean isLuckyShotUnlocked();
    byte getLuckyShotLevel();
    boolean isEagleEyeUnlocked();
    byte getEagleEyeLevel();

    void setPersistenceUnlocked(boolean skillPersistence);
    void setPersistenceLevel(byte level);
    void setIntuitionUnlocked(boolean skillIntuition);
    void setIntuitionLevel(byte level);

    void setAdrenalineUnlocked(boolean skillAdrenaline);
    void setAdrenalineLevel(byte level);
    void setUndyingUnlocked(boolean skillUndyingSpirit);
    void setUndyingLevel(byte level);

    void setLuckyShotUnlocked(boolean skillLuckyShot);
    void setLuckyShotLevel(byte level);
    void setEagleEyeUnlocked(boolean skillEagleEye);
    void setEagleEyeLevel(byte level);
}
