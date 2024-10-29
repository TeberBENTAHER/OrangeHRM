package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;
import junit.framework.Assert;

public class LoginPage {
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement Username;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	WebElement Password;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement LoginBouton;
	
	@FindBy(tagName="h6")
	WebElement verifConx;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
	WebElement verifConxInv;
	
	public LoginPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void Connexion(String name, String pwd) {
		Config.wait(10);
		Username.sendKeys(name);
		Password.sendKeys(pwd);
		LoginBouton.click();
		
	}
	
	public void verifPageConx(String verif) {
		Assert.assertEquals(verifConx.getText(), verif);
		
		Config.closeBr();
		
	}
	public void verifConxInvalid(String verifMsg) {
		Assert.assertEquals(verifConxInv.getText(), verifMsg);
		Config.closeBr();
	}
	

}
