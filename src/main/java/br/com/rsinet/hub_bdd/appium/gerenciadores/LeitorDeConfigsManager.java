package br.com.rsinet.hub_bdd.appium.gerenciadores;

import br.com.rsinet.hub_bdd.appium.provedorDeDados.LeitorDeConfigs;

public class LeitorDeConfigsManager {

	private static LeitorDeConfigsManager leitorDeConfigs_Manager = new LeitorDeConfigsManager();
	private static LeitorDeConfigs leitorDeConfigs;

	private LeitorDeConfigsManager() {
		leitorDeConfigs = new LeitorDeConfigs();
	}

	public static LeitorDeConfigsManager getInstancia() {
		return leitorDeConfigs_Manager;
	}

	public LeitorDeConfigs getLeitorDeConfigs() {
		return (leitorDeConfigs == null) ? new LeitorDeConfigs() : leitorDeConfigs;
	}
}
