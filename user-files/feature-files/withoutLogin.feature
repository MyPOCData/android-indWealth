@xstream @withoutLogin
Feature: Without_Login

  @P0
  Scenario Outline: verify all top bar pages for withoutLogin|| noReset=<noReset>
    Given close register popup
    Then verify all top bar pages <pages>
    Examples:
      | noReset | pages         |
      | true    | All_TOP_PAGES |

  @P0
  Scenario Outline:get all rails for withoutLogin|| noReset=<noReset>
    Then close register popup
    Then get all screen rails

    Examples:
      | noReset |
      | true    |

  @P1
  Scenario Outline:Play any content and verify register popup then close popup and then play the content and again verify register popup for withoutLogin|| noReset=<noReset>
    Then close register popup
    Given play any CP content when user is not login
    Then verify register page popup
    Then close register popup
    And play non playing content
    Then verify register page popup

    Examples:
      | noReset |
      | true    |

  @P1
  Scenario Outline:Verify registration on Kids Page || noReset=<noReset>
    Given close register popup
    Then Click on Link <TopPage> from Top Tile Page
    Given play any CP content when user is not login
    Then verify register page popup
    Examples:
      | noReset | TopPage |
      | false    | Kids  |

  @P1
  Scenario Outline:open <TopPage> page then play first channel then verify register popup for withoutLogin || noReset=<noReset>
    Then close register popup
    Then Click on Link <TopPage> from Top Tile Page
    And open any Live tv channel without login
    Then verify register page popup

    Examples:
      | noReset | TopPage |
      | true    | Live TV |

  @P1 @local
  Scenario Outline: create skip exception || noReset=<noReset>
    Then check for skip exception
    Examples:
      | noReset |
      | true    |