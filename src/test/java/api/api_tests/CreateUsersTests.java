package api.api_tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class CreateUsersTests {

    @Test
    public void testCreateUser() {
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
                .statusCode(201);
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
//Date: Wed, 08 Dec 2021 12:47:49 GMT
//Content-Type: application/json; charset=utf-8
//Content-Length: 84
//Connection: keep-alive
//x-powered-by: Express
//access-control-allow-origin: *
//etag: W/"54-nmdlhTjNJSQ6VBsLnDxnVH7qyro"
//via: 1.1 vegur
//CF-Cache-Status: DYNAMIC
//Expect-CT: max-age=604800, report-uri="https://report-uri.cloudflare.com/cdn-cgi/beacon/expect-ct"
//Report-To: {"endpoints":[{"url":"https:\/\/a.nel.cloudflare.com\/report\/v3?s=bjgvh%2BShxubywHyqbsk6M96ePQfQfLEDdh%2B2IuQdCeX7y9bpiS3e4GSwYB4v%2Bjx%2BpCD2to%2FJOEn2%2Bd3BbnjNIVYpKjzJRIcYZZiqxZBG3NBgOxwQHo%2B%2B%2F2lp5DI%3D"}],"group":"cf-nel","max_age":604800}
//NEL: {"success_fraction":0,"report_to":"cf-nel","max_age":604800}
//Server: cloudflare
//CF-RAY: 6ba61abc2aee2deb-KBP
//alt-svc: h3=":443"; ma=86400, h3-29=":443"; ma=86400, h3-28=":443"; ma=86400, h3-27=":443"; ma=86400
//
//{
//    "name": "morpheus",
//    "job": "leader",
//    "id": "684",
//    "createdAt": "2021-12-08T12:47:49.301Z"
//}
//
//===============================================
//Default Suite
//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
//===============================================

    @Test
    public void testCreateUserEqualTo() {
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
               // .body("name", equalTo("morpheuss"));
                .body("name", equalTo("morpheus"));

//java.lang.AssertionError: 1 expectation failed.
//JSON path name doesn't match.
//Expected: morpheuss
//  Actual: morpheus
    }

    @Test
    public void testCreateUserEqualJob() {
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
                .body("name", equalTo("morpheus"))
                .body("job", equalTo("leader"));

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
//Date: Wed, 08 Dec 2021 13:08:45 GMT
//Content-Type: application/json; charset=utf-8
//Content-Length: 84
//Connection: keep-alive
//x-powered-by: Express
//access-control-allow-origin: *
//etag: W/"54-6+mQJpuG2JtmRo+NDNHBp7cpcBo"
//via: 1.1 vegur
//CF-Cache-Status: DYNAMIC
//Expect-CT: max-age=604800, report-uri="https://report-uri.cloudflare.com/cdn-cgi/beacon/expect-ct"
//Report-To: {"endpoints":[{"url":"https:\/\/a.nel.cloudflare.com\/report\/v3?s=7iHm8LPSOakgnD%2BWw7XmsF5vJqDyWJmfJpqR6FgLTo%2FeQ1KX7evX57LeRc9oAMpzbO8844ruODaeH3hNTUrI5q6yx1SZj1jf4ADEbG3RoNBiG%2BJ3r%2Bk50s675xM%3D"}],"group":"cf-nel","max_age":604800}
//NEL: {"success_fraction":0,"report_to":"cf-nel","max_age":604800}
//Server: cloudflare
//CF-RAY: 6ba63963fa1177a7-KBP
//alt-svc: h3=":443"; ma=86400, h3-29=":443"; ma=86400, h3-28=":443"; ma=86400, h3-27=":443"; ma=86400
//
//{
//    "name": "morpheus",
//    "job": "leader",
//    "id": "968",
//    "createdAt": "2021-12-08T13:08:44.965Z"
//}
//
//===============================================
//Default Suite
//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
//===============================================
    }
}