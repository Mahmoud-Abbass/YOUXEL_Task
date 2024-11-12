package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePage;



public class BaseTest {
   public static WebDriver driver;
    HomePage homePage;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.manage().window().maximize();


    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://www.amazon.com/");
    }

    @AfterClass
    public void tearDown() {
        //driver.quit();


    }
}







