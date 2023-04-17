package pojos.deanmanagementpojo;

import com.github.javafaker.Faker;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Locale;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeanObjectPojo {

    private String birthDay;
    private String birthPlace;
    private String gender;
    private String name;
    private String password;
    private String phoneNumber;
    private String ssn;
    private String surname;
    private String username;
    private Integer userId;

    Faker faker = new Faker(Locale.US);


    public DeanObjectPojo() {
        this.birthDay    = "1990-12-12";
        this.birthPlace  = "California";
        this.gender      = "FEMALE";
        this.name        = faker.name().firstName();
        this.password    = "tusubasa123";
        this.phoneNumber = faker.number().digits(3) + "-" + faker.number().digits(3) + "-" + faker.number().digits(4);
        this.ssn         = faker.idNumber().ssnValid();
        this.surname     = faker.name().lastName();
        this.username    = faker.name().username();
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "DeanCreateBodyPojo{" +
                "birthDay='" + birthDay + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ssn='" + ssn + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", userId=" + userId +
                '}';
    }
}
