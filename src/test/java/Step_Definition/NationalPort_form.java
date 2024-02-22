package Step_Definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NationalPort_form {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	@BeforeClass
	public void extentrepotSetUp() {
		extent = new ExtentReports(System.getProperty("user.dir")+"/extentreport.html");
		test = extent.startTest("ReportTesting");
	}
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		test.log(LogStatus.PASS,"Browser open sucessfully");
		driver.get("https://www.india.gov.in/user/register");
		test.log(LogStatus.PASS, "Url loaded sucessfully");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	public void testcase1( String username ,String emailaddress) {
		
		WebElement userfield = driver.findElement(By.id("edit-name"));
		WebElement emailfield = driver.findElement(By.id("edit-mail"));
		userfield.sendKeys(username);
		emailfield.sendKeys(emailaddress);
		test.log(LogStatus.PASS,"Text Entered Sucessfully");
	}
	public void testcase2() {
		
		WebElement firstnamefield = driver.findElement(By.xpath("//div[@class=\"form-item form-type-textfield form-item-profile-main-field-first-name-und-0-value\"]/input[@type=\"text\"]"));
		WebElement lastnamefield = driver.findElement(By.xpath("//div[@class=\"form-item form-type-textfield form-item-profile-main-field-last-name-und-0-value\"]/input[@class=\"text-full form-text required\"]"));
		WebElement Countrydropdown = driver.findElement(By.xpath("//select[@id=\"edit-profile-main-field-country-und\"]"));
		WebElement statedropdown = driver.findElement(By.xpath("//select[@id=\"edit-profile-main-field-state-und-hierarchical-select-selects-0\"]"));
		Select select = new Select(Countrydropdown);
		select.selectByVisibleText("India");
		Select select1 = new Select(statedropdown);
		select1.selectByVisibleText("Andhra Pradesh");
		WebElement pincodefield = driver.findElement(By.xpath("//input[@id=\"edit-profile-main-field-pin-code-und-0-value\"]"));
		
		WebElement edudropdown = driver.findElement(By.xpath("//select[@id=\"edit-profile-main-field-education-und\"]"));
		Select select2 = new Select(edudropdown);
		select2.selectByVisibleText("Graduate/Post Graduate-Professional");
		WebElement checkbox = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
		checkbox.click();
	}

}
