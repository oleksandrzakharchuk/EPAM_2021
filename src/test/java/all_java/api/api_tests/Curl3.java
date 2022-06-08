package all_java.api.api_tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Curl3 {
    @Test
    public void testListOfUserswShema() {
        RestAssured.given().log().all()
                .baseUri("https://www.dropbox.com")
                .basePath("/log/pro_events")
                .contentType(ContentType.JSON)
                .body("is_xhr=true&t=QRub9kKro_D1glSwOlbXv3vq&event=suggested_folders_qualify&extra=%7B%22variant%22%3A%22V3%22%7D&is_client=false&project=sf_individual")
                .when()
                .post()
                .then()
                .log()
                .all();
             //   .statusCode(200);
    }
}


//Request method:	POST
//Request URI:	https://www.dropbox.com/log/pro_events
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
//is_xhr=true&t=QRub9kKro_D1glSwOlbXv3vq&event=suggested_folders_qualify&extra=%7B%22variant%22%3A%22V3%22%7D&is_client=false&project=sf_individual
//HTTP/1.1 403 Forbidden
//Content-Security-Policy: sandbox allow-forms allow-scripts
//Content-Type: text/html
//Accept-Encoding: identity,gzip
//Date: Thu, 23 Dec 2021 20:13:29 GMT
//Server: envoy
//Strict-Transport-Security: max-age=31536000; includeSubDomains
//Strict-Transport-Security: max-age=31536000; includeSubDomains
//Strict-Transport-Security: max-age=31536000; includeSubDomains; preload
//Cache-Control: no-cache, no-store
//Content-Encoding: gzip
//Vary: Accept-Encoding
//X-Dropbox-Response-Origin: far_remote
//X-Dropbox-Request-Id: 04b199b3cc994fd2a07371d330b060d9
//Transfer-Encoding: chunked
//
//<html>
//  <head>
//    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
//    <title>Dropbox - 403</title>
//    <link href="https://cfl.dropboxstatic.com/static/css/error.css" rel="stylesheet" type="text/css"/>
//    <link rel="shortcut icon" href="https://cfl.dropboxstatic.com/static/images/favicon.ico"/>
//  </head>
//  <body>
//    <div class="figure">
//      <img src="https://assets.dropbox.com/www/en-us/illustrations/spot/traffic-u-turn.svg" alt="Error: 403"/>
//    </div>
//    <div id="errorbox">
//      <h1>Error (403)</h1>
//It seems you tried to do something we can't verify. Did you log into a different Dropbox account in a different window? Try clicking       <a shape="rect" href="#" onclick="history.go(-1); return false;">here</a>
// to go back to the page you came from, or just go       <a shape="rect" href="/">home</a>
//.
//    </div>
//  </body>
//</html>
//
//===============================================
//Default Suite
//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
//===============================================
//
//
//Process finished with exit code 0