import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Homework {

    public static WebDriver driver;
//Environment
    String URL="http://automationpractice.com/index.php";

//Lokatori
    String signInButton=".login";
    String emailCreate="[name='email_create']";
    String createBtn=".btn.btn-default.button.button-medium.exclusive";
    String warningError=".alert.alert-danger";
    String registerBtn="[name='submitAccount']";
    String password=".required.password.form-group.form-error>.is_required.validate.form-control";
    String firstName1="[name='customer_firstname']";
    String lastName1="[name='customer_lastname']";
    String emailRegister=".is_required.validate.form-control[name='email'] ";
    String days="[name='days']";
    String months="[name='months']";
    String yearss="[name='years']";
    String firstName2="[name='firstname']";
    String lastName2="[name='lastname']";
    String company="[name='company']";
    String address="[name='address1']";
    String city="[name='city']";
    String states="[name='id_state']";
    String zip="[name='postcode']";
    String countrys="[name='id_country']";
    String additional="[name='other']";
    String phone="[name='phone']";
    String mobile="[name='phone_mobile']";
    String alias="[name='alias']";

//Expected error message
    String expEmailError="Invalid email address.";
    String expFieldsError="There are 8 errors\n" + "You must register at least one phone number.\n" + "lastname is required.\n" + "firstname is required.\n" + "passwd is required.\n" + "address1 is required.\n" + "city is required.\n" + "The Zip/Postal code you've entered is invalid. It must follow this format: 00000\n" + "This country requires you to choose a State.";
    String expRfieldsError="There are 4 errors\n" + "lastname is required.\n" + "firstname is required.\n" + "email is required.\n" + "passwd is required.";

//Test data
    Random num=new Random();
    int a=num.nextInt(200);
    String email="neki"+a+"@email.com";
    String firstName="Ime";
    String lastName="Prezime";
    String companyName="Kompanija";
    String addressa="Adresa";
    String grad="Beograd";
    String postal="12323";
    String other="nesto";
    String phoneNum="123445";
    String mobileNum="253645242";
    String aliasVal="My address";


    @BeforeClass
    public void setUp() {
//namestimo putanju do chrome drivera
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver =new ChromeDriver();
//podesimo velicinu prozora
        driver.manage().window().maximize();
//implicitno cekanje
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//pozivamo okruzenje
        driver.get(URL);
    }

//01.TC. Submit email field empty

    @Test
    public void emptyEmail(){
    //klik na Sign In button
        driver.findElement(By.cssSelector(signInButton)).click();
    //klik na Create an account button
        driver.findElement(By.cssSelector(createBtn)).click();

    //eksplictno cekanje
        WebDriverWait wdWait=new WebDriverWait(driver,10);
        wdWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector(warningError)),expEmailError));
    //provera da li je vidljiva poruka
        Assert.assertTrue(driver.findElement(By.cssSelector(warningError)).isDisplayed());
    //provera da li se tekst poklapa
        Assert.assertEquals(driver.findElement(By.cssSelector(warningError)).getText(),expEmailError);
    //provera da li se boja poklapa
        Assert.assertEquals(driver.findElement(By.cssSelector(warningError)).getCssValue("background-color"),"rgba(243, 81, 92, 1)");
    }

//02.TC. Submit all fields empty
    @Test
    public void emptyFields(){

        driver.findElement(By.cssSelector(signInButton)).click();
        driver.findElement(By.cssSelector(emailCreate)).sendKeys(email);
        driver.findElement(By.cssSelector(createBtn)).click();

        WebDriverWait wdWait=new WebDriverWait(driver,10);
        wdWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(registerBtn))));

        driver.findElement(By.cssSelector(registerBtn)).click();
        Assert.assertTrue(driver.findElement(By.cssSelector(warningError)).isDisplayed());
        Assert.assertEquals(driver.findElement(By.cssSelector(warningError)).getText(),expFieldsError);
        Assert.assertEquals(driver.findElement(By.cssSelector(warningError)).getCssValue("background-color"),"rgba(243, 81, 92, 1)");
    }

//03.TC. Submit required fields empty
    @Test
    public void requiredEmpty() {

        driver.findElement(By.cssSelector(signInButton)).click();
        driver.findElement(By.cssSelector(emailCreate)).sendKeys(email);
        driver.findElement(By.cssSelector(createBtn)).click();


        WebDriverWait wdWait=new WebDriverWait(driver,20);
        wdWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(registerBtn))));

        driver.findElement(By.cssSelector(emailRegister)).clear();
        Select day=new Select(driver.findElement(By.cssSelector(days)));
        day.selectByValue("22");
        Select month=new Select(driver.findElement(By.cssSelector(months)));
        month.selectByValue("2");
        Select years=new Select(driver.findElement(By.cssSelector(yearss)));
        years.selectByValue("1992");
        driver.findElement(By.cssSelector(firstName2)).sendKeys(firstName);
        driver.findElement(By.cssSelector(lastName2)).sendKeys(lastName);
        driver.findElement(By.cssSelector(company)).sendKeys(companyName);
        driver.findElement(By.cssSelector(address)).sendKeys(addressa);
        driver.findElement(By.cssSelector(city)).sendKeys(grad);
        Select state=new Select(driver.findElement(By.cssSelector(states)));
        state.selectByVisibleText("Alaska");
        driver.findElement(By.cssSelector(zip)).sendKeys(postal);
        Select country=new Select(driver.findElement(By.cssSelector(countrys)));
        country.selectByVisibleText("United States");
        driver.findElement(By.cssSelector(additional)).sendKeys(other);
        driver.findElement(By.cssSelector(phone)).sendKeys(phoneNum);
        driver.findElement(By.cssSelector(mobile)).sendKeys(mobileNum);
        driver.findElement(By.cssSelector(alias)).sendKeys(aliasVal);
        driver.findElement(By.cssSelector(registerBtn)).click();

        wdWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector(warningError)),expRfieldsError));
        Assert.assertTrue(driver.findElement(By.cssSelector(warningError)).isDisplayed());
        Assert.assertEquals(driver.findElement(By.cssSelector(warningError)).getText(),expRfieldsError);
        Assert.assertEquals(driver.findElement(By.cssSelector(warningError)).getCssValue("background-color"),"rgba(243, 81, 92, 1)");

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
