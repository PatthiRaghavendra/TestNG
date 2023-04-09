package TestNG;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Java.ReadCellValue;

public class readvalue {


ChromeDriver driver;

@BeforeSuite
public void startTest() {
 System.setProperty("webdriver.chrome.driver", "/Users/raghavendrapatthi/chromedriver_mac64/webDrivers/Chrome_111/chromedriver");
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
}

/*@Test
public void login() throws InterruptedException {
Thread.sleep(6000);
driver.findElementByName("username").sendKeys("Admin");
driver.findElementByName("password").sendKeys("admin123");
driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input").sendKeys("Admin");
driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input").sendKeys("admin123");
driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button").click();
}*/

@Test
public void readFromExcel() throws InterruptedException {

String file = "D:\\dummy\\test_emp.xlsx";
ReadCellValue rc = new ReadCellValue();

String username = rc.ReadCellData(1, 0, file);
String password = rc.ReadCellData(1, 1, file);

System.out.println("user name got is " + username);
System.out.println("password got is " + password);
Thread.sleep(6000);
driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input").sendKeys(username);
driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input").sendKeys(password);
driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button").click();
}

@Test
public void logout () throws InterruptedException {
Thread.sleep(4000);
driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p").click();
Thread.sleep(3000);
driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a").click();
}

@AfterSuite
public void broswerclosure() {
driver.close();
}

}
