package br.com.rsinet.hub_bdd.appium.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import br.com.rsinet.hub_bdd.appium.contextos.ContextoDeTeste;
import br.com.rsinet.hub_bdd.appium.screenFactory.SearchScreen_SOF;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class SearchScreen_Steps {

	private SearchScreen_SOF searchScreen;
	private ContextoDeTeste contexto;
	private String nomeDoProduto;
	
	public SearchScreen_Steps(ContextoDeTeste contexto) {
		searchScreen = contexto.getScreenObjectManager().getSearchScreen();
	}
	
	@Quando("^tocar no filtro$")
	public void tocar_no_filtro() throws Throwable {
		searchScreen.clicaFiltro();
	}

	@Quando("^selecionar uma determinada preferencia de produtos$")
	public void selecionar_uma_determinada_preferencia_de_produtos() throws Throwable {
		searchScreen.clicaFiltroCompatibilidade();
		searchScreen.clicaFiltroCompatibilidade_AcrossAllDevices();
	}

	@Quando("^tocar para filtrar$")
	public void tocar_para_filtrar() throws Throwable {
		searchScreen.clicaApplyFiltro();
	}

	@Entao("^deve encontrar o produto desejado na tela pesquisa$")
	public void deve_encontrar_o_produto_desejado_na_tela_pesquisa() throws Throwable {
		nomeDoProduto = searchScreen.nomePrimeiroProduto();
		searchScreen.clicaPrimeiroProduto();
		System.out.println(nomeDoProduto);
	}
	
	@Quando("^ser correspondente ao mesmo na tela de produto$")
	public void ser_correspondente_ao_mesmo_na_tela_de_produto() throws Throwable {
		assertEquals(nomeDoProduto, searchScreen.nomeDoProdutoNaTela());
	}

	@Quando("^selecionar duas determinadas preferencias de produtos$")
	public void selecionar_duas_determinadas_preferencias_de_produtos() throws Throwable {
		searchScreen.clicaFiltroCompatibilidade();
		searchScreen.clicaFiltroCompatibilidade_AcrossAllDevices();
		searchScreen.clicaFiltroConnector();
		searchScreen.clicaFiltroConnector_Bluetooth();
	}

	@Entao("^nao deve encontrar produto algum$")
	public void nao_deve_encontrar_produto_algum() throws Throwable {
		assertTrue(searchScreen.mensagemProdutoNaoEncontradoAparece());
	}
	
	@Entao("^o \"([^\"]*)\" desejado aparece na tela de pesquisa$")
	public void o_desejado_aparece_na_tela_de_pesquisa(String produtoExistente) throws Throwable {
		assertEquals(produtoExistente, searchScreen.nomePrimeiroProduto());
	}

	@Entao("^o produto inexistente desejado nao aparece na tela$")
	public void o_desejado_nao_aparece_na_tela(String produtoInexistente) throws Throwable {
		
	}
}