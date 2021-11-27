@e2e
Feature: Register a medical application
  I as a clinical user
  I want to register a medical application through the hospital administration system
  you must validate that there is user

  @registration
  Scenario Outline: Performing the registration of a "<add>"
    Given Carlos needs to register a medical application
    When you register a "<add>" in the hospital administration application
      | <name> | <lastName> | <phone> | <identityCardType> | <identityCard> |
    Then  he checks that the message "Datos guardados correctamente"
    Examples:
      | add     | name    | lastName | phone      | identityCardType      | identityCard |
      | Doctor  | camila  | botero   | 3512369898 | Cédula de extrangería | 1066980990   |
      | Patient | Juanita | perdomo  | 3552369898 | Pasaportes            | 1066980880   |

  @agendaCity
  Scenario: Scheduling an appointment
    Given carlos needs to see the doctor
    When he makes an appointment
    Then he checks that message

  @hospital
  Scenario: Add hospital
    Given  Carlos needs to register a new hospital
    When he record hospital information
      | code | fullName | address         | phone     | department | municipality |
      | 010  | colmedis | cr 67 # 101-110 | 302600900 | Antioquia  | Medellín     |
    Then check that the correct message "Datos guardados correctamente."

  @addRoom
  Scenario Outline: Add room
    Given Brandon wants to enter the website hospital
    When you add a hospital room
      | <roomNumber> |
    Then check that the message of the added room "Datos guardados correctamente."
    Examples:
      | roomNumber |
      ##@externaldata@./src/test/resources/datadriven/data.xlsx@feature@2,3
   |4567|
