package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	

	

	public static void main(String[] args) throws InterruptedException {
	
		 
				
			  	System.setProperty("webdriver.chrome.driver", "/Users/raghavendrapatthi/chromedriver_mac64/webDrivers/Chrome_110/chromedriver");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(4000);
				System.out.println(driver.getTitle());
				
			
			
				// data=(String U, String P) throws InterruptedException {	
				//driver.wait(6000);
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("U");
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("P");
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
				System.out.println(driver.getTitle());
				//Assert.assertTrue(driver.getTitle());
				driver.close();

	}

}
