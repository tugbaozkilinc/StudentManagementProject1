package pojos.studentmanagement;

public class CreateStudentInvalidPojo {

    private String message;
    private Integer statusCode;
    private String path;
    private Long timeStamp;
    private CreateStudentInvalidDataPojo validations;

    public CreateStudentInvalidPojo() {
    }

    public CreateStudentInvalidPojo(String message, Integer statusCode, String path, Long timeStamp, CreateStudentInvalidDataPojo validations) {
        this.message = message;
        this.statusCode = statusCode;
        this.path = path;
        this.timeStamp = timeStamp;
        this.validations = validations;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public CreateStudentInvalidDataPojo getValidations() {
        return validations;
    }

    public void setValidations(CreateStudentInvalidDataPojo validations) {
        this.validations = validations;
    }

    @Override
    public String toString() {
        return "CreateStudentInvalidPojo{" +
                "message='" + message + '\'' +
                ", statusCode=" + statusCode +
                ", path='" + path + '\'' +
                ", timeStamp=" + timeStamp +
                ", validations=" + validations +
                '}';
    }
}
