Feature: Ahorcado Maradona
  @perfectWin

  Scenario: Verification of perfect win
    Given user is on gamepage
    When user puts a right letter
    And user keeps putting right letters until the word is completed
    Then success message is displayed
    
	@perfectLose

  Scenario: Verification of perfect lose
    Given user is on gamepage
    When user puts a wrong letter
    And user keeps putting wrong letters until lose
    Then failed message is displayed

		@imperfectWin

  Scenario: Verification of imperfect win
    Given user is on gamepage
    When user puts right and wrong letters until the word is completed
    Then success message is displayed
    
	@imperfectLose

  Scenario: Verification of imperfect lose
    Given user is on gamepage
    When user puts right and wrong letters until lose
    Then failed message is displayed