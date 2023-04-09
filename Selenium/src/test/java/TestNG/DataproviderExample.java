package TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExample {
	
	
	@Test(dataProvider = "datareader")
	public void login(String U, String P) throws InterruptedException {
		
	  	System.setProperty("webdriver.chrome.driver", "/Users/raghavendrapatthi/chromedriver_mac64/webDrivers/Chrome_111/chromedriver");
		WebDriver driver = new ChromeDriver();			
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	//Assert.assertTrue(driver.getTitle().equals(driver.getTitle()));
		//System.out.println(driver.getTitle());
		
		//for (int i = 0; i < 5; i++) 
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(U);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(P);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		driver.wait(6000);
		//Assert.assertTrue(driver.getTitle());
		System.out.println(driver.getTitle());
		AssertJUnit.assertTrue(driver.getTitle().equals(driver.getTitle()));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		
		//Assert.assertTrue(driver.getTitle());
		driver.close();
}
	 @DataProvider
	  public Object[][] datareader() {
	    return new Object[][]
	    		{
	    	new Object[] { "Admin", "admin123" },
	      //  new Object[] { "Raghavendra", "password123" },
	      
	    		};
	  }

}

