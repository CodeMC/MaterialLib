package it.feargames.materiallib;

import it.feargames.materiallib.data.CrossMaterial;
import it.feargames.materiallib.services.ServerService;
import org.bukkit.plugin.Plugin;

import java.util.logging.Logger;

public class MaterialLib {
	private final Plugin plugin;
	private final Logger logger;
	private ServerService serverService;

	public MaterialLib(Plugin plugin) {
		this.plugin = plugin;
		this.logger = plugin.getLogger();
		this.serverService = new ServerService(logger, plugin.getServer());
	}

	public void initialize() {
		CrossMaterial.initialize(logger, serverService.getVersion());
	}
}
