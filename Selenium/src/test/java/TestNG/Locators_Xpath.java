package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators_Xpath {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "/Users/raghavendrapatthi/chromedriver_mac64/webDrivers/Chrome_111/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
	driver.manage().window().maximize();
		
	WebElement Childs =driver.findElement(By.xpath("//*[@id=\"https://in.bookmyshow.com/bengaluru/movies/antman-and-the-wasp-quantumania/ET00302402-0\"]/div/div[3]/child::*"));
	System.out.println("number of child elements:"+Childs.getSize());
		
	System.out.println(driver.getTitle());
	driver.getTitle();
		
		//google
//(//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]/parent::*/parent::*/parent::*/div[1])
		//amazon
		//(//input[@id='twotabsearchtextbox']/following::a[contains(text(),"Today's Deals")])
		
	}

}
