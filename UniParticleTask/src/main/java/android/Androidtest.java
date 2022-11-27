package android;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page.CaptureScreenshotFormat;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

public class Androidtest {

		public class UNIPARTICLE {
		WebDriver driver;
		DesiredCapabilities caps = new DesiredCapabilities();
		@BeforeTest
		public void InitConfig(){
		caps.setCapability("deviceName", "AVY9KA9632202030");
		caps.setCapability("platformName", "Android");
		caps.setCapability (CapabilityType.BROWSER_NAME, "Chrome");
		caps.setCapability (CapabilityType.VERSION, "5.1");
		}
		 @Test
		public void testApp() throws MalformedURLException{
		   	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		driver = new RemoteWebDriver (new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.get("https://opd.portal.stage.discoveryeducationme.com/login");
		
		

		driver.findElement(By.id("email")).sendKeys("Learner");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
	WebElement MyAccount = driver.findElement(By.xpath("//*[@id=\"dropdown-header-1\"]/div[1]/button"));
	
	MyAccount.click();
	WebElement Learnerlink=  driver.findElement(By.xpath("//*[@id=\"dropdown-header-1\"]/div[2]/div/div/div[1]"));

		Learnerlink.click();
		WebElement MyProfile = driver.findElement(By.xpath("//*[@id=\"dropdown-header-1\"]/div[1]/button"));

 		MyProfile.click();
		  WebElement Logout = driver.findElement(By.xpath("//*[@id=\"dropdown-header-1\"]/div[2]/div/div/div[2]"));

 		Logout.click();


		
		}
		
	}

}
