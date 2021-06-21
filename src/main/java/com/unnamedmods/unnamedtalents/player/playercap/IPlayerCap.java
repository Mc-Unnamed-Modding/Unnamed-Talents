package com.unnamedmods.unnamedtalents.player.playercap;

import com.unnamedmods.unnamedtalents.player.playercap.playerraw.*;
import com.unnamedmods.unnamedtalents.player.playercap.playerskills.*;

public interface IPlayerCap extends Abilities, Skills
{
    byte getMaxAbilityLevel();
    int getXPThreshold();

    short getSkillPoints();


    int getXPMax();
    int getSkillCategoryXPMax();

    void setSkillPoints(short skillPoints);

    boolean isKeyPressed();
    void setKeyPressed(boolean keyPressed);
}
