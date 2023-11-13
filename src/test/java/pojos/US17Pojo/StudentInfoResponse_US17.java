package pojos.US17Pojo;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public class StudentInfoResponse_US17 {


    private Integer userId;
    private String username;
    private String name;
    private String surname;
    private String birthDay;
    private String birthPlace;
    private String phoneNumber;
    private String gender;
    private Integer studentNumber;
    private String motherName;
    private String fatherName;
    private String email;
    private Boolean active;

    public StudentInfoResponse_US17() {

    }

    public StudentInfoResponse_US17(Integer userId, String username, String name, String surname, String birthDay, String birthPlace, String phoneNumber, String gender, Integer studentNumber, String motherName, String fatherName, String email, Boolean active) {
        this.userId = userId;
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.birthPlace = birthPlace;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.studentNumber = studentNumber;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.email = email;
        this.active = active;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "StudentInfoResponse_US17{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", studentNumber=" + studentNumber +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", email='" + email + '\'' +
                ", active=" + active +
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
