package Steps;

import Pages.SignUpPage;
import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SignUpStep extends CommonMethods {



    @Given("The User clicks Login.")
    public void the_user_clicks_login() {

    // OpenBrowserAndLaunchApplication();
     click(signUpPage.Popup);
     click(SignUpPage.signUpPage.SignIn);



    }

    @Given("The User clicks Create an account.")
    public void the_user_clicks_create_an_account() {

        click(signUpPage.John);
    }

    @Given("The User filled up the information.")
    public void the_user_filled_up_the_information() {

        SendText(signUpPage.FirstName, ConfigReader.getPropertyValue("FirstName"));
        SendText(signUpPage.LastName, ConfigReader.getPropertyValue("LastName"));
        SendText(signUpPage.Email, ConfigReader.getPropertyValue("Email"));
        SendText(signUpPage.ConfirmEmail, ConfigReader.getPropertyValue("Email"));
        SendText(signUpPage.Phone, ConfigReader.getPropertyValue("Phone"));
        SendText(signUpPage.Password, ConfigReader.getPropertyValue("Password"));
        SendText(signUpPage.ConfirmPassword, ConfigReader.getPropertyValue("Password"));


    }

    @Given("Click Create Account.")
    public void click_create_account() {

        click(signUpPage.Registered);

    }

    @Then("the account has been signed.")
    public void the_account_has_been_signed() {


        String ActualResult = driver.findElement(By.xpath("//p[@class='errorText ']")).getText();
        Assert.assertTrue(ActualResult.contains("Failed to save your account. This email address is already registered."));



    }
}
