package pojos.vicedeanmanagement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ViceDeanManagementResponse {

    private ViceDeanManagementObject object;
    private String message;
    private String httpStatus;

    public ViceDeanManagementResponse() {
    }

    public ViceDeanManagementResponse(ViceDeanManagementObject object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public ViceDeanManagementObject getObject() {
        return object;
    }

    public void setObject(ViceDeanManagementObject object) {
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
