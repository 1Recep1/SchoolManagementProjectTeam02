package pojos.US17Pojo;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import pojos.StudentInfoObject_US17;

@JsonIgnoreProperties(ignoreUnknown = true)

public class StudentInfo_US17 {

        private StudentInfoObject_US17 object;
        private String message;
        private String httpStatus;

    public StudentInfo_US17() {
    }

    public StudentInfo_US17(StudentInfoObject_US17 object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public StudentInfoObject_US17 getObject() {
        return object;
    }

    public void setObject(StudentInfoObject_US17 object) {
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
        return "StudentInfo_US17{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }

    /*
            "object": {
        "id": 1032,
        "midtermExam": 75.0,
        "finalExam": 100.0,
        "absentee": 20,
        "infoNote": "sehr gut ++",
        "lessonName": "hukukkk",
        "creditScore": 5,
        "educationTerm": "FALL_SEMESTER",
        "average": 90.0,
        "studentResponse": {
            "userId": 99,
            "username": "ekrem251584",
            "name": "ekrem",
            "surname": "keskin",
            "birthDay": "1999-03-05",
            "birthPlace": "samsun",
            "phoneNumber": "334-586-1247",
            "gender": "MALE",
            "studentNumber": 1097,
            "motherName": "fatma",
            "fatherName": "ahmet",
            "email": "ekrem_2515@gmail.com",
            "active": true
        },
        "compulsory": true,
        "note": "AA"
    },
    "message": "Student Info saved Successfully",
    "httpStatus": "CREATED"
         */


}
