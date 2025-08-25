package pac1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC008_Window_Handling {
	public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/window");
		System.out.println("Window handling: "+driver.getWindowHandle());
		driver.findElement(By.id("multi")).click();
		Set<String> multiwin=driver.getWindowHandles();
		
		System.out.println("Number of windows: "+multiwin.size());
		
		for(String childwin:multiwin) {
			driver.switchTo().window(childwin);
			System.out.println("Url is: "+driver.getCurrentUrl());
			if(driver.getCurrentUrl().equals("https://letcode.in/alert"))
			{
				driver.findElement(By.id("accept")).click();
				Alert simplealert=driver.switchTo().alert();
				System.out.println("Alert message:"+simplealert.getText());
				simplealert.accept();
				driver.findElement(By.id("confirm")).click();
				Alert confirmalert=driver.switchTo().alert();
				System.out.println("Alert message:"+confirmalert.getText());
				confirmalert.accept();
				driver.findElement(By.id("prompt")).click();
				Alert promptalert=driver.switchTo().alert();
				System.out.println("Alert message:"+promptalert.getText());
				promptalert.sendKeys("hhhhh");
				promptalert.accept();
		}
	}

}
}
