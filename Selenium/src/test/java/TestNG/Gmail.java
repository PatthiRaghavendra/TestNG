package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Gmail {
  @Test(dataProvider = "datasender")
  public void gmailbrower(String n, String s) {
	  
	  System.setProperty("webdriver.chrome.driver", "/Users/raghavendrapatthi/chromedriver_mac64/webDrivers/Chrome_111/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.findElement(By.xpath("/html/body/header/div/div/div/a[3]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(n);
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(s);
		
	
	  driver.close();

	  
	  
  }

  @DataProvider
  public Object[][] datasender() {
    return new Object[][] {
      new Object[] { "Admin", "123" },
      new Object[] { "123", "password123" },
    };
  }
}
