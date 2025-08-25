package pac1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class Lab5 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://tutorialsninja.com/demo/index.php?");
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Register")).click();

        WebElement registerTitle = driver.findElement(By.xpath("//*[@id='content']/h1"));
        System.out.println("The Register page title is: " + registerTitle.getText());

        // First Continue click without filling fields
        driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
        WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='account-register']/div[1]")));
        System.out.println("The message is: " + msg.getText());

        // Fill first name
        WebElement search = driver.findElement(By.id("input-firstname"));
        search.sendKeys("Automation Testing Tools like Selenium and more");
        driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
        WebElement msg1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"account\"]/div[2]/div/div")));
        System.out.println("The message is: " + msg1.getText());

        // Re-locate first name after page update
        WebElement search1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-firstname")));
        search1.clear();
        search1.sendKeys("Keerthana");

        // Fill last name
        WebElement search2 = driver.findElement(By.id("input-lastname"));
        search2.sendKeys("Automation Testing Tools like Selenium and more");
        driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
        WebElement msg2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"account\"]/div[3]/div/div")));
        System.out.println("The message is: " + msg2.getText());

        // Re-locate last name after page update
        WebElement search3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-lastname")));
        search3.clear();
        search3.sendKeys("Shetty");

        // Fill email
        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("keerthanashetty@592gmail.com");

        // Fill phone
        WebElement phone = driver.findElement(By.id("input-telephone"));
        phone.sendKeys("6363656616");

        // Fill password
        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("abcd");

        // Fill confirm password
        WebElement confirm = driver.findElement(By.id("input-confirm"));
        confirm.sendKeys("abcd");

       
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).click();

       
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();

       
        driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();

       
        WebElement msg3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/h1")));
        System.out.println("The message is: " + msg3.getText());
        
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
        
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul[2]/li[1]/a")).click();


    }
}
