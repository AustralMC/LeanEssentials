package net.australmc.lightessentials.command.feed;

import com.google.inject.Inject;
import lombok.RequiredArgsConstructor;
import net.australmc.lightessentials.command.PlayerCommand;
import net.australmc.lightessentials.service.permission.CommandPermissionValidatorService;
import net.australmc.lightessentials.service.player.FeedOtherPlayerService;
import net.australmc.lightessentials.service.player.FeedPlayerService;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static net.australmc.lightessentials.domain.Constants.PERMISSION_FEED_CMD;
import static net.australmc.lightessentials.domain.Constants.PERMISSION_FEED_CMD_OTHERS;

@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class FeedCommand extends PlayerCommand {
    private final CommandPermissionValidatorService commandPermissionValidatorService;
    private final FeedOtherPlayerService feedOtherPlayerService;
    private final FeedPlayerService feedPlayerService;
    private final Server server;

    @Override
    public void execute(final Player sender, final Command command, final String label, final String[] args) {
        commandPermissionValidatorService.validate(sender, PERMISSION_FEED_CMD);

        if(args.length > 0) {
            commandPermissionValidatorService.validate(sender, PERMISSION_FEED_CMD_OTHERS);

            final var target = server.getPlayer(args[0]);

            feedOtherPlayerService.feed(sender, target);
        }

        feedPlayerService.feedWithMessage(sender);
    }

    @NotNull
    @Override
    public String getName() {
        return "feed";
    }
}
