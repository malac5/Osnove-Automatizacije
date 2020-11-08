import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;
    public static void setUpChrome(String URL){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1920,1080");
        driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(URL);
    }
    public static void setUpFirefox(String URL){
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
        FirefoxOptions options= new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("window-size=1920,1080");
        driver=new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(URL);
    }
    public void takeScreenshot(String name) throws IOException {
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("src/main/resources/Screenshot/"+name+".png"));
    }


}
