package org.ait.firstSeleniumProject.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductHelper extends HelperBase {
    public ProductHelper(WebDriver driver) {
        super(driver);
    }

    public void clickToShoppingCart() {
        click(By.xpath("//a[contains(text(),'shopping cart')]"));
    }

    public void clickAddToCartButton() {
        click(By.xpath("//input[@id='add-to-cart-button-2']"));
    }

    public boolean isProductAdded(String text){
        List<WebElement> products = driver.findElements(By.xpath("//tr[@class='cart-item-row']"));
        for (WebElement el: products){
            if (el.isEnabled())
                return true;
        }
        return false;
    }

    public void clickOnProduct() {
         click(By.cssSelector("div.master-wrapper-page:nth-child(4) div.master-wrapper-content div.master-wrapper-main:nth-child(5) div.center-3 div.page.home-page div.page-body div.product-grid.home-page-product-grid:nth-child(4) div.item-box:nth-child(2) div.product-item div.picture a:nth-child(1) > img:nth-child(1)"));
     }

    public void clickToRemoveProduct() {
        click(By.xpath("//input[@class='button-2 update-cart-button']"));
    }

    public void clickOnSelectedProduct() {
        click(By.xpath("//tbody/tr[1]/td[1]/input[1]"));
    }
}
