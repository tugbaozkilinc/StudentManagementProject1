package pojos.studentmanagement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateStudentPojo {
    private CreateStudentDataPojo object;
    private String message;


    public CreateStudentPojo() {
    }

    public CreateStudentPojo(CreateStudentDataPojo object, String message) {
        this.object = object;
        this.message = message;
    }


    public CreateStudentDataPojo getObject() {
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
