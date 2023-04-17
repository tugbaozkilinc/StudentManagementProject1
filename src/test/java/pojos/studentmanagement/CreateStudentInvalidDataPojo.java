package pojos.studentmanagement;

public class CreateStudentInvalidDataPojo {

    public String message;
    public Integer statusCode;
    public String path;
    public Long timeStamp;
    public CreateStudentInvalidValidationsPojo validations;

    public CreateStudentInvalidDataPojo() {
    }

    public CreateStudentInvalidDataPojo(String message, Integer statusCode, String path, Long timeStamp, CreateStudentInvalidValidationsPojo validations) {
        this.message = message;
        this.statusCode = statusCode;
        this.path = path;
        this.timeStamp = timeStamp;
        this.validations = validations;
    }

    public String getMessage() {
        return message;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getPath() {
        return path;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public CreateStudentInvalidValidationsPojo getValidations() {
        return validations;
    }

    @Override
    public String toString() {
        return "CreateStudentInvalidDataPojo{" +
                "message='" + message + '\'' +
                ", statusCode=" + statusCode +
                ", path='" + path + '\'' +
                ", timeStamp=" + timeStamp +
                ", validations=" + validations +
                '}';
    }
}
