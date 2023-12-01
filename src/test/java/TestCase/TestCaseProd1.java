package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCaseProd1 {
    WebDriver driver;

    By producto1 = By.xpath("//*[@id=\"destacados-tab\"]/div[2]/div/ul/li[1]/a/img");
    By agregarCarrito1 = By.name("add-to-cart");
    By titulo = By.xpath("//*[@id=\"sticky-wrapper\"]/header/div[2]/div/a/img");

    By producto2 = By.xpath("//*[@id=\"destacados-tab\"]/div[2]/div/ul/li[2]/a[2]/img");
    By agregarCarrito2 = By.name("add-to-cart");



    public TestCaseProd1(WebDriver driver){
        this.driver = driver;
    }

    public void botonProducto1() {
        driver.findElement(producto1).click();
        driver.findElement(agregarCarrito1).click();
        driver.findElement(titulo).click();
        driver.findElement(producto2).click();
        driver.findElement(agregarCarrito2).click();

    }
}
