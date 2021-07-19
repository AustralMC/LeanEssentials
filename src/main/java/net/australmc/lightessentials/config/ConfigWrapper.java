package net.australmc.lightessentials.config;

import com.google.inject.Inject;
import lombok.RequiredArgsConstructor;
import net.australmc.lightessentials.utils.PlaceholderReplacer;
import org.bukkit.configuration.file.FileConfiguration;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

import static java.util.Collections.emptyMap;
import static java.util.Objects.requireNonNullElse;
import static org.apache.commons.lang.StringUtils.EMPTY;
import static org.bukkit.ChatColor.translateAlternateColorCodes;

@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class ConfigWrapper {
    private static final char ALTERNATIVE_COLOR_CHAR = '&';
    private static final String MESSAGES_PATH = "messages.";

    private final FileConfiguration config;

    @NotNull
    public String getMessage(@NotNull final Message message) {
        return getMessage(message, emptyMap());
    }

    @NotNull
    public String getMessage(@NotNull final Message message, @NotNull final Map<String, String> placeholders) {
        final var text = requireNonNullElse(config.getString(MESSAGES_PATH + message.getPath()), EMPTY);

        final var coloredText = translateAlternateColorCodes(ALTERNATIVE_COLOR_CHAR, text);

        return PlaceholderReplacer.replace(coloredText, placeholders);
    }
}
