package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement newAccount = driver.findElement(By.id("//data-testid='open-registration-form-button'"));
		newAccount.click();
		WebElement firstName = driver.findElement(By.id("//input[@placeholder aria-label='First name']"));
		firstName.sendKeys("Ram");
		WebElement surName = driver.findElement(By.id("//input[@placeholder aria-label='Surname']"));
		surName.sendKeys("Kumar");
		WebElement mobile = driver.findElement(By.name("Mobile.number"));
		mobile.sendKeys("1234567890");
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("mar26");
		WebElement day = driver.findElement(By.name("//select[@title='Day']"));
		Select dayInput = new Select(day);
		dayInput.selectByValue("29");
		WebElement month = driver.findElement(By.name("//select[@name='birthday_month']"));
		Select monthInput = new Select(month);
		monthInput.selectByIndex(6);
		WebElement year = driver.findElement(By.id("//select[@id='year']"));
		Select yearInput = new Select(year);
		yearInput.selectByVisibleText("2000");
		WebElement radioButton = driver.findElement(By.id("//input[@value='2']"));
		radioButton.click();
		Thread.sleep(10000);
		driver.close();
	}

}