package TestProjectSelenium.TestProjectSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest {
	
	String url = "https://pagseguro.uol.com.br/";
	String username = "ana.delprado@uol.com.br";
	String password = "or54wef3";
	LoginPage pagelogin;
	BasePage page;
	WebDriver controlpage;

	@Before
	public void beforeTest() {
		page = new BasePage();
		pagelogin = new LoginPage();
		controlpage = page.criarWebDriverFirefox();
	}

	@Test
	public void testApp01() {
		page.acessarURL(controlpage, url);
		page.aguardarCarregarPagina(controlpage);
		pagelogin.realizarLogin(controlpage, username, password);
		page.aguardarCarregarPagina(controlpage);
		pagelogin.validarPaginaLogin(controlpage);
		pagelogin.realizarLogout(controlpage);
	}

	@After
	public void afterTest() {
		page.fecharPagina(controlpage);
	}

}
