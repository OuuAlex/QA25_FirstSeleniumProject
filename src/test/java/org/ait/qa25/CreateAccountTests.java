package org.ait.qa25;

import org.ait.firstSeleniumProject.models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition(){
        if (app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnLongOutButton();
        }
        app.getUser().clickOnLogInButton();
    }

    @Test
    public void existedUserRegistrationNegativeTest(){
        app.getUser().click(By.xpath("//input[@class='button-1 register-button']"));
        app.getUser().fillLoginRegistrationForm(new User().setEmail("alexouu@gmail.com")
                .setPassword("Alex.ouu123")
                .setFirstName("Alex")
                .setSecondName("Ouu"));
        app.getUser().clickOnRegistrationButton();
        Assert.assertTrue(app.getUser().isElementPresent2(By.xpath("//li[contains(text(),'The specified email already exists')]")));


    }

    //
    //input[@class='button-1 register-button']
    //input[@id='gender-female']
    //input[@id='FirstName']
    //input[@id='LastName']
    //input[@id='Email']
    //input[@id='Password']
    //input[@id='ConfirmPassword']
    //input[@id='register-button']
}
