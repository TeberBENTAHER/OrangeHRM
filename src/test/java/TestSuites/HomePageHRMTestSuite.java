package TestSuites;


import Helper.Config;
import Pages.HomePageHRM;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageHRMTestSuite {
	

	@When("Admin clique sur le menu {string}")
	public void admin_clique_sur_le_menu(String menu) {
		HomePageHRM page = new HomePageHRM();
		page.clikOnMEnu(menu);
		
	    
	}

	@Then("Admin sur la page de menu cliquee")
	public void admin_sur_la_page_de_menu_cliquee() {
		HomePageHRM page = new HomePageHRM();
		page.verifPage();
		Config.closeBr();
	    
	}



}
