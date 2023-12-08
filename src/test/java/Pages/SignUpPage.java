package Pages;

import Utils.CommonMethods;
import Utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends CommonMethods {

    @FindBy(xpath = "//*[@id=\"emergency-pizza-unclaimed-modal\"]/button")
    public WebElement Popup;

    @FindBy(xpath = "//button[@class='e1jlvhcu3 css-14em039']")
    public WebElement SignIn;

    @FindBy(xpath = "//a[@class='css-li1w1i']")
    public WebElement John;

    @FindBy(name = "nameFirst")
    public WebElement   FirstName;

    @FindBy(name = "nameLast")
    public WebElement   LastName;

    @FindBy(name = "email")
    public WebElement   Email;

    @FindBy(name = "emailConfirm")
    public WebElement   ConfirmEmail;

    @FindBy(name = "phone")
    public WebElement   Phone;

    @FindBy(name = "password")
    public WebElement   Password;

    @FindBy(name = "passwordConfirm")
    public WebElement   ConfirmPassword;

    @FindBy( xpath = "//button[@type='submit']")
    public WebElement   Registered;

    @FindBy (xpath = "//p[@class='errorText ']")
    public WebElement WAssertion;

    public SignUpPage(){
        PageFactory.initElements(driver, this);
    }


  /*public void SignUp(String SEmail, String SPassword, String SConfrimPassword, String SFirstName,
                       String SLastName, int SPhone, int SZipCode, int SDateOfBirth){
        click(WSignIn);
        //click(WCreateAnAccount);
        SendText(WEmail, ConfigReader.getPropertyValue("Email"));
        SendText(WPassword, ConfigReader.getPropertyValue("Password"));
        SendText(WConfirmPassword, ConfigReader.getPropertyValue("ConFirmPassword"));
        SendText(WFirstName, ConfigReader.getPropertyValue("FirstName"));
        SendText(WLastName, ConfigReader.getPropertyValue("LastName"));
        SendText(WPhone, ConfigReader.getPropertyValue("Phone"));
        SendText(WZipCode, ConfigReader.getPropertyValue("ZipCode"));
        SendText(WBirthDay, ConfigReader.getPropertyValue("DateOfBirth"));
        //click(WSliderRound);
        click(WCheck);
        click(WRegisterButton);


    }*/
}
