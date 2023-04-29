package pojos.studentmanagement;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateStudentInvalidDataPojo {

    private String advisorTeacherId;
    private String name;
    private String surname;
    private String birthPlace;
    private String email;
    private String phoneNumber;
    private String gender;
    private String birthDay;
    private String ssn;
    private String username;
    private String fatherName;
    private String motherName;
    private String password;

    public CreateStudentInvalidDataPojo() {
    }

    public CreateStudentInvalidDataPojo(String advisorTeacherId, String name, String surname, String birthPlace, String email, String phoneNumber, String gender, String birthDay, String ssn, String username, String fatherName, String motherName, String password) {
        this.advisorTeacherId = advisorTeacherId;
        this.name = name;
        this.surname = surname;
        this.birthPlace = birthPlace;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public void setAdvisorTeacherId(String advisorTeacherId) {
        this.advisorTeacherId = advisorTeacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CreateStudentInvalidDataPojo{" +
                "advisorTeacherId='" + advisorTeacherId + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", ssn='" + ssn + '\'' +
                ", username='" + username + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

