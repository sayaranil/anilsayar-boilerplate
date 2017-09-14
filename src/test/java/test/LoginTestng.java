package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page.HomePage;

public class LoginTestng extends BaseWebTest {


    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) throws Exception {

        if (browser.equalsIgnoreCase("firefox")) {
            //create firefox instance
            //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anil Sayar\\Desktop\\geckodriver.exe");
            //if you are using mac
            System.setProperty("webdriver.gecko.driver","/Users/anilsayar/opt/selenium/geckodriver");
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette", false);
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","/Users/anilsayar/opt/selenium/chromedriver");
            ChromeOptions opt = new ChromeOptions();
            opt.addArguments("--incognito");
            opt.addArguments("disable-popup-blocking");
            driver = new ChromeDriver(opt);
        }

        baseUrl = "URL of page";
        driver.get(baseUrl + "/");
    }
    @Test
    public void Login(){
        HomePage home = new HomePage(driver);
        home.Login("user eMail","user Pass");
        home.checkLogin();
        home.LogOut();
        home.checkLogOut();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}