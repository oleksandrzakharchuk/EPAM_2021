package all_java.api.applicatiom.api.requests;

import all_java.api.applicatiom.api.models.dto.CreateUserDTO;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserApi {

    public Response createUser(CreateUserDTO userDTO){
        Response response= RestAssured.given()
                .log().all()
                .baseUri("https://reqres.in/")
                .basePath("/api/users")
                .contentType(ContentType.JSON)
                //.body("{\"name\": \"morpheus\", \"job\": \"leader\"}")
                .body(userDTO)
                .when().post();
        response.then().statusCode(201);
        return response;
    }

    public Response getListOfUsers(Integer page){
        Response response = RestAssured.given().log().all()
                .baseUri("https://reqres.in/")
                .basePath("/api/users?page="+page)
                .contentType(ContentType.JSON)
                .when().get();
        response.then().statusCode(200);
        return response;
    }
}




