import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Yahoo {
    public static WebDriver driver;
    String URL="https://www.yahoo.com/";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void yahooSearch() throws InterruptedException {
        driver.get(URL);
        driver.findElement(By.cssSelector("[name=p]")).sendKeys("QAItive");
        driver.findElement(By.cssSelector(".rapid-noclick-resp._yb_ibx5x")).click();
        //driver.findElement(By.cssSelector(".rapid-noclick-resp._yb_8s7nv")).click();
        Thread.sleep(3000);

        Assert.assertTrue(driver.findElement(By.cssSelector(".dd.algo.algo-sr.relsrch.fst.Sr")).getText().contains("www.qaitive.rs"));
        //Assert.assertTrue(driver.findElement(By.cssSelector("#ysch")).getText().contains("www.qaitive.rs"));
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
