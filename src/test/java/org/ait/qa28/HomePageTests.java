package org.ait.qa28;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.getHomePage().isHomeComponentPresent()){
            app.getHomePage().clickOnHomeLink();
        }
    }

    @Test
    public void isHomeComponentPresentTest(){
       // driver.findElement(By.xpath("//div[@id='nivo-slider']"));
       // System.out.println("Home Component is" + isElementPresent(By.xpath("//div[@id='nivo-slider']")));
        Assert.assertTrue(app.getHomePage().isElementPresent2(By.xpath("//div[@id='nivo-slider']")));
    }

}
