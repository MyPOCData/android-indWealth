@indwealth @AppLaunch @regression
Feature: Login

  @P1
  Scenario Outline: login into App|| noReset=<noReset>
    Given click on get started button
    Then verify Enter Mobile Number page and login with <loginWith>

    Examples: 
      | noReset | loginWith                |
      | false   | IND_WEALTH_MOBILE_NUMBER |

  @P1
  Scenario Outline: login into App and verify otp page|| noReset=<noReset>
    Given click on get started button
    Then verify Enter Mobile Number page and login with <loginWith>
    Then verify otp page for <loginWith>

    Examples: 
      | noReset | loginWith                |
      | false   | IND_WEALTH_MOBILE_NUMBER |

  @P0
  Scenario Outline: registration on App || noReset=<noReset>
    Given verify Registration popper
    Then login with user number <loginWith>

    Examples: 
      | noReset | loginWith  |
      | false   | IND_WEALTH_MOBILE_NUMBER |
