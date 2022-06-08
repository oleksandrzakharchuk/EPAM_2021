package all_java.api.api_tests;

import all_java.api.applicatiom.api.models.dto.CreateUserDTO;
import all_java.api.applicatiom.api.requests.UserApi;
import org.testng.annotations.Test;

public class CreateUserTests1 {

    @Test
    public void testCreateUser1(){
        CreateUserDTO createUserDTO = new CreateUserDTO();
        createUserDTO.setName("Alex");
        createUserDTO.setJob("Test Automation");

        UserApi api = new UserApi();
        api.createUser(createUserDTO).then().log().body();

//        Request method:	POST
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
//    "name": "Alex",
//    "job": "Test Automation"
//}
//{
//    "name": "Alex",
//    "job": "Test Automation",
//    "id": "98",
//    "createdAt": "2021-12-08T17:21:04.913Z"
//}
//
//===============================================
//Default Suite
//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
//===============================================


    }
}
