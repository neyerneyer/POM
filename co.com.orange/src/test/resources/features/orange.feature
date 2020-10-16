Feature:Creating employees
  As a user I must be able to log in to the orange page and register a new employee

  Scenario:Register a new employee
    Given Juan needs to create an employee at OrageHR
    When he makes the registration entry in the application
      | firstName | middleName | lastName | employeeId | location      | otherId    | dateOfBirth      | maritalStatus |
      | Juan      | Jose       | Luna     | 0012       | London Office | 1234567890 | Tue, 13 Oct 2020 | Single         |
    Then he displays the new employee in the application
