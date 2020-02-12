package br.com.rsinet.hub_bdd.appium.gerenciadores;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AndroidDriverManager {

	private AndroidDriver<MobileElement> driver;

	public AndroidDriver<MobileElement> iniciaApp() throws Exception {
		if (driver == null) {

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "DrGusPhone1");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("appPackage", "com.Advantage.aShopping");
			capabilities.setCapability("appActivity", ".SplashActivity");
			capabilities.setCapability("newCommandTimeOut", "120");
			URL url = new URL("http://127.0.0.1:4723/wd/hub");

			driver = new AndroidDriver<MobileElement>(url, capabilities);

		}
		return driver;
	}

	public AndroidDriver<MobileElement> encerra() {
		if (driver != null) {
			driver.quit();
		}
		return driver = null;
	}
}
