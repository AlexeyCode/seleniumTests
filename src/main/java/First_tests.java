import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class First_tests {
    public static void main( String[] args ) {
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://en.wikipedia.org");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement search = driver.findElement(By.xpath("//input[@id=\"searchInput\"]"));
        search.sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@id=\"searchButton\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Contents\"]")).click();
        WebElement search2 = driver.findElement(By.xpath("//input[@id=\"searchInput\"]"));
        search2.sendKeys("Selenide");
        search2.submit();
        driver.findElement(By.xpath("//span[@class=\"toctext\" and text()=\"Examples\"]")).click();

        driver.findElement(By.xpath("//a[@title=\"Niobium diselenide\"]")).click();
        driver.findElement(By.xpath("//a[@title=\"Niobium\" and text()=\"Niobium\"]")).click();


        driver.findElement(By.xpath("//span[text()=\"Palladium\"]")).click();
        driver.findElement(By.xpath("//button[@class=\"uls-settings-trigger\" and @title=\"Language settings\"]")).click();
        try{
            Thread.sleep(10000);
        }catch (Exception e) {
            System.out.println(e.getMessage());

        }
        new WebDriverWait(driver,15).until(ExpectedConditions.presenceOfElementLocated (By.xpath("//button[text()=\"Fonts\"]"))).click();
        new WebDriverWait(driver,15).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class=\"mw-ui-checkbox\"]/input"))).click();

        driver.findElement(By.xpath("//button[text()=\"Apply settings\"]")).click();



    }
}
