import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(CustomListener.class)
public class Firefox extends Base{
    String URL="https://www.winwin.rs/customer/account/login/";
    @BeforeMethod
    public void setFirefox(){
        setUpFirefox(URL);
    }

    @Test
    @Parameters({"email","pass","btnLokator","message","emailLokator","passLokator","messageLokator"})
    public void loginSuccessfullyFirefox(String email,String pass, String btnLokator,String message,String emailLokator, String passLokator,String messageLokator){
        driver.findElement(By.cssSelector(emailLokator)).sendKeys(email);
        driver.findElement(By.cssSelector(passLokator)).sendKeys(pass);
        driver.findElement(By.cssSelector(btnLokator)).click();

        WebDriverWait wdWait= new WebDriverWait(driver,10);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(messageLokator)));

        Assert.assertEquals(driver.findElement(By.cssSelector(messageLokator)).getText(),message);


    }

    @Test
    @Parameters({"email","pass","btnLokator","message","emailLokator","passLokator","messageLokator"})
    public void loginFailFirefox(String email,String pass, String btnLokator,String message,String emailLokator, String passLokator,String messageLokator){
        driver.findElement(By.cssSelector(emailLokator)).sendKeys(email);
        driver.findElement(By.cssSelector(passLokator)).sendKeys(pass);
        driver.findElement(By.cssSelector(btnLokator)).click();

        WebDriverWait wdWait= new WebDriverWait(driver,10);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(messageLokator)));

        Assert.assertEquals(driver.findElement(By.cssSelector(messageLokator)).getText(),message);
    }

    @AfterMethod
    public void tearDownFirefox(){
        driver.quit();
    }
}
