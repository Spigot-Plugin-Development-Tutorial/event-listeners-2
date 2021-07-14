package me.kodysimpson.eventlistenerspart2;

import me.kodysimpson.eventlistenerspart2.listeners.ShearSheepListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class EventListenersPart2 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        //You can register it using the same methods but this time you provide a new instance
        //of the class for the fist parameter
        getServer().getPluginManager().registerEvents(new ShearSheepListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
