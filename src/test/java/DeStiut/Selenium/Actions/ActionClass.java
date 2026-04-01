package DeStiut.Selenium.Actions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Alert alert;
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.navigate().to("https://trytestingthis.netlify.app/");

        //click
        driver.findElement(By.xpath("//input[@id='male']")).click();
        Thread.sleep(3000);

        //double click
        WebElement doubleClik = driver.findElement(By.xpath("//button[contains(text(),'Double-click me')]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Double-click me']")));
        actions.moveToElement(doubleClik).perform();
        actions.doubleClick(doubleClik).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//p[@id='demo' and text()='Your Sample Double Click worked!']")).isDisplayed();
        Thread.sleep(3000);

        //right click
        // deschide tab nou
        driver.switchTo().newWindow(WindowType.TAB);
        // mergi la un URL
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement rightClick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
        actions.contextClick(rightClick).perform();
        Thread.sleep(2000);

        driver.close();
        driver.quit();
    }
}
