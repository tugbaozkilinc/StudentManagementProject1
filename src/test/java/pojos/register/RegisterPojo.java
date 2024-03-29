package pojos.register;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import pojos.register.RegisterObject;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisterPojo {

    private RegisterObject object;
    private String message;
    private String httpStatus;

    public RegisterPojo() {
    }

    public RegisterPojo(RegisterObject object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public RegisterObject getObject() {
        return object;
    }

    public void setObject(RegisterObject object) {
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
        return "RegisterPojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
