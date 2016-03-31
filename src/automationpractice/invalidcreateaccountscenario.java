package automationpractice;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class invalidcreateaccountscenario {
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		//Valid registration with invalid scenarios//
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		
		driver.findElement(By.id("email_create")).sendKeys("1234");
		driver.findElement(By.id("SubmitCreate")).click();
		
		WebElement TxtBoxContent = driver.findElement(By.id("create_account_error"));
		System.out.println("Printing " + TxtBoxContent.getAttribute("value"));	
		
		driver.findElement(By.id("email_create")).sendKeys("piyushraj@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		
		/*// This will capture error message
		String actual_msg = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/form/div/div[1]/ol/li")).getText();*/
		
		/*// Store message in variable
		String expect="Invalid email address.";
		
		// Verify error message
	Assert.assertEquals(expect, actual_msg);
	*/
	}
}
