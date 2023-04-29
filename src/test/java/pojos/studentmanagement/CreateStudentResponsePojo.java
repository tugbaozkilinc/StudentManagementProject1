package pojos.studentmanagement;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateStudentResponsePojo {
    private CreateStudentResponseDataPojo object;
    private String message;

    public CreateStudentResponsePojo() {
    }

    public CreateStudentResponsePojo(CreateStudentResponseDataPojo object, String message) {
        this.object = object;
        this.message = message;
    }

    public CreateStudentResponseDataPojo getObject() {
        return object;
    }

    public void setObject(CreateStudentResponseDataPojo object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "CreateStudentResponseData{" +
                "object=" + object +
                ", message='" + message + '\'' +
                '}';
    }
}
