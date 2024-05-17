package webelement;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class elementtest {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		//Driver Initialization
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Window & Link
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		//first Name
		
		driver.findElement(By.id("fname")).sendKeys("Habiba");
		driver.findElement(By.id("lname")).sendKeys("Jannat");
		
		//Gender radiobutton
		
		WebElement radiobutton = driver.findElement(By.id("female"));
		radiobutton.click();
		
		assert radiobutton.isSelected();
		System.out.println(radiobutton.isSelected());
		
		
		//Dropdown option
		
		WebElement testDropDown = driver.findElement(By.id("option"));
		Select dropdown = new Select(testDropDown);
		
		//dropdown.selectByIndex(2);
		//dropdown.selectByValue("option 3");
		dropdown.selectByVisibleText("Option 1");
		
		//multiple option
		
		WebElement checkbox1 = driver.findElement(By.cssSelector("input[type='checkbox'][value='Option 1']"));
		checkbox1.click();

		WebElement checkbox2 = driver.findElement(By.cssSelector("input[type='checkbox'][value='Option 3']"));
		checkbox2.click();
		
		//Image
		
		WebElement uploadElement = driver.findElement(By.id("myfile"));
		String filePath = "C:/Users/Bristy/eclipse-workspace/Trytesting/img/myimage.jpg";
		uploadElement.sendKeys(filePath);
		
		//submit 
		
		Thread.sleep(5000);
		driver.findElement(By.className("btn-success")).click();



		

		
	}

}
