package kr.kro.narileein05.kid;

import kr.kro.narileein05.kid.functions.events.AlwaysEvents;
import kr.kro.narileein05.kid.functions.events.Dev;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static JavaPlugin pl;
    public static String prefix = "§f[§9KID§f]";

    @Override
    public void onEnable() {
        pl = this;
        getLogger().info(prefix + " §aEnable");
        getCommand("kid").setExecutor(new CMD());
        Bukkit.getPluginManager().registerEvents(new AlwaysEvents(), this);
    }

    @Override
    public void onDisable() {
    }
}
