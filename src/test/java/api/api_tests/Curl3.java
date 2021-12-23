package api.api_tests;

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
//"C:\Program Files\Java\jdk-11.0.11\bin\java.exe" -ea -Dallure.results.directory=D:\intelij-workspace\EPAM_exem\target/allure-results -Didea.test.cyclic.buffer.size=1048576 "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.1.1\lib\idea_rt.jar=57521:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.1.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.1.1\lib\idea_rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.1.1\plugins\testng\lib\testng-rt.jar;D:\intelij-workspace\EPAM_exem\target\test-classes;D:\intelij-workspace\EPAM_exem\target\classes;C:\Users\Oleksandr\.m2\repository\org\hibernate\hibernate-jpamodelgen\5.2.6.Final\hibernate-jpamodelgen-5.2.6.Final.jar;C:\Users\Oleksandr\.m2\repository\org\jboss\logging\jboss-logging\3.3.0.Final\jboss-logging-3.3.0.Final.jar;C:\Users\Oleksandr\.m2\repository\io\qameta\allure\allure-testng\2.16.1\allure-testng-2.16.1.jar;C:\Users\Oleksandr\.m2\repository\io\qameta\allure\allure-java-commons\2.16.1\allure-java-commons-2.16.1.jar;C:\Users\Oleksandr\.m2\repository\io\qameta\allure\allure-model\2.16.1\allure-model-2.16.1.jar;C:\Users\Oleksandr\.m2\repository\io\qameta\allure\allure-test-filter\2.16.1\allure-test-filter-2.16.1.jar;C:\Users\Oleksandr\.m2\repository\org\seleniumhq\selenium\selenium-java\3.141.59\selenium-java-3.141.59.jar;C:\Users\Oleksandr\.m2\repository\org\seleniumhq\selenium\selenium-api\3.141.59\selenium-api-3.141.59.jar;C:\Users\Oleksandr\.m2\repository\org\seleniumhq\selenium\selenium-chrome-driver\3.141.59\selenium-chrome-driver-3.141.59.jar;C:\Users\Oleksandr\.m2\repository\org\seleniumhq\selenium\selenium-edge-driver\3.141.59\selenium-edge-driver-3.141.59.jar;C:\Users\Oleksandr\.m2\repository\org\seleniumhq\selenium\selenium-firefox-driver\3.141.59\selenium-firefox-driver-3.141.59.jar;C:\Users\Oleksandr\.m2\repository\org\seleniumhq\selenium\selenium-ie-driver\3.141.59\selenium-ie-driver-3.141.59.jar;C:\Users\Oleksandr\.m2\repository\org\seleniumhq\selenium\selenium-opera-driver\3.141.59\selenium-opera-driver-3.141.59.jar;C:\Users\Oleksandr\.m2\repository\org\seleniumhq\selenium\selenium-remote-driver\3.141.59\selenium-remote-driver-3.141.59.jar;C:\Users\Oleksandr\.m2\repository\org\seleniumhq\selenium\selenium-safari-driver\3.141.59\selenium-safari-driver-3.141.59.jar;C:\Users\Oleksandr\.m2\repository\org\seleniumhq\selenium\selenium-support\3.141.59\selenium-support-3.141.59.jar;C:\Users\Oleksandr\.m2\repository\net\bytebuddy\byte-buddy\1.8.15\byte-buddy-1.8.15.jar;C:\Users\Oleksandr\.m2\repository\org\apache\commons\commons-exec\1.3\commons-exec-1.3.jar;C:\Users\Oleksandr\.m2\repository\com\google\guava\guava\25.0-jre\guava-25.0-jre.jar;C:\Users\Oleksandr\.m2\repository\com\google\code\findbugs\jsr305\1.3.9\jsr305-1.3.9.jar;C:\Users\Oleksandr\.m2\repository\org\checkerframework\checker-compat-qual\2.0.0\checker-compat-qual-2.0.0.jar;C:\Users\Oleksandr\.m2\repository\com\google\errorprone\error_prone_annotations\2.1.3\error_prone_annotations-2.1.3.jar;C:\Users\Oleksandr\.m2\repository\com\google\j2objc\j2objc-annotations\1.1\j2objc-annotations-1.1.jar;C:\Users\Oleksandr\.m2\repository\org\codehaus\mojo\animal-sniffer-annotations\1.14\animal-sniffer-annotations-1.14.jar;C:\Users\Oleksandr\.m2\repository\com\squareup\okhttp3\okhttp\3.11.0\okhttp-3.11.0.jar;C:\Users\Oleksandr\.m2\repository\com\squareup\okio\okio\1.14.0\okio-1.14.0.jar;C:\Users\Oleksandr\.m2\repository\com\codeborne\selenide\5.24.3\selenide-5.24.3.jar;C:\Users\Oleksandr\.m2\repository\commons-lang\commons-lang\2.6\commons-lang-2.6.jar;C:\Users\Oleksandr\.m2\repository\org\apache\commons\commons-compress\1.21\commons-compress-1.21.jar;C:\Users\Oleksandr\.m2\repository\org\apache\httpcomponents\client5\httpclient5\5.1\httpclient5-5.1.jar;C:\Users\Oleksandr\.m2\repository\org\apache\httpcomponents\core5\httpcore5\5.1.1\httpcore5-5.1.1.jar;C:\Users\Oleksandr\.m2\repository\commons-codec\commons-codec\1.15\commons-codec-1.15.jar;C:\Users\Oleksandr\.m2\repository\org\apache\commons\commons-lang3\3.12.0\commons-lang3-3.12.0.jar;C:\Users\Oleksandr\.m2\repository\commons-io\commons-io\2.11.0\commons-io-2.11.0.jar;C:\Users\Oleksandr\.m2\repository\org\slf4j\slf4j-api\1.7.32\slf4j-api-1.7.32.jar;C:\Users\Oleksandr\.m2\repository\io\github\bonigarcia\webdrivermanager\5.0.2\webdrivermanager-5.0.2.jar;C:\Users\Oleksandr\.m2\repository\com\google\code\gson\gson\2.8.8\gson-2.8.8.jar;C:\Users\Oleksandr\.m2\repository\org\jsoup\jsoup\1.14.2\jsoup-1.14.2.jar;C:\Users\Oleksandr\.m2\repository\com\github\docker-java\docker-java\3.2.11\docker-java-3.2.11.jar;C:\Users\Oleksandr\.m2\repository\com\github\docker-java\docker-java-core\3.2.11\docker-java-core-3.2.11.jar;C:\Users\Oleksandr\.m2\repository\com\github\docker-java\docker-java-api\3.2.11\docker-java-api-3.2.11.jar;C:\Users\Oleksandr\.m2\repository\org\bouncycastle\bcpkix-jdk15on\1.64\bcpkix-jdk15on-1.64.jar;C:\Users\Oleksandr\.m2\repository\org\bouncycastle\bcprov-jdk15on\1.64\bcprov-jdk15on-1.64.jar;C:\Users\Oleksandr\.m2\repository\org\slf4j\jcl-over-slf4j\1.7.30\jcl-over-slf4j-1.7.30.jar;C:\Users\Oleksandr\.m2\repository\com\github\docker-java\docker-java-transport-httpclient5\3.2.11\docker-java-transport-httpclient5-3.2.11.jar;C:\Users\Oleksandr\.m2\repository\com\github\docker-java\docker-java-transport\3.2.11\docker-java-transport-3.2.11.jar;C:\Users\Oleksandr\.m2\repository\net\java\dev\jna\jna\5.8.0\jna-5.8.0.jar;C:\Users\Oleksandr\.m2\repository\org\brotli\dec\0.1.2\dec-0.1.2.jar;C:\Users\Oleksandr\.m2\repository\org\testng\testng\7.4.0\testng-7.4.0.jar;C:\Users\Oleksandr\.m2\repository\com\beust\jcommander\1.78\jcommander-1.78.jar;C:\Users\Oleksandr\.m2\repository\org\webjars\jquery\3.5.1\jquery-3.5.1.jar;C:\Users\Oleksandr\.m2\repository\log4j\log4j\1.2.17\log4j-1.2.17.jar;C:\Users\Oleksandr\.m2\repository\org\springframework\boot\spring-boot-starter-log4j2\2.5.6\spring-boot-starter-log4j2-2.5.6.jar;C:\Users\Oleksandr\.m2\repository\org\apache\logging\log4j\log4j-slf4j-impl\2.14.1\log4j-slf4j-impl-2.14.1.jar;C:\Users\Oleksandr\.m2\repository\org\apache\logging\log4j\log4j-api\2.14.1\log4j-api-2.14.1.jar;C:\Users\Oleksandr\.m2\repository\org\apache\logging\log4j\log4j-core\2.14.1\log4j-core-2.14.1.jar;C:\Users\Oleksandr\.m2\repository\org\apache\logging\log4j\log4j-jul\2.14.1\log4j-jul-2.14.1.jar;C:\Users\Oleksandr\.m2\repository\org\slf4j\jul-to-slf4j\1.7.32\jul-to-slf4j-1.7.32.jar;C:\Users\Oleksandr\.m2\repository\org\assertj\assertj-core\3.20.2\assertj-core-3.20.2.jar;C:\Users\Oleksandr\.m2\repository\junit\junit\4.13.2\junit-4.13.2.jar;C:\Users\Oleksandr\.m2\repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar;C:\Users\Oleksandr\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.12.1\jackson-databind-2.12.1.jar;C:\Users\Oleksandr\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.12.1\jackson-annotations-2.12.1.jar;C:\Users\Oleksandr\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.12.1\jackson-core-2.12.1.jar;C:\Users\Oleksandr\.m2\repository\io\rest-assured\json-schema-validator\4.4.0\json-schema-validator-4.4.0.jar;C:\Users\Oleksandr\.m2\repository\com\github\java-json-tools\json-schema-validator\2.2.14\json-schema-validator-2.2.14.jar;C:\Users\Oleksandr\.m2\repository\com\github\java-json-tools\jackson-coreutils-equivalence\1.0\jackson-coreutils-equivalence-1.0.jar;C:\Users\Oleksandr\.m2\repository\com\github\java-json-tools\jackson-coreutils\2.0\jackson-coreutils-2.0.jar;C:\Users\Oleksandr\.m2\repository\com\github\java-json-tools\msg-simple\1.2\msg-simple-1.2.jar;C:\Users\Oleksandr\.m2\repository\com\github\java-json-tools\btf\1.3\btf-1.3.jar;C:\Users\Oleksandr\.m2\repository\com\github\java-json-tools\json-schema-core\1.2.14\json-schema-core-1.2.14.jar;C:\Users\Oleksandr\.m2\repository\com\github\java-json-tools\uri-template\0.10\uri-template-0.10.jar;C:\Users\Oleksandr\.m2\repository\org\mozilla\rhino\1.7.7.2\rhino-1.7.7.2.jar;C:\Users\Oleksandr\.m2\repository\com\sun\mail\mailapi\1.6.2\mailapi-1.6.2.jar;C:\Users\Oleksandr\.m2\repository\joda-time\joda-time\2.10.5\joda-time-2.10.5.jar;C:\Users\Oleksandr\.m2\repository\com\googlecode\libphonenumber\libphonenumber\8.11.1\libphonenumber-8.11.1.jar;C:\Users\Oleksandr\.m2\repository\net\sf\jopt-simple\jopt-simple\5.0.4\jopt-simple-5.0.4.jar;C:\Users\Oleksandr\.m2\repository\org\hamcrest\hamcrest\2.1\hamcrest-2.1.jar;C:\Users\Oleksandr\.m2\repository\org\projectlombok\lombok\1.18.22\lombok-1.18.22.jar;C:\Users\Oleksandr\.m2\repository\io\rest-assured\rest-assured\4.4.0\rest-assured-4.4.0.jar;C:\Users\Oleksandr\.m2\repository\org\codehaus\groovy\groovy\3.0.8\groovy-3.0.8.jar;C:\Users\Oleksandr\.m2\repository\org\codehaus\groovy\groovy-xml\3.0.8\groovy-xml-3.0.8.jar;C:\Users\Oleksandr\.m2\repository\org\apache\httpcomponents\httpclient\4.5.13\httpclient-4.5.13.jar;C:\Users\Oleksandr\.m2\repository\org\apache\httpcomponents\httpcore\4.4.13\httpcore-4.4.13.jar;C:\Users\Oleksandr\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\Oleksandr\.m2\repository\org\apache\httpcomponents\httpmime\4.5.13\httpmime-4.5.13.jar;C:\Users\Oleksandr\.m2\repository\org\ccil\cowan\tagsoup\tagsoup\1.2.1\tagsoup-1.2.1.jar;C:\Users\Oleksandr\.m2\repository\io\rest-assured\json-path\4.4.0\json-path-4.4.0.jar;C:\Users\Oleksandr\.m2\repository\org\codehaus\groovy\groovy-json\3.0.8\groovy-json-3.0.8.jar;C:\Users\Oleksandr\.m2\repository\io\rest-assured\rest-assured-common\4.4.0\rest-assured-common-4.4.0.jar;C:\Users\Oleksandr\.m2\repository\io\rest-assured\xml-path\4.4.0\xml-path-4.4.0.jar;C:\Users\Oleksandr\.m2\repository\jakarta\xml\bind\jakarta.xml.bind-api\2.3.3\jakarta.xml.bind-api-2.3.3.jar;C:\Users\Oleksandr\.m2\repository\jakarta\activation\jakarta.activation-api\1.2.2\jakarta.activation-api-1.2.2.jar;C:\Users\Oleksandr\.m2\repository\com\sun\xml\bind\jaxb-impl\2.3.3\jaxb-impl-2.3.3.jar" com.intellij.rt.testng.RemoteTestNGStarter -usedefaultlisteners false -socket57520 @w@C:\Users\Oleksandr\AppData\Local\Temp\idea_working_dirs_testng.tmp -temp C:\Users\Oleksandr\AppData\Local\Temp\idea_testng.tmp
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