package org.ait.qa25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenDemoWebShopTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= new ChromeDriver();
        driver.navigate().to("https://demowebshop.tricentis.com/");
    }

    @Test
    public void openDemoWebShopTest(){
        System.out.println("Site opened!!!");
    }

    @Test
    public void findElementByCssTest(){
        driver.findElement(By.cssSelector("form"));
        driver.findElement(By.cssSelector("[class$='close']"));
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector(".master-wrapper-page"));
        driver.findElement(By.cssSelector("[name='q']"));
        driver.findElement(By.cssSelector("[class^='topic-html-content-header']"));
        driver.findElement(By.cssSelector(".block-category-navigation"));
        driver.findElement(By.cssSelector(".close"));
        driver.findElement(By.cssSelector("#flyout-cart"));
    }

    @Test
    public void findElementByXpathTest() {

        driver.findElement(By.xpath("//form"));
        driver.findElement(By.xpath("//body/div[@id='bar-notification']/span[1]"));
        driver.findElement(By.xpath("//div[@id='bar-notification']"));
        driver.findElement(By.xpath("//div[@id='flyout-cart']"));
        driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
        driver.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]"));
        driver.findElement(By.xpath("//body/div[@id='bar-notification']/span[1]"));

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
