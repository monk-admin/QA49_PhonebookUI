package homeWork;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void userRegPosTest(){
        //click on Login link
        click(By.cssSelector("[href='/register']"));
        //enter name to First name field
        type(By.name("FirstName"), "Tom");
        //enter last name to Last Name field
        type(By.name("LastName"), "Hanks");
        //enter email to Email field
        type(By.name("Email"), "tomHanks09071956@gmail.com");
        //enter password to password field
        type(By.name("Password"), "Heelo123!");
        //confirm the password in the Confirm password field
        type(By.name("ConfirmPassword"), "Heelo123!");
        //click on Register button
        click(By.name("register-button"));

    }
}
