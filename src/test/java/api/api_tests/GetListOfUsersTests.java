package api.api_tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class GetListOfUsersTests {

    @Test
    public void testGetListOfUsers() {
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .basePath("/api/users?page=1")
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .log()
                .all();

    }

    /*HTTP/1.1 200 OK
    Date: Wed, 08 Dec 2021 12:05:19 GMT
    Content-Type: application/json; charset=utf-8
    Transfer-Encoding: chunked
    Connection: keep-alive
    x-powered-by: Express
    access-control-allow-origin: *
    etag: W/"3e4-2RLXvr5wTg9YQ6aH95CkYoFNuO8"
    via: 1.1 vegur
    Cache-Control: max-age=14400
    CF-Cache-Status: HIT
    Age: 3625
    Expect-CT: max-age=604800, report-uri="https://report-uri.cloudflare.com/cdn-cgi/beacon/expect-ct"
    Report-To: {"endpoints":[{"url":"https:\/\/a.nel.cloudflare.com\/report\/v3?s=5ocjsrQw1qNUPub9FkSAVcliw0WX56PUBuSn%2FIkiAaBWYlBKSIhlsK6uQn4mDwqCAA%2BWF1x9Dol4o5KBoFZ%2Fh9c9iBEsxgI%2FYb0CF%2BJne63tn2Ri5PHiWSPsrqs%3D"}],"group":"cf-nel","max_age":604800}
    NEL: {"success_fraction":0,"report_to":"cf-nel","max_age":604800}
    Vary: Accept-Encoding
    Server: cloudflare
    CF-RAY: 6ba5dc7b58b224b4-KBP
    Content-Encoding: gzip
    alt-svc: h3=":443"; ma=86400, h3-29=":443"; ma=86400, h3-28=":443"; ma=86400, h3-27=":443"; ma=86400

    {
        "page": 1,
        "per_page": 6,
        "total": 12,
        "total_pages": 2,
        "data": [
            {
                "id": 1,
                "email": "george.bluth@reqres.in",
                "first_name": "George",
                "last_name": "Bluth",
                "avatar": "https://reqres.in/img/faces/1-image.jpg"
            },
            {
                "id": 2,
                "email": "janet.weaver@reqres.in",
                "first_name": "Janet",
                "last_name": "Weaver",
                "avatar": "https://reqres.in/img/faces/2-image.jpg"
            },
            {
                "id": 3,
                "email": "emma.wong@reqres.in",
                "first_name": "Emma",
                "last_name": "Wong",
                "avatar": "https://reqres.in/img/faces/3-image.jpg"
            },
            {
                "id": 4,
                "email": "eve.holt@reqres.in",
                "first_name": "Eve",
                "last_name": "Holt",
                "avatar": "https://reqres.in/img/faces/4-image.jpg"
            },
            {
                "id": 5,
                "email": "charles.morris@reqres.in",
                "first_name": "Charles",
                "last_name": "Morris",
                "avatar": "https://reqres.in/img/faces/5-image.jpg"
            },
            {
                "id": 6,
                "email": "tracey.ramos@reqres.in",
                "first_name": "Tracey",
                "last_name": "Ramos",
                "avatar": "https://reqres.in/img/faces/6-image.jpg"
            }
        ],
        "support": {
            "url": "https://reqres.in/#support-heading",
            "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
        }
    }

    ===============================================
    Default Suite
    Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
    ===============================================
    */
    @Test
    public void testCheckStatusCode() {
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .basePath("/api/users?page=1")
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200);
/*==============================================
Default Suite
Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
===============================================*/
    }

    @Test
    public void testCheckLogsAll() {
        RestAssured.given().log().all()
                .baseUri("https://reqres.in/")
                .basePath("/api/users?page=1")
                .contentType(ContentType.JSON)
        .when()
                .get()
        .then()
                .log()
                .body()
                .assertThat()
                .statusCode(200);

    }
//    Request method:	GET
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
//Body:			<none>
//{
//    "page": 1,
//    "per_page": 6,
//    "total": 12,
//    "total_pages": 2,
//    "data": [
//        {
//            "id": 1,
//            "email": "george.bluth@reqres.in",
//            "first_name": "George",
//            "last_name": "Bluth",
//            "avatar": "https://reqres.in/img/faces/1-image.jpg"
//        },
//        {
//            "id": 2,
//            "email": "janet.weaver@reqres.in",
//            "first_name": "Janet",
//            "last_name": "Weaver",
//            "avatar": "https://reqres.in/img/faces/2-image.jpg"
//        },
//        {
//            "id": 3,
//            "email": "emma.wong@reqres.in",
//            "first_name": "Emma",
//            "last_name": "Wong",
//            "avatar": "https://reqres.in/img/faces/3-image.jpg"
//        },
//        {
//            "id": 4,
//            "email": "eve.holt@reqres.in",
//            "first_name": "Eve",
//            "last_name": "Holt",
//            "avatar": "https://reqres.in/img/faces/4-image.jpg"
//        },
//        {
//            "id": 5,
//            "email": "charles.morris@reqres.in",
//            "first_name": "Charles",
//            "last_name": "Morris",
//            "avatar": "https://reqres.in/img/faces/5-image.jpg"
//        },
//        {
//            "id": 6,
//            "email": "tracey.ramos@reqres.in",
//            "first_name": "Tracey",
//            "last_name": "Ramos",
//            "avatar": "https://reqres.in/img/faces/6-image.jpg"
//        }
//    ],
//    "support": {
//        "url": "https://reqres.in/#support-heading",
//        "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
//    }
//}
//
//===============================================
//Default Suite
//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
//===============================================




}