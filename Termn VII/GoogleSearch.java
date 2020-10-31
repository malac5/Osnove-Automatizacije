
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearch {
    public static WebDriver driver;
    String URL="https://www.google.com";
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void googleSearch(){
        driver.get(URL);
        driver.findElement(By.cssSelector("[name=q]")).sendKeys("QAItive");
        driver.findElement(By.cssSelector("[name=btnK]")).click();

        Assert.assertTrue(driver.findElement(By.id("#gsr")).getText().contains("www.qaitive.rs"));

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
