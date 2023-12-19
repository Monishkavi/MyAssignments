package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HAFacebookNewAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("kavi");
		driver.findElement(By.name("lastname")).sendKeys("monish");
		driver.findElement(By.name("reg_email__")).sendKeys("abg@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abg@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Kavi#%564");
		
	
		//selecting dropdown
		WebElement day= driver.findElement(By.name("birthday_day"));
		Select dateD= new Select(day);
		dateD.selectByValue("24");
	
		WebElement month= driver.findElement(By.name("birthday_month"));
		Select dateM= new Select(month);
		dateM.selectByVisibleText("May");
		
		WebElement year= driver.findElement(By.name("birthday_year"));
		Select dateY= new Select(year);
		dateY.selectByVisibleText("2015");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}
