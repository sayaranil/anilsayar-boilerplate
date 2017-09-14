package test;

import org.junit.Test;
import page.HomePage;

public class LoginTest extends BaseWebTest {


    @Test
    public void LoginTest(){
        HomePage home = new HomePage(driver);
        home.Login("user eMail","user Pass");
        home.checkLogin();
        home.LogOut();
        home.checkLogOut();

    }
}
