package pojos.studentmanagement;

public class CreateStudentInvalidValidationsPojo {
    private String advisorTeacherId;
    private String name;
    private String surname;
    private String birthPlace;
    private String phoneNumber;
    private String email;
    private String gender;
    private String birthDay;
    private String ssn;
    private String username;
    private String fatherName;
    private String motherName;
    private String password;

    public CreateStudentInvalidValidationsPojo() {
    }


    public CreateStudentInvalidValidationsPojo(String advisorTeacherId, String name, String surname, String birthPlace, String phoneNumber, String email, String gender, String birthDay, String ssn, String username, String fatherName, String motherName, String password) {
        this.advisorTeacherId = advisorTeacherId;
        this.name = name;
        this.surname = surname;
        this.birthPlace = birthPlace;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.birthDay = birthDay;
        this.ssn = ssn;
        this.username = username;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.password = password;
    }

    public String getAdvisorTeacherId() {
        return advisorTeacherId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getSsn() {
        return ssn;
    }

    public String getUsername() {
        return username;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getPassword() {
        return password;
    }
}
