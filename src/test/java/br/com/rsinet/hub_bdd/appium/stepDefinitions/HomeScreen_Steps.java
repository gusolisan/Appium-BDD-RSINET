package br.com.rsinet.hub_bdd.appium.stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import com.cucumber.listener.Reporter;

import br.com.rsinet.hub_bdd.appium.contextos.ContextoDeTeste;
import br.com.rsinet.hub_bdd.appium.screenFactory.HomeScreen_SOF;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class HomeScreen_Steps {

	private HomeScreen_SOF homeScreen;

	public HomeScreen_Steps(ContextoDeTeste contexto) throws MalformedURLException {
		homeScreen = contexto.getScreenObjectManager().getHomeScreen();
	}

	@Dado("^usuario esta na tela principal$")
	public void usuario_esta_na_tela_principal() throws Throwable {
		Reporter.addStepLog("Aplicacao Mobile iniciada");
	}

	@Quando("^usuario tocar na categoria Headphones$")
	public void usuario_tocar_na_categoria_Headphones() throws Throwable {
		homeScreen.clicaBotaoHeadphones();
		Reporter.addStepLog("Botao Headphones tocado");
	}

	@Quando("^tocar no menu do aplicativo$")
	public void tocar_no_menu_do_aplicativo() throws Throwable {
		homeScreen.clicaMenu();
		Reporter.addStepLog("Menu do app acionado");
	}

	@Quando("^tocar no menu de login$")
	public void tocar_no_menu_de_login() throws Throwable {
		homeScreen.clicaMenuDoUsuario();
		Reporter.addStepLog("Menu do usuario/Menu de login acionado");
	}

	@Entao("^estara cadastrado e ja logado no sistema$")
	public void estara_cadastrado_e_ja_logado_no_sistema() throws Throwable {
		homeScreen.clicaMenu();
		assertTrue(homeScreen.usuarioEstaLogado());
		Reporter.addStepLog("Usuario cadastrado e logado");
	}

	@Entao("^mensagem de usuario ja existente aparecera$")
	public void mensagem_de_usuario_ja_existente_aparecera() throws Throwable {
		homeScreen.clicaMenu();
		assertTrue(homeScreen.menuDeLoginContinuaAtivo());
		Reporter.addStepLog("Cadastro nao realizado e usuario nao logado");
	}

	@Quando("^inserir o \"([^\"]*)\" desejado no campo de pesquisa$")
	public void inserir_o_desejado_no_campo_de_pesquisa(String produtoExistente) throws Throwable {
		homeScreen.insereNoCampoDePesquisa(produtoExistente);
		Reporter.addStepLog("Inserido produto desejado: " + produtoExistente);
	}

	@Quando("^inserir o \"([^\"]*)\" no campo de pesquisa$")
	public void inserir_o_no_campo_de_pesquisa(String produtoInexistente) throws Throwable {
		homeScreen.insereNoCampoDePesquisa(produtoInexistente);
		Reporter.addStepLog("Inserido produto desejado: " + produtoInexistente);
	}

	@Quando("^executar a pesquisa$")
	public void executar_a_pesquisa() throws Throwable {
		homeScreen.clicaBotaoPesquisar();
		Reporter.addStepLog("Pesquisa executada");
	}

}