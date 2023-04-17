package pojos.studentmanagement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentPojo {
    private CreateStudentPojo object;
    private String message;


    public StudentPojo() {
    }

    public StudentPojo(CreateStudentPojo object, String message) {
        this.object = object;
        this.message = message;
    }


    public CreateStudentPojo getObject() {
        return object;
    }

    public String getMessage() {
        return message;
    }


    @Override
    public String toString() {
        return "StudentPojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                '}';
    }
}
