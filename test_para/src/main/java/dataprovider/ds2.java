package dataprovider;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ds2 {
	
	@DataProvider(name="arun")
	public static Object[][] DataSet(){
		Object[][] obj = { 
				{"invalid","aaaaa","111111"},
				{"valid","Dhivyakarthi123","12345"},
				{"in","ggggg","33333"}};
		return obj;
		}
	
	@Test(dataProvider="arun")
	public void driver(String type,String username,String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\downloads\\chromedriver-win64\\chromedriver.exe\\");
        ChromeDriver cd = new ChromeDriver();
        cd.get("https://www.mycontactform.com/");
        Thread.sleep(1000);
        
        cd.findElementById("user").sendKeys(username);
        Thread.sleep(1000);
        cd.findElementByName("pass").sendKeys(password);
        Thread.sleep(1000);
        cd.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();
        Thread.sleep(1000);
        
        if(type.equals("valid")) {
        	System.out.println("in home");
        	cd.findElementByLinkText("Logout").click();
        }
        else {
        	System.out.println("in valid user");
        }
        
        Thread.sleep(1000);
        cd.close();
	}
	    
}
