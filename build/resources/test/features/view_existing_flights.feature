#Author: John
  #Language: en

Feature:view existing flights
  as flight manager
  I need to see the list of existing flights
  for all currently scheduled flights

  Scenario: View the list of flights created in the flight management page
    Given I am on the airline's web site
    When I go to the flight management page
    Then I can see the list of existing flights

    #ViewExistingFlights