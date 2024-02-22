
@tag
Feature: V3 practise form
  @tag1
  Scenario Outline: Filling the form to create an account
    Given User opens the browser and navigating to practise form
    
    When User is entering "<username>" , "<emailaddress>", "<firstname>" ,"<lastname>" ,"<pincode>"
    And Select the country, state, education
    And Clicking on the checkbox, entering the text in the "<textfield>"
    And click on button
    Then an error message displayed
    
   Examples: 
      | username      | emailaddress         | firstname  | lastname | pincode  | textfield |
      |Rachel Reena 	| rachel@gmail.com     | Rachel     | Reena    |517325    |pdk8ce    |
      |Abhigail sharon| abhi@gmail.com       | Abhigail   | Sharon   | 518689   |pdk8ce    |
      |Sohail         | sohail@gmail.com     |Sohail      | Raj      | 518954   |pdk8ce    |
      |Reedha         | reedha@gmail.com     |Reedha      |G.S       |516466    |pdk8ce    |
      |Samapth Ravi   |sampath@gmail.com     |Sampath     |Ravi      |512336    |pdk8ce    |