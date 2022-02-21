package me.polemic.main;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class onQuit implements Listener {

	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent e) {
		Scoreboard.refreshScoreboard();	
		}
	

}
