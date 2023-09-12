package org.ait.qa25;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{

    @Test
    public void isHomeComponentPresentTest(){
       // driver.findElement(By.xpath("//div[@id='nivo-slider']"));
       // System.out.println("Home Component is" + isElementPresent(By.xpath("//div[@id='nivo-slider']")));
        Assert.assertTrue(isElementPresent2(By.xpath("//div[@id='nivo-slider']")));
    }

}
