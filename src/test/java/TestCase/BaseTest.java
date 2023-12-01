package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Variables;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    protected Login login;
    protected Inicio inicio;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/lauraordonez/programas/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Variables.TIME_OUT));
        driver.manage().window().maximize();
        driver.get(Variables.BASE_TEST);

        login = new Login(driver);
        inicio = new Inicio(driver);
    }
    @AfterMethod
    public void bajar(){
        driver.quit();
    }

}
