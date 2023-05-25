package week3;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Acme {

		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://acme-test.uipath.com/login");
			driver.manage().window().maximize();
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys("kumar.testleaf@gmail.com");
			WebElement passWord = driver.findElement(By.name("password"));
			passWord.sendKeys("leaf@12");
			WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
			loginButton.click();
			System.out.println("Title of the page is- " + driver.getTitle());			
			WebElement logOut = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));
			logOut.click();
			Thread.sleep(100);
			driver.close();

		}
	}
