package Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyHooks {
	
	public static WebDriver driver;

	@Before
	public void setBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://myassignmenthelp.com/");
		driver.manage().window().maximize();
	}
}
