package pac1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab_6 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/index.php?");
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("input-email")).sendKeys("keerthanashetty@592gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("abcd");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
        
        WebElement componentsLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Components")));
        componentsLink.click();
        driver.findElement(By.linkText("Monitors (2)")).click();
        
       
        driver.get("https://tutorialsninja.com/demo/index.php?route=product/category&path=25_28&limit=25"); 

        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/div/div[2]/div[2]/button[1]/i")).click();
        
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/div/div[2]/div[1]/h4/a")).click();
       
        
        WebElement msg1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tab-description\"]/div")));
        System.out.println("The description appears");
        
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/button[1]")).click();

        WebElement msg2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product-product\"]/div[1]")));
        System.out.println("Success Message appears");
        
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Mobile");
        driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
        
        driver.findElement(By.xpath("//*[@id=\"description\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"button-search\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a")).click();
        
        driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).sendKeys("3");
        
        driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
        
        WebElement msg3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product-product\"]/div[1]")));
        System.out.println("Success: You have added HTC Touch HD to your shopping cart!");
        
        driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
        
        WebElement msg4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr[1]/td[2]/a")));
        System.out.println("The mobile added to the cart is: " +msg4.getText());
        
        driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong")).click();
        
        
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();
        
        WebElement msg5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/h1")));
        System.out.println(msg5.getText());
        
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
        
        

        
    }
}
