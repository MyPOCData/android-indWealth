package in.pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import report.custom.TestReporting;
import utils.CustomizeAssert;

public class LoginPage extends CommonPage {


   By otpContinueButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceIdMatches(\".*:id/loginOtpContinue\")");

  public LoginPage(TestReporting reporting, CustomizeAssert customizeAssert) {
    super(reporting, customizeAssert);
  }


  public void verifyEnterMobileNumberPage(String mobileNumber) throws Exception {
    elementPath = "LoginPage/enterYourMobileNumberTitle";
    verifyText("Enter your","contains",elementPath);
    enterMobileNumber(mobileNumber);
    elementPath = "LoginPage/mobileNumberCountryCode";
    verifyText("+91","same",elementPath);
    String text  = getText(elementPath);
    org.testng.Assert.assertEquals(text,"+91");
    elementPath = "LoginPage/continueButton";
    verifyPresenceOfElement(elementPath);
    elementPath = "LoginPage/registerSebiLabel";
    getText(elementPath);
    elementPath = "LoginPage/authorisedAgencyLogoIcon_loan";
    verifyPresenceOfElement(elementPath);
    elementPath = "LoginPage/authorisedAgencyLogoIcon_bse";
    verifyPresenceOfElement(elementPath);
    elementPath = "LoginPage/authorisedAgencyLogoIcon_credit";
    verifyPresenceOfElement(elementPath);
    elementPath = "LoginPage/loginTermsAndCondition";
    verifyPresenceOfElement(elementPath);
    clickOnContinueAfterEnterNumber();
  }

  public void clickOnContinueAfterEnterNumber() throws Exception {
    elementPath = "LoginPage/continueButton";
    click(elementPath,"Continue after entering the mobile Number");
  }

  public void enterMobileNumber(String mobileNumber) throws Exception {
    elementPath = "LoginPage/typeMobileNumber";
    sendKeys(elementPath,mobileNumber);
  }

  public void verifyOtpPage(String mobileNumber) throws Exception {
    elementPath = "LoginPage/otpSendMessageText";
    verifyText("We’ve sent you an SMS with a 6-digit verification code on +91 "+mobileNumber+".","same",elementPath);
    elementPath = "LoginPage/otpWaitingMessage";
    verifyText("Waiting for OTP","contains",elementPath);
    elementPath = "LoginPage/otpDidntReceiveText";
    verifyText("Didn’t receive the code?","contains",elementPath);
    elementPath = "LoginPage/otpCallMeButton";
    verifyPresenceOfElement(elementPath);
    elementPath = "LoginPage/resendOtp_disable_enable";
    verifyPresenceOfElement(elementPath,"false");
    sleep(10);
    verifyPresenceOfElement(elementPath,"true");
  }

  public void enterOtp() throws Exception {
    elementPath = "LoginPage/enterOtp";
    sendKeys(elementPath,"123456");
    sleep(60);
    click(otpContinueButton,"click on Continue Button");
  }
  
  public void verifyRegPopper() throws Exception {
	  elementPath = "RegistrationPpper/Header";
	  verifyText("Register and enjoy all benefits of Airtel Xstream", "contains", elementPath);
	  elementPath = "RegistrationPpper/RegButton";
	  verifyPresenceOfElement(elementPath);
	  click(elementPath, "Click on Registreation Page");
  }
  
  public void registerApp(String number) throws Exception {
	  elementPath = "RegistrationPpper/EnterMobNumber";
	  sendKeys(elementPath,number);
	  elementPath = "RegistrationPpper/ContinueButton";
	  click(elementPath, "Click on Continue button");
  }

}
