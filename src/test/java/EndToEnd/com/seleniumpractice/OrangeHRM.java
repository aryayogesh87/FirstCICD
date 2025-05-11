package EndToEnd.com.seleniumpractice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrangeHRM {
	
	@Test
	public void setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Successfully reached to demo site - OrangeHRM");
		
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath("//*[@name='username']"));
		username.sendKeys("Admin");
		
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
		password.sendKeys("admin123");
		
		Thread.sleep(5000);
		WebElement loginbutton = driver.findElement(By.xpath("//button[contains(@class, 'orangehrm-login-button')]"));
		loginbutton.click();
		
		Thread.sleep(2000);
		
		driver.quit();
}
}