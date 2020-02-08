package br.com.rsinet.hub_bdd.appium.contextos;

import java.net.MalformedURLException;

import br.com.rsinet.hub_bdd.appium.gerenciadores.AndroidDriverManager;
import br.com.rsinet.hub_bdd.appium.gerenciadores.ScreenObjectManager;

public class ContextoDeTeste {

	private ScreenObjectManager screenObjectManager;
	private AndroidDriverManager androidDriverManager;

	public ContextoDeTeste() throws MalformedURLException {
		androidDriverManager = new AndroidDriverManager();
		screenObjectManager = new ScreenObjectManager(androidDriverManager.driverOn());
	}

	public AndroidDriverManager getAndroidDriverManager() {
		return androidDriverManager;
	}

	public ScreenObjectManager getScreenObjectManager() {
		return screenObjectManager;
	}
}
