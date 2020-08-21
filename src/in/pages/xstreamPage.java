package in.pages;

import io.appium.java_client.android.nativekey.AndroidKey;
import java.util.List;
import report.custom.TestReporting;
import test.DriverFactory;
import utils.CustomizeAssert;
import utils.JavaWrappers;

public class xstreamPage extends CommonPage{


  public xstreamPage(TestReporting reporting, CustomizeAssert customizeAssert) {
    super(reporting, customizeAssert);
  }

  public void closeScreen(boolean back) throws Exception {
    if (back) {
      pressAnyButton(AndroidKey.BACK);
    } else {
      elementPath = "XstreamPage/RegisteredScreen_CloseIcon";
      if (verifyPresenceOfElementOpt(elementPath, 5)) {
        click(elementPath,"close register screen");
      } else {
        elementPath = "XstreamPage/RegisterScreen_RegisterBT";
        if (verifyPresenceOfElementOpt(elementPath, 5)) {
          pressAnyButton(AndroidKey.BACK);
        }
      }
    }
  }

  /**
   * Pass p
   *
   * @param fromLeftToRight, if left pass true else false
   */
  public void validateAllHomePages(String pages, boolean fromLeftToRight) throws Exception {
    elementPath = "XstreamPage/TopTile_PageOptions";
    List<String> text = getAllElementsText(elementPath);
    String[] allExpectedPages = pages.split(",");
    for (String page: allExpectedPages){
      DriverFactory.getTestReporting().log("Expected Page "+page,""+text.contains(page),"PASS");
    }
  }

  public void getAllRowHeaderTitle() throws Exception {
    swipeNTimesDown(1);
    elementPath = "XstreamPage/AllRowHeaderText";
    if (!verifyPresenceOfElementOpt(elementPath, 1)) {
      swipeNTimesDown(2);
      if (!verifyPresenceOfElementOpt(elementPath, 1)) {
        swipeNTimesDown(1);
      }
    }
    elementPath = "XstreamPage/AllRowHeaderText";
    getAllElementsText(elementPath);
  }

  public void openAnyCPContentWithoutWait() throws Exception {
    elementPath = "XstreamPage/AnyVideoCP_Content";
    int number = JavaWrappers.getRandoNumber(15, 5);
    swipeToElement("down", number, elementPath);
    elementPath = "XstreamPage/AnyVideoCP_Content";
    click(elementPath,"opening any playable content");
    sleep(8);
  }

  public void verifyRegisterPage() throws Exception {
    elementPath = "XstreamPage/RegisterScreen_HeaderText";
    verifyPresenceOfElementOpt(elementPath, 10);
    verifyText("Register and enjoy all benefits of Airtel", "contains", elementPath);
    elementPath = "XstreamPage/RegisterScreen_DescriptionText";
    verifyText("Watch your favorite Movies, TV shows and Live TV!", "same", elementPath);
    elementPath = "XstreamPage/RegisterScreen_RegisterBT";
    verifyText("Register", "same", elementPath);
  }

  public void playNonPlayingVideo() throws Exception {
    elementPath = "XstreamPage/PlayVideo";
    click(elementPath,"click in not playing content on player");
  }

  public void openTopTilePages(String page) throws Exception {
    elementPath = "XstreamPage/TopTile_PageParentView";
    verifyPresenceOfElementOpt(elementPath, 10);
    elementPath = "XstreamPage/TopTile_Page_selectWithName";
    click(elementPath, "opening top page",page);
    sleep(5);
    verifyTopActivePage(page);
    sleep(10);
  }

  public void verifyTopActivePage(String page) throws Exception {
    elementPath = "XstreamPage/TopTile_ActivePage";
    verifyText(page, "same", elementPath);
  }


  public void openFirstLiveChannel() throws Exception {
    elementPath = "XstreamPage/ProgramsNameOnTV";
    String name = getText(elementPath);
    click(elementPath,"Opening live tv channel");
    sleep(10);
  }

}
