package week3;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Contact {

		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			WebElement userName = driver.findElement(By.id("username"));
			userName.sendKeys("DemoSalesManager");

			WebElement passWord = driver.findElement(By.name("PASSWORD"));
			passWord.sendKeys("crmsfa");
			WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
			loginButton.click();
			WebElement crmButton = driver.findElement(By.xpath("//*[@id=\"label\"]/a"));
			crmButton.click();
			WebElement contactsButton = driver.findElement(By.linkText("Contacts"));
			contactsButton.click();
			WebElement createContactButton = driver.findElement(By.linkText("Create Contact"));
			createContactButton.click();
			WebElement firstName = driver.findElement(By.id("firstNameField"));
			firstName.sendKeys("firstName");
			WebElement lastName = driver.findElement(By.id("lastNameField"));
			lastName.sendKeys("lastName");
			WebElement localFirstName = driver.findElement(By.id("createContactForm_firstNameLocal"));
			localFirstName.sendKeys("firstNameLocal");
			WebElement localLastName = driver.findElement(By.id("createContactForm_lastNameLocal"));
			localLastName.sendKeys("lastNameLocal");
			WebElement departmentID = driver.findElement(By.name("departmentName"));
			departmentID.sendKeys("departmentName");
			WebElement descriptionBox = driver.findElement(By.xpath("//*[@id=\"createContactForm_description\"]"));
			descriptionBox.sendKeys("description");
			WebElement mail = driver.findElement(By.id("createContactForm_primaryEmail"));
			mail.sendKeys("ram@gmail.com");
			WebElement province = driver.findElement(By.name("generalStateProvinceGeoId"));
			Select provinceNY = new Select(province);
			provinceNY.selectByVisibleText("New York");
			WebElement clickContactButton = driver.findElement(By.className("smallSubmit"));
			clickContactButton.click();
			WebElement editButton = driver.findElement(By.className("subMenuButton"));
			editButton.click();
			WebElement clearDescription = driver.findElement(By.id("updateContactForm_description"));
			clearDescription.clear();
			WebElement impNote = driver.findElement(By.name("importantNote"));
			impNote.sendKeys("important note");
			WebElement updateButton = driver.findElement(By.xpath("//input[@value='Update']"));
			updateButton.click();
			System.out.println("Title: " + driver.getTitle());

		}

	}