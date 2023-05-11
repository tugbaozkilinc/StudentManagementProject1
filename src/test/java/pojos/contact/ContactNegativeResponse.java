package pojos.contact;

public class ContactNegativeResponse {

    private String message;
    private int statusCode;
    private String path;
    private Object timeStamp;
    private ContactValidationsPojo validations;

    public ContactNegativeResponse() {
    }

    public ContactNegativeResponse(String message, int statusCode, String path, Object timeStamp, ContactValidationsPojo validations) {
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

    public Object getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Object timeStamp) {
        this.timeStamp = timeStamp;
    }

    public ContactValidationsPojo getValidations() {
        return validations;
    }

    public void setValidations(ContactValidationsPojo validations) {
        this.validations = validations;
    }

    @Override
    public String toString() {
        return "ContactNegativeResponse{" +
                "message='" + message + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", path='" + path + '\'' +
                ", timeStamp=" + timeStamp +
                ", validations=" + validations +
                '}';
    }
}
