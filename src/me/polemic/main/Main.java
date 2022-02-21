package me.polemic.main;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin implements CommandExecutor {
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "SubarMC - ItemShop" + ChatColor.GRAY + "[" + ChatColor.GREEN +  "uruchamianie..." + ChatColor.GRAY + "]");
	PluginManager pm = Bukkit.getPluginManager();
	pm.registerEvents(new onJoin(), this);
	pm.registerEvents(new onQuit(), this);
	}

	public void onDisable() {
		System.out.println("[SubarMC Lobby] Wylaczanie...");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("itemshop-vip")) {
			if (sender.hasPermission("subarmc.itemshop.console") || sender.isOp()) {
			Bukkit.broadcastMessage("§7Gracz: §2§l" + String.join(" ", args) + " §7Zakupił rangę: §2§lVIP");
			Bukkit.broadcastMessage("§7Tez chcesz taka range?");
			Bukkit.broadcastMessage("§7Wejdz na: §ehttps://sklep.subarmc.pl/");
			Bukkit.broadcastMessage(" ");
			} else {
				sender.sendMessage("§cTaka komenda nie istnieje!");
			}
	}
		if(cmd.getName().equalsIgnoreCase("itemshop-kvp")) {
			if (sender.hasPermission("subarmc.itemshop.console") || sender.isOp()) {
			Bukkit.broadcastMessage("§7Gracz: §2§l" + String.join(" ", args) + " §7Zakupił rangę: §a§lKVP");
			Bukkit.broadcastMessage("§7Tez chcesz taka range?");
			Bukkit.broadcastMessage("§7Wejdz na: §ehttps://sklep.subarmc.pl/");
			Bukkit.broadcastMessage(" ");
			} else {
				sender.sendMessage("§cTaka komenda nie istnieje!");
			}
		}
		if(cmd.getName().equalsIgnoreCase("itemshop-mvp")) {
			if (sender.hasPermission("subarmc.itemshop.console") || sender.isOp()) {
			Bukkit.broadcastMessage("§7Gracz: §2§l" + String.join(" ", args) + " §7Zakupił rangę: §6§lMVP");
			Bukkit.broadcastMessage("§7Tez chcesz taka range?");
			Bukkit.broadcastMessage("§7Wejdz na: §ehttps://sklep.subarmc.pl/");
			Bukkit.broadcastMessage(" ");
			} else {
				sender.sendMessage("§cTaka komenda nie istnieje!");
			}
		}
		if(cmd.getName().equalsIgnoreCase("itemshop-sponsor")) {
			if (sender.hasPermission("subarmc.itemshop.console") || sender.isOp()) {
			Bukkit.broadcastMessage("§7Gracz: §2§l" + String.join(" ", args) + " §7Zakupił rangę: §9§lSPONSOR");
			Bukkit.broadcastMessage("§7Tez chcesz taka range?");
			Bukkit.broadcastMessage("§7Wejdz na: §ehttps://sklep.subarmc.pl/");
			Bukkit.broadcastMessage(" ");
			} else {
				sender.sendMessage("§cTaka komenda nie istnieje!");
			}
		}
		return false;
		
	}
	
	

}
