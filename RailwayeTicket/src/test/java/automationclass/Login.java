package automationclass;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Driver Initialization
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				//Window & link 
				
				driver.get("https://eticket.railway.gov.bd/login");
				driver.manage().window().maximize();
				
				//login
				
				driver.findElement(By.id("mobile_number")).sendKeys("01678691673");
				driver.findElement(By.id("password")).sendKeys("xwNAEs601");
				//driver.findElement(By.id("login-button")).click();
				driver.findElement(By.className("login-form-submit-btn")).click();
								

	}

}
