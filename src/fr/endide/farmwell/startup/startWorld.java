package fr.endide.farmwell.startup;

import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.event.Listener;

import fr.endide.farmwell.Main;

public class startWorld implements Listener {
	private Main main;
	public startWorld(Main main) {
		this.main = main;
	}

	public void onEnable() {
	    if(main.getConfig().getString("core.world.create") != null) {
	    	WorldCreator wc_void = new WorldCreator("farwellWorld");
			wc_void.environment(World.Environment.NORMAL);
			wc_void.type(WorldType.NORMAL);
			wc_void.generator("VoidGenerator");
			wc_void.createWorld();
	    	
	    }
		}
	}

