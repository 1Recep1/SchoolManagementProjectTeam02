package pojos.US17Pojo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import pojos.StudentInfoResponse_US17;

@JsonIgnoreProperties(ignoreUnknown = true)

public class StudentInfoObject_US17 {

        private int id;
        private double midtermExam;
        private double finalExam;
        private int absentee;
        private String infoNote;
        private String lessonName;
        private int creditScore;
        private String educationTerm;
        private double average;
        private StudentInfoResponse_US17 studentResponse;
        private boolean compulsory;
        private String note;

    public StudentInfoObject_US17() {

    }

    public StudentInfoObject_US17(int id, double midtermExam, double finalExam, int absentee, String infoNote, String lessonName, int creditScore, String educationTerm, double average, StudentInfoResponse_US17 studentResponse, boolean compulsory, String note) {
        this.id = id;
        this.midtermExam = midtermExam;
        this.finalExam = finalExam;
        this.absentee = absentee;
        this.infoNote = infoNote;
        this.lessonName = lessonName;
        this.creditScore = creditScore;
        this.educationTerm = educationTerm;
        this.average = average;
        this.studentResponse = studentResponse;
        this.compulsory = compulsory;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMidtermExam() {
        return midtermExam;
    }

    public void setMidtermExam(double midtermExam) {
        this.midtermExam = midtermExam;
    }

    public double getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;
    }

    public int getAbsentee() {
        return absentee;
    }

    public void setAbsentee(int absentee) {
        this.absentee = absentee;
    }

    public String getInfoNote() {
        return infoNote;
    }

    public void setInfoNote(String infoNote) {
        this.infoNote = infoNote;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getEducationTerm() {
        return educationTerm;
    }

    public void setEducationTerm(String educationTerm) {
        this.educationTerm = educationTerm;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public StudentInfoResponse_US17 getStudentResponse() {
        return studentResponse;
    }

    public void setStudentResponse(StudentInfoResponse_US17 studentResponse) {
        this.studentResponse = studentResponse;
    }

    public boolean isCompulsory() {
        return compulsory;
    }

    public void setCompulsory(boolean compulsory) {
        this.compulsory = compulsory;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "StudentInfoObject_US17{" +
                "id=" + id +
                ", midtermExam=" + midtermExam +
                ", finalExam=" + finalExam +
                ", absentee=" + absentee +
                ", infoNote='" + infoNote + '\'' +
                ", lessonName='" + lessonName + '\'' +
                ", creditScore=" + creditScore +
                ", educationTerm='" + educationTerm + '\'' +
                ", average=" + average +
                ", studentResponse=" + studentResponse +
                ", compulsory=" + compulsory +
                ", note='" + note + '\'' +
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
