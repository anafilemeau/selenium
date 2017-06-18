package TestProjectSelenium.TestProjectSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

public class LoginPage extends BasePage {

	public void realizarLogin(WebDriver driver, String username, String password) {
		driver.findElement(By.xpath(".//*[@id='eml']")).sendKeys(username);
		driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='entrar']")).click();
	}

	public void validarPaginaLogin(WebDriver driver) {
		String email = driver.findElement(By.xpath(".//*[@id='welcome']/div[1]/p[2]")).getText();
		assertEquals("ana.delprado@uol.com.br", email);
	}

	public void realizarLogout(WebDriver driver) {
		driver.findElement(By.xpath(".//*[@id='welcome']/div[4]")).click();
	}
}
