package fr.endide.farmwell.startup;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.endide.farmwell.Main;

public class startLicense implements Listener {
	private Main main;
	public startLicense(Main main) {
		this.main = main;
	}

	public void onJoin(PlayerJoinEvent event) {
		if(main.getConfig() != null) {
			
		}
	}

}
