package week3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {   // Step 1: Download and set the path
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		// Step 4: Maximize the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Step 6: Click on Create New Account button
		WebElement newAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		// Step 7: Enter the first name
		WebElement firstName = driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Ram");
		// Step 8: Enter the last name
		WebElement surName = driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("kumar");
		// Step 9: Enter the mobile number
		WebElement mobile = driver.findElement(By.name("reg_email__")).sendKeys("123456767");
		// Step 10: Enter the password
		WebElement password = driver.findElement(By.id("password_step_input")).sendKeys("ram262");
		// Step 11: Handle all the three drop downs
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select dayInput = new Select(day);
		dayInput.selectByValue("26");
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select monthInput = new Select(month);
		monthInput.selectByIndex(9);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select yearInput = new Select(year);
		yearInput.selectByVisibleText("2000");
		// Step 12: Select the radio button "male"
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='4']"));
		// ( A normal click will do for this step)
		radioButton.click();
		Thread.sleep(50000);
		driver.close();
	}

}
