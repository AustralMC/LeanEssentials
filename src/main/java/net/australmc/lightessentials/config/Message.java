package net.australmc.lightessentials.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Message {
    PLAYER_ONLY_COMMAND("errors.player-only-command");

    private final String path;
}
