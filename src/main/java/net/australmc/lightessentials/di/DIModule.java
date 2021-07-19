package net.australmc.lightessentials.di;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import lombok.RequiredArgsConstructor;
import net.australmc.lightessentials.LightEssentials;
import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.logging.Logger;

@RequiredArgsConstructor
public class DIModule extends AbstractModule {
    private final LightEssentials plugin;

    public Injector createInjector() {
        return Guice.createInjector(this);
    }

    @Override
    protected void configure() {
        bind(LightEssentials.class).toInstance(this.plugin);
        bind(FileConfiguration.class).toInstance(this.plugin.getConfig());
        bind(Logger.class).toInstance(this.plugin.getLogger());
        bind(Server.class).toInstance(this.plugin.getServer());
    }
}
