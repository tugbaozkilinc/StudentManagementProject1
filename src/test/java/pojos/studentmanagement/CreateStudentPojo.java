package pojos.studentmanagement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateStudentPojo {

    private Integer advisorTeacherId;
    private String birthDay;
    private String birthPlace;
    private String email;
    private String fatherName;
    private String gender;
    private String motherName;
    private String name;
    private String password;
    private String phoneNumber;
    private String ssn;
    private String surname;
    private String username;

    public CreateStudentPojo() {
    }

    public CreateStudentPojo(Integer advisorTeacherId, String birthDay, String birthPlace, String email, String fatherName, String gender, String motherName, String name, String password, String phoneNumber, String ssn, String surname, String username) {
        this.advisorTeacherId = advisorTeacherId;
        this.birthDay = birthDay;
        this.birthPlace = birthPlace;
        this.email = email;
        this.fatherName = fatherName;
        this.gender = gender;
        this.motherName = motherName;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
        this.surname = surname;
        this.username = username;
    }

    public Integer getAdvisorTeacherId() {
        return advisorTeacherId;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getEmail() {
        return email;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getGender() {
        return gender;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "CreateStudentPojo{" +
                "advisorTeacherId=" + advisorTeacherId +
                ", birthDay='" + birthDay + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", email='" + email + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", gender='" + gender + '\'' +
                ", motherName='" + motherName + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ssn='" + ssn + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
