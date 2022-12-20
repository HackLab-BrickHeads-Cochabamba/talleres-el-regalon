package src;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PrimeraClase {

    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/?hl=es");


        WebElement inputGoogle = driver.findElement(By.xpath("//input[@name='q']"));
        inputGoogle.sendKeys("selenium");
        inputGoogle.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        WebElement selemiunLabel = driver.findElement(By.xpath("//h3[text()='Selenium']"));
        String label = selemiunLabel.getText();
        Assert.assertEquals(label,"Selenium");

        driver.quit();
    }

}
