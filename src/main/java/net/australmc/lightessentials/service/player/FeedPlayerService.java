package net.australmc.lightessentials.service.player;

import com.google.inject.Inject;
import lombok.RequiredArgsConstructor;
import net.australmc.lightessentials.config.ConfigWrapper;
import org.bukkit.entity.Player;

import static net.australmc.lightessentials.config.Message.COMMAND_FEED_SUCCESS;
import static net.australmc.lightessentials.domain.Constants.PLAYER_MAX_FOOD_LEVEL;

@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class FeedPlayerService {
    private final ConfigWrapper config;

    public void feedWithMessage(final Player player) {
        this.feed(player);

        player.sendMessage(config.getMessage(COMMAND_FEED_SUCCESS));
    }

    public void feed(final Player player) {
        player.setFoodLevel(PLAYER_MAX_FOOD_LEVEL);
    }
}
