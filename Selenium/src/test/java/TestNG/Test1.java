package TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Test1 {

	 
	//private static final String priority = null;
	ChromeDriver driver;
	 
	@BeforeSuite
	public void startTest() {	
		System.setProperty("webdriver.chrome.driver","/Users/raghavendrapatthi/chromedriver_mac64/webDrivers/Chrome_111/chromedriver");
	    driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
	
	@BeforeTest
	public void login() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input").sendKeys("admin");
		driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input").sendKeys("admin123");
		driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button").click();
	}
	
@Test(priority=1)
	public void admin () throws InterruptedException {
			Thread.sleep(6000);
		   driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span").isDisplayed();
	       Thread.sleep(6000);
	       driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a").click();
	       Thread.sleep(6000);
}
	
	@Test(priority=2)
	public void PIM () throws InterruptedException {
	Thread.sleep(3000);
	 driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a").click();
	 Thread.sleep(3000);
	 driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button").isDisplayed();
	}
	@Test(priority=3)
	public void Time () throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a/span").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[1]/div/div/div/div[2]/div/div/input").isDisplayed();
		}	
	@AfterTest
	public void logout () throws InterruptedException {
		AssertJUnit.assertTrue(true);
		Thread.sleep(4000);
		driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a").click();
	   
}
	@AfterSuite
	public void broswerclosure () {
		AssertJUnit.assertTrue(true);
		System.out.println("Page title is : " + driver.getTitle());
		 driver.close();
	}

 }

