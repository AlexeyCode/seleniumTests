import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class First_tests {
    public static void main( String[] args ) {
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://en.wikipedia.org");
        driver.manage().window().maximize();

        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id=\"searchInput\"]"))).sendKeys("Selenium");

        driver.findElement(By.xpath("//input[@id=\"searchButton\"]")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[text()=\"Contents\"]"))).click();
        WebElement wait = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(
                By.xpath("//input[@id=\"searchInput\"]")));
        wait.sendKeys("Selenide");
        wait.submit();

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[@class=\"toctext\" and text()=\"Examples\"]"))).click();

        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@title=\"Niobium diselenide\"]"))).click();

        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@title=\"Niobium\" and text()=\"Niobium\"]"))).click();

        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[text()=\"Palladium\"]"))).click();

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@class=\"uls-settings-trigger\" and @title=\"Language settings\"]"))).click();

        new WebDriverWait(driver,15).until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[text()=\"Fonts\"]"))).click();
        new WebDriverWait(driver,15).until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@class=\"mw-ui-checkbox\"]"))).click();
        try{
            Thread.sleep(1000);
        }catch (Exception e) {
            System.out.println(e.getMessage());

        }
        new WebDriverWait(driver,15).until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//button[text()=\"Apply settings\"]"))).click();



    }
}
