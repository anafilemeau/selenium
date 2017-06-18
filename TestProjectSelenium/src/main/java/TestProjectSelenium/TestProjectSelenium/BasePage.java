package TestProjectSelenium.TestProjectSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BasePage extends BaseDriver {

	public void acessarURL(WebDriver driver, String url) {
		driver.get(url);
	}

	public void aguardarCarregarPagina(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void fecharPagina(WebDriver driver) {
		driver.quit();
	}

}
