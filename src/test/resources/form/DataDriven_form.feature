@tag
Feature: V2 dataDriven Testing form 

  @tag2
  Scenario Outline: Title of your scenario outline
    Given User opens the chrome browser and navigate to form website
    When user is entering "<firstname>", "<lastName>", "<Email>"
     And user is entering "<contactNumber>", "<Message>"
    And clicking on submit button
    Then All the data entered successfully

    Examples: 
      | firstname  | lastName | Email                      | contactNumber| Message |
      | Rachel     | Reena    | rachel.reena@gmial.com     | 8056248998   |Hello!   |
      | Abhigail   | Sharon   | Abhigail.sharon@gmail.com  | 8952451255   |Hello!   |
      | Sohail     | Raj      | sohail.raj@gmail.com       | 8549952462   |Hello!   |
      | Reedha     |G.S       |reedha@gmail.com            | 84@56845!&   |Hello!   |