package api.api_tests;

import api.api_tests.models.GetListOfUserDAO;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class GetPage1Test {
    @Test
    public void testListOfPage() {
        GetListOfUserDAO listOfUsers = RestAssured.given().log().all()
                .baseUri("https://reqres.in/")
                .basePath("/api/users?page=1")
                .contentType(ContentType.JSON)
                .when()
                .get()
                .as(GetListOfUserDAO.class);
        System.out.println(listOfUsers.getPage());
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
//1
//
//===============================================
//Default Suite
//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
//===============================================