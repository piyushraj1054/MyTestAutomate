package automationpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class createaccount {
	public static void main(String args[]){
		WebDriver driver = new FirefoxDriver();
		//Valid registration with all mandatory field//
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.id("email_create")).sendKeys("piyushraj1054@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//complete the form//
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("piyush");
		driver.findElement(By.id("customer_lastname")).sendKeys("raj");
		driver.findElement(By.id("passwd")).sendKeys("test123");
		//selecting drop down//
		Select date = new Select(driver.findElement(By.id("days")));
		date.selectByValue("23");
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByValue("2");
		Select year= new Select(driver.findElement(By.id("years")));
		year.selectByValue("1990");
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
		//Address//
		driver.findElement(By.id("firstname")).sendKeys("Piyush");
		driver.findElement(By.id("lastname")).sendKeys("Raj");
		driver.findElement(By.id("company")).sendKeys("Prision Of Code");
		driver.findElement(By.id("address1")).sendKeys("Electonic City, Phase 2, Bangalore");
		driver.findElement(By.id("city")).sendKeys("Bangalore");
		Select State= new Select(driver.findElement(By.id("id_state")));
		State.selectByValue("32");
		
		driver.findElement(By.id("postcode")).sendKeys("56010");
		driver.findElement(By.id("phone_mobile")).sendKeys("7411839544");
		driver.findElement(By.id("submitAccount")).click();
		
		
	}

}
