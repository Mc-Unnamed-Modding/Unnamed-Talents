package com.unnamedmods.unnamedtalents;

import com.google.common.collect.Lists;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.IGuiEventListener;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;
import java.util.UUID;

@OnlyIn(Dist.CLIENT)
public class TalentGUIMain extends Screen
{

    private int boxWidth = 256;
    private int boxHeight = 256;
    private int x;
    private int y;

    private UUID uuid;


    protected TalentGUIMain(ITextComponent p_i51108_1_)
    {
        super(p_i51108_1_);
    }

    @Override
    public boolean shouldCloseOnEsc()
    {
        return true;
    }

}
