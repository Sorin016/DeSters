package DeStiut.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class opensource {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        final WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
//        submit.sendKeys(Keys.ENTER);
        String ss = submit.getText();
        System.out.println(submit.isEnabled());
        System.out.println(submit.isDisplayed());
        System.out.println(ss);
        submit.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()=\"Dashboard\"]")));
        String s = driver.getWindowHandle();
        System.out.println(s);
        WebElement sss = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]"));
        String mm = driver.getWindowHandle();
        System.out.println(mm);
        driver.navigate().back();
//        Thread.sleep(4000);
        driver.quit();
    }
}
