package kr.kro.narileein05.kid.functions.events;

import kr.kro.narileein05.kid.functions.events.New.JoinEvents;
import kr.kro.narileein05.kid.functions.events.New.QuitEvents;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.desktop.QuitEvent;

public class Dev extends JavaPlugin {
    @Override
    public void onEnable() {
        //Plugin start logic
        getServer().getPluginManager().registerEvents(new JoinEvents(), this);
        getServer().getPluginManager().registerEvents(new QuitEvents(), this);
    }
}
