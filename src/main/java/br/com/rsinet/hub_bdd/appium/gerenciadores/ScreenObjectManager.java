package br.com.rsinet.hub_bdd.appium.gerenciadores;

import br.com.rsinet.hub_bdd.appium.screenFactory.HomeScreen_SOF;
import br.com.rsinet.hub_bdd.appium.screenFactory.ProductScreen_SOF;
import br.com.rsinet.hub_bdd.appium.screenFactory.RegisterScreen_SOF;
import br.com.rsinet.hub_bdd.appium.screenFactory.SearchScreen_SOF;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ScreenObjectManager {

	private AndroidDriver<MobileElement> driver;
	private HomeScreen_SOF homeScreen;
	private RegisterScreen_SOF registerScreen;
	private SearchScreen_SOF searchScreen;
	private ProductScreen_SOF productScreen;

	public ScreenObjectManager(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}

	public HomeScreen_SOF getHomePage() {
		return (homeScreen == null) ? homeScreen = new HomeScreen_SOF(driver) : homeScreen;
	}

	public RegisterScreen_SOF getRegisterPage() {
		return (registerScreen == null) ? registerScreen = new RegisterScreen_SOF(driver) : registerScreen;
	}

	public SearchScreen_SOF getSearchPage() {
		return (searchScreen == null) ? searchScreen = new SearchScreen_SOF(driver) : searchScreen;
	}

	public ProductScreen_SOF getProductPage() {
		return (productScreen == null) ? productScreen = new ProductScreen_SOF(driver) : productScreen;
	}

}