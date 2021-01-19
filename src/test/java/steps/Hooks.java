package steps;



import org.testng.annotations.*;

import cucumber.api.Scenario;

//import org.junit.Test;
import org.junit.*;
import org.junit.After;

public class Hooks extends BaseClass{
	
   @Before
	public void beforeScenario(Scenario sc) {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
			
		System.out.println("Name: "+sc.getName());
		System.out.println("Status: "+sc.getStatus());
		//System.out.println("Line number: "+ sc.getLine());
		
	}
	
	@After
	public void afterScenario(Scenario sc) {
		driver.close();
		System.out.println("Status: "+ sc.getStatus());
		
	}

}
