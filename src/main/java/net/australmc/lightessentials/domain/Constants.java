package net.australmc.lightessentials.domain;

public interface Constants {
    int PLAYER_MAX_FOOD_LEVEL = 20;

    String BASE_PERMISSION_NODE = "lightessentials.";
    String PERMISSION_FEED_CMD = BASE_PERMISSION_NODE.concat("feed");
    String PERMISSION_FEED_CMD_OTHERS = PERMISSION_FEED_CMD.concat(".others");
}
