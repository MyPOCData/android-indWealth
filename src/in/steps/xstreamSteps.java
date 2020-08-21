package in.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import in.pages.xstreamPage;
import org.testng.SkipException;
import test.DriverFactory;
import utils.JavaWrappers;

public class xstreamSteps {

  public xstreamPage xstreamPage = null;

  public xstreamSteps(xstreamPage xstreamPage){
    this.xstreamPage =  xstreamPage;
  }

  @Then("close register popup")
  public void closeRegisterPopup() throws Exception {
    xstreamPage.closeScreen(false);
  }

  @Given("verify all top bar pages (.+)")
  public void verifyAllTopBarPagesPages(String pages) throws Exception {
    pages = DriverFactory.environment.get(pages);
    xstreamPage.validateAllHomePages(pages, false);
  }

  @Then("^get all screen rails$")
  public void swipe_down_and_get_all_screen_rails() throws Exception {
    xstreamPage.getAllRowHeaderTitle();
  }

  @Given("play any CP content when user is not login")
  public void playAnyCPContentWhenUserIsNotLogin() throws Exception {
    xstreamPage.openAnyCPContentWithoutWait();
  }

  @Then("^verify register page popup$")
  public void verifyRegisterPagePopup() throws Throwable {
    xstreamPage.verifyRegisterPage();
  }

  @And("^play non playing content$")
  public void playNonPlayingContent() throws Exception {
    xstreamPage.playNonPlayingVideo();
  }

  @Then("Click on Link (.+) from Top Tile Page")
  public void clickOnLinkTopPageFromTopTilePage(String page) throws Exception {
    xstreamPage.openTopTilePages(page);
  }

  @And("^open any Live tv channel without login$")
  public void openAnyLiveTvChannelWithoutLogin() throws Exception {
    int swipe = JavaWrappers.getRandoNumber(4, 1);
    xstreamPage.swipeNTimesDown(swipe);
    xstreamPage.openFirstLiveChannel();
  }

  @Then("check for skip exception")
  public void checkForSkipException() throws Exception{
      throw new SkipException("check for skip exception");
  }
}
