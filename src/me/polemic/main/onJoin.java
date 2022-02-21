package me.polemic.main;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class onJoin implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		
		Scoreboard.cScore(e.getPlayer());
		Scoreboard.refreshScoreboard();
		e.getPlayer().getInventory().setItem(4, game());
		e.getPlayer().getInventory().setItem(8, shop());
		e.getPlayer().getInventory().setItem(0, hideplayer());
		Player p = e.getPlayer();
		e.setJoinMessage("§a " + p.getName() + " §7Dolaczyl do gry§c!");
		p.sendMessage("§8[ §7--------------------------------- §8]");
		p.sendMessage(" ");
		p.sendMessage(" §7" + p.getName() + " §8| §7Polaczyles sie z serwerem §8Lobby");
		p.sendMessage("");
		p.sendMessage(" §7Wersja serwera: §c" + Bukkit.getBukkitVersion());
		p.sendMessage(" §7Port Serwera: §c" + Bukkit.getPort());
		p.sendMessage(" §7Pole Widzienia Serwera: §c" + Bukkit.getViewDistance());
		p.sendMessage(" §7Graczy: " + Bukkit.getOnlinePlayers().size());
		p.sendMessage(" ");
		p.sendMessage("§8[ §7--------------------------------- §8]");
		
	}

	public ItemStack game(){
	       ItemStack ServerSelector = new ItemStack(Material.COMPASS);
	        ItemMeta ServerSelectorMeta = ServerSelector.getItemMeta();
	     //»«
	        ServerSelectorMeta.setDisplayName(ChatColor.GRAY + "§8» §aMenu Gier §8«");
	        ArrayList<String> LoreList = new ArrayList<String>();
	        LoreList.add("§7» §aWybierz serwer");
	        LoreList.add("§7» §aI zacznij grac!");
	     
	        ServerSelectorMeta.setLore(LoreList);
	        ServerSelector.setItemMeta(ServerSelectorMeta);
	      
	        return ServerSelector;
	}
	
	public ItemStack shop(){
	       ItemStack ServerSelector = new ItemStack(Material.EMERALD);
	        ItemMeta ServerSelectorMeta = ServerSelector.getItemMeta();
	     //»«
	        ServerSelectorMeta.setDisplayName(ChatColor.GRAY + "§8» §aSklep §8«");
	        ServerSelector.setItemMeta(ServerSelectorMeta);
	      
	        return ServerSelector;
	}
	
	public ItemStack hideplayer(){
	       ItemStack ServerSelector = new ItemStack(Material.SLIME_BALL);
	        ItemMeta ServerSelectorMeta = ServerSelector.getItemMeta();
	     //»«
	        ServerSelectorMeta.setDisplayName(ChatColor.GRAY + "§8» §aUkryj Graczy §8«");
	        ServerSelector.setItemMeta(ServerSelectorMeta);
	      
	        return ServerSelector;
	}
	
}


