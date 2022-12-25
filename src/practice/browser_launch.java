package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser_launch {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "D:\\Selenium material\\Selenium project\\Ezymech\\Drivers\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://ezy.herokuapp.com/");
		  //updating the code
		  Thread.sleep(3000);
		  driver.quit();

	}

}
