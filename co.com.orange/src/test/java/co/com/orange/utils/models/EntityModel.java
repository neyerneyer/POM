package co.com.orange.utils.models;

public class EntityModel {

    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String otherId;
    private final String dateOfBirth;
    private final String maritalStatus;
    private final String gender;

    public EntityModel(String firstName, String middleName, String lastName, String employeeId, String location, String otherId, String dateOfBirth, String maritalStatus, String gender) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.otherId = otherId;
        this.dateOfBirth = dateOfBirth;
        this.maritalStatus = maritalStatus;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOtherId() {
        return otherId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getGender() {
        return gender;
    }
}
