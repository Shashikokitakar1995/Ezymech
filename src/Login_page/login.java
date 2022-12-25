package Login_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class login {
	WebDriver driver;
  @Test
  public void launch_chrome() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium material\\Selenium project\\Ezymech\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://ezy.herokuapp.com/");
  }

  @Test
  public void launch_firefox()
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\Selenium material\\Selenium project\\Ezymech\\Drivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://ezy.herokuapp.com/");  
  }
  
  @Test
  public void launch_edge() 
  {
	  System.setProperty("webdriver.IE.driver", "D:\\Selenium material\\Selenium project\\Ezymech\\Drivers\\IEDriverServer.exe");
	  driver=new EdgeDriver();
	  driver.get("https://ezy.herokuapp.com/"); 
  }
  @Test
  public void launch_IE() 
  {
	  System.setProperty("webdriver.edge.driver", "D:\\Selenium material\\Selenium project\\Ezymech\\Drivers\\msedgedriver.exe");
	  driver=new InternetExplorerDriver();
	  driver.get("https://ezy.herokuapp.com/"); 
  }
}
