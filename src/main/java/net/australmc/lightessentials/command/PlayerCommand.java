package net.australmc.lightessentials.command;

import com.google.inject.Inject;
import net.australmc.lightessentials.exception.PlayerOnlyCommandException;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public abstract class PlayerCommand extends BaseCommand {
    @Inject
    private FileConfiguration config;

    public abstract void execute(Player sender, Command command, String label, String[] args);

    @Override
    public void execute(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof final Player playerSender) {
            this.execute(playerSender, command, label, args);
        } else {
            throw new PlayerOnlyCommandException(config);
        }
    }
}
