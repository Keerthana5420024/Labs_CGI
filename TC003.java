package pac1;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC003 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links: "+links.size());
		
		for(WebElement l:links ) {
			System.out.println("The link is: "+l.getText());
		}
	}

}
