package pageObject;


import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Este  o construtor
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//ELEMENTOS
	@FindBy(id = "txtUsername")
	private WebElement campoUser;
	
	@FindBy(id = "txtPassword")
	private WebElement campoPassword;
	
	@FindBy(id = "btnLogin")
	private WebElement botaoLogin;
	
	@FindBy(id = "spanMessage")
	private WebElement mensagemLogin;
	
	@FindBy(id = "welcome")
	private WebElement usuarioLogado;
	
	
	//METODOS
	public void informarCampoUser(String nomeUsuario) {
		campoUser.sendKeys(nomeUsuario);
	//driver.findElement(By.id("txtUsername")).sendKeys("asdsd");
	}
	
	public void informarCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}
	
	public void acionarBotaoLogin() {
		botaoLogin.click();
	}
	
	public void validarMensagemLogin(String msgEsperada) {
		assertEquals(msgEsperada, mensagemLogin.getText());
	}
	
	public void validarUsuarioLogado() {
		assertEquals("Welcome Admin", usuarioLogado.getText());
	}
	
	public void fazerLogin() {
		informarCampoUser("Admin");
		informarCampoPassword("admin123");
		acionarBotaoLogin();
	}

}

//
//import static org.junit.Assert.assertEquals;
//import static utils.Utils.driver;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class LoginPage {
//	
//	public LoginPage(WebDriver driver) {
//	 PageFactory.initElements(driver, this);
//	}
//	
//	//elementos
//	@FindBy(id ="txtUsername")
//	private WebElement campUser;
//	
//	@FindBy(id = "txtPassword")
//	private WebElement campSenha;
//	
//	@FindBy(id = "btnLogin")
//	private WebElement clicar;
//	
//	@FindBy(id= "welcome")
//	private WebElement validacao;
//	
//	//==================================
//	@FindBy(id= "spanMessage")
//	private WebElement mensagemLogin;
//	//==================================
//	
//	
//	
//	//=================================================================
//	
//	//metodos
//	public void informarUsuario(String nomeUsuario) {
//		campUser.sendKeys(nomeUsuario);
//	}
//	
//	
//	public void informarSenha(String nomeSenha) {
//	campSenha.sendKeys(nomeSenha);
//	
//	}
//	
//	public void  clicarBotao() {
//		clicar.click();
//		
//	}
//		
//		public void validacaoLogin(String string) {
//			//validacao.equals(statusValidacao);
//			assertEquals(string, driver.findElement(By.id("welcome")).getText());
//		}
////		@Entao("a aplicacao exibe o user {string}")
////		public void aAplicacaoExibeOUser(String string) {
////			assertEquals(string, driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a")).getText());
////		    
//		
//		public void validarMensagemLogin(String mensagemEsperada) {
//			assertEquals(mensagemEsperada, mensagemLogin.getText()); //geeeeeeeet.text recuperar o texto do elemento
//		}                // passar o texto para comparar com o get
//
//}




