package pageObject;
import static utils.Utils.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	public AdminPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement menuAdmin;
	
	@FindBy(id = "btnAdd")
	public WebElement addName;
	
	@FindBy(id ="systemUser_employeeName_empName")
	public WebElement userName;

	@FindBy(id = "systemUser_userName")
	public WebElement employeeName;
	
	@FindBy(id = "systemUser_password")
	public WebElement employeeSenha;
	
	@FindBy(id = "systemUser_confirmPassword")
	public WebElement confirmarSenha;
	
	@FindBy(id = "btnSave")
	public WebElement salvePesso;
	
	
//	@FindBy(id ="searchSystemUser_userType")
//    public WebElement definirPapel;
	
//	@FindBy(value = "1")
//    public WebElement escrolherUsuario;
	
	
	
	
//	@FindBy(id = "searchSystemUser_employeeName_empName")
//	public WebElement difinirStat;

	
	
	
	
	//=============================================
	
	
	
	
	// Metodos
	public void acessarMenuAdmin() {
		menuAdmin.click();
	}
	
	public void addNamePessoa() {
		addName.click();
	}
	
	public void preencherUserName(String userName) {
		this.userName.sendKeys(userName);
	}
	
	public void preencherUserNamePessoa(String employeeName) {
		this.employeeName.sendKeys(employeeName);
	}
	
	
	
	public void nomeSenha(String employeeSenha) {
		this.employeeSenha.sendKeys(employeeSenha);
	}
	
	public void confirmarSenha(String confirmarSenha) {
		this.confirmarSenha.sendKeys(confirmarSenha);
	}
	
	public void salvePessoa() {
		salvePesso.click();
	}
//	public void definirPapelUsuario() {
//		this.definirPapel.click();
//	}
	
//	public void escolherUsuario() {
//		this.escrolherUsuario.click();
//	}
	

	
	
	
	
//	public void definirStatus() {
//		this.difinirStat.click();
//	}
	
	


}
