package br.com.rsinet.hub_bdd.appium.screenFactory;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HomeScreen_SOF {

	private WebDriverWait wait;

	public HomeScreen_SOF(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 10);
	}

//	elementos da pagina principal do aplicativo:

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[1]")
	private MobileElement menu;

	@FindBy(how = How.XPATH, using = "//android.support.v4.widget.DrawerLayout[@content-desc=\"Main Menu\"]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView")
	private MobileElement menuDoUsuario;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]")
	private MobileElement botaoDeCadastro;

	@FindBy(how = How.XPATH, using = "//android.support.v4.widget.DrawerLayout[@content-desc=\"Main Menu\"]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]")
	private MobileElement botaoDeslogar;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]")
	private MobileElement confirmaDeslog;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/editTextSearch")
	private MobileElement campoDePesquisa;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewSearch")
	private MobileElement botaoPesquisar;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView")
	private MobileElement botaoHeadphones;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView")
	private MobileElement botaoLaptop;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.ImageView")
	private MobileElement botaoTablets;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.ImageView")
	private MobileElement botaoMice;

//	ações dos elementos:

	public void clicaMenu() {
		wait.until(ExpectedConditions.elementToBeClickable(menu)).click();
	}

	public void clicaMenuDoUsuario() {
		wait.until(ExpectedConditions.elementToBeClickable(menuDoUsuario)).click();
	}

	public void clicaBotaoDeCadastro() {
		wait.until(ExpectedConditions.elementToBeClickable(botaoDeCadastro)).click();
	}

	public void clicaBotaoDeslogar() {
		wait.until(ExpectedConditions.elementToBeClickable(botaoDeslogar)).click();
	}

	public void clicaConfirmaDeslog() {
		wait.until(ExpectedConditions.elementToBeClickable(confirmaDeslog)).click();
	}

	public void insereNoCampoDePesquisa(String pesquisa) {
		wait.until(ExpectedConditions.elementToBeClickable(campoDePesquisa)).sendKeys(pesquisa);
	}

	public void clicaBotaoPesquisar() {
		wait.until(ExpectedConditions.elementToBeClickable(botaoPesquisar)).click();
	}

	public void clicaBotaoLaptop() {
		wait.until(ExpectedConditions.elementToBeClickable(botaoLaptop)).click();
	}

	public void clicaBotaoHeadphones() {
		wait.until(ExpectedConditions.elementToBeClickable(botaoHeadphones)).click();
	}

	public void clicaBotaoTablets() {
		wait.until(ExpectedConditions.elementToBeClickable(botaoTablets)).click();
	}

	public void clicaBotaoMice() {
		wait.until(ExpectedConditions.elementToBeClickable(botaoMice)).click();
	}

//	Métodos para asserts:

	public boolean usuarioEstaLogado() {
		return botaoDeslogar.isEnabled();
	}

	public boolean menuDeLoginContinuaAtivo() {
		return menuDoUsuario.isEnabled();
	}
}
