package TestProjectSelenium.TestProjectSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest {
	
	String url = "https://pagseguro.uol.com.br/";
	String username = "ana.delprado@uol.com.br";
	String password = "******";
	LoginPage pagelogin;
	BasePage page;
	WebDriver controlpage;

	@Before
	public void setUp() {
		page = new BasePage();
		pagelogin = new LoginPage();
		controlpage = page.criarWebDriverFirefox();
	}

	@Test
	public void validaLoginUsuarioPagSeguro() {
		page.acessarURL(controlpage, url);
		page.aguardarCarregarPagina(controlpage);
		pagelogin.realizarLogin(controlpage, username, password);
		page.aguardarCarregarPagina(controlpage);
		pagelogin.validarPaginaLogin(controlpage);
		pagelogin.realizarLogout(controlpage);
	}

	@After
	public void tearDown() {
		page.fecharPagina(controlpage);
	}

}
