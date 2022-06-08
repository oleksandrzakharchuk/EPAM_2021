package all_java.api.api_tests;

import all_java.api.api_tests.models.GetListOfUserDAO;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GetPageGetDataPageAssertTests {

    @Test
    public void testListOfData() {
        GetListOfUserDAO listOfUsers = RestAssured.given().log().all()
                .baseUri("https://reqres.in/")
                .basePath("/api/users?page=1")
                .contentType(ContentType.JSON)
                .when()
                .get()
                .as(GetListOfUserDAO.class);

        assertThat(listOfUsers.getPage(), equalTo(1));// bad test-> data testing
        assertThat(listOfUsers.getData().get(0).getFirst_name(), equalTo("George"));// bad test-> data testing
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