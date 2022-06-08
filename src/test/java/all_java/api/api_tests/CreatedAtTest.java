package all_java.api.api_tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static all_java.api.utils.maching.CustomMatchers.isDateFormat;
import static all_java.api.utils.maching.CustomMatchers.isNumber;

public class CreatedAtTest {

    @Test
    public void testCreatedAt() {
        RestAssured.given()
                .log().all()
                .baseUri("https://reqres.in/")
                .basePath("/api/users")
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")
                .when()
                .post()
                .then()
                .log().all()
                .assertThat()
                .statusCode(201)
                .body("id", isNumber())
                .body("createdAt", isDateFormat());

    }

}
//Request method:	POST
//Request URI:	https://reqres.in/api/users
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
//    "name": "morpheus",
//    "job": "leader"
//}
//HTTP/1.1 201 Created
//Date: Wed, 08 Dec 2021 14:03:25 GMT
//Content-Type: application/json; charset=utf-8
//Content-Length: 84
//Connection: keep-alive
//x-powered-by: Express
//access-control-allow-origin: *
//etag: W/"54-/PN7AITbR8YxfF4EHO2MNRrnOlw"
//via: 1.1 vegur
//CF-Cache-Status: DYNAMIC
//Expect-CT: max-age=604800, report-uri="https://report-uri.cloudflare.com/cdn-cgi/beacon/expect-ct"
//Report-To: {"endpoints":[{"url":"https:\/\/a.nel.cloudflare.com\/report\/v3?s=kOHl5lipC9WsK3J55DqiCf0ekVTLhcuYox9jvNHjO%2BJvw5fixzbUd2xlN7u4iN%2BT22JCRWQIwEycC3wuo%2Bn04n6HMux0AlRHKL71jaVrTQsG1z2i1cp7rGuBddU%3D"}],"group":"cf-nel","max_age":604800}
//NEL: {"success_fraction":0,"report_to":"cf-nel","max_age":604800}
//Server: cloudflare
//CF-RAY: 6ba68979dfb92d73-KBP
//alt-svc: h3=":443"; ma=86400, h3-29=":443"; ma=86400, h3-28=":443"; ma=86400, h3-27=":443"; ma=86400
//
//{
//    "name": "morpheus",
//    "job": "leader",
//    "id": "226",
//    "createdAt": "2021-12-08T14:03:25.260Z"
//}
//
//===============================================
//Default Suite
//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
//===============================================
