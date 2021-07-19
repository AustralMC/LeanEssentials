package net.australmc.lightessentials.exception;

import net.australmc.lightessentials.config.ConfigWrapper;
import org.bukkit.configuration.file.FileConfiguration;
import org.jetbrains.annotations.NotNull;

import static net.australmc.lightessentials.config.Message.PLAYER_ONLY_COMMAND;

public class PlayerOnlyCommandException extends CommandException {
    public PlayerOnlyCommandException(@NotNull final FileConfiguration config) {
        super(new ConfigWrapper(config).getMessage(PLAYER_ONLY_COMMAND));
    }
}
