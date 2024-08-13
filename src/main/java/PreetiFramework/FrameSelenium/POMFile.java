package PreetiFramework.FrameSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMFile {

	
		
		WebDriver driver;
		public POMFile(WebDriver driver){
			
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
			
		}
		
		@FindBy(id="input28")
		WebElement username;
		
		@FindBy(id="input36")
		WebElement password;
		
		@FindBy(xpath="//*[@id='form20']/div[2]/input")
		WebElement submit;
		
		public void loginPage(String um, String pw)
		{
			username.sendKeys(um);
			password.sendKeys(pw);
			submit.click();
		}
		

	

}
