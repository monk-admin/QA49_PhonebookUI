package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegistrationPositiveTest(){
        int i = (int)((System.currentTimeMillis()/1000)%3600);
        //click on Login link
        click(By.cssSelector("[href='/login']"));
        //enter email to email field
        type(By.name("email"), "ukr@hello.com");
        //type(By.name("email"), "test" + i + "@hello.com");
        //enter password to password field
        type(By.name("password"), "HeLlo1$!");
        //click on Registration button
        click(By.name("registration"));
        //verify Sign out button is displayed
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out'")));
    }


    @Test
    public void existedUserRegistrationNegativeTest(){
        //click on Login link
        click(By.cssSelector("[href='/login']"));
        //enter email to email field
        type(By.name("email"), "ukr@hello.com");
        //enter password to password field
        type(By.name("password"), "HeLlo1$!");
        //click on Registration button
        click(By.name("registration"));
        //verify Alert is displayed
        Assert.assertTrue(isAlertDisplayed());
    }

}
