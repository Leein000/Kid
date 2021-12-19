package kr.kro.narileein05.kid.functions.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class AlwaysEvents implements Listener {

    @EventHandler
    public void test(PlayerInteractEvent e) {
        e.getPlayer().sendMessage("hi");
    }

}
