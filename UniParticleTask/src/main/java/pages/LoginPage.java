package pages;



import java.awt.Desktop.Action;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class LoginPage {
	public WebElement MyAccount;
	public WebElement MyAccountDropDown;
	public WebElement Learnerlink;
	public WebElement Myprofile;
	public WebElement dlIcon;
	public WebElement ProfileDropdown;

	public WebElement Logout;

	public static void main (String[] arg) throws InterruptedException, IOException {
   	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opd.portal.stage.discoveryeducationme.com/login");
		driver.manage().window().maximize();

		
		
		
		driver.findElement(By.id("email")).sendKeys("Learner");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div/div/div[3]/button")).click();
	Thread.sleep(1000);

	WebDriverWait wait = new WebDriverWait(driver, 5);
	if ("https://opd.portal.stage.discoveryeducationme.com/learner/dashboard".equals(driver.getCurrentUrl())) {
		WebElement MyAccount = driver.findElement(By.xpath("//*[@id=\"dropdown-header-1\"]/div[1]/button"));
		
		MyAccount.click();
  		Thread.sleep(1000);
		WebElement MyAccountDropDown = driver.findElement(By.xpath("//*[@id=\"dropdown-header-1\"]/div[2]"));

		WebElement Learnerlink=  driver.findElement(By.xpath("//*[@id=\"dropdown-header-1\"]/div[2]/div/div/div[1]"));

	 		Learnerlink.click();
	 		driver.get("https://opd.portal.stage.discoveryeducationme.com/learner/profile");
	  		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

	 		driver.switchTo().window (tabs.get (1));

WebElement MyProfile = driver.findElement(By.xpath("//*[@id=\"dropdown-header-1\"]/div[1]/button"));

		 		MyProfile.click();
		 		Thread.sleep(1000);
		 		WebElement MyProfileDropDown = driver.findElement(By.xpath("//*[@id=\"dropdown-header-1\"]/div[1]/button/img[@src='/_nuxt/img/account.1be8cee.svg']"));
				  WebElement Logout = driver.findElement(By.xpath("//*[@id=\"dropdown-header-1\"]/div[2]/div/div/div[2]"));

		 		Logout.click();

//		  		Actions action = new Actions(driver);  
//		  		action.keyDown(Keys.CONTROL).moveToElement(Learnerlink).click().perform();
//		  		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		  		driver.switchTo().window (tabs.get (1));
//		 		driver.switchTo().newWindow(WindowType.TAB);
//
//		 		driver.get("https://opd.portal.stage.discoveryeducationme.com/learner/profile");
//		  		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//
//		 		driver.switchTo().window (tabs.get (1));

//		 		WebElement dlIcon = driver.findElement(By.cssSelector("img[alt='dropdown icon']"));
//
//		 		Actions builder = new Actions(driver);
//		 		Actions seriesOfActions = builder.moveToElement(dlIcon).click();

		 		
	
	}
	
//	String CurrentUrl= driver.getCurrentUrl();
//	if (CurrentUrl .equals("https://opd.portal.stage.discoveryeducationme.com/login"));
//	{
//	System.out.print("Login and logout Passed");
//	
//}
}
	}