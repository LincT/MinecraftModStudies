package tutorial.crayfish.didactic;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

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
        return "Just type hello. Simple test command";
    }

    @Override
    public List getCommandAliases() {
        ArrayList alias = new ArrayList();
        alias.add("hello");
        return alias;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        String message = "Hello " + sender.getCommandSenderName().toString();
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
        return tabcompletes;
    }

    @Override
    public boolean isUsernameIndex(String[] p_82358_1_, int p_82358_2_) {
        return false;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
