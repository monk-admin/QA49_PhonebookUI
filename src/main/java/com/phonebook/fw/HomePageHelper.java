package com.phonebook.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends BaseHelper{

    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isHomePageComponentPresent(){
        return isElementPresent(By.xpath("(//div/h1)[2]"));
    }

    public void clickOnHomeLink() {
        click(By.cssSelector("[href='/home']"));
    }
}
