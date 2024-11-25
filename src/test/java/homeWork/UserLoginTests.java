package homeWork;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserLoginTests extends TestBase{

    @Test
    public void UserLogin(){
        //click on Log in link
        click(By.xpath("//a[@href='/login']"));
        type(By.name("Email"),"tomHanks09071956@gmail.com");
        type(By.name("Password"), "Heelo123!");
        click(By.xpath("//input[@value='Log in']"));
        Assert.assertTrue(isElementPresent(By.xpath("//a[.='Log out']")));
    }
}
