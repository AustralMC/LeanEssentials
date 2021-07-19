package net.australmc.lightessentials.command;

import com.google.inject.Inject;
import lombok.RequiredArgsConstructor;
import net.australmc.lightessentials.LightEssentials;
import net.australmc.lightessentials.command.feed.FeedCommand;

import java.util.Set;

import static java.util.Set.of;

@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class CommandsManager {
    private final LightEssentials plugin;
    private final FeedCommand feedCommand;

    private Set<BaseCommand> getCommands() {
        return of(
                feedCommand
        );
    }

    public void setUp() {
        getCommands().forEach(command -> plugin.getCommand(command.getName()));
    }

}
