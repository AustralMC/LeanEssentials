package net.australmc.lightessentials.service.player;

import com.google.inject.Inject;
import lombok.RequiredArgsConstructor;
import net.australmc.lightessentials.config.ConfigWrapper;
import net.australmc.lightessentials.exception.PlayerNotFoundException;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

import static java.util.Map.entry;
import static java.util.Map.ofEntries;
import static java.util.Objects.isNull;
import static net.australmc.lightessentials.config.Message.COMMAND_FEED_OTHER_SUCCESS;

@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class FeedOtherPlayerService {
    private final ConfigWrapper configWrapper;
    private final FeedPlayerService feedPlayerService;

    public void feed(@NotNull final Player player, @Nullable final Player target) {
        if(isNull(target)) {
            throw new PlayerNotFoundException(configWrapper);
        }

        feedPlayerService.feed(target);

        final Map<String, String> placeholders = ofEntries(
                entry("target", target.getName())
        );

        player.sendMessage(configWrapper.getMessage(COMMAND_FEED_OTHER_SUCCESS, placeholders));
    }
}
