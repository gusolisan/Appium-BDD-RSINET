package br.com.rsinet.hub_bdd.appium.stepDefinitions;

import static org.junit.Assert.assertEquals;

import br.com.rsinet.hub_bdd.appium.contextos.ContextoDeTeste;
import br.com.rsinet.hub_bdd.appium.enums.Contexto;
import br.com.rsinet.hub_bdd.appium.screenFactory.ProductScreen_SOF;
import cucumber.api.java.pt.Quando;

public class ProductScreen_Steps {

	private ContextoDeTeste contexto;
	private ProductScreen_SOF productScreen;
	
	public ProductScreen_Steps(ContextoDeTeste contexo) {
		productScreen = contexo.getScreenObjectManager().getProductScreen();
	}
	
	
}
