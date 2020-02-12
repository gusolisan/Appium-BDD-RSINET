package br.com.rsinet.hub_bdd.appium.stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import br.com.rsinet.hub_bdd.appium.contextos.ContextoDeTeste;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	private ContextoDeTeste contextoDeTeste;

	public Hooks(ContextoDeTeste contexto) {
		this.contextoDeTeste = contexto;
	}

	@Before
	public void startConfigsDeTeste() throws Exception {
		contextoDeTeste.getAndroidDriverManager().iniciaApp();
		Reporter.addScenarioLog("Driver gerado e acionado ao app");
	}

	@After(order = 1)
	public void afterCenario(Scenario scenario) throws Exception {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		try {
			File sourcePath = ((TakesScreenshot) contextoDeTeste.getAndroidDriverManager().iniciaApp())
					.getScreenshotAs(OutputType.FILE);

			File destinationPath = new File(
					System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");

			Files.copy(sourcePath, destinationPath);

			Reporter.addScreenCaptureFromPath(destinationPath.toString());
		} catch (IOException e) {
			System.out.println("Houve problemas ao copiar a captura de tela e envia-la para o report.html");
		}
	}

	@After(order = 0)
	public void endConfigsDeTeste() throws Exception {
		contextoDeTeste.getAndroidDriverManager().encerra();
		Reporter.addScenarioLog("Aplicação Web é encerrada");
	}
}