package br.com.rsinet.hub_bdd.appium.gerenciadores;

import br.com.rsinet.hub_bdd.appium.screenFactory.HomeScreen_SOF;
import br.com.rsinet.hub_bdd.appium.screenFactory.LoginScreen_SOF;
import br.com.rsinet.hub_bdd.appium.screenFactory.ProductScreen_SOF;
import br.com.rsinet.hub_bdd.appium.screenFactory.RegisterScreen_SOF;
import br.com.rsinet.hub_bdd.appium.screenFactory.SearchScreen_SOF;
import io.appium.java_client.android.AndroidDriver;

public class ScreenObjectManager {

	private AndroidDriver driver;
	private HomeScreen_SOF homeScreen;
	private RegisterScreen_SOF registerScreen;
	private SearchScreen_SOF searchScreen;
	private ProductScreen_SOF productScreen;
	private LoginScreen_SOF loginScreen;

	public ScreenObjectManager(AndroidDriver androidDriver) {
		this.driver = androidDriver;
	}


	public HomeScreen_SOF getHomeScreen() {
		return (homeScreen == null) ? homeScreen = new HomeScreen_SOF(driver) : homeScreen;
	}

	public RegisterScreen_SOF getRegisterScreen() {
		return (registerScreen == null) ? registerScreen = new RegisterScreen_SOF(driver) : registerScreen;
	}

	public SearchScreen_SOF getSearchScreen() {
		return (searchScreen == null) ? searchScreen = new SearchScreen_SOF(driver) : searchScreen;
	}

	public ProductScreen_SOF getProductScreen() {
		return (productScreen == null) ? productScreen = new ProductScreen_SOF(driver) : productScreen;
	}

	public LoginScreen_SOF getLoginScreen() {
		return (loginScreen == null) ? loginScreen = new LoginScreen_SOF(driver) : loginScreen;
	}

}