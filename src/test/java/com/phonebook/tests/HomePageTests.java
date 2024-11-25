package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        if (!app.getHome().isHomePageComponentPresent()){
            app.getHome().clickOnHomeLink();
        }
    }

    @Test
    public void isHomePageComponentPresentTest(){
        //driver.findElement(By.xpath("(//div/h1)[2]"));
        //System.out.println("Home component: " + isHomePageComponentPresent());
        Assert.assertTrue(app.getHome().isHomePageComponentPresent());
    }
}
