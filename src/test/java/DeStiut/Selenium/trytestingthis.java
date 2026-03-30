package DeStiut.Selenium;

import Util.WaitUntil;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class trytestingthis {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        final WebDriver driver = new ChromeDriver();
        Alert alert;
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //Navigare
        driver.get("https://trytestingthis.netlify.app/");
        Thread.sleep(3000);
        driver.navigate().refresh();

        //Info despre pagină
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        Thread.sleep(4000);
        WebElement element = driver.findElement(By.id("div1"));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView(true);", element);

        //Find Element
        WebElement source = driver.findElement(By.xpath("//img[@id='drag1']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='div1']"));
        actions.dragAndDrop(source, target).perform();
        actions.doubleClick(driver.findElement(
                By.xpath("//button[text()='Double-click me']"))).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Double-click me']")));

        // WebElement – acțiuni pe elemente
        //Instructuini
        driver.findElement(By.xpath("//input[@id='male']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Sorin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@name='message']")).clear();
        Thread.sleep(3000);
//        driver.findElement(By.xpath("//button[contains(text(),'Your Sample')]")).click();
        driver.findElement(By.xpath("//button[text()=' Submit']"))
                .submit();
        driver.navigate().back();
//        alert=driver.switchTo().alert();
//        alert.accept();

        //WebElement –  informatii
        System.out.println(driver.findElement(By
                .xpath("//select[@id='option']")).getText());
        System.out.println(driver.findElement(By
                .xpath("//input[@type='color']")).getCssValue("color"));
        System.out.println(driver.findElement(By
                .xpath("//input[@type='color']")).getTagName());

        //WebElement -Verificari
        System.out.println(driver.findElement(By.xpath("//input[@id='male']")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//input[@id='male']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//input[@id='male']")).isDisplayed());


        String originalWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[text()=' Submit']"))
                .sendKeys(Keys.ENTER);
        wait.until(drivers -> driver.getWindowHandles().size() > 1);

// Faci switch pe tab-ul nou
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        String googlePage = driver.getWindowHandle();
        driver.switchTo().window(googlePage);
        driver.navigate().to("https://www.dezlearn.com/javascript-alerts");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle()+" "+driver.getCurrentUrl());
        Thread.sleep(3000);

       // Alert

               // ok
        driver.findElement(By.xpath("//button[@id='s_alert1']")).click();
        alert=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);

                //ok si cancel
        driver.findElement(By.xpath("//button[@id='c_alert2']")).click();
        alert=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='c_alert2']")).click();
        alert=driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(1000);

        // pentru situl asta nu merge cu scroll daca merge tot impreuna
        // in cazul asta am facut cu actions pina ajunge la element si doar asa a mers,
        // TOT CE ESTE CU scroll NU FUNCTIONEAZA!!!!

        //Actions si doar Alerta ok calcel si submit
        WebElement element1=driver.findElement(By.xpath("//button[@id='p_alert3']"));
        actions.moveToElement(element1).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='p_alert3']")).click();
        alert=driver.switchTo().alert();
        alert.sendKeys("sorin");
        alert.dismiss();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='p_alert3']")).click();
        alert=driver.switchTo().alert();
        alert.sendKeys("SORIN");
        alert.accept();
        Thread.sleep(2000);


        //Închidere browser
        driver.close();
        driver.quit();
    }
}
