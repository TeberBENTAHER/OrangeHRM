package Pages;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePageHRM {
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span")
	List<WebElement> menus;
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	WebElement verifPAge;
	
	public HomePageHRM() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void clikOnMEnu(String menuchoisie) {
		try{
		 for(WebElement menu:menus) {
			 if(menu.getText().contains(menuchoisie)) {
				 menu.click();
			 }
			 
		 }
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public String verifPage() {
	String ActuelMsg = verifPAge.getText();
	return ActuelMsg;
	
	}

}

