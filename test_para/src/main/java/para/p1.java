package para;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class p1 {
	
	@Parameters({"U","V"}) //U=u, V=v
	@Test
	public void data(String u, String n) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\downloads\\chromedriver-win64\\chromedriver.exe\\");
        ChromeDriver cd = new ChromeDriver();
        cd.get("https://www.mycontactform.com/");
        Thread.sleep(2000);
        
        cd.findElementById("user").sendKeys(u);
        Thread.sleep(2000);
        
        cd.findElementByName("pass").sendKeys(n);
        Thread.sleep(2000);
        
        cd.findElementByClassName("btn_log").click();
        Thread.sleep(2000);
        
        cd.close();
	}

}
