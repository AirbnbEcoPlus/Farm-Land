package fr.endide.farmwell;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

import fr.endide.farmwell.commands.fwCreate;
import fr.endide.farmwell.commands.fwCreateListen;
import fr.endide.farmwell.commands.fwDelete;
import fr.endide.farmwell.commands.fwDeleteListen;
import fr.endide.farmwell.commands.fwMarketplace;
import fr.endide.farmwell.commands.fwMarketplaceListen;
import fr.endide.farmwell.commands.fwMenu;
import fr.endide.farmwell.commands.fwMenuListen;
import fr.endide.farmwell.commands.fwShop;
import fr.endide.farmwell.commands.fwShopListen;
import fr.endide.farmwell.commands.fwStats;
import fr.endide.farmwell.commands.fwStatsListen;
import fr.endide.farmwell.commands.fwUpgrades;
import fr.endide.farmwell.commands.fwUpgradesListen;
import fr.endide.farmwell.commands.fwaDelete;
import fr.endide.farmwell.commands.fwaDeleteListen;
import fr.endide.farmwell.commands.fwaResetMoney;
import fr.endide.farmwell.commands.fwaResetMoneyListen;
import fr.endide.farmwell.commands.fwaResetStats;
import fr.endide.farmwell.commands.fwaResetStatsListen;
import fr.endide.farmwell.event.eventPrice;
import fr.endide.farmwell.event.eventSeason;
import fr.endide.farmwell.startup.startLicense;
import fr.endide.farmwell.startup.startWorld;



public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		saveDefaultConfig();
		System.out.println("Merci d'utiliser le plugin FarmWell");
		getCommand("fw create").setExecutor(new fwCreate());
		getCommand("fw delete").setExecutor(new fwDelete());
		getCommand("fw menu").setExecutor(new fwMenu());
		getCommand("fw shop").setExecutor(new fwShop());
		getCommand("fw upgrades").setExecutor(new fwUpgrades());
		getCommand("fw marketplace").setExecutor(new fwMarketplace());
		getCommand("fw stats").setExecutor(new fwStats());
		getCommand("fwa delete").setExecutor(new fwaDelete());
		getCommand("fwa resetstats").setExecutor(new fwaResetStats());
		getCommand("fwa resetmoney").setExecutor(new fwaResetMoney());
		getServer().getPluginManager().registerEvents(new fwCreateListen(), this);
		getServer().getPluginManager().registerEvents(new fwDeleteListen(), this);
		getServer().getPluginManager().registerEvents(new fwMarketplaceListen(), this);
		getServer().getPluginManager().registerEvents(new fwMenuListen(), this);
		getServer().getPluginManager().registerEvents(new fwShopListen(), this);
		getServer().getPluginManager().registerEvents(new fwStatsListen(), this);
		getServer().getPluginManager().registerEvents(new fwUpgradesListen(), this);
		
		getServer().getPluginManager().registerEvents(new fwaDeleteListen(), this);
		getServer().getPluginManager().registerEvents(new fwaResetStatsListen(), this);
		getServer().getPluginManager().registerEvents(new fwaResetMoneyListen(), this);
		
		getServer().getPluginManager().registerEvents(new eventPrice(), this);
		getServer().getPluginManager().registerEvents(new eventSeason(), this);
		
		getServer().getPluginManager().registerEvents(new startLicense(this), this);
		getServer().getPluginManager().registerEvents(new startWorld(this), this);





		
		
		
		
	}
	


}