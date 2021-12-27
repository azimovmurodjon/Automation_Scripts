import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @BeforeTest
    public static void maximizeBrowser(){
        driver.manage().window().maximize();
    }


    @Test(testName = "Submit a SignUpForm")
    public static void submitForm() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        SignUpForm signUpForm = new SignUpForm(driver);
        signUpForm.clickLogin();
        signUpForm.enterEmail();
        signUpForm.clickCreateAccountBtn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        signUpForm.selectGender();
        signUpForm.enterFirstName();
        signUpForm.enterLastName();
        signUpForm.enterPassword();
        signUpForm.selectDate();
        signUpForm.selectMonth();
        signUpForm.selectYear();
        signUpForm.checkCheckBox();
        signUpForm.enterRealFirstName();
        signUpForm.enterRealLastName();
        signUpForm.enterConpanyName();
        signUpForm.enterAddress();
        signUpForm.enterCity();
        signUpForm.selectState();
        signUpForm.enterZipCode();
        signUpForm.enterAdditionalComments();
        signUpForm.enterHomePhoneNumber();
        signUpForm.enterMobilePhoneNumber();
        signUpForm.enterAliesAddress();
        signUpForm.clickRegisterBtn();
        TakesScreenshot ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);

        try {
            //save the screenshot taken in destination path
            FileUtils.copyFile(file, new File("/Users/m.j./IdeaProjects/Automation/ScreenShot_Folder/Test1_Login.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        signUpForm.clickSingOut();
        signUpForm.clickLogin();
        signUpForm.enterLoginEmail();
        signUpForm.enterPassword();
        signUpForm.clickLoginBtn();
        System.out.println("the login page screenshot is taken");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test(testName = "Login Page")
    public void Login(){
        driver.get(Utils.BASE_URL);
        SignUpForm signUpForm = new SignUpForm(driver);
        signUpForm.clickLogin();
        signUpForm.enterLoginEmail();
        signUpForm.enterPassword();
        signUpForm.clickLoginBtn();
    }


    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}