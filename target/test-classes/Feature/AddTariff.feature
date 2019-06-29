
Feature: Title of your feature
  I want to use this template for my feature file

 
  Scenario Outline: Title of your scenario outline
  Given The user is in telecom home page
 And the user is in addTrafic page
    When the user fill all the fields "<rent>","<localmin>","<intermin>","<smspack>","<minutecharges>","<intercharges>","<smscharges>"
    When the user click reset button
    Then the form should be clear

    Examples: 
      | rent | localmin | intermin | smspack | minutecharges | intercharges | smscharges |
      | 1000 |      100 |      100 |     100 |           100 |          100 |        100 |
     
