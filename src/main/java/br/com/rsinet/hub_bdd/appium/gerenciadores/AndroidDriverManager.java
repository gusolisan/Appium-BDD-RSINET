package br.com.rsinet.hub_bdd.appium.gerenciadores;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AndroidDriverManager {

	private AndroidDriver<MobileElement> driver;
	private DesiredCapabilities caps;

	public AndroidDriverManager() {
		caps = new DesiredCapabilities();
	}

	public AndroidDriver<MobileElement> driverOn() throws MalformedURLException {
		if (driver == null) {
			caps.setCapability("deviceName",
					LeitorDeConfigsManager.getInstancia().getLeitorDeConfigs().getCapability_nomeDoAparelho());
			caps.setCapability("platformVersion",
					LeitorDeConfigsManager.getInstancia().getLeitorDeConfigs().getCapability_versaoDaPlataforma());
			caps.setCapability("platformName",
					LeitorDeConfigsManager.getInstancia().getLeitorDeConfigs().getCapability_nomeDaPlataforma());
			caps.setCapability("appPackage",
					LeitorDeConfigsManager.getInstancia().getLeitorDeConfigs().getCapability_capsPacoteDoApp());
			caps.setCapability("appActivity",
					LeitorDeConfigsManager.getInstancia().getLeitorDeConfigs().getCapability_capsAtividadeDoApp());
			caps.setCapability("newCommandTimeOut",
					LeitorDeConfigsManager.getInstancia().getLeitorDeConfigs().getCapability_capsComandoDeEspera());

			driver = new AndroidDriver<MobileElement>(
					new URL(LeitorDeConfigsManager.getInstancia().getLeitorDeConfigs().getCapability_servidor()), caps);
			driver.manage().timeouts().implicitlyWait(
					LeitorDeConfigsManager.getInstancia().getLeitorDeConfigs().getImplicitlyWait(), TimeUnit.SECONDS);
		}
		return driver;
	}

	public AndroidDriver<MobileElement> driverOff() {
		if (driver != null) {
			driver.quit();
		}
		return driver = null;
	}
}