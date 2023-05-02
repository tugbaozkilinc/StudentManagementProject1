package pojos.meetmanagementpojo;

public class MeetResponsePojo {
    public MeetManagementObjectPojo object;
    public String message;
    public String httpStatus;

    public MeetResponsePojo() {
    }

    public MeetResponsePojo(MeetManagementObjectPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public MeetManagementObjectPojo getObject() {
        return object;
    }

    public void setObject(MeetManagementObjectPojo object) {
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
        return "MeetResponsePojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
