import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragAndDrop {
    public WebDriver driver;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable");
    }

    @Test
    public void dragAndDrop(){
        WebElement from=driver.findElement(By.cssSelector("#draggable"));
        WebElement to=driver.findElement(By.cssSelector("#droppable"));
        Actions actions=new Actions(driver);

        //actions.dragAndDrop(from,to).perform();
        //Assert.assertEquals(to.getText(),"Dropped!");

        int x=to.getLocation().getX();
        int y=to.getLocation().getY();

        //actions.dragAndDropBy(from,x,y).perform();

        int xFrom=from.getLocation().getX();
        int yFrom=from.getLocation().getY();

        int xOffset= (x-xFrom)+10;
        int yyOffset=(y-yFrom)+20;

        actions.dragAndDropBy(from,xOffset,yyOffset).perform();
        // actions.dragAndDropBy(from,370,100).perform();

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
