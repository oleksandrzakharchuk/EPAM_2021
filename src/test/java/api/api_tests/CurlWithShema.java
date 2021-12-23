package api.api_tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class CurlWithShema {

    @Test
    public void testListOfUserswShema() {
        RestAssured.given().log().all()
                .baseUri("https://api.dropboxapi.com/")
                .basePath("/2/file_requests/create \\ ")
                .contentType(ContentType.JSON)
               // .body("{\"title\": \"Homework submission\",\"destination\": \"/File Requests/Homework\",\"deadline\": {\"deadline\": \"2020-10-12T17:00:00Z\",\"allow_late_uploads\": \"seven_days\"},\"open\": true}" )
                .body("\"{ \\n\" +\n" +
                        "                        \"\\\"title\\\": \\\"Homework submission\\\", \\n\" +\n" +
                        "                        \"\\\"destination\\\": \\\"/File Requests/Homework\\\", \\n\" +\n" +
                        "                        \"\\\"deadline\\\": { \\n\" +\n" +
                        "                        \"\\\"deadline\\\": \\\"2020-10-12T17:00:00Z\\\", \\n\" +\n" +
                        "                        \"\\\"allow_late_uploads\\\": \\\"seven_days\\\" \\n\" +\n" +
                        "                        \"}, \\n\" +\n" +
                        "                        \"\\\"open\\\": true \\n\" +\n" +
                        "                        \"}\\n\" +\n" +
                        "                        \"\\n\")" )
        .when()
                .post()
        .then()
                //.body(
                .log().all()
                .assertThat();
                //.statusCode(400);
                //.body(matchesJsonSchemaInClasspath("postLisOfUsersShemas.json"));

    }
}
