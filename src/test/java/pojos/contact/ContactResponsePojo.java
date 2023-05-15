package pojos.contact;

public class ContactResponsePojo {

    private ContactResponseObject object;
    private String message;
    private String httpStatus;

    public ContactResponsePojo() {
    }

    public ContactResponsePojo(ContactResponseObject object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public ContactResponseObject getObject() {
        return object;
    }

    public void setObject(ContactResponseObject object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public String toString() {
        return "ContactResponsePojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
