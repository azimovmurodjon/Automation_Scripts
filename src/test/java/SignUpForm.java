// Page URL: https://www.phptravels.net/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.List;
import java.util.Random;

public class SignUpForm extends PageObject{

    Random r = new Random();

    private final String REAL_FIRST_NAME = "Murodjon";
    private final String REAL_LAST_NAME = "Azimov";
    private final String FIRST_NAME = "First Name";
    private final String LAST_NAME = "Last Name";
    private final String MOBILE_PHONE_NUMBER = "412-000-0000";
    private final String HOME_PHONE_NUMBER = "412-111-1111";
    private final String EMAIL = "azimovm.j@gmail.com";
    private final String PASSWORD = "mura9780879";
    private final String COMPANY_NAME = "PNC National Bank";
    private final String ADDRESS = "620 Liberty Ave";
    private final String CITY = "Pittsburgh";
    private final String ADDITIONAL_COMMENTS = "Automation Testing Process 412-000-0000";
    private final String ALIES_ADDRESS = "Pittsburgh";
    private final String ZIP_CODE = "15222";


    @FindBy(id = "customer_firstname")
    private WebElement first_name;

    @FindBy(id = "customer_lastname")
    private WebElement last_name;

    @FindBy(id = "phone")
    private WebElement home_phone_number;

    @FindBy(xpath = "//input[@id='email_create']")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(xpath = "//*[@class='icon-user left']")
    private WebElement create_account_btn;

    @FindBy(xpath = "//a[@class='login']")
    private WebElement click_login;

    @FindBy(id = "uniform-id_gender1")
    private WebElement select_gender;

    @FindBy(id = "days")
    private WebElement select_date;

    @FindBy(id = "months")
    private  WebElement select_month;

    @FindBy(id = "years")
    private WebElement select_year;

    @FindBy(id = "newsletter")
    private WebElement check_checkbox;

    @FindBy(id = "firstname")
    private WebElement real_first_name;

    @FindBy(id = "lastname")
    private WebElement real_last_name;

    @FindBy(id = "company")
    private WebElement company_name;

    @FindBy(id = "address1")
    private WebElement address;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "id_state")
    private WebElement state;

    @FindBy(id = "other")
    private WebElement additional_comments;

    @FindBy(id = "phone_mobile")
    private WebElement mobile_phone_number;

    @FindBy(id = "alias")
    private WebElement alies_address;

    @FindBy(id = "postcode")
    private  WebElement zip_code;

    @FindBy(xpath = "//*[text()='Register']")
    private WebElement register_btn;

    @FindBy(id = "email")
    private WebElement loginEmail;

    @FindBy(xpath = "//*[@class='icon-lock left']")
    private WebElement login_btn;

    @FindBy(className = "logout")
    private WebElement sign_out;

    public SignUpForm(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);

    public void clickSingOut(){
        this.sign_out.click();
        System.out.println("Clicking Sign Out");
    }

    public void clickLoginBtn(){
        this.login_btn.click();
        System.out.println("Clicking Login Button");
    }

    public void enterLoginEmail(){
        this.loginEmail.sendKeys(EMAIL);
        System.out.println("Entering Login Email");
    }

    public void clickRegisterBtn(){
        this.register_btn.click();
        System.out.println("Click Register Button");
    }

    public void enterZipCode(){
        this.zip_code.sendKeys(ZIP_CODE);
        System.out.println("Entering Zip Code");
    }

    public void enterAliesAddress(){
        this.alies_address.sendKeys(ALIES_ADDRESS);
        System.out.println("Entering alies Address");
    }

    public void enterMobilePhoneNumber(){
        this.mobile_phone_number.sendKeys(MOBILE_PHONE_NUMBER);
        System.out.println("Entering Mobile Phone Number");
    }

    public void enterHomePhoneNumber(){
        this.home_phone_number.sendKeys(HOME_PHONE_NUMBER);
        System.out.println("Entering Home Phone Number");
    }



    public void enterAdditionalComments(){
        this.additional_comments.sendKeys(ADDITIONAL_COMMENTS);
        System.out.println("Entering Additional Comments");
    }

    public void selectState(){
        this.state.click();
        List<WebElement> states = this.driver.findElements(By.xpath("//select[@id='id_state']//following-sibling::option"));
        int randomStates = r.nextInt(states.size());
        states.get(randomStates).click();
        System.out.println("Selecting " + randomStates + "State");
    }

    public void enterAddress(){
        this.address.sendKeys(ADDRESS);
        System.out.println("Entering Address");
    }
    public void enterCity(){
        this.city.sendKeys(CITY);
        System.out.println("Entering City");
    }

    public void enterConpanyName(){
        this.company_name.sendKeys(COMPANY_NAME);
        System.out.println("Entering Company Name");
    }

    public void enterRealFirstName(){
        this.real_first_name.sendKeys(REAL_FIRST_NAME);
        System.out.println("Entering Real First Name");
    }

    public void enterRealLastName(){
        this.real_last_name.sendKeys(REAL_LAST_NAME);
        System.out.println("Entering Real Last Name");
    }

    public void enterFirstName(){
        this.first_name.sendKeys(FIRST_NAME);
        System.out.println("Entering First Name");
    }

    public void enterLastName(){
        this.last_name.sendKeys(LAST_NAME);
        System.out.println("Entering Last Name");
    }

    public void enterEmail(){this.email.sendKeys(EMAIL);
        System.out.println("Entering Email");}

    public void enterPassword() {this.password.sendKeys(PASSWORD);
        System.out.println("Entering Passcode");}

    public void clickLogin(){this.click_login.click();
        System.out.println("Click Login Button");}

    public void clickCreateAccountBtn(){this.create_account_btn.click();
    System.out.println("Click Create Account Button");}

    public void selectGender(){this.select_gender.click();
    System.out.println("Selecting Gender");}

    public void selectDate(){
        this.select_date.click();
        List<WebElement> days = this.driver.findElements(By.xpath("//select[@id='days']//following-sibling::option"));
        int randomDays = r.nextInt(days.size());
        days.get(randomDays).click();
        System.out.println("Selecting Date " + randomDays );
    }

    public void selectMonth(){
        this.select_month.click();
        List<WebElement> month = this.driver.findElements(By.xpath("//select[@id='months']//following-sibling::option"));
        int randomMonth = r.nextInt(month.size());
        month.get(randomMonth).click();
        System.out.println("Selecting Month " + randomMonth);
    }
    public void selectYear(){
        this.select_year.click();
        List<WebElement> years = this.driver.findElements(By.xpath("//select[@id='years']//following-sibling::option"));
        int randomYear = r.nextInt(years.size());
        years.get(randomYear).click();
        System.out.println("Selecting Year " + randomYear);
    }

    public void checkCheckBox(){this.check_checkbox.click();}





}