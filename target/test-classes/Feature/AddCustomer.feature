Feature: Title of your feature
  I want to use this template for my feature file

@regression
  Scenario: Title of your scenario
    Given The user is in telecom home page
    And The user click on add custome
    When The user is filling all the detail
      | fname | lname | email         | address    | phno      |
      | test  | exam  | kj@gmail.com  | thanjavore | 123156143 |
      | testA | examA | Akj@gmail.com | madurai    | 123156143 |
      | testB | examB | Bkj@gmail.com | trichy     | 123156143 |
      | testC | examC | Ckj@gmail.com | chennai    | 123156143 |
    And The user click on submit button
    Then The user should be displayed the customer id
