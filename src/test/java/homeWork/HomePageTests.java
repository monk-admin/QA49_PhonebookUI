package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{

    @Test
    public void isHomePageComponentPresentTest(){
        Assert.assertTrue(isElementPresent(By.xpath("//img[@alt='Tricentis Demo Web Shop']")));
    }
}
