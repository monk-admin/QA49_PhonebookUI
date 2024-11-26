package homeWork;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test(enabled = false)
    public void userRegPosTest(){
        int i = (int)((System.currentTimeMillis()/1000)%3600);
        clickOnRegisterLink();
        fillRegisterLoginForm("tomHanks" + i + "@gmail.com", "Heelo123!");
        clickOnRegistrationButton();
        Assert.assertTrue(isElementPresent(By.xpath("//a[.='Log out']")));
    }

    @Test
    public void userRegNegativeTest(){
        clickOnRegisterLink();
        fillRegisterLoginForm("tomHanks09071956@gmail.com", "Heelo123!");
        clickOnRegistrationButton();
        Assert.assertTrue(isElementPresent(By.xpath("//li[contains(.,'The specified email already exists')]")));
    }

}
