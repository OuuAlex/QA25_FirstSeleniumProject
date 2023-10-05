package org.ait.firstSeleniumProject.fw;

import org.ait.firstSeleniumProject.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnLogInButton() {
        click(By.xpath("//a[contains(text(),'Log in')]"));
    }

    public void clickOnLongOutButton() {
        click(By.xpath("//a[contains(text(),'Log out')]"));
    }

    public boolean isLoginLinkPresent() {
        return !isElementPresent(By.xpath("//a[contains(text(),'Log in')]"));
    }

    public boolean isMessagePresent(){
        return  isElementPresent(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors ')]"));
    }

    public void clickOnRegistrationButton() {
        click(By.xpath("//input[@id='register-button']"));
    }

    public void fillLoginRegistrationForm(User user) {
        click(By.xpath("//input[@id='gender-female']"));
        type(By.xpath("//input[@id='FirstName']"), user.getFirstName());
        type(By.xpath("//input[@id='LastName']"), user.getSecondName());
        type(By.xpath("//input[@id='Email']"), user.getEmail());
        type(By.xpath("//input[@id='Password']"), user.getPassword());
        type(By.xpath("//input[@id='ConfirmPassword']"), user.getPassword());
    }

    public boolean isLogOutButtonPresent() {
        return isElementPresent2(By.xpath("//a[contains(text(),'Log out')]"));
    }

    public void clickOnLoginButton() {
        click(By.xpath("//input[@class='button-1 login-button']"));
    }

    public void fillLogInForm(User user) {
            click(By.xpath("//input[@id='Email']"));
            type(By.xpath("//input[@id='Email']"), user.getEmail());
            click(By.xpath("//input[@id='Password']"));
            type(By.xpath("//input[@id='Password']"), user.getPassword());
        }

    public void login(){
        clickOnLoginButton();
        fillLogInForm(new User().setEmail("alexouu@gmail.com").setPassword("alexouu123"));
        clickOnLoginButton();
        }
}
