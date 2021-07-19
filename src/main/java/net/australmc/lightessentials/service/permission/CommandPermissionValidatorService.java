package net.australmc.lightessentials.service.permission;

import com.google.inject.Inject;
import lombok.RequiredArgsConstructor;
import net.australmc.lightessentials.config.ConfigWrapper;
import net.australmc.lightessentials.exception.InsuficcientCommandPermissionsException;
import org.bukkit.command.CommandSender;

@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class CommandPermissionValidatorService {
    private final ConfigWrapper configWrapper;

    public void validate(final CommandSender sender, final String permission) {
        if(!(sender.hasPermission(permission))) {
            throw new InsuficcientCommandPermissionsException(configWrapper);
        }
    }
}
