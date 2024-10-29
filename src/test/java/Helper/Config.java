package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Config {
	
public static WebDriver driver;
	
	public static void confEdge() throws Exception {
		System.setProperty("WebDriver.edge.driver", Utils.getproprety("Google_driver"));
		
	}
	
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	
	public static void closeBr() {
		driver.quit();
	}
	public static void wait(int s) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}

}
