Feature:Creating employees
  As a user I must be able to log in to the orange page and register a new employee

  @login
  Scenario:successful login
    Given Brandon wants to enter the colorlib website OrageHR
    When he authenticates with username and password
      | userName | password |
      | Admin    | admin123 |
      #| Admin1   | admin123 |
    Then Then we verify that you entered the page by reviewing the message "Dashboard"

  @register
  Scenario:Register a new employee
    Given Juan needs to create an employee at OrageHR
      | userName | password |
      | Admin    | admin123 |
    When he makes the registration entry in the application
      | firstName | middleName | lastName | otherId    | dateOfBirth | maritalStatus | gender |
      | Angel     | Jose       | Luna     | 1234567890 | 2011-11-18  | Single        | Female |
    Then he displays the new employee in the application
