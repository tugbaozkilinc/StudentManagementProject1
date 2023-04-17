package pojos.studentmanagement;

public class CreateStudentInvalidValidationsPojo {
    private String advisorTeacherId;
    private String name;
    private String surname;
    private String birthPlace;
    private String phoneNumber;
    private String email;

    public CreateStudentInvalidValidationsPojo() {
    }

    public CreateStudentInvalidValidationsPojo(String advisorTeacherId, String name, String surname, String birthPlace, String phoneNumber, String email) {
        this.advisorTeacherId = advisorTeacherId;
        this.name = name;
        this.surname = surname;
        this.birthPlace = birthPlace;
        this.phoneNumber = phoneNumber;
        this.email = email;
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

}
