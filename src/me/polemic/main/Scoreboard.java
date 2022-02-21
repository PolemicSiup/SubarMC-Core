package me.polemic.main;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.ScoreboardManager;

public class Scoreboard implements Listener {
	
	public static void cScore(Player p) {
		ScoreboardManager m = Bukkit.getScoreboardManager();
		org.bukkit.scoreboard.Scoreboard board = m.getNewScoreboard();
		Objective objective = board.registerNewObjective("Stats", "dummy");
		objective.setDisplayName("§e§lSUBARMC.PL");
		objective.setDisplaySlot(DisplaySlot.SIDEBAR);
		
		Score side = objective.getScore(" ");
		side.setScore(6);
		
		Score side2 = objective.getScore("§fNick: §a" + p.getName());
		side2.setScore(5);
		
		Score side3 = objective.getScore("§fPoczekalnia: §a#1");
		side3.setScore(4);
		
		Score side4 = objective.getScore(" ");
		side4.setScore(3);
		
		Score side5 = objective.getScore("§fGraczy: §7" + Bukkit.getOnlinePlayers().size());
		side5.setScore(2);
		
		Score side6 = objective.getScore("§fOdlamki: §7[§f0§7]");
		side6.setScore(1);
		
		p.setScoreboard(board);
		
		
	}
	
	public static void refreshScoreboard() {
		for(Player players : Bukkit.getOnlinePlayers()) {
			cScore(players);
		}
	}
	

}
