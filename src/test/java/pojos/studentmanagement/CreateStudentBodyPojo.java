package pojos.studentmanagement;

import com.github.javafaker.Faker;

import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateStudentBodyPojo {

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

    Faker faker = new Faker(Locale.US);

    public CreateStudentBodyPojo() {
        this.advisorTeacherId = 107;
        this.birthDay = "1990-12-12";
        this.birthPlace = "Tokat";
        this.email = "emin" + faker.number().digits(3) + "@gmail.com";
        this.fatherName = "Ali";
        this.gender = "MALE";
        this.motherName = "Ayse";
        this.name = "Emin";
        this.password = "password123";
        this.phoneNumber = faker.number().digits(3) + "-" + faker.number().digits(3) + "-" + faker.number().digits(4);
        this.ssn = faker.idNumber().ssnValid();
        this.surname = "Emin";
        this.username = faker.name().username();
    }

    public CreateStudentBodyPojo(Integer advisorTeacherId, String birthDay, String birthPlace, String email, String fatherName, String gender, String motherName, String name, String password, String phoneNumber, String ssn, String surname, String username) {
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

    public void setAdvisorTeacherId(Integer advisorTeacherId) {
        this.advisorTeacherId = advisorTeacherId;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
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

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "CreateStudentBodyPojo{" +
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