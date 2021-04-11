package FlatFolder.FlatFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@Test
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver",
                "C:\\Work\\chromedriver.exe");
       
       
        driver = new ChromeDriver();
        driver.get("http://stage.flatfolder.com/home");
        driver.manage().window().maximize();
		
	}
	
	@Test(dependsOnMethods="openBrowser")
	
	public void login() throws InterruptedException {
		
		        
		        Thread.sleep(3000);
		      

		        
		        Select drpCountry = new Select(driver.findElement(By.name("//select[@id='lang']")));
				drpCountry.selectByVisibleText("English");
	}

}
