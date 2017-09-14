package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage extends BasePageUtil{

    public BasePage(WebDriver driver){super(driver);}

    public By loginBtn = By.xpath("login buttons area");
    public By logOutBtn = By.xpath("logout buttons area");
    private By loginMail = By.id("email area");
    private By loginPass = By.id("password area");


    public HomePage Login(String eMail,String pass){
        driver.findElement(loginBtn).click();
        driver.findElement(loginMail).sendKeys(eMail);
        driver.findElement(loginPass).sendKeys(pass);

        return new HomePage(driver);
    }

    public HomePage LogOut(){
        driver.findElement(logOutBtn).click();

        return new HomePage(driver);
    }
}
