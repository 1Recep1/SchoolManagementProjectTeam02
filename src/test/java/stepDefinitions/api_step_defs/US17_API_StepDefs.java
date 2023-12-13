package stepdefinitions.APIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
//import pojos.StudentInfo_US17;
//import pojos.StudentInfo_Update_Expected_US17;

//import static baseurl.ManagementOnSchoolBaseUrl.spec;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US17_API_StepDefs {

    Response response;

    //public static StudentInfo_Update_Expected_US17 expectedData;

    @Given("teacher sends put request for add StudentInfo")
    public void teacher_sends_put_request_for_add_student_info() {
        //{{baseUrl}}/studentInfo/update/:studentInfoId
        //spec.pathParams("first", "studentInfo", "second","update","third","547");

       //Set the expected data

         /*
  "absentee": "14",
  "educationTermId": "1",
  "finalExam": "50",
  "infoNote": "sehr gut ++",
  "lessonId": "1",
  "midtermExam": "75.0",
  "studentId": "537"
         */
    /*
        Map <String,Object> expectedStudentInfo = new HashMap<String,Object>();
        expectedStudentInfo.put("absentee","33");
        expectedStudentInfo.put("educationTermId","1");
        expectedStudentInfo.put("finalExam","55");
        expectedStudentInfo.put("infoNote","Basarili++");
        expectedStudentInfo.put("lessonId","2");
        expectedStudentInfo.put("midtermExam","65.0");
        expectedStudentInfo.put("studentId","551");
    */

        //expectedData = new StudentInfo_Update_Expected_US17();
        //expectedData.setAbsentee(14);
        //expectedData.setEducationTermId(2);
        //expectedData.setFinalExam(50);
        //expectedData.setInfoNote("sehr gut ++");
        //expectedData.setLessonId(2);
        //expectedData.setMidtermExam(75.0);

        //response = given(spec).contentType(ContentType.JSON).when().body(expectedData).put("{first}/{second}/{third}");
        response.prettyPrint();
    }
    /*
             "object": {
        "id": 547,
        "midtermExam": 55.0,
        "finalExam": 50.0,
        "absentee": 11,
        "infoNote": "basarili++",
        "lessonName": "JAVA",
        "creditScore": 8,
        "educationTerm": "SPRING_SEMESTER",
        "average": 52.0,
        "studentResponse": {
            "userId": 15,
            "username": "Ayse03",
            "name": "Ayse03",
            "surname": "Ayse",
            "birthDay": "1987-01-15",
            "birthPlace": "Paris",
            "phoneNumber": "643-546-6666",
            "gender": "FEMALE",
            "studentNumber": 1013,
            "motherName": "mama",
            "fatherName": "papa",
            "email": "ayse123@gmail.com",
            "active": true
        },
        "compulsory": false,
        "note": "DD"
    },
    "message": "Student Info updated Successfully",
    "httpStatus": "CREATED"
          */
    @Then("teacher sends get request and validates StudentInfo")
    public void teacherSendsGetRequestAndValidatesStudentInfo() {

    //    StudentInfo_US17 actualData = response.as(StudentInfo_US17.class);
    // assertEquals(200,response.getStatusCode());
    // assertEquals(expectedData.getAbsentee(), actualData.getObject().getAbsentee());
    // //assertEquals(expectedData.getEducationTermId(), actualData.getObject().getEducationTerm());
    // //assertEquals(expectedData.getFinalExam(), actualData.getObject().getFinalExam());
    // assertEquals(expectedData.getInfoNote(), actualData.getObject().getInfoNote());
    // //assertEquals(expectedData.getLessonId(), actualData.getObject().getLessonName());
    // //assertEquals(expectedData.getMidtermExam(), actualData.getObject().getMidtermExam());


      //  JsonPath jsonPath = response.jsonPath();
      //  System.out.println(jsonPath.getString("object.lessonName"));


    }
}
