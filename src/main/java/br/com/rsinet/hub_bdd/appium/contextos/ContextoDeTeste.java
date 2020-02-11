package br.com.rsinet.hub_bdd.appium.contextos;

import br.com.rsinet.hub_bdd.appium.gerenciadores.AndroidDriverManager;
import br.com.rsinet.hub_bdd.appium.gerenciadores.ScreenObjectManager;

public class ContextoDeTeste {

	private ScreenObjectManager screenObjectManager;
	private AndroidDriverManager androidDriverManager;
	private ContextoDeCenario contextoDeCenario;

	public ContextoDeTeste() throws Exception {
		androidDriverManager = new AndroidDriverManager();
		screenObjectManager = new ScreenObjectManager(androidDriverManager.iniciaApp());
		contextoDeCenario = new ContextoDeCenario();
	}

	public AndroidDriverManager getAndroidDriverManager() {
		return androidDriverManager;
	}

	public ScreenObjectManager getScreenObjectManager() {
		return screenObjectManager;
	}

	public ContextoDeCenario getContextoDeCenario() {
		return contextoDeCenario;
	}
}