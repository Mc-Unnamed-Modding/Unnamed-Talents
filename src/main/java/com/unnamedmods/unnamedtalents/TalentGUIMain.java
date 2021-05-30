package com.unnamedmods.unnamedtalents;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.resources.DataPackRegistries;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.lwjgl.system.CallbackI;

import javax.annotation.Nullable;
import java.util.Objects;


public class TalentGUIMain extends Screen
{
    private final ResourceLocation box = new ResourceLocation(UnnamedTalents.MOD_ID, "textures/gui/guitextures.png");

    private static final ITextComponent TITLE = new TranslationTextComponent("block_renderer.gui.choose");
    private int boxWidth = 184;
    private int boxHeight = 184;
    private int x;
    private int y;

    @Nullable
    private final Screen old;


    Minecraft mc = Minecraft.getInstance();
    MainWindow mainWindow = mc.getWindow();

    public TalentGUIMain (@Nullable Screen old)
    {
        super(TITLE);
        this.old = old;
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
        assert mc != null;
        addButton(new CustomWidget(92,  92, 55, 26, TITLE, button -> { mc.setScreen(new TestGui(new TalentGUIMain(null)));}));
    }

    @Override
    public void render(MatrixStack stack, int mouseX, int mouseY, float partialTicks)
    {
        renderBackground(stack,1 );
        super.render(stack, mouseX, mouseY, partialTicks);

        x = (mainWindow.getGuiScaledWidth() / 2) - (boxWidth / 2);
        y = (mainWindow.getGuiScaledHeight() / 2) - (boxHeight / 2);

        Minecraft.getInstance().getTextureManager().bind(box);

        blit(stack,mainWindow.getGuiScaledWidth() / 2 - 92,mainWindow.getGuiScaledHeight() / 2 - 92,
                0, 0F, 0F, boxWidth, boxHeight, boxWidth, boxHeight);
    }

    // if UnnamedTalents.keybindings.isDown() & iteration == 1 -> iteration++ setOverlayImage (iteration 1 coordinates)
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
        if(button == 1)
        {
            mc.setScreen(new TestGui(this));
            return true;

        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public boolean mouseReleased(double mouseX, double mouseY, int button)
    {
        return super.mouseReleased(mouseX, mouseY, button);
    }

    //if (mx >= (centerX - coordinateXOffset) && mx <= (centerX - coordinateXOffset) + 55 && my >= (centerY - coordinateYOffset) && my <= (centerY - coordinateYOffset) + 26)
    @Override
    public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY)
    {
        return super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
    }


    ///
    ///
    ///
    /// TEST GUI
    ///
    ///
    ///


    public class TestGui extends Screen
    {
        TalentGUIMain talent = new TalentGUIMain(null);
        private final Screen old;

        public TestGui(@Nullable Screen old)
        {
            super(TITLE);
            this.old = old;
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
            renderBackground(stack,1 );
            super.render(stack, mouseX, mouseY, partialTicks);
            if (talent != null)
            {
                talent.init(mc, 0, 0);
                talent.render(stack,mouseX,mouseY,partialTicks);
            }

            Minecraft.getInstance().getTextureManager().bind(box);

            blit(stack,Minecraft.getInstance().getWindow().getGuiScaledWidth() / 2,Minecraft.getInstance().getWindow().getGuiScaledHeight() / 2 - 92,0, 0F, 0F, 184, 184, 184, 184);

        }

        // if UnnamedTalents.keybindings.isDown() & iteration == 1 -> iteration++ setOverlayImage (iteration 1 coordinates)
        @Override
        public boolean mouseScrolled(double mouseX, double mouseY, double scroll)
        {
            return super.mouseScrolled(mouseX, mouseY, scroll);
        }

        @Override
        public boolean mouseClicked(double mouseX, double mouseY, int button)
        {
            if(button == 1)
            {
                mc.setScreen(old);
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

        @Override
        public void onClose()
        {
            assert minecraft != null;

            minecraft.setScreen(old);
        }
    }
}
