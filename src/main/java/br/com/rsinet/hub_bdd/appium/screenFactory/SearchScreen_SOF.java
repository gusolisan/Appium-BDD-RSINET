package br.com.rsinet.hub_bdd.appium.screenFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SearchScreen_SOF {

	private WebDriverWait wait;

	public SearchScreen_SOF(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}

//	elementos da pagina de cadastro do aplicativo:

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewProductName")
	private WebElement primeiroProduto;

	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Headphones\"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")
	private WebElement botaoFiltro;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView")
	private WebElement filtroCompatibilidade;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView")
	private WebElement filtroCompatibilidade_AcrossAllDevices;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[3]")
	private WebElement applyFiltro;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.TextView\r\n"
			+ "")
	private WebElement filtroConnector;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.TextView\r\n"
			+ "")
	private WebElement filtroConnector_Bluetooth;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView")
	private WebElement nomeDoProdutoNaTelaDeCompra;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")
	private WebElement botaoAdicionaAoCarrinho;

//	ações dos elementos:

	public String nomePrimeiroProduto() {
		return wait.until(ExpectedConditions.elementToBeClickable(primeiroProduto)).getText();
	}

	public void clicaPrimeiroProduto() {
		wait.until(ExpectedConditions.elementToBeClickable(primeiroProduto)).click();
	}

	public void clicaFiltro() {
		wait.until(ExpectedConditions.visibilityOf(primeiroProduto));
		wait.until(ExpectedConditions.elementToBeClickable(botaoFiltro)).click();
	}

	public void clicaFiltroCompatibilidade() {
		wait.until(ExpectedConditions.elementToBeClickable(filtroCompatibilidade)).click();
	}

	public void clicaFiltroCompatibilidade_AcrossAllDevices() {
		wait.until(ExpectedConditions.elementToBeClickable(filtroCompatibilidade_AcrossAllDevices)).click();
	}

	public void clicaFiltroConnector() {
		wait.until(ExpectedConditions.elementToBeClickable(filtroConnector)).click();
	}

	public void clicaFiltroConnector_Bluetooth() {
		wait.until(ExpectedConditions.elementToBeClickable(filtroConnector_Bluetooth)).click();
	}

	public void clicaApplyFiltro() {
		wait.until(ExpectedConditions.elementToBeClickable(applyFiltro)).click();
	}

	public void clicaBotaoAdicionaAoCarrinho() {
		wait.until(ExpectedConditions.elementToBeClickable(botaoAdicionaAoCarrinho)).click();
	}
	
//	Metodos para asserts:

	public boolean mensagemProdutoNaoEncontradoAparece() {
		return wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "No results" + "\").instance(0))")))
				.isDisplayed();
	}

	public boolean produtoApareceNaTela(String produto) {
		return wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ produto + "\").instance(0))")))
				.isDisplayed();
	}

	public String nomeDoProdutoNaTela() {
		return nomeDoProdutoNaTelaDeCompra.getText();
	}
}