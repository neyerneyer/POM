package co.com.hospitals.utils.models;

public class EntityModel {

    private final String code;
    private final String fullName;
    private final String address;
    private final String phone;
    private final String department;
    private final String municipality;

    public EntityModel(String code, String fullName, String address, String phone, String department, String municipality) {
        this.code = code;
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.department = department;
        this.municipality = municipality;
    }

    public String getCode() {
        return code;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getDepartment() {
        return department;
    }

    public String getMunicipality() {
        return municipality;
    }
}
