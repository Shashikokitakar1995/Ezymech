package Login_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium material\\Selenium project\\Ezymech\\Drivers\\chromedriver.exe");
			System.out.println("webdriver launch");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.geeksforgeeks.org");

	}

}
