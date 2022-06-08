package all_java.api.api_tests;


import all_java.api.api_tests.models.GetListOfUserDAO;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class ListOfDataTest {

    @Test
    public void testListOfData() {
        GetListOfUserDAO listOfUsers = RestAssured.given().log().all()
                .baseUri("https://reqres.in/")
                .basePath("/api/users?page=1")
                .contentType(ContentType.JSON)
                .when()
                .get()
                .as(GetListOfUserDAO.class);
        System.out.println(listOfUsers.toString());
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
//GetListOfUserDAO(page=1, per_page=6, total=12, total_pages=2,
// data=[GetListOfUserDAO.User(id=1, email=george.bluth@reqres.in,
// first_name=George, last_name=Bluth,
// avatar=https://reqres.in/img/faces/1-image.jpg),
// GetListOfUserDAO.User(id=2, email=janet.weaver@reqres.in,
// first_name=Janet, last_name=Weaver,
// avatar=https://reqres.in/img/faces/2-image.jpg),
// GetListOfUserDAO.User(id=3, email=emma.wong@reqres.in,
// first_name=Emma, last_name=Wong,
// avatar=https://reqres.in/img/faces/3-image.jpg),
// GetListOfUserDAO.User(id=4, email=eve.holt@reqres.in,
// first_name=Eve, last_name=Holt,
// avatar=https://reqres.in/img/faces/4-image.jpg),
// GetListOfUserDAO.User(id=5, email=charles.morris@reqres.in,
// first_name=Charles, last_name=Morris,
// avatar=https://reqres.in/img/faces/5-image.jpg),
// GetListOfUserDAO.User(id=6, email=tracey.ramos@reqres.in,
// first_name=Tracey, last_name=Ramos,
// avatar=https://reqres.in/img/faces/6-image.jpg)],
// support=GetListOfUserDAO.Support(url=https://reqres.in/#support-heading,
// text=To keep ReqRes free, contributions towards server costs are appreciated!))
//
//===============================================
//Default Suite
//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
//===============================================
    }
}
//equest method:	GET
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