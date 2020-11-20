package pom_classes.CTcreateAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CTregisterPage {
    WebDriver driver;
    WebDriverWait wdWait;
    String result;
    public CTregisterPage(WebDriver driver){
        this.driver=driver;
    }

    private By cMessageContainer= By.cssSelector(".alert.alert-success>p");
    
    public void checkMessage(String cMessage){
        Assert.assertEquals(driver.findElement(cMessageContainer).getText(),cMessage);
    }

}
