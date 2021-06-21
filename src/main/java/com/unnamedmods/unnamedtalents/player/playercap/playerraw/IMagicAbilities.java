package com.unnamedmods.unnamedtalents.player.playercap.playerraw;

public interface IMagicAbilities
{
    byte getMagicLevel();
    int getMagicXP();

    byte getAlchemyLevel();
    int getAlchemyXP();

    byte getAgilityLevel();
    int getAgilityXP();

    byte getEnchantingLevel();
    int getEnchantingXP();

    void setMagicLevel(byte magicLevel);
    void setMagicXP(int magicXP);

    void setAlchemyLevel(byte alchemyLevel);
    void setAlchemyXP(int alchemyXP);

    void setAgilityLevel(byte agilityLevel);
    void setAgilityXP(int agilityXP);

    void setEnchantingLevel(byte enchantingLevel);
    void setEnchantingXP(int enchantingXP);
}
