package net.australmc.lightessentials.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public abstract class BaseCommand implements CommandExecutor {
    @NotNull
    public abstract String getName();

    public abstract void execute(CommandSender sender, Command command, String label, String[] args);

    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        try {
            this.execute(sender, command, label, args);
        } catch (final CommandException exception) {
            sender.sendMessage(exception.getMessage());
        }

        return true;
    }
}
