package br.com.rsinet.hub_bdd.appium.screenFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class RegisterScreen_SOF {

	private AndroidDriver<MobileElement> driver;
	private WebDriverWait wait;

	public RegisterScreen_SOF(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 5);
	}

//	elementos da pagina de cadastro do aplicativo:

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement nomeUsuario;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement email;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement senha;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement confirmaSenha;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement nome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement sobrenome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement telefone;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewCountriesTitle")
	private WebElement paisDoUsuario;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText\r\n"
			+ "")
	private WebElement estado;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText\r\n"
			+ "")
	private WebElement endereco;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText\r\n"
			+ "")
	private WebElement cidade;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText\r\n"
			+ "")
	private WebElement cep;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.CheckBox[2]")
	private WebElement botaoTermos;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button\r\n"
			+ "")
	private WebElement botaoRegistrarCadastro;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/switchLocation")
	private WebElement gerarLocalAutomatico;

	@FindBy(how = How.ID, using = "com.android.packageinstaller:id/permission_allow_button")
	private WebElement allow;

	private WebElement paisDesejado(String nomeDoPais) {
		return driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ nomeDoPais + "\").instance(0))");
	}

//	ações dos elementos:

	public void preencheCampoUsuario(String usuario) {
		wait.until(ExpectedConditions.elementToBeClickable(nomeUsuario)).sendKeys(usuario);
	}

	public void preencheCampoEmail(String emailDoUsuario) {
		wait.until(ExpectedConditions.elementToBeClickable(email)).sendKeys(emailDoUsuario);
	}

	public void preencheCampoSenha(String senhaDoUsuario) {
		wait.until(ExpectedConditions.elementToBeClickable(senha)).sendKeys(senhaDoUsuario);
	}

	public void preencheCampoConfirmaSenha(String senhaDoUsuario) {
		wait.until(ExpectedConditions.elementToBeClickable(confirmaSenha)).sendKeys(senhaDoUsuario);
	}

	public void preencheCampoNome(String nomeDoUsuario) {
		wait.until(ExpectedConditions.elementToBeClickable(nome)).sendKeys(nomeDoUsuario);
	}

	public void preencheCampoSobrenome(String sobrenomeDoUsuario) {
		wait.until(ExpectedConditions.elementToBeClickable(sobrenome)).sendKeys(sobrenomeDoUsuario);
	}

	public void preencheCampoTelefone(String telefoneDoUsuario) {
		wait.until(ExpectedConditions.elementToBeClickable(telefone)).sendKeys(telefoneDoUsuario);
	}

	public void redirecionaTelaParaRegister() {
		try {
			TouchAction action = new TouchAction(driver);
			action.press(PointOption.point(941, 1723)).moveTo(PointOption.point(954, 387)).release().perform();
		} catch (Exception e) {
			TouchAction action = new TouchAction(driver);
			action.press(PointOption.point(941, 1723)).moveTo(PointOption.point(954, 387)).release().perform();
		}

//		driver.findElementByAndroidUIAutomator(
//				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
//						+ "REGISTER" + "\").instance(0))");
	}

	public void selecionaEnderecoAutomatico() {
		wait.until(ExpectedConditions.elementToBeClickable(gerarLocalAutomatico)).click();
		allow.click();
	}

	public void selecionaPais(String nomeDoPais) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(paisDoUsuario)).click();
		paisDesejado(nomeDoPais).click();
	}

	public void preencheCampoEstado(String estadoOuProvincia) {
		wait.until(ExpectedConditions.elementToBeClickable(estado)).sendKeys(estadoOuProvincia);
	}

	public void preencheCampoEndereco(String enderecoDoUsuario) {
		wait.until(ExpectedConditions.elementToBeClickable(endereco)).sendKeys(enderecoDoUsuario);
	}

	public void preencheCampoCidade(String cidadeDoUsuario) {
		wait.until(ExpectedConditions.elementToBeClickable(cidade)).sendKeys(cidadeDoUsuario);
	}

	public void preencheCampoCep(String cepDoUsuario) {
		wait.until(ExpectedConditions.elementToBeClickable(cep)).sendKeys(cepDoUsuario);
	}

	public void submeteCadastro() {
		try {
			botaoRegistrarCadastro.click();
		} catch (Exception e) {
			botaoRegistrarCadastro.click();
		}
	}

	public void rolarPaginaParaEndereco() {
		try {
			TouchAction action = new TouchAction(driver);
			action.press(PointOption.point(860, 1400)).moveTo(PointOption.point(814, 400)).release().perform();
		} catch (Exception e) {
			TouchAction action = new TouchAction(driver);
			action.press(PointOption.point(860, 1400)).moveTo(PointOption.point(814, 400)).release().perform();
		}

//		driver.findElementByAndroidUIAutomator(
//				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
//						+ nomeDoPais + "\").instance(0))");
	}
}