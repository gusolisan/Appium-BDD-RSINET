package br.com.rsinet.hub_bdd.appium.screenFactory;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ProductScreen_SOF {

	private WebDriverWait wait;
	
	public ProductScreen_SOF(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 5);
	}

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView")
	private MobileElement nomeDoProdutoNaTelaDeCompra;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button") 
	private MobileElement botaoAdicionaAoCarrinho;
	
	public void clicaBotaoAdicionaAoCarrinho() {
		wait.until(ExpectedConditions.elementToBeClickable(botaoAdicionaAoCarrinho)).click();
	}
	
	public String nomeDoProdutoNaTela() {
		return nomeDoProdutoNaTelaDeCompra.getText();
	}
}
