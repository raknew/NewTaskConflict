package org.newjavatest;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class NewOne {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-15\\Bala\\Test\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demoqa.com/registration/");
			driver.findElement(By.id("name_3_firstname")).sendKeys("Bala");
			driver.findElement(By.id("name_3_lastname")).sendKeys("Krishnan");
			driver.findElement(By.id("phone_9")).sendKeys("8122372242");
			driver.findElement(By.id("username")).sendKeys("Bala77");
			driver.findElement(By.id("email_1")).sendKeys("balatcy7@gmail.com");
			driver.findElement(By.id("description")).sendKeys("Hi this is Balakrishnan");
			driver.findElement(By.id("password_2")).sendKeys("********");
			driver.findElement(By.id("confirm_password_password_2")).sendKeys("********");
			driver.quit();
			
		}
	}

}
