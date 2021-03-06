@indwealth @AppLaunch @regression
Feature: Launch App

  @P0
  Scenario Outline: launch the app and proceed to login page || noReset=<noReset>
    Given verify intro page

    Examples: 
      | noReset | Tab      |
      | true    | Featured |
