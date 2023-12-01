package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCaseProd2 {

    WebDriver driver;

    By productoRosas = By.xpath("//*[@id=\"destacados-tab\"]/div[2]/div/ul/li[4]/a[2]/img");

    By agregarUnidades = By.id("quantity_656a1491e9cd7");
    By agregarAlCarrito = By.name("add-to-cart");

    public TestCaseProd2(WebDriver driver){
        this.driver = driver;
    }

    public void botonesProd2(){
        driver.findElement(productoRosas).click();
        driver.findElement(agregarUnidades).clear();
        driver.findElement(agregarUnidades).sendKeys("2");
        driver.findElement(agregarAlCarrito).click();
    }

}
