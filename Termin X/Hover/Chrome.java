import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Chrome {
    public WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void ChromeTest() {
        Actions actions= new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector("#homefeatured>li:nth-child(1) img"))).perform();

        WebDriverWait wdWait= new WebDriverWait(driver,10);
        wdWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#homefeatured>li:nth-child(1) [title='Add to cart']>span"))));

        driver.findElement(By.cssSelector("#homefeatured>li:nth-child(1) [title='Add to cart']>span")).click();

        wdWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[title='Continue shopping']>span"))));

        driver.findElement(By.cssSelector("[title='Continue shopping']>span")).click();

        String intNum=driver.findElement(By.cssSelector("[title='View my shopping cart']>span:nth-child(2)")).getText();
        Assert.assertEquals(intNum,"1");

        actions.moveToElement(driver.findElement(By.cssSelector(".shopping_cart>a"))).perform();
        wdWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#button_order_cart>span"))));
        driver.findElement(By.cssSelector("#button_order_cart>span")).click();
        wdWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector(".step_current.first>span")),"01. Summary"));
        Assert.assertEquals(driver.findElement(By.cssSelector(".step_current.first>span")).getText(),"01. Summary");

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
