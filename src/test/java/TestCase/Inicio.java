package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Inicio {

    WebDriver driver;

    By textoInicio = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6");

    public Inicio (WebDriver driver){
        this.driver = driver;

    }
    public String traerTextoInicio(){
        String textoInicio1 = driver.findElement(textoInicio).getText();
        return textoInicio1;
    }

}
