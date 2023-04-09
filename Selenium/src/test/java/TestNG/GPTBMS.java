package TestNG;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

public class GPTBMS {

	      private WebDriver driver;

	      @BeforeMethod
	      public void setup() {
	          // Set the driver path for Chrome browser
	    	  System.setProperty("webdriver.chrome.driver", "/Users/raghavendrapatthi/chromedriver_mac64/webDrivers/Chrome_111/chromedriver");

	          // Initialize a new ChromeDriver instance
	          driver = new ChromeDriver();

	          // Maximize the browser window
	          driver.manage().window().maximize();
	      }

	      @AfterMethod
	      public void teardown() {
	          // Quit the browser
	         // driver.quit();
	      }

	      @Test
	      public void bookMovieTicket() {
	          // Navigate to the BookMyShow website
	          driver.get("https://in.bookmyshow.com/");

	          // Close the popup if it appears
	          WebDriverWait wait = new WebDriverWait(driver, 10);
	          
	          // Select the location
	          WebElement locationDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"venuelist\"]/div[1]/div/div[2]/div/div[1]/div/div[1]/span")));
	          locationDropdown.click();
	          WebElement selectLocation = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"venuelist\"]/div[1]/div/div[2]/div/div[2]/ul/li[2]")));
	          selectLocation.click();

	          WebElement closePopupButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"wzrk-cancel\"]")));
	          closePopupButton.click();
	          
	          WebElement closePopupcity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[2]/ul/li[3]/div/div/img")));
	          closePopupcity.click();
	        

	          // Search for the movie
	          WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div[1]/div[2]/input"));
	          searchBox.sendKeys("Avengers Endgame");
	          searchBox.submit();

	          // Click on the movie
	          WebElement movieLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cards\"]/div[1]/div[2]/div/div[2]/a/div[1]/img")));
	          movieLink.click();


	          // Select the date
	          WebElement dateDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"venuelist\"]/div[1]/div/div[2]/div/div[1]/div/div[2]/span")));
	          dateDropdown.click();
	          WebElement selectDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"venuelist\"]/div[1]/div/div[2]/div/div[2]/ul/li[3]")));
	          selectDate.click();

	          // Select the time
	          WebElement timeLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"venuelist\"]/div[1]/div/div[3]/div/div/div[1]/div/div/div/div[1]/a")));
	          timeLink.click();

	          // Book the seats
	          WebElement bookSeatsButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"proceed-Qty\"]")));
	          bookSeatsButton.click();

	          // Login to your account
	          WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"popUserData\"]/div[1]/div/div[1]/div/input")));
	          emailInput.sendKeys("your_email@example.com");
	          WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"popUserData\"]/div[1]/div/div[2]/button")));
	          continueButton.click();

	          // Enter

  }
}
