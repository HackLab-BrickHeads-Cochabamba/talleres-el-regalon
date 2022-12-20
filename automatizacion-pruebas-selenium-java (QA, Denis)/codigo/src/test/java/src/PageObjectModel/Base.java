package src.PageObjectModel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    private WebDriver driver;

    public Base(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver connection(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }

    public void openURL(String url){
        driver.get(url);
    }

    public void write(By elemen, String texto){
        driver.findElement(elemen).sendKeys(texto);
    }

    public void simulateEnter(By element){
        driver.findElement(element).sendKeys(Keys.ENTER);
    }

    public String getText(By element){
        return driver.findElement(element).getText();
    }

}
