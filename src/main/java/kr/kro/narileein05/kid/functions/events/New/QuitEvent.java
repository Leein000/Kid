package kr.kro.narileein05.kid.functions.events.New;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitEvent implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        String playerName = event.getPlayer().getName();
        event.setQuitMessage(ChatColor.GOLD + playerName + "가 퇴장했습니다");
    }
}
