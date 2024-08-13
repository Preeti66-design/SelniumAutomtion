package PreetiFramework.FrameSelenium;



import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LogineCIS {

	public static void main(String a[])
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testlas01-myapps.secure.fedex.com/DataMining/");
		POMFile pm=new POMFile(driver);
		pm.loginPage("910808", "Ganesha224466");
		
		

	}

}
