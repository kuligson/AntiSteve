package pl.filippop1.jebacnonpremium;

import java.util.logging.Level;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class JebacNonPremium extends JavaPlugin {
	@Override
	public void onEnable() {
		if (Bukkit.getOnlineMode()) {
			this.getLogger().log(Level.INFO, "#################");
			this.getLogger().log(Level.INFO, "# ANTY STEVE ON #");
			this.getLogger().log(Level.INFO, "#################");
		} else {
			for (int i = 0; i < 80; i++) {
				this.getLogger().log(Level.INFO, "");
				this.getLogger().log(Level.INFO, "#########################################");
				this.getLogger().log(Level.INFO, "#             NON PREMIUM!?             #");
				this.getLogger().log(Level.INFO, "#########################################");
				this.getLogger().log(Level.INFO, "#            WYLACZAM SERWER            #");
				this.getLogger().log(Level.INFO, "#             Kup Minecraft:            #");
				this.getLogger().log(Level.INFO, "# https://minecraft.net/store/minecraft #");
				this.getLogger().log(Level.INFO, "#########################################");
			}
			this.getServer().shutdown();
		}
	}
	
	@Override
	public void onDisable() {
		if (Bukkit.getOnlineMode()) {
			this.getLogger().log(Level.INFO, "##################");
			this.getLogger().log(Level.INFO, "# ANTY STEVE OFF #");
			this.getLogger().log(Level.INFO, "##################");
		}
	}
}
