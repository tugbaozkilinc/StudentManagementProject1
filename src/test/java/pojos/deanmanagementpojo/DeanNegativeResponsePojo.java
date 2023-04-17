package pojos.deanmanagementpojo;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeanNegativeResponsePojo {

    private String message;
    private int statusCode;
    private String path;
    private long timeStamp;
    private DeanNegativeResponseValidationsPojo validations;

    public DeanNegativeResponsePojo() {
    }

    public DeanNegativeResponsePojo(String message, int statusCode, String path, long timeStamp, DeanNegativeResponseValidationsPojo validations) {
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

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public DeanNegativeResponseValidationsPojo getValidations() {
        return validations;
    }

    public void setValidations(DeanNegativeResponseValidationsPojo validations) {
        this.validations = validations;
    }

    @Override
    public String toString() {
        return "DeanNegativeResponsePojo{" +
                "message='" + message + '\'' +
                ", statusCode=" + statusCode +
                ", path='" + path + '\'' +
                ", timeStamp=" + timeStamp +
                ", validations=" + validations +
                '}';
    }
}
