#Author: John
  #Language: en

Feature:Search flights
  As a flight administrator,
  I need to be able to query a specific flight
  to view the flight information

  Scenario: Search flight by flight number
    Given that I'm on the flight management page
    When I enter a flight number in the search field and click on search
    Then the detailed information of the corresponding flight will be displayed