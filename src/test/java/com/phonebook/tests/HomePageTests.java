package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{

    @Test
    public void isHomePageComponentPresentTest(){
        //driver.findElement(By.xpath("(//div/h1)[2]"));
        //System.out.println("Home component: " + isHomePageComponentPresent());
        Assert.assertTrue(isHomePageComponentPresent());
    }

}
