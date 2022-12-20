package src.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

public class BuscarEnGooglePage extends Base{
     private By inputGoogle = By.xpath("//input[@name='q']");
     private By labelToCompare = By.xpath("//h3[text()='Selenium']");

    public BuscarEnGooglePage(WebDriver driver) {
        super(driver);
    }

    public void buscar() throws InterruptedException {
        super.write(inputGoogle,"Selenium");
        super.simulateEnter(inputGoogle);
        Thread.sleep(5000);
    }

    public void validarBusqueda(){
        String label = super.getText(labelToCompare);
        Assert.assertEquals(label,"Selenium");
    }


}
