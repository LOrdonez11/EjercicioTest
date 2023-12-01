package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Carrito1 {
    WebDriver driver;

    By carritoCompra = By.xpath("//*[@id=\"post-196\"]/header");

    public Carrito1(WebDriver driver){
        this.driver = driver;
    }

    public String traerTextoCarrito(){
        String textoCompra = driver.findElement(carritoCompra).getText();
        return textoCompra;

    }

}
