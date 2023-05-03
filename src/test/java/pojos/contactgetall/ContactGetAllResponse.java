package pojos.contactgetall;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactGetAllResponse {

    private ContactGetAllObject object;
    private String message;
    private String httpStatus;

    public ContactGetAllResponse() {
    }

    public ContactGetAllResponse(ContactGetAllObject object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public ContactGetAllObject getObject() {
        return object;
    }

    public void setObject(ContactGetAllObject object) {
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
        return "{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }

}
