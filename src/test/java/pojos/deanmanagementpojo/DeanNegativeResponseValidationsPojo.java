package pojos.deanmanagementpojo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeanNegativeResponseValidationsPojo {
    private String birthDay;
    private String password;

    private String phoneNumber;

    private String ssn;

    public DeanNegativeResponseValidationsPojo() {
    }

    public DeanNegativeResponseValidationsPojo(String birthDay, String password, String phoneNumber, String ssn) {
        this.birthDay = birthDay;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
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

    @Override
    public String toString() {
        return "DeanNegativeResponseValidationsPojo{" +
                "birthDay='" + birthDay + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
