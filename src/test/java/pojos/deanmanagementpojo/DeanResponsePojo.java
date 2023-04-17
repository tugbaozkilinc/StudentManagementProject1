package pojos.deanmanagementpojo;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeanResponsePojo {

    private String httpStatus;
    private String message ;
    private DeanObjectPojo object;


    public DeanResponsePojo() {
    }

    public DeanResponsePojo(String httpStatus, String message, DeanObjectPojo object) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.object = object;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DeanObjectPojo getObject() {
        return object;
    }

    public void setObject(DeanObjectPojo object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "DeanPojoResponse{" +
                "httpStatus='" + httpStatus + '\'' +
                ", message='" + message + '\'' +
                ", deanBodyPojo=" + object +
                '}';
    }
}
