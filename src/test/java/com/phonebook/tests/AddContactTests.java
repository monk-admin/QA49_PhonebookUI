package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase{

    //login
    @BeforeMethod
    public void precondition(){
        click(By.cssSelector("[href='/login']"));
        type(By.name("email"), "ukr@hello.com");
        type(By.name("password"), "HeLlo1$!");
        click(By.name("login"));
    }

    @Test
    public void addContactPositiveTest(){
        //click on Add link
        click(By.cssSelector("[href='/add']"));
        //enter name
        type(By.cssSelector("input:nth-child(1)"),"Karl");
        //enter LastName
        type(By.cssSelector("input:nth-child(2)"),"Adam");
        //enter phone
        type(By.cssSelector("input:nth-child(3)"),"123456789011");
        //enter email
        type(By.cssSelector("input:nth-child(4)"),"Karl@gm.com");
        //enter address
        type(By.cssSelector("input:nth-child(5)"),"Berlin");
        //enter description
        type(By.cssSelector("input:nth-child(6)"),"goalkeeper");
        //click on Save button
        click(By.cssSelector(".add_form__2rsm2 button"));
        //verify contact is added
    }


    //enter name
    //enter LastName
    //enter phone
    //enter email
    //enter address
    //enter description
    //click on Save button
    //verify contact is added
}
