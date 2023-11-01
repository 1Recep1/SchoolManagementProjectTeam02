package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utilities.Authentication;
import utilities.ConfigReader;


public class ManagementSchoolUrl extends Authentication {

    public static RequestSpecification spec;

    public static void adminSetup() {

        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).addHeader("Authorization", generateToken(ConfigReader.getProperty("adminPassword"), ConfigReader.getProperty("adminUsername"))).
                setBaseUri("https://managementonschools.com/app").build();
    } //setContentType() kismi post isleminin duzgun calismasi icin

    public static void deanSetup() {

        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).addHeader("Authorization", generateToken(ConfigReader.getProperty("deanPassword"), ConfigReader.getProperty("deanUsername"))).
                setBaseUri("https://managementonschools.com/app").build();
    }

    public static void viceDeanSetup() {

        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).addHeader("Authorization", generateToken(ConfigReader.getProperty("viceDeanPassword"), ConfigReader.getProperty("viceDeanUsername"))).
                setBaseUri("https://managementonschools.com/app").build();
    }

    public static void teacherSetup() {

        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).addHeader("Authorization", generateToken(ConfigReader.getProperty("teacherPassword"), ConfigReader.getProperty("teacherUsername"))).
                setBaseUri("https://managementonschools.com/app").build();
    }

    public static void studentSetup() {

        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).addHeader("Authorization", generateToken(ConfigReader.getProperty("studentPassword"), ConfigReader.getProperty("studentUsername"))).
                setBaseUri("https://managementonschools.com/app").build();
    }
}

