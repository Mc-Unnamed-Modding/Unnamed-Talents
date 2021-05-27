package com.unnamedmods.unnamedtalents;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.IGuiEventListener;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.monster.piglin.PiglinEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;


public class TalentGUIMain extends Screen
{

    private final ResourceLocation box = new ResourceLocation(UnnamedTalents.MOD_ID, "textures/gui/guitextures.png");
    private int boxWidth = 184;
    private int boxHeight = 184;
    private int x;
    private int y;
    private UUID uuid;
    Minecraft mc = Minecraft.getInstance();
    MainWindow mainWindow = mc.getWindow();
    FontRenderer font = mc.font;
    public net.minecraft.entity.monster.piglin.PiglinTasks pickUpItem;



    public TalentGUIMain (ITextComponent component)
    {
        super(component);

    }

    @Override
    public boolean shouldCloseOnEsc()
    {
        return true;
    }

    @Override
    public boolean isPauseScreen()
    {
      return false;
    }

    @Override
    public void init()
    {
        super.init();
    }

    @Override
    public void render(MatrixStack stack, int mouseX, int mouseY, float partialTicks)
    {
        renderBackground( stack,  1 );
        super.render( stack, mouseX, mouseY, partialTicks );

        x = (mainWindow.getGuiScaledWidth() / 2) - (boxWidth / 2);
        y = (mainWindow.getGuiScaledHeight() / 2) - (boxHeight / 2);

        Minecraft.getInstance().getTextureManager().bind(box);
        RenderSystem.enableBlend();
        blit(stack,mainWindow.getGuiScaledWidth() / 2 - 92,mainWindow.getGuiScaledHeight() / 2 - 92,0, 0F, 0F, 184, 184, 184, 184);
    }

    @Override
    public void renderBackground(MatrixStack stack, int p_renderBackground_1_)
    {
        super.renderBackground(stack,p_renderBackground_1_);
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double scroll)
    {
        return super.mouseScrolled(mouseX, mouseY, scroll);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button)
    {
        if( button == 1 )
        {
            return true;
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public boolean mouseReleased(double mouseX, double mouseY, int button)
    {
        return super.mouseReleased(mouseX, mouseY, button);
    }

    @Override
    public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY)
    {
        return super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
    }

}
