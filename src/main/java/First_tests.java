
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class First_tests {
    public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
       driver.get("https://en.wikipedia.org");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       WebElement search = driver.findElement(By.xpath("//input[@id=\"searchInput\"]"));
       search.sendKeys("Selenium");
       driver.findElement(By.xpath("//input[@id=\"searchButton\"]")).click();
       driver.findElement(By.xpath("//a[text()=\"Contents\"]")).click();
       search.sendKeys("Selenium");
       driver.quit();


    }
}
