package TestProjectSelenium.TestProjectSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseDriver {
	private WebDriver driver = null;

	public WebDriver criarWebDriverFirefox() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		setDriver(new FirefoxDriver());
		return getDriver();
	}

	public WebDriver criarWebDriverChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		setDriver(new ChromeDriver());
		return getDriver();
	}

	public WebDriver criarWebDriverEdge() {
		System.setProperty("webdriver.edge.driver", "C:\\MicrosoftWebDriver.exe");
		setDriver(new EdgeDriver());
		return getDriver();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
