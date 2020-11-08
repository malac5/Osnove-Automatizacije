import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Paralel {
    public WebDriver driver;
    @Test
    public void ChromeTest() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.close();
    }

    @Test
    public void FirefoxTest() {
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.close();
    }
}
