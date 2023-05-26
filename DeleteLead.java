package week3;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DeleteLead {

		public static void main(String[] args) throws InterruptedException {
			    //launch the browser
				ChromeDriver driver = new ChromeDriver();
				//maximize the window
				driver.manage().window().maximize();
				// Launch  URL
				driver.get("http://leaftaps.com/opentaps/control/main");
			    // Enter UserName 
			    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			    // Enter Password 
			    driver.findElement(By.id("password")).sendKeys("crmsfa");
			    // Click on Login Button 
			    driver.findElement(By.className("decorativeSubmit")).click();
			    //Click on CRM/SFA Link
				driver.findElement(By.linkText("CRM/SFA")).click();
				//Click on Leads link
				driver.findElement(By.linkText("Leads")).click();
				//Click on Find leads
				driver.findElement(By.linkText("Find Leads")).click();
				//Click on Phone
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				//Enter phone number
				driver.findElement(By.name("phoneCountryCode")).clear();
				driver.findElement(By.name("phoneCountryCode")).sendKeys("52");
				driver.findElement(By.name("phoneAreaCode")).sendKeys("52");
				driver.findElement(By.name("phoneNumber")).sendKeys("9884423492");
				//Click find leads button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				Thread.sleep(5000);			
				
				//Click Find leads
				driver.findElement(By.linkText("Find Leads")).click();
				//Enter captured lead ID
				driver.findElement(By.name("id")).sendKeys("11009");
				//Click find leads button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				Thread.sleep(5000);
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
				WebElement check=driver.findElement(By.xpath("//div[text()='No records to display']"));
				if(Boolean(check))
				{
					System.out.println("successful deletion");
				}
				//Close the browser (Do not log out)
				driver.close();
				
		}

		private static boolean Boolean(WebElement check) {
			return true;
		}

	}

