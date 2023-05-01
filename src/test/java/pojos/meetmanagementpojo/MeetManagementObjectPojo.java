package pojos.meetmanagementpojo;

public class MeetManagementObjectPojo {
/*
 {
        "id": 1,
        "description": "lms",
        "date": "2023-05-15",
        "startTime": "10:00:00",
        "stopTime": "11:00:00",
        "advisorTeacherId": 51,
        "teacherName": "Nihal",
        "teacherSsn": "185-32-1478",
        "students": [
            {
                "id": 1,
                "username": "idil03",
                "ssn": "475-23-9874",
                "name": "idil",
                "surname": "Bksgn",
                "birthDay": "2007-01-01",
                "birthPlace": "istanbul",
                "phoneNumber": "532-123-5500",
                "gender": "FEMALE",
                "motherName": "Nihal",
                "fatherName": "hakan",
                "studentNumber": 1000,
                "email": "idil@hotmail.com",
                "active": true
            }
        ]
    },

    public class Root{
    public int id;
    public String description;
    public String date;
    public String startTime;
    public String stopTime;
    public int advisorTeacherId;
    public String teacherName;
    public String teacherSsn;
    public ArrayList<Student> students;
}
 */
    public int id;
    public String description;
    public String date;
    public String startTime;
    public String stopTime;


    public int advisorTeacherId;
    public String teacherName;
    public String teacherSsn;
    public MeetManagementStudentPojo students;

    public MeetManagementObjectPojo() {
    }

    public MeetManagementObjectPojo(int id, String description, String date, String startTime, String stopTime, int advisorTeacherId, String teacherName, String teacherSsn, MeetManagementStudentPojo students) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.advisorTeacherId = advisorTeacherId;
        this.teacherName = teacherName;
        this.teacherSsn = teacherSsn;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public int getAdvisorTeacherId() {
        return advisorTeacherId;
    }

    public void setAdvisorTeacherId(int advisorTeacherId) {
        this.advisorTeacherId = advisorTeacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSsn() {
        return teacherSsn;
    }

    public void setTeacherSsn(String teacherSsn) {
        this.teacherSsn = teacherSsn;
    }

    public MeetManagementStudentPojo getStudents() {
        return students;
    }

    public void setStudents(MeetManagementStudentPojo students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "MeetManagementObjectPojo{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                ", advisorTeacherId=" + advisorTeacherId +
                ", teacherName='" + teacherName + '\'' +
                ", teacherSsn='" + teacherSsn + '\'' +
                ", students=" + students +
                '}';
    }
}
