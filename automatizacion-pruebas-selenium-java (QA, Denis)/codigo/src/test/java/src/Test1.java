package src;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test1 {
    private WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/?hl=es");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void pruebaGoogle() throws InterruptedException {
        WebElement inputGoogle = driver.findElement(By.xpath("//input[@name='q']"));
        inputGoogle.sendKeys("selenium");
        inputGoogle.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        WebElement selemiunLabel = driver.findElement(By.xpath("//h3[text()='Selenium']"));
        String label = selemiunLabel.getText();
        Assert.assertEquals(label,"Selenium");
    }
}
