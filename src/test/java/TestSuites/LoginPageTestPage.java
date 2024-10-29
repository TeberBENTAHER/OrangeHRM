package TestSuites;



import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTestPage {
	
	@Given("Admin sur la page Login")
	public void admin_sur_la_page_login() throws Exception {
		
		Config.driver = new EdgeDriver();
		Config.confEdge();
		Config.maxWindow();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Config.driver.get(url);
		
	    
	}

	@When("Admin entrer le username valide {string} et passwaord valide {string}")
	public void admin_entrer_le_username_valide_et_passwaord_valide(String USERNAME, String PWD) {
		
		LoginPage page = new LoginPage();
		page.Connexion(USERNAME, PWD);
	    
	}

	@Then("Administrateur deriger vers la page accueil qui contient le message {string}")
	public void administrateur_deriger_vers_la_page_accueil_qui_contient_le_message(String VERIFmsg) {
		
		LoginPage page = new LoginPage();
		page.verifPageConx(VERIFmsg);
		
	}

	@When("Admin entrer le username valide {string} et passward invalide {string}")
	public void admin_entrer_le_username_valide_et_passward_invalide(String USERNAME, String PWD) {
	    LoginPage page = new LoginPage();
	  page.Connexion(USERNAME, PWD);
	}

	@Then("Admin est encore dans la page  login qui contient le message {string}")
	public void admin_est_encore_dans_la_page_login_qui_contient_le_message(String verifmsg) {
		LoginPage page = new LoginPage();
		page.verifConxInvalid(verifmsg);
	    
	}


}
