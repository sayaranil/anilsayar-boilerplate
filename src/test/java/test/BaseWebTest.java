package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseWebTest {

    public WebDriver driver;
    public String baseUrl;

    @Before
    public void setUp(){
        //for windows
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Anil Sayar\\Desktop\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","/Users/anilsayar/opt/selenium/chromedriver");

        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--incognito");
        //options.addArguments("disable-popup-blocking");


        driver = new ChromeDriver();
        baseUrl = "URL of page";
        driver.get(baseUrl + "/");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}