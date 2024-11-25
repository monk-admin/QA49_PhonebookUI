package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
    }

    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size()>0;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public boolean isHomePageComponentPresent(){
        return driver.findElements(By.xpath("//div/a/img[@alt='Tricentis Demo Web Shop']")).size()>0;
    }

    public boolean ifExistedUser(){
        return driver.findElements(By.xpath("//li[contains(.,'The specified email already exists')]")).size()>0;
    }

    public void clickOnRegistrationButton() {
        click(By.name("register-button"));
    }

    public void fillRegisterLoginForm(String email, String password) {
        type(By.name("FirstName"), "Tom");
        type(By.name("LastName"), "Hanks");
        type(By.name("Email"), email);
        type(By.name("Password"), password);
        type(By.name("ConfirmPassword"), password);
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector("[href='/register']"));
    }
}
