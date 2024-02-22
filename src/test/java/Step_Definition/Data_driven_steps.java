package Step_Definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_driven_steps {
	WebDriver driver;
	@Given("User opens the chrome browser and navigate to form website")
	public void user_opens_the_chrome_browser_and_navigate_to_form_website() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/simple-form");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
	}

	@When("user is entering {string}, {string}, {string}")
	public void user_is_entering(String firstname, String lastName, String Email) {
		driver.findElement(By.id("firstName")) .sendKeys(firstname);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
		driver.findElement(By.id("email")).sendKeys(Email);
	}

	@When("user is entering {string}, {string}")
	public void user_is_entering(String contactNumber, String Message) {
		driver.findElement(By.id("number")) .sendKeys("805649278");
		driver.findElement(By.xpath("//div[@class=\"field\"]/textarea")).sendKeys("Hello!");
	}

	@When("clicking on submit button")
	public void clicking_on_submit_button() {
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")) .click();
	    
	}

	@Then("All the data entered successfully")
	public void all_the_data_entered_successfully() throws InterruptedException {
		System.out.println("Clicked on Submit");
		Thread.sleep(5000);
		driver.close();
	}

}
