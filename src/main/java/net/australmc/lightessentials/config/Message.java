package net.australmc.lightessentials.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Message {
    COMMAND_FEED_SUCCESS("commands.feed.success"),
    COMMAND_FEED_OTHER_SUCCESS("commands.feed.others.success"),
    INSUFFICIENT_COMMAND_PERMISSIONS("errors.insufficient-permissions"),
    PLAYER_NOT_FOUND("errors.player-not-found"),
    PLAYER_ONLY_COMMAND("errors.player-only-command");

    private final String path;
}
