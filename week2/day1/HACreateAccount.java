package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HACreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("democsr");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.id("accountName")).sendKeys("Monish Testleaf");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement indD=driver.findElement(By.name("industryEnumId"));
		Select in= new Select(indD);
		in.selectByIndex(3);
		
		WebElement ownD=driver.findElement(By.name("ownershipEnumId"));
		Select ow= new Select(ownD);
		ow.selectByVisibleText("S-Corporation");
		
		WebElement soD=driver.findElement(By.id("dataSourceId"));
		Select so= new Select(soD);
		so.selectByValue("LEAD_EMPLOYEE");		
		
		WebElement macD=driver.findElement(By.id("marketingCampaignId"));
		Select mac= new Select(macD);
		mac.selectByIndex(6);
		
		WebElement stD=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select st= new Select(stD);
		st.selectByValue("TX");
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		
	}

}
