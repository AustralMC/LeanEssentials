package net.australmc.lightessentials.exception;

import net.australmc.lightessentials.config.ConfigWrapper;
import net.australmc.lightessentials.config.Message;

public class PlayerNotFoundException extends CommandException {
    public PlayerNotFoundException(final ConfigWrapper configWrapper) {
        super(configWrapper.getMessage(Message.PLAYER_NOT_FOUND));
    }
}
