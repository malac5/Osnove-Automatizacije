import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");
        String URL = "https://www.google.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("[name=q]")).sendKeys("QAItive");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("[name=btnK]")).click();
        Thread.sleep(5000);
        String savText = driver.findElement(By.cssSelector("#gsr")).getText();
        if(savText.contains("www.qaitive.rs")){
            System.out.println("Pronadjen text");
        } else {
            System.out.println("Nije pronadjen text");
        }
        Thread.sleep(5000);
        driver.close();
    }

}
