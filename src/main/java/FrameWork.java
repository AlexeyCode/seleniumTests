import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class FrameWork {

    static WebDriver driver = new ChromeDriver();
    static private Actions action = new Actions(driver);

    static void findAndClickElementByXpath(String xpath){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(
                By.xpath(xpath))).click();
    }

    static void findAndSendKeysByXpath(String xpath, String search){
        WebElement wait = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(
                By.xpath(xpath)));
        wait.sendKeys(search);
        wait.submit();
    }

     static void findAndDoubleClick(String xpath){
        WebElement fontButton = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(
                By.xpath(xpath)));

        action.doubleClick(fontButton).perform();
    }

}
