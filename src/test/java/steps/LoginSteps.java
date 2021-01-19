package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import io.cucumber.java.*;


public class LoginSteps extends BaseClass{
	
	@Given("Click Location and select")
	public void clickLocation() {
		driver.findElementByXPath("//li[5]/div/div/p[2]").click();
	}
	
	@And("^Click Trip as \"([^\"]*)\"$")
	public void clickTrip(String oneway) {
		driver.findElementByXPath("(//div[1]/ul/li[1])[5]").click();
		System.out.println(oneway +"trip selected");
	}
	
	@Then("^Select From option as \"([^\"]*)\"$")
	public void selectFromOption(String city) {
		driver.findElementById("fromCity").sendKeys(city);
		
	}
	

}
