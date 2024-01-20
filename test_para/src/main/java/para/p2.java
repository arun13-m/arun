package para;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class p2 {
	
	@Parameters({"I","P"})
	@Test
	public void driver(String i, String p) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\downloads\\chromedriver-win64\\chromedriver.exe\\");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		cd.findElementById("email").sendKeys(i);
		Thread.sleep(2000);
		
		cd.findElementByCssSelector("input#pass").sendKeys(p);
		Thread.sleep(2000);
		
		cd.findElementByName("login").click();
		Thread.sleep(2000);
		
		
		
	}

}
