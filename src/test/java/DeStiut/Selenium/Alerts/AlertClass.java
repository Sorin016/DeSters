package DeStiut.Selenium.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        Alert alert;
        Actions actions=new Actions(driver);

        driver.navigate().to("https://www.dezlearn.com/javascript-alerts");
        // ok
        driver.findElement(By.xpath("//button[@id='s_alert1']")).click();
        alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);

        //ok si cancel
        driver.findElement(By.xpath("//button[@id='c_alert2']")).click();
        alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='c_alert2']")).click();
        alert = driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(1000);

        // pentru situl asta nu merge cu scroll daca merge tot impreuna
        // in cazul asta am facut cu actions pina ajunge la element si doar asa a mers,
        // TOT CE ESTE CU scroll NU FUNCTIONEAZA!!!!

        //Actions moveToElement si doar Alerta ok calcel si submit
        WebElement element1 = driver.findElement(By.xpath("//button[@id='p_alert3']"));
        actions.moveToElement(element1).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='p_alert3']")).click();
        alert = driver.switchTo().alert();
        alert.sendKeys("sorin");
        alert.dismiss();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='p_alert3']")).click();
        alert = driver.switchTo().alert();
        alert.sendKeys("SORIN");
        alert.accept();
        Thread.sleep(2000);

        driver.close();
        driver.quit();
    }
}
