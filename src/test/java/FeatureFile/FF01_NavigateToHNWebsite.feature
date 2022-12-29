@mamatha
Feature: HN Homepage
  @SmokeTest
  Scenario: Navigate to HN website
  Given open browser and enter url and navigate to HN website
  Then get title and assert
  @RegressionTest
  Scenario: Login to Homepage
  Given Enter username
  Then Enter password
  And Click on login button
  Then should be on Account screen








#one feature file can have multiple Scenarios under it

#Featrue = user story
  #Scenario = test case
      #    #Steps
      #    Given
      #    When
      #    Then
      #    But
      #    AND
      #    *



