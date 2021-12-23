package api.api_tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class UsSchemaInTest {

    @Test
    public void testListOfData() {
       RestAssured.given().log().all()
                .baseUri("https://reqres.in/")
                .basePath("/api/users?page=1")
                .contentType(ContentType.JSON)
        .when()
                .get()
               .then()
               .body(matchesJsonSchemaInClasspath("getListOfUsersShemas.json"));



          }
}
//Request method:	GET
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
//
//===============================================
//Default Suite
//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
//===============================================
