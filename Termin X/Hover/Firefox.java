import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Firefox {
    public WebDriver driver;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void FirefoxTest() {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
        WebDriverWait wdWait= new WebDriverWait(driver,10);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#homefeatured>li:nth-child(1) img")) );
        Actions actions= new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector("#homefeatured>li:nth-child(1) img"))).perform();


        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#homefeatured>li:nth-child(1) [title='Add to cart']")) );

        driver.findElement(By.cssSelector("#homefeatured>li:nth-child(1) [title='Add to cart']")).click();

        wdWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[title='Continue shopping']>span"))));

        driver.findElement(By.cssSelector("[title='Continue shopping']>span")).click();

        String intNum=driver.findElement(By.cssSelector("[title='View my shopping cart']>span:nth-child(2)")).getText();
        Assert.assertEquals(intNum,"1");

        //driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_UP);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(By.cssSelector(".shopping_cart>a")));
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".shopping_cart>a")) );

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
