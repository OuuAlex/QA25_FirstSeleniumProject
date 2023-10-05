package org.ait.qa25;

import org.ait.firstSeleniumProject.models.Recipient;
import org.ait.firstSeleniumProject.models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddProductTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        if (app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnLongOutButton();
        }
        app.getUser().clickOnLogInButton();
        app.getUser().fillLogInForm(new User().setEmail("alexouu@gmail.com").setPassword("Alex.ouu123"));
        app.getUser().clickOnLoginButton();
        app.getProduct().clickOnProduct();
    }
    @Test
    public void addProductPositiveTest(){
        app.getRecipient().fillRecipientFields(new Recipient().setRecipientName("Alex").setRecipientEmail("alexouu@gmail.com"));
        app.getProduct().clickAddToCartButton();
        app.getProduct().clickToShoppingCart();
        Assert.assertTrue(app.getProduct().isProductAdded("$25 Virtual Gift Card"));
    }

    @AfterMethod
    public void postCondition(){
        app.getProduct().clickOnSelectedProduct();
        app.getProduct().clickToRemoveProduct();
    }
}
