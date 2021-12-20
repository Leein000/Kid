package kr.kro.narileein05.kid.functions.events;

import kr.kro.narileein05.kid.functions.events.New.JoinEvents;
import kr.kro.narileein05.kid.functions.events.New.QuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Dev extends JavaPlugin {
    @Override
    public void onEnable() {
        //Plugin start logic
        getServer().getPluginManager().registerEvents(new JoinEvents(), this);
        getServer().getPluginManager().registerEvents(new QuitEvent(), this);
    }
}
