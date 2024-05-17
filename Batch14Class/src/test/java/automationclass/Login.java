package automationclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Driver Initialization
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Window & link 
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		//title

		//If-Else check
				
				String ExpectedTitle = "Swag Labs";
				String ActualTitle = driver.getTitle();
				
				 //if(ActualTitle.equals(ExpectedTitle)) {
		     //System.out.println("Title Match");
			// }
			// else {
		     //System.out.println("Not Match");
			// }
				
				//Assert
				
				Assert.assertEquals(ActualTitle, ExpectedTitle,"Condition true");
				
				//URL
				
				//If-Else check
				
				String expectedUrl = "https://www.saucedemo.com/";
				String actualUrl = driver.getCurrentUrl();
				
				 //if(actualUrl.equals(expectedUrl)) {
		     //System.out.println("URL Match");
			 //}
			 //else {
		     //System.out.println("URL does Not Match");
			 //}
				
				//Assert
				

				Assert.assertEquals(actualUrl, expectedUrl,"URLs do not match");
				
				
			}
		
			}

		
		

		