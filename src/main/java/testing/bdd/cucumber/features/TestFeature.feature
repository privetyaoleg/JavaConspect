Feature: Test Smoke Facebook scenario

  Scenario: Open browser and verify log-in
    Given Open "opera" and start application
    When some actions
    Then first assert
    Then second assert

  Scenario Outline: Open browser
    Given Open "<browser>" and open "<site>"
    When some actions
    Then first assert

    Examples:
      | browser | site         |
      | chrome  | google.com   |
      | opera   | vk.ru        |
      | ie      | facebook.com |