package br.com.rsinet.hub_bdd.appium.stepDefinitions;

import br.com.rsinet.hub_bdd.appium.contextos.ContextoDeTeste;
import br.com.rsinet.hub_bdd.appium.screenFactory.LoginScreen_SOF;
import cucumber.api.java.pt.Quando;

public class LoginScreen_Steps {

	private LoginScreen_SOF loginScreen;

	public LoginScreen_Steps(ContextoDeTeste contexto) {
		loginScreen = contexto.getScreenObjectManager().getLoginScreen();
	}
	
	@Quando("^tocar na opcao de realizar um novo cadastro$")
	public void tocar_na_opcao_de_realizar_um_novo_cadastro() throws Throwable {
		loginScreen.clicaBotaoDeCadastro();
	}
	
}