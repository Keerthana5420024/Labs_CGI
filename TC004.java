package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC004 {
	public static void main(String [] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\r\n");
		Thread.sleep(3000);
		if(driver.findElement(By.name("username")).isDisplayed()) {
		driver.findElement(By.name("username")).sendKeys("Admin");
		}else {
			System.out.println("username is not displayed");
		}
		//driver.findElement(By.name("username")).sendKeys(Keys.TAB);
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
	}

}
