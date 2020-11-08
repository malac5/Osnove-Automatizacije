import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Serial {
    public WebDriver driver;
    @Test
    public void ChromeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void FirefoxTest() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.quit();
    }
}
