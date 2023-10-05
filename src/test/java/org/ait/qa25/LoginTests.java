package org.ait.qa25;

import org.ait.firstSeleniumProject.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition(){
        if (app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnLongOutButton();
        }
        app.getUser().clickOnLogInButton();
    }
    @Test
    public void loginPositiveTest () {
        app.getUser().clickOnLogInButton();
        app.getUser().fillLogInForm(new User().setFirstName("Alex")
                .setSecondName("Ouu")
                .setEmail("alexouu@gmail.com")
                .setPassword("Alex.ouu123")
                .setPassword("Alex.ouu123"));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isLogOutButtonPresent());
    }
    @Test
    public void loginNegativeWithoutEmailTest () {
        app.getUser().clickOnLogInButton();
        app.getUser().fillLogInForm(new User().setPassword("Alex.ouu123"));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isMessagePresent());
    }

}
