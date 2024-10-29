package TestSuites;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;

import Pages.LoginPage;
import io.cucumber.java.en.Given;

public class CommunStepDef {
	
	@Given("Admin est bien connectee avec username correct {string} et password correct {string}")
	public void admin_est_bien_connectee_avec_username_correct_et_password_correct(String username, String mdp) throws Exception {
		Config.driver = new EdgeDriver();
		Config.confEdge();
		Config.maxWindow();
		//Utils utils = new Utils();
		
		Config.driver.get(Helper.Utils.getproprety("URL"));
	   LoginPage page = new LoginPage();
	   Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   page.Connexion(username, mdp);
	}
}
