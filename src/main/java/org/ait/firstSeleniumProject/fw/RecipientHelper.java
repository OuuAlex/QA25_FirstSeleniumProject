package org.ait.firstSeleniumProject.fw;

import org.ait.firstSeleniumProject.models.Recipient;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecipientHelper extends HelperBase {
    public RecipientHelper(WebDriver driver) {
        super(driver);
    }

    public void fillRecipientFields(Recipient recipient) {
        click(By.xpath("//input[@id='giftcard_2_RecipientName']"));
        type(By.xpath("//input[@id='giftcard_2_RecipientName']"), recipient.getRecipientName());
        click(By.xpath("//input[@id='giftcard_2_RecipientEmail']"));
        type(By.xpath("//input[@id='giftcard_2_RecipientEmail']"), recipient.getRecipientEmail());
    }
}
