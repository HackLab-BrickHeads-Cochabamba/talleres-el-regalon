package src.PageObjectModel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class TestGoogleSearch {
    private WebDriver driver;
    private BuscarEnGooglePage busqueda;

    @Before
    public void setUp(){
        busqueda = new BuscarEnGooglePage(driver);
        busqueda.connection();
        busqueda.openURL("https://www.google.com/?hl=es");
    }

    @After
    public void tearDown(){

    }

    @Test
    public void pruebaGoogle() throws InterruptedException {
        busqueda.buscar();
        busqueda.validarBusqueda();

    }
}
