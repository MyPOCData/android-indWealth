package in.pages;

import report.custom.TestReporting;
import utils.CustomizeAssert;

public class IntroPage extends CommonPage {


  public IntroPage(TestReporting reporting, CustomizeAssert customizeAssert) {
    super(reporting, customizeAssert);
  }

  public void verifyIntroPage() throws Exception {
    elementPath = "IntroPage/introPageTitle";
    getText(elementPath);
    elementPath = "IntroPage/introPageSubtitle";
    verifyText("Make Money From","contains",elementPath);
    elementPath = "IntroPage/securePolicyButton";
    verifyPresenceOfElement(elementPath);
    clickOnGetStartedButton();
  }

  public void clickOnGetStartedButton() throws Exception {
    elementPath = "IntroPage/getStartedButton";
    click(elementPath,"click on get started button");
  }

}
