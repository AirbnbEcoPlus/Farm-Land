package fr.endide.farmwell.startup;

import org.bukkit.World;
import org.bukkit.WorldBorder;
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
	    if(main.getConfig().get("core.world.create") != null) {
	    	WorldCreator world = new WorldCreator("farwellWorld");
			world.environment(World.Environment.NORMAL);
			world.type(WorldType.NORMAL);
			world.createWorld();
			WorldBorder border = ((World) world).getWorldBorder();
			border.setSize(10000.0);
			border.setCenter(0.0, 0.0);
			main.getConfig().set("core.world.create", "true");
	    }
		}
	}

