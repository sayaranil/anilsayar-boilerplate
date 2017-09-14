package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);}


    public void checkLogin(){
        WebElement LogoutBtn = driver.findElement(logOutBtn);
        Assert.assertTrue("Login fail", LogoutBtn.isDisplayed());
    }


    public void checkLogOut(){
        WebElement LoginBtn  = driver.findElement(loginBtn);
        Assert.assertTrue("LogOut fail", LoginBtn.isDisplayed());
    }
}
