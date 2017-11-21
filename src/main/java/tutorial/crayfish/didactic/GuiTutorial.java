package tutorial.crayfish.didactic;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiButton;

public class GuiTutorial extends GuiScreen {
    private GuiButton a = new GuiButton(0, this.width / 2 - 100,
            this.height / 2 - 24, "This is button a");
    private GuiButton b = new GuiButton(1, this.width / 2 - 100,
            this.height / 2 + 4, "This is button b");

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
    @Override
    public void initGui() {
        final boolean add = this.buttonList.add(a);
        boolean add1 = this.buttonList.add(b);
    }
    @Override
    protected void actionPerformed(GuiButton button) {
        if (button == this.a) {
            //Main.packetHandler.sendToServer(...);
            this.mc.displayGuiScreen(null);
            if (this.mc.currentScreen == null)
                this.mc.setIngameFocus();
        }
        if (button == this.b){
            //Main.packetHandler.sendToServer(...);
            this.mc.displayGuiScreen(null);
            if (this.mc.currentScreen == null)
                this.mc.setIngameFocus();
        }
    }

}
