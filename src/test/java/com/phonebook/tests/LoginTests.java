package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginPositiveTest(){
        //click on Login link
        click(By.cssSelector("[href='/login']"));
        //enter email to email field
        type(By.name("email"), "ukr@hello.com");
        //enter password to password field
        type(By.name("password"), "HeLlo1$!");
        //click on Login button
        click(By.name("login"));
        //verify Sign out button is displayed
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));
    }
}
