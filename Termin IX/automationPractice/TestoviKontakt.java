package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestoviKontakt {
    public static WebDriver driver;

    String URL="http://automationpractice.com/index.php";

    @BeforeClass
    @Parameters("browser")
    public void setUp(String browser) {

        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
            driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
            driver= new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

    }

    @Test
    @Parameters({"email","orderID","message","alertMessage","alertSelektor","subjectValue"})
    public void fillContactForm(String email, String orderID, String message, String alertMessage, String alertSelektor, String subjectValue){
        driver.get(URL);

        driver.findElement(By.cssSelector("#contact-link>a")).click();
        Select subject=new Select(driver.findElement(By.cssSelector("#id_contact")));
        subject.selectByVisibleText(subjectValue);
        driver.findElement(By.cssSelector("#email")).sendKeys(email);
        driver.findElement(By.cssSelector("#id_order")).sendKeys(orderID);
        driver.findElement(By.cssSelector("#message")).sendKeys(message);
        driver.findElement(By.cssSelector("#submitMessage")).click();

        Assert.assertEquals(driver.findElement(By.cssSelector(alertSelektor)).getText(),alertMessage);


    }

    @AfterClass
    public void tearDown(){
        driver.close();
        //driver.quit();
    }

}
