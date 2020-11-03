package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WinWin {
    public static WebDriver driver;
    String URL="https://www.winwin.rs/customer/account/login/";

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(URL);
    }

    @Test
    @Parameters({"email","pass","message","lokator"})
    public void logIn(String email, String pass, String message, String lokator){
        driver.findElement(By.cssSelector("#email")).sendKeys(email);
        driver.findElement(By.cssSelector("#pass")).sendKeys(pass);

        driver.findElement(By.cssSelector("#send2")).click();

        Assert.assertEquals(driver.findElement(By.cssSelector(lokator)).getText(),message);

    }


    @AfterClass
    public  void tearDown(){
        driver.close();
    }
}
