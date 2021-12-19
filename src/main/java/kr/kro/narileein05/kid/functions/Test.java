package kr.kro.narileein05.kid.functions;


import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[PluginTutorial] Plugin Enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("[PluginTutorial] plugin Disabled");

    }
}
