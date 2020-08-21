package in.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import in.pages.IntroPage;

public class IntroPageSteps {

  IntroPage introPage = null;
  public IntroPageSteps(IntroPage introPage){
    this.introPage = introPage;
  }

  @When("^verify intro page$")
  public void verify_intro_page() throws Exception {
   introPage.verifyIntroPage();
  }


  @Given("click on get started button")
  public void clickOnGetStartedButton() throws Exception {
    introPage.clickOnGetStartedButton();
  }
}
