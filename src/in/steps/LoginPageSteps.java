package in.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import in.pages.LoginPage;
import test.DriverFactory;

public class LoginPageSteps {

  LoginPage loginPage = null;
  public LoginPageSteps(LoginPage loginPage){
    this.loginPage = loginPage;
  }

  @Then("^verify Enter Mobile Number page and login with (.+)$")
  public void verifyEnterMobileNumberPageAndEnterMobileNumberLoginWith(String mobileNumber)
      throws Exception {
    mobileNumber = DriverFactory.environment.get(mobileNumber);
    loginPage.verifyEnterMobileNumberPage(mobileNumber);
  }

  @Then("verify otp page for (.+)")
  public void verifyOtpPage(String mobileNumber) throws Exception {
    mobileNumber = DriverFactory.environment.get(mobileNumber);
    loginPage.verifyOtpPage(mobileNumber);
  }

  @Given("verify Registration popper")
  public void verifyRegistrationPopper() throws Exception {
	  loginPage.verifyRegPopper();
  }

  @Then("login with user number (.+)")
  public void loginWithUserNumberLoginWith(String mobNumber) throws Exception{
	  mobNumber = DriverFactory.environment.get(mobNumber);
	  loginPage.registerApp(mobNumber);
  }
}
