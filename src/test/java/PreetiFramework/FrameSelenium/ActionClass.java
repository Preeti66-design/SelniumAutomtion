package PreetiFramework.FrameSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		// Hover to element
		
		a.moveToElement(driver.findElement(By.xpath("//*[@id='nav_link_allhealthingress']"))).build().perform();
		
		// To write on amazon search
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait w= new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(null));
		driver.switchTo().frame(Webelement);
		driver.switchTo().defaultContent()
		
		
		a.moveToElement(driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		/*try {
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@ldap://eusoud.prod.fedex.com/DATAMI_PERM_01_RTM_S1,cn=OracleContext,dc=ute,dc=fedex,dc=com", "ri", "ri");
			
			if(con != null)
				System.out.println("connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		

	}

}
