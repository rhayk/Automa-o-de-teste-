package stepsDefinitions;

import cucumber.api.PendingException;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import pageObject.AdminPage;


public class AdminSteps {
	AdminPage adminPage = new AdminPage();
	
	@Dado("que eu acesse o menu Admin")
	public void queEuAcesseOMenuAdmin() {
	    adminPage.acessarMenuAdmin();
	    
	}
	
	@E("^clicar no botao add$")
	public void clicarNoBotaoAdd() throws Throwable {
		adminPage.addNamePessoa();
	}

	
	@E("^adicionar uma pessoa \"([^\"]*)\"$")
	public void adicionarUmaPessoa(String userName) throws Throwable {
		adminPage.preencherUserName(userName);
	}
	
	
	
	@E("^adicionar nome da pessoa \"([^\"]*)\"$")
	public void adicionarNomeDaPessoa(String employeeName) throws Throwable {
		adminPage.preencherUserNamePessoa(employeeName);
	}

	@E("^adicionar senha \"([^\"]*)\"$")
	public void adicionarSenha(String employeeSenha) throws Throwable {
		adminPage.nomeSenha(employeeSenha);
		
		
		
	}


	@E("^confirmar senha \"([^\"]*)\"$")
	public void confirmarSenha(String confirmarSenha) throws Throwable {
	adminPage.confirmarSenha(confirmarSenha);
	}

	@Quando("^clicar no botao salvar$")
	public void clicarNoBotaoSalvar() throws Throwable {
		adminPage.salvePessoa();
	}

	

	

	
	
	
	
	
	
	
	
	
	
	
	
	


//	@E("^adicionar nome do empregado \"([^\"]*)\"$")
//	public void adicionarNomeDoEmpregado(String employeeName) throws Throwable {
//		adminPage.nameUsuario(employeeName);
//	}
//	@E("^definir papel do usuario$")
//	public void definirPapelDoUsuario() throws Throwable {
//		adminPage.definirPapelUsuario();
//	}

//	@E("^escolher usuario$")
//	public void escolherUsuario() throws Throwable {
//	 
//	}

	
	           //============
	


	
//	@E("^selecionar status$")
//	public void selecionarStatus() throws Throwable {
//		adminPage.definirStatus();
//	}
//	

//



//	@Entao("^validar se pessoa foi cadastrada$")
//	public void validarSePessoaFoiCadastrada() throws Throwable {
//		
//	}
	
	
}
