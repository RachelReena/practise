package Step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple_form_step {
	WebDriver driver;
	
	@Given("User opens the browser and navigate to V1 training form website")
	public void user_opens_the_browser_and_navigate_to_v1_training_form_website() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/simple-form");
		driver.manage().window().maximize();
	}

	@When("user enters firstname, last Name, Email")
	public void user_enters_firstname_last_name_email() {
		driver.findElement(By.id("firstName")) .sendKeys("Rachel");
		driver.findElement(By.id("lastName")).sendKeys("Reena");
		driver.findElement(By.id("email")).sendKeys("reena.rachel@gmail.com");
	}

	@When("user enter contact Number, Message")
	public void user_enter_contact_number_message() {
		driver.findElement(By.id("number")) .sendKeys("805649278");
		driver.findElement(By.xpath("//div[@class=\"field\"]/textarea")).sendKeys("Hello!");
	}

	@When("user clicks on submit")
	public void user_clicks_on_submit() {
		driver.findElement(By.xpath("//input[@type=\"submit\"]")) .click();
	}

	@Then("A confirmation popup is displayed")
	public void a_confirmation_popup_is_displayed() {
		System.out.println("Clicked on Submit");
		driver.quit();;
	}
}
