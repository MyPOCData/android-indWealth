package in.pages;

import report.custom.TestReporting;
import ui.driverUtils.AppActionsUtils;
import utils.CustomizeAssert;

public class CommonPage extends AppActionsUtils {

  String elementPath = "";

  public CommonPage(TestReporting reporting, CustomizeAssert customizeAssert) {
    super(reporting, customizeAssert);
  }
}
