package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.time.Duration;

public class Setup {
    public WebDriver driver;
    @BeforeTest
    public void startbrowser() throws InterruptedException {
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    }
    @AfterTest
    public void closeDriver(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.quit();
    }
}
