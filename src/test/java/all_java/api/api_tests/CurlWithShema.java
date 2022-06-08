package all_java.api.api_tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class CurlWithShema {

    @Test
    public void testListOfUserswShema() {
        RestAssured.given().log().all()
                .baseUri("https://api.dropboxapi.com/")
                .basePath("/2/file_requests/create \\ ")
                .contentType(ContentType.JSON)
               .body("{\"title\": \"Homework submission\",\"destination\": \"/File Requests/Homework\",\"deadline\": {\"deadline\": \"2020-10-12T17:00:00Z\",\"allow_late_uploads\": \"seven_days\"},\"open\": true}" )
               /* .body("\"{ \\n\" +\n" +
                        "                        \"\\\"title\\\": \\\"Homework submission\\\", \\n\" +\n" +
                        "                        \"\\\"destination\\\": \\\"/File Requests/Homework\\\", \\n\" +\n" +
                        "                        \"\\\"deadline\\\": { \\n\" +\n" +
                        "                        \"\\\"deadline\\\": \\\"2020-10-12T17:00:00Z\\\", \\n\" +\n" +
                        "                        \"\\\"allow_late_uploads\\\": \\\"seven_days\\\" \\n\" +\n" +
                        "                        \"}, \\n\" +\n" +
                        "                        \"\\\"open\\\": true \\n\" +\n" +
                        "                        \"}\\n\" +\n" +
                        "                        \"\\n\")" )*/
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
//Request method:	POST
//Request URI:	https://api.dropboxapi.com/2/file_requests/create%20%5C
//Proxy:			<none>
//Request params:	<none>
//Query params:	<none>
//Form params:	<none>
//Path params:	<none>
//Headers:		Accept=*/*
//				Content-Type=application/json
//Cookies:		<none>
//Multiparts:		<none>
//Body:
//{
//    "title": "Homework submission",
//    "destination": "/File Requests/Homework",
//    "deadline": {
//        "deadline": "2020-10-12T17:00:00Z",
//        "allow_late_uploads": "seven_days"
//    },
//    "open": true
//}
//HTTP/1.1 307 Temporary Redirect
//Location: /2/file_requests/create%20/
//Vary: Accept-Encoding
//X-Dropbox-Response-Origin: local
//Date: Thu, 23 Dec 2021 19:14:21 GMT
//Server: envoy
//Connection: close
//Content-Length: 0
//
//===============================================
//Default Suite
//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
//===============================================




//Request method:	POST
//Request URI:	https://api.dropboxapi.com/2/file_requests/create%20%5C
//Proxy:			<none>
//Request params:	<none>
//Query params:	<none>
//Form params:	<none>
//Path params:	<none>
//Headers:		Accept=*/*
//				Content-Type=application/json
//Cookies:		<none>
//Multiparts:		<none>
//Body:
//"{ \n" +
//                        "\"title\": \"Homework submission\", \n" +
//                        "\"destination\": \"/File Requests/Homework\", \n" +
//                        "\"deadline\": { \n" +
//                        "\"deadline\": \"2020-10-12T17:00:00Z\", \n" +
//                        "\"allow_late_uploads\": \"seven_days\" \n" +
//                        "}, \n" +
//                        "\"open\": true \n" +
//                        "}\n" +
//                        "\n")
//HTTP/1.1 307 Temporary Redirect
//Location: /2/file_requests/create%20/
//Vary: Accept-Encoding
//X-Dropbox-Response-Origin: local
//Date: Thu, 23 Dec 2021 19:09:01 GMT
//Server: envoy
//Connection: close
//Content-Length: 0
//
//===============================================
//Default Suite
//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
//===============================================
//
//
//Process finished with exit code 0