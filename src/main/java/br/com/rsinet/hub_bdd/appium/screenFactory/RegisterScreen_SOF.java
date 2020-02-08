package br.com.rsinet.hub_bdd.appium.screenFactory;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class RegisterScreen_SOF {

	private AndroidDriver<MobileElement> driver;
	private WebDriverWait wait;

	public RegisterScreen_SOF(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 5);
	}

//	elementos da pagina de cadastro do aplicativo:

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement nomeUsuario;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement email;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement senha;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement confirmaSenha;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText")
	private MobileElement nome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")
	private MobileElement sobrenome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement telefone;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]")
	private MobileElement pais;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement estado;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement endereco;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText")
	private MobileElement cidade;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText")
	private MobileElement cep;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.CheckBox[2]")
	private MobileElement botaoTermos;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
	private MobileElement botaoRegistrarCadastro;

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

	public void rolarTelaAteDeterminadaPosicao(String posicao) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ posicao + "\").instance(0))");
	}

	public void selecionaPais(String nomeDoPais) {
		wait.until(ExpectedConditions.elementToBeClickable(pais)).click();
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ nomeDoPais + "\").instance(0))")
				.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(botaoRegistrarCadastro)).click();
	}
}