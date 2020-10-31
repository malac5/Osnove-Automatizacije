import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PracticeTests {
    public static WebDriver driver;

    String URL="http://automationpractice.com/index.php";

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(URL);
    }

    @Test
    public void fillInContactForm(){
        driver.findElement(By.cssSelector("#contact-link>a")).click();
        Select subSelect=new Select(driver.findElement(By.cssSelector("#id_contact")));
        subSelect.selectByValue("2");
        WebDriverWait wdWait=new WebDriverWait(driver,10);
        wdWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector("#desc_contact2")),"For any question about a product, an order"));
        String text=driver.findElement(By.cssSelector("#desc_contact2")).getText();
        driver.findElement(By.cssSelector("#email")).sendKeys("nekimail@gmail.com");
        driver.findElement(By.cssSelector(".form-group.selector1>.form-control.grey")).sendKeys("uztjhk");
        driver.findElement(By.cssSelector("#fileUpload")).sendKeys("C:\\Users\\ikapi\\Desktop\\test.txt");
        driver.findElement(By.cssSelector("#message")).sendKeys(text);
        driver.findElement(By.cssSelector("#submitMessage")).click();
        wdWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector(".alert.alert-success")),"Your message has been successfully sent to our team."));
        Assert.assertTrue(driver.findElement(By.cssSelector(".alert.alert-success")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.cssSelector(".alert.alert-success")).getText(),"Your message has been successfully sent to our team.");
        Assert.assertEquals(driver.findElement(By.cssSelector(".alert.alert-success")).getCssValue("background-color"),"rgba(85, 198, 94, 1)");
    }

    @Test
    public void fillInContactFormInvalid(){
        driver.findElement(By.cssSelector("#contact-link>a")).click();
        Select subSelect=new Select(driver.findElement(By.cssSelector("#id_contact")));
        subSelect.selectByValue("2");
        WebDriverWait wdWait=new WebDriverWait(driver,10);
        wdWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector("#desc_contact2")),"For any question about a product, an order"));
        String text=driver.findElement(By.cssSelector("#desc_contact2")).getText();
        //driver.findElement(By.cssSelector("#email")).sendKeys("nekimail@gmail.com");
        driver.findElement(By.cssSelector(".form-group.selector1>.form-control.grey")).sendKeys("uztjhk");
        driver.findElement(By.cssSelector("#fileUpload")).sendKeys("C:\\Users\\ikapi\\Desktop\\test.txt");
        driver.findElement(By.cssSelector("#message")).sendKeys(text);
        driver.findElement(By.cssSelector("#submitMessage")).click();
        wdWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector(".alert.alert-danger>ol>li")),"Invalid email address."));
        Assert.assertTrue(driver.findElement(By.cssSelector(".alert.alert-danger")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.cssSelector(".alert.alert-danger")).getText(),"There is 1 error\n" +"Invalid email address.");
        Assert.assertEquals(driver.findElement(By.cssSelector(".alert.alert-danger")).getCssValue("background-color"),"rgba(243, 81, 92, 1)");
    }

    @Test
    public void fillInContactFormInvalidMessage(){
        driver.findElement(By.cssSelector("#contact-link>a")).click();
        Select subSelect=new Select(driver.findElement(By.cssSelector("#id_contact")));
        subSelect.selectByValue("2");
        WebDriverWait wdWait=new WebDriverWait(driver,10);
        wdWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector("#desc_contact2")),"For any question about a product, an order"));
        String text=driver.findElement(By.cssSelector("#desc_contact2")).getText();
        driver.findElement(By.cssSelector("#email")).sendKeys("nekimail@gmail.com");
        driver.findElement(By.cssSelector(".form-group.selector1>.form-control.grey")).sendKeys("uztjhk");
        driver.findElement(By.cssSelector("#fileUpload")).sendKeys("C:\\Users\\ikapi\\Desktop\\test.txt");
        //driver.findElement(By.cssSelector("#message")).sendKeys(text);
        driver.findElement(By.cssSelector("#submitMessage")).click();
        wdWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector(".alert.alert-danger>ol>li")),"The message cannot be blank."));
        Assert.assertTrue(driver.findElement(By.cssSelector(".alert.alert-danger")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.cssSelector(".alert.alert-danger")).getText(),"There is 1 error\n" +"The message cannot be blank.");
        Assert.assertEquals(driver.findElement(By.cssSelector(".alert.alert-danger")).getCssValue("background-color"),"rgba(243, 81, 92, 1)");
    }

    @Test
    public void fillInContactFormInvalidEmail(){
        driver.findElement(By.cssSelector("#contact-link>a")).click();
        Select subSelect=new Select(driver.findElement(By.cssSelector("#id_contact")));
        subSelect.selectByValue("2");
        WebDriverWait wdWait=new WebDriverWait(driver,10);
        wdWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector("#desc_contact2")),"For any question about a product, an order"));
        String text=driver.findElement(By.cssSelector("#desc_contact2")).getText();
        driver.findElement(By.cssSelector("#email")).sendKeys("sdadas");
        driver.findElement(By.cssSelector(".form-group.selector1>.form-control.grey")).sendKeys("uztjhk");
        driver.findElement(By.cssSelector("#fileUpload")).sendKeys("C:\\Users\\ikapi\\Desktop\\test.txt");
        driver.findElement(By.cssSelector("#message")).sendKeys(text);
        driver.findElement(By.cssSelector("#submitMessage")).click();
        wdWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector(".alert.alert-danger>ol>li")),"Invalid email address."));
        Assert.assertEquals(driver.findElement(By.id("email")).getCssValue("color"),"rgba(156, 155, 155, 1)");
        //dodaj Assert.assertEquals za boje

        Assert.assertTrue(driver.findElement(By.cssSelector(".alert.alert-danger")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.cssSelector(".alert.alert-danger")).getText(),"There is 1 error\n" +"Invalid email address.");
        Assert.assertEquals(driver.findElement(By.cssSelector(".alert.alert-danger")).getCssValue("background-color"),"rgba(243, 81, 92, 1)");
    }

    @Test
    public void signUp(){

        Random num=new Random();
        int a=num.nextInt(200);

        driver.findElement(By.cssSelector(".header_user_info>a")).click();
        WebDriverWait wdWait=new WebDriverWait(driver,5);
        wdWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#email_create")));
        driver.findElement(By.cssSelector("#email_create")).sendKeys("qwerty@"+a+"nekimail.com");
        driver.findElement(By.cssSelector("#SubmitCreate")).click();
        wdWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#id_gender2"))));
        driver.findElement(By.cssSelector("#id_gender2")).click();
        driver.findElement(By.cssSelector("#customer_firstname")).sendKeys("ImeNeko");
        driver.findElement(By.cssSelector("#customer_lastname")).sendKeys("PrezimeNeko");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("qwerty@"+a+"nekimail.com");
        driver.findElement(By.id("passwd")).sendKeys("testPass1231");
        Select day=new Select(driver.findElement(By.id("days")));
        day.selectByValue("22");
        Select month=new Select(driver.findElement(By.id("months")));
        month.selectByValue("2");
        Select years=new Select(driver.findElement(By.id("years")));
        years.selectByValue("1992");
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys("ImeNeko");
        driver.findElement(By.id("lastname")).sendKeys("PrezimeNeko");
        driver.findElement(By.id("company")).sendKeys("KompanijaNeka");
        driver.findElement(By.id("address1")).sendKeys("Adresa1");
        driver.findElement(By.id("address2")).sendKeys("Adresa2");
        driver.findElement(By.id("city")).sendKeys("GradNeki");
        Select state=new Select(driver.findElement(By.id("id_state")));
        state.selectByVisibleText("Oregon");
        driver.findElement(By.id("postcode")).sendKeys("12312");
        Select country=new Select(driver.findElement(By.id("id_country")));
        country.selectByVisibleText("United States");
        driver.findElement(By.id("other")).sendKeys("Nesto");
        driver.findElement(By.id("phone")).sendKeys("0848493");
        driver.findElement(By.id("phone_mobile")).sendKeys("0848493345345");
        driver.findElement(By.id("alias")).sendKeys("nestoo");
        driver.findElement(By.id("submitAccount")).click();

        wdWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[title='Log me out']")));
        driver.findElement(By.cssSelector("[title='Log me out']")).click();

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
