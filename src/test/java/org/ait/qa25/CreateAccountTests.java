package org.ait.qa25;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition(){
        if (!isElementPresent(By.xpath("//a[contains(text(),'Log in')]"))){
            driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
        }
        driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
    }
    @Test
    public void newUserRegistrationPositiveTest(){
        driver.findElement(By.xpath("//input[@class='button-1 register-button']")).click();
        driver.findElement(By.xpath("//input[@id='gender-female']")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).clear();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Alex");
        driver.findElement(By.xpath("//input[@id='LastName']")).click();
        driver.findElement(By.xpath("//input[@id='LastName']")).clear();
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Ouu");
        driver.findElement(By.xpath("//input[@id='Email']")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).clear();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("alexouu@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).click();
        driver.findElement(By.xpath("//input[@id='Password']")).clear();
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Alex.ouu123");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).click();
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).clear();
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Alex.ouu123");
        driver.findElement(By.xpath("//input[@id='register-button']")).click();
        Assert.assertTrue(isElementPresent2(By.xpath("//a[contains(text(),'Log out')]")));

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
