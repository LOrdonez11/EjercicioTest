package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class Login {
    WebDriver driver;

    By campoUserName = By.name("username");
    By campoPassword = By.name("password");
    By botonLogin = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void inicioSesion(){
        driver.findElement(campoUserName).sendKeys("Admin");
        driver.findElement(campoPassword).sendKeys("admin123");
        driver.findElement(botonLogin).click();
    }

}
