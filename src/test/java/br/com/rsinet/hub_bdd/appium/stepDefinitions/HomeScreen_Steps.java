package br.com.rsinet.hub_bdd.appium.stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import br.com.rsinet.hub_bdd.appium.contextos.ContextoDeTeste;
import br.com.rsinet.hub_bdd.appium.screenFactory.HomeScreen_SOF;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class HomeScreen_Steps {

	private HomeScreen_SOF homeScreen;
	private ContextoDeTeste contexto;
	
	public HomeScreen_Steps(ContextoDeTeste contexto) throws MalformedURLException {
		this.contexto = contexto;
		homeScreen = contexto.getScreenObjectManager().getHomeScreen();
		
	}

	@Dado("^usuario esta na tela principal$")
	public void usuario_esta_na_tela_principal() throws Throwable {
		contexto.getAndroidDriverManager().iniciaDriver();
	}

	@Quando("^tocar no menu do aplicativo$")
	public void tocar_no_menu_do_aplicativo() throws Throwable {
		homeScreen.clicaMenu();
	}

	@Quando("^tocar no menu de login$")
	public void tocar_no_menu_de_login() throws Throwable {
		homeScreen.clicaMenuDoUsuario();
	}
	
	@Entao("^estara cadastrado e ja logado no sistema$")
	public void estara_cadastrado_e_ja_logado_no_sistema() throws Throwable {
		homeScreen.clicaMenu();
		assertTrue(homeScreen.usuarioEstaLogado());
	}

	@Entao("^mensagem de usuario ja existente aparecera$")
	public void mensagem_de_usuario_ja_existente_aparecera() throws Throwable {
		homeScreen.clicaMenu();
		assertTrue(homeScreen.menuDeLoginContinuaAtivo());
	}
	
}