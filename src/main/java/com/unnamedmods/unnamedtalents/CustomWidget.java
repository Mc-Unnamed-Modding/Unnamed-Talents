package com.unnamedmods.unnamedtalents;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.AbstractButton;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.loot.TableLootEntry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

import java.util.List;
import java.util.function.Supplier;

public class CustomWidget extends Button
{
    public final ResourceLocation hoveredButton = new ResourceLocation(UnnamedTalents.MOD_ID,  "textures/gui/guibuttonhovered.png");
    public final ResourceLocation otherBox = new ResourceLocation(UnnamedTalents.MOD_ID,  "textures/gui/guibutton.png");

    private int x;
    private int y;
    private int width;
    private int height;
    private ITextComponent component;
    private IPressable pressable;
    MainWindow mainWindow = Minecraft.getInstance().getWindow();
    TalentGUIMain main = new TalentGUIMain(null);


    public CustomWidget(int x, int y, int width, int height, ITextComponent component, IPressable pressable)
    {
        super(x, y, width, height, component, pressable);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.component = component;
        this.pressable = pressable;
    }

    @Override
    public void renderButton(MatrixStack matrix, int mouseX, int mouseY, float partialTicks)
    {
        if (this.isHovered() && Minecraft.getInstance().screen instanceof TalentGUIMain)
        {

            Minecraft.getInstance().getTextureManager().bind(hoveredButton);
        }

        else
        {
            Minecraft.getInstance().getTextureManager().bind(otherBox);
        }
        blit(matrix, this.x, this.y, 0, 0f, 0f, this.width /* ComponentWidth */, this.height /* ComponentHeight */, this.height /* ComponentHeight */, this.width /* ComponentWidth */);
    }
}
