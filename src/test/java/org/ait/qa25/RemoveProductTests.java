package org.ait.qa25;

import org.ait.firstSeleniumProject.models.Recipient;
import org.ait.firstSeleniumProject.models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveProductTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition(){
        if (app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnLongOutButton();
        }
        app.getUser().clickOnLogInButton();
        app.getUser().fillLogInForm(new User().setEmail("alexouu@gmail.com").setPassword("Alex.ouu123"));
        app.getUser().clickOnLoginButton();
        app.getProduct().clickOnProduct();
        app.getRecipient().fillRecipientFields(new Recipient().setRecipientName("Alex").setRecipientEmail("alexouu@gmail.com"));
        app.getProduct().clickAddToCartButton();
        app.getProduct().clickToShoppingCart();
    }

    @Test
    public void removeProductPositiveTest(){
        int sizeBefore = sizeOfProducts();
        app.getProduct().clickOnSelectedProduct();
        app.getProduct().clickToRemoveProduct();
        int sizeAfter = sizeOfProducts();
        Assert.assertEquals(sizeAfter, sizeBefore-1);

    }

    public int sizeOfProducts(){
        if(app.getUser().isElementPresent(By.xpath("//tbody/tr[1]/td[1]/input[1]"))){
            return app.driver.findElements(By.xpath("//tbody/tr[1]/td[1]/input[1]")).size();
        }
        return 0;
    }


}
