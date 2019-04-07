package mavenexample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNGWithMaven {

  WebDriver driver;
  
  @Test
  public void f() {
	  System.out.println("Navigating to Google");
	  driver.get("https://www.google.com");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\gali\\selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Closing the Browser");
	  driver.quit();
  }

}
