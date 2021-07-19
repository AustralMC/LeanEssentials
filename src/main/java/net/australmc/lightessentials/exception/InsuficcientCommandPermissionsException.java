package net.australmc.lightessentials.exception;

import net.australmc.lightessentials.config.ConfigWrapper;

import static net.australmc.lightessentials.config.Message.INSUFFICIENT_COMMAND_PERMISSIONS;

public class InsuficcientCommandPermissionsException extends CommandException {

    public InsuficcientCommandPermissionsException(final ConfigWrapper configWrapper) {
        super(configWrapper.getMessage(INSUFFICIENT_COMMAND_PERMISSIONS));
    }
}
