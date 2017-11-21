package tutorial.crayfish.didactic;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import tutorial.crayfish.TutorialMod;
import tutorial.crayfish.tutorial.crayfish.ArmorRegister;

import java.util.ArrayList;
import java.util.List;

public class CommandTutorial implements ICommand{
    public CommandTutorial() {
    }

    @Override
    public String getCommandName() {
        return "Hello";
    }

    @Override
    public String getCommandUsage(ICommandSender p_71518_1_) {
        return "Hello: Just type hello. Simple test command";
    }

    @Override
    public List getCommandAliases() {
        ArrayList alias = new ArrayList();
        alias.add("hello");
        alias.add("hi");
        return alias;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {

        //newlines don't work, so need to call a new line for each line we add.
        String message = "Hello " + sender.getCommandSenderName().toString()+"!";
        System.out.println("ModID: " + TutorialMod.MODID +
                "\nItem Class test: "+ ArmorRegister.cheeseChestPlate.getClass().toString()+
                "\ntexture model string test: " + TutorialMod.MODID + ":textures/armor/cheese_layer_");


        sender.addChatMessage(new ChatComponentText(message));


    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender p_71519_1_) {
        return true;
    }

    @Override
    public List addTabCompletionOptions(ICommandSender p_71516_1_, String[] p_71516_2_) {
        ArrayList tabcompletes = new ArrayList();
        tabcompletes.add("Hello");
        tabcompletes.add("h");
        tabcompletes.add("H");
        return tabcompletes;
    }

    @Override
    public boolean isUsernameIndex(String[] strings, int i) {
        return false;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
