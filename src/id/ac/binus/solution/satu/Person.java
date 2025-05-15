package id.ac.binus.solution.satu;

public class Person {
    private String code;
    private String name;
    private String address;
    private String phone;
    private String email;

    public Person(String code, String name, String address, String phone, String email) {
        super();
        this.code = code;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
}
