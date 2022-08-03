import io.restassured.RestAssured;

import javax.swing.text.html.parser.Parser;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Test {
    @org.testng.annotations.Test
    public void abc() {
        RestAssured.baseURI = "https://reqres.in/api";
        given().queryParam("token", "QpwL5tke4Pnpja7X4")

                .log().all()
                .body("{\n" +
                        "    \"email\": \"eve.holt@reqres.in\",\n" +
                        "    \"password\": \"cityslicka\"\n" +
                        "}")
                .when().post("/login")
                .then().log().all()
                .statusCode(200)
                .extract().response().asString();

    }
}
