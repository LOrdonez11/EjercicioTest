package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Variables;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    protected TestCaseProd1 testCaseProd1;
    protected Carrito1 carrito1;
    protected TestCaseProd2 testCaseProd2;


    @BeforeMethod
    public void setup(){
        //aqui estoy guardando el chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/lauraordonez/programas/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Variables.TIME_OUT));
        driver.manage().window().maximize();
        driver.get(Variables.BASE_URL);

        testCaseProd1 = new TestCaseProd1(driver);
        carrito1 = new Carrito1(driver);
        testCaseProd2 = new TestCaseProd2(driver);

    }
    @AfterMethod
    public void bajar(){
        driver.quit();
    }

}
