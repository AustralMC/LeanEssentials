package net.australmc.lightessentials;

import com.google.inject.Inject;
import com.google.inject.Injector;
import net.australmc.lightessentials.command.CommandsManager;
import net.australmc.lightessentials.di.DIModule;
import org.bukkit.plugin.java.JavaPlugin;

public class LightEssentials extends JavaPlugin {
    @Inject
    private CommandsManager commandsManager;

    public void onEnable() {
        setupConfig();
        setupDI();

        commandsManager.setUp();
    }

    private void setupConfig() {
        saveDefaultConfig();
        getConfig().options().copyDefaults(true);
    }

    private void setupDI() {
        final DIModule module = new DIModule(this);
        final Injector injector = module.createInjector();

        injector.injectMembers(this);
    }
}
